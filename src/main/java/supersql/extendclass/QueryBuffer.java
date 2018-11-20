package supersql.extendclass;


import java.lang.reflect.Array;
import java.util.*;

import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.parser.*;

public class QueryBuffer {
    private ExtList schf;
    public ExtList sep_sch;
    private HashSet tg;
    private FromInfo fi;
    private Hashtable atts;
    private ExtList aggregate_list;
    private ExtList aggregate_attnum_list;
    private ExtList result;
    private String query;
    public ExtList constructedResult;
//    private ExtList orderTable = Preprocessor.getOrderByTable();
    public int forestNum = 0; //Which tree belongs to in forest
    public int treeNum = 0; //集約によって分割される前はどの木にいたか
    private ArrayList UsedTables;
    public int fromGroupNum;
    public String selectClause = "";
    public String fromClause = "";
    public String whereCluase = "";
    public String groupbyClause = "";


    public QueryBuffer(ExtList schf){
//        ArrayList<Integer> tmp = new ArrayList<>();
//        for (int i = 0; i < schf.unnest().size(); i++) {
//            tmp.add((int)schf.unnest().get(i));
//        }
//        tmp.sort(Comparator.naturalOrder());
//        this.schf = new ExtList();
//        for (int i: tmp) {
//            this.schf.add(i);
//        }
        schf = schf.unnest();
        schf.sort(Comparator.naturalOrder());
        this.schf = new ExtList(schf);
    }

    public void setFromInfo(String line){
        fi = new FromInfo(line);
    }

    public void setTg(HashSet tg){
        this.tg = tg;
    }

    public ExtList getSchf(){
        return schf;
    }

    public HashSet getTg(){
        return tg;
    }

    public FromInfo getFi() {
        return fi;
    }

    public void setAtts(Hashtable atts) {
        this.atts = atts;
    }

    public Hashtable getAtts() {
        return atts;
    }

    public void setAggregate_list(ExtList aggregate_list) {
        this.aggregate_list = aggregate_list;
    }

    public ExtList getAggregate_list() {
        return aggregate_list;
    }

    public void setAggregate_attnum_list(ExtList aggregate_attnum_list) {
        this.aggregate_attnum_list = aggregate_attnum_list;
    }

    public void setResult(ExtList result) {
        this.result = new ExtList(result);
    }

    public ExtList getResult() {
        return result;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public ExtList getAggregate_attnum_list() {
        return aggregate_attnum_list;
    }

    public void makeQuery(WhereInfo where){
        Boolean flag = false;
        StringBuffer buf = new StringBuffer();
        StringBuffer buf2 = new StringBuffer();
        //SELECT句作成
        //make SELECT clause
        buf.append("SELECT ");
        boolean isAgg = false;
//        boolean isOrder = false;
        boolean containAgg = false;
//        String orderStr = new String();
        schf.sort(Comparator.naturalOrder());
        this.UsedTables = this.makeTableGroup();
        int aggCount = 0;
        for(int index = 0; index < this.schf.size(); index++){
            int attnum = (Integer)this.schf.get(index);
//            isOrder = false;
//            for (int i = 0; i < orderTable.size(); i++) {
//                String ordert = orderTable.get(i).toString();
//                if(ordert.substring(ordert.indexOf("["), ordert.indexOf("]") + 1).equals("["+attnum+"]")){
//                    orderStr = ordert.substring(0, ordert.indexOf("]") + 1);
//                    isOrder = true;
//                }
//            }
            String att = atts.get(attnum).toString();
            isAgg = false;
            String func_att = new String();
            if(this.aggregate_attnum_list.contains(attnum)){
                //集約だったらfunction_name(att)の形にして追加
                //if the attribute is to be aggregated, add by form of aggregation.
                String function_name = new String();
                String agg_str = new String();
                for(Object o: aggregate_list) {
                    if (Integer.parseInt(o.toString().split(" ")[0]) == attnum) {
                        agg_str = o.toString();
                    }
                }
                function_name = agg_str.split(" ")[1];
                func_att = function_name + "(" + att + ")";
                isAgg = true;
                containAgg = true;
            }
            if(!isAgg){
                //集約じゃなかったらそのまま追加
                //if Not aggregation, add as it is.
                if(index == 0){
                    buf2.append(att);
                }else{
                    buf2.append(", "+att);
                }
            }else{
                aggCount++;
                if(index == 0){
                    buf2.append(func_att);
                }else{
                    buf2.append(", "+func_att);
                }
            }
        }
        if(!isAgg){
//            buf.append("DISTINCT ");
        }
        buf.append(buf2.toString());
        this.selectClause = buf.toString().substring(buf.toString().indexOf("SELECT")).trim();

//        System.out.println("relatedGLO:::"+GlobalEnv.relatedTableSet);
//        System.out.println("usedTables:::"+usedTables);
        makeUsedTables(this.UsedTables);

//        System.out.println("relateSet:::"+GlobalEnv.relatedTableSet);
//        System.out.println("usedTables_after:::"+usedTables);

        //FROM句作成
        //make From clause
        buf.append(" FROM ");
        List<FromTable> fts = From.getFromItems();
        if(From.hasFromItems()){
            for (int i = 0; i < fts.size(); i++) {
                FromTable ft = fts.get(i);
                if(this.UsedTables.contains(ft.getAlias())){
                    buf.append(ft.getLine()+",");
                }
            }
            if (From.hasJoinItems()){
                List<JoinItem> jis = From.getJoinItems();
                for (int i = 0; i < jis.size(); i++) {
                    JoinItem ji = jis.get(i);
                    if(this.UsedTables.contains(ji.table.getAlias())){
                        if(ji.isSimple()){
                            buf.append(ji.table.getLine() + ",");
                        }else{
                            boolean same = true;
                            for (int j = 0; j < ji.getUseTables().size(); j++) {
                                for (int k = 0; k < ji.getUseTables().get(j).size(); k++) {
                                    String alias1 = ji.getUseTables().get(j).get(k);
                                    if(!this.UsedTables.contains(alias1) && !alias1.equals("constant_value")){
                                        same = false;
                                        break;
                                    }
                                }
                                if (!same){
                                    break;
                                }
                            }
                            if (same){
                                if(buf.charAt(buf.length() - 1) == ','){
                                    buf = new StringBuffer(buf.substring(0, buf.length() - 1));
                                }
                                buf.append(" ");
                                buf.append(ji.getStatement() + ",");
                            }else{
                                buf.append(ji.table.getLine() + ",");
                            }
                        }
                    }
                }
            }
        }
        if(buf.charAt(buf.length() - 1) == ','){
            buf = new StringBuffer(buf.substring(0, buf.length() - 1));
        }
        if(buf.toString().indexOf("FROM") != -1){
            this.fromClause = buf.toString().substring(buf.toString().indexOf("FROM")).trim();
        }
//        System.out.println("used_tables:::"+usedTables);
//        System.out.println("query:::"+buf.toString());
        //WHERE句作成
        //make Where clause
        Iterator e2 = where.getWhereClause().iterator();
        boolean first = true;
        while (e2.hasNext()) {
            WhereParse whe = (WhereParse) e2.next();
//            System.out.println("where clause:::"+whe.getUseTables());
            boolean addFlag = true;
            Iterator ut = whe.getUseTables().iterator();
            int counter = 0;
            String tname_bak = new String();
            while(ut.hasNext()){
                counter++;
                String tname = ut.next().toString();
                tname_bak = tname;
                if(!this.UsedTables.contains(tname)){
                    addFlag = false;
                    break;
                }
            }
            if(counter == 1){
                if(this.UsedTables.contains(tname_bak)){
                    addFlag = true;
                }
            }
            if(addFlag){
                if(first){
                    buf.append(" WHERE ");
                    buf.append(whe.getLine());
                    first = false;
                }else{
                    buf.append(" AND ");
                    buf.append(whe.getLine());
                }
            }
        }
        if(buf.toString().indexOf("WHERE") != -1){
            this.whereCluase = buf.toString().substring(buf.toString().indexOf("WHERE")).trim();
        }

        //Group By句作成
        //make Group By clause
        if(containAgg && schf.size() - aggCount >= 1) {
            buf.append(" GROUP BY ");
            int j = 0;
            for (Object attnum : this.schf) {
                if (!this.aggregate_attnum_list.contains(attnum)) {
                    if (j == 0) {
                        buf.append(atts.get((int) attnum).toString());
                        j++;
                    } else {
                        buf.append(", " + atts.get((int) attnum).toString());
                    }
                }
            }
        }
        if(buf.toString().indexOf("GROUP BY") != -1){
            this.groupbyClause = buf.toString().substring(buf.toString().indexOf("GROUP BY")).trim();
        }

        buf.append(";");
        this.query = buf.toString();
    }

    private ArrayList<String> makeTableGroup() {
        ExtList usedTables = new ExtList();
        for(int index = 0; index < this.schf.size(); index++){
            int attnum = (Integer)this.schf.get(index);
            String att = atts.get(attnum).toString();
            if(att.contains("(") && att.contains(")")){
                if(!usedTables.contains(att.substring(att.indexOf("(") + 1, att.indexOf(")")).split("\\.")[0].trim())){
                    usedTables.add(att.substring(att.indexOf("(") + 1, att.indexOf(")") - 1).split("\\.")[0].trim());
                }
            }else {
                if (!usedTables.contains(att.split("\\.")[0])) {
                    usedTables.add(att.split("\\.")[0]);
                }
            }
        }
        return usedTables;
    }

    private void makeUsedTables(ArrayList<String> usedTables) {
        for (int i = 0; i < usedTables.size(); i++) {
            ArrayList<String> relatedtables = GlobalEnv.relatedTableSet.get(usedTables.get(i));
//            System.out.println("relatedtables:::"+relatedtables);
            for (int j = 0; j < relatedtables.size(); j++) {
                if(relatedtables.get(j).equals("contains_one_side_constraint")){
                    continue;
                }
                findUsedTables(usedTables.get(i), relatedtables.get(j), GlobalEnv.relatedTableSet.get(relatedtables.get(j)), usedTables);
            }
        }
    }

    private Boolean findUsedTables(String parent, String now, ArrayList<String> child, ArrayList<String> usedTables) {
//        System.out.println("parent:::"+parent);
//        System.out.println("now:::"+now);
//        System.out.println("child:::"+child);
//        System.out.println("usedTables:::"+usedTables);
        if(usedTables.contains(now)){
            return true;
        }
//        System.out.println("child:::"+child);
        for (int i = 0; i < child.size(); i++) {
            if(child.get(i).equals("contains_one_side_constraint")){
                if(!usedTables.contains(now)){
                    usedTables.add(now);
                }
                return true;
            }
            if(!child.get(i).equals(parent)){
                boolean result = findUsedTables(now, child.get(i), GlobalEnv.relatedTableSet.get(child.get(i)), usedTables);
                if(result){
                    if(!usedTables.contains(now)){
                        usedTables.add(now);
                    }
                    return result;
                }
            }
        }
        return false;
    }

    public void showDebug(){
        ArrayList<String> ut = new ArrayList<>(this.UsedTables);
        Collections.sort(ut);
        System.out.println("----------QueryBuffer Information----------");
        System.out.println("Forest Num is "+this.forestNum);
        System.out.println("Tree Num is "+this.treeNum);
        System.out.println("From Group Num is "+this.fromGroupNum);
        System.out.println("sep_sch is "+this.sep_sch);
        System.out.println("SQL Query is "+this.getQuery());
        System.out.println("Used Tables are "+ ut);
//        System.out.println("SELECT Clouse is "+ this.selectClause);
//        System.out.println("FROM clouse is "+ this.fromClause);
//        System.out.println("WHERE clouse is "+ this.whereCluase);
//        System.out.println("GroupBY clouse is "+ this.groupbyClause);
//        System.out.println("Result is "+this.getResult());
//        System.out.println("Constructed Result is "+this.constructedResult);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

    }

    public ExtList getUsedTables(){
        ArrayList<String> tg = this.makeTableGroup();
        makeUsedTables(tg);
        ExtList usedTables = (ExtList)tg;
        return usedTables;
    }

    public void makeAllPattern() {
        ExtList info = Preprocessor.getCtabList();
        ExtList infoCorresponding = new ExtList();
        int num = info.size();
        boolean contain = false;
        ExtList sep_sch = this.sep_sch.unnest();
        for (int i = 0; i < sep_sch.size(); i++) {
            for (int j = 0; j < num; j++) {
                if(info.getExtListString(j).split(" ")[0].equals(sep_sch.getExtListString(i))){
                    if(!infoCorresponding.contains(info.getExtListString(j))){
                        infoCorresponding.add(info.getExtListString(j));
                    }
                    if(info.getExtListString(j).split(" ")[1].equals("ctab_side") || info.getExtListString(j).split(" ")[1].equals("ctab_value")){
                        contain = true;
                    }
                }
            }
        }
        Log.out("contain:::"+contain);
        if(!contain){
            return;
        }
        ExtList result = this.result;
        Log.out("result:::"+result);
        Log.out("info_corres:::"+infoCorresponding);
        int[] index = new int[infoCorresponding.size()];
        Log.out("index:::");
        int value_num = 0;
        for (int i = 0; i < index.length; i++) {
            if(infoCorresponding.getExtListString(i).contains("head")){
                index[i] = 0;
            }else if(infoCorresponding.getExtListString(i).contains("side")){
                index[i] = 1;
            }else{
                value_num++;
                index[i] = 2;
            }
            Log.out(index[i]);
        }
        ExtList headSet = new ExtList();
        ExtList sideSet = new ExtList();
        for (int i = 0; i < result.size(); i++) {
            ExtList one = result.getExtList(i);
            ExtList head_tmp = new ExtList();
            ExtList side_tmp = new ExtList();
            for (int j = 0; j < index.length; j++) {
                if(index[j] == 0){
                    head_tmp.add(one.getExtListString(j));
                }else if(index[j] == 1){
                    side_tmp.add(one.getExtListString(j));
                }
            }
            headSet.add(head_tmp);
            sideSet.add(side_tmp);
        }
        //種類全部出し
        Log.out("headSet:::"+headSet);
        Log.out("sideSet:::"+sideSet);
//        int size = sideSet.size() * headSet.size();

        //ここから全通りの組み合わせを作る
        //順番はside→head
//        System.out.println("size:::"+size);
//        System.out.println("result_size:::"+result.size());
//        if(size > result.size()) {
            ExtList allPattern_sidehead = new ExtList();
            for (int i = 0; i < sideSet.size(); i++) {
                ExtList one = new ExtList();
                ExtList side = sideSet.getExtList(i);
                for (int j = 0; j < side.size(); j++) {
                    one.add(side.getExtListString(j));
                }
                for (int j = 0; j < headSet.size(); j++) {
                    ExtList one_copy = (ExtList) one.clone();
                    ExtList head = headSet.getExtList(j);
                    for (int k = 0; k < head.size(); k++) {
                        one_copy.add(head.getExtListString(k));
                    }
                    allPattern_sidehead.add(one_copy);
                }

            }
            Log.out("allP_sidehead:::" + allPattern_sidehead);
            String nullValue = "N/A";
            if (!GlobalEnv.nullValue.equals("PqVyySBvmTiyfKjsspwt56kXMxwqubX9DXkVNDKN")) {
                nullValue = GlobalEnv.nullValue;
            }

            int result_num = result.size();
            for (int i = 0; i < allPattern_sidehead.size(); i++) {
                ExtList one = allPattern_sidehead.getExtList(i);
                boolean contain2 = false;
                for (int j = 0; j < result_num; j++) {
                    boolean same = true;
                    ExtList result_one = result.getExtList(j);
                    for (int k = 0; k < index.length; k++) {
                        if (index[k] == 2) {
                            break;
                        } else {
                            if (!result_one.getExtListString(k).equals(one.get(k))) {
                                same = false;
                                break;
                            }
                        }
                    }
                    if (same) {
                        contain2 = true;
                        break;
                    }
                }
                if (!contain2) {
                    ExtList tmp = (ExtList) one.clone();
                    for (int j = 0; j < value_num; j++) {
                        tmp.add(nullValue);
                    }
                    result.add(tmp);
                }
            }
//        }
        this.result = result;
        Log.out("finalresult:::"+result);
    }
}
