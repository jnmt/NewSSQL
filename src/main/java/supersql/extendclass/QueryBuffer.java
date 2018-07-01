package supersql.extendclass;

import supersql.codegenerator.AttributeItem;
import supersql.common.Log;
import supersql.parser.FromInfo;
import supersql.parser.WhereInfo;
import supersql.parser.WhereParse;

import java.util.Hashtable;
import java.util.Iterator;

public class QueryBuffer {
    private ExtList schf;
    private ExtList tg;
    private FromInfo fi;
    private Hashtable atts;
    private ExtList aggregate_list;
    private ExtList aggregate_attnum_list;


    public QueryBuffer(ExtList schf){
        this.schf = schf;
    }

    public void setFromInfo(String line){
        fi = new FromInfo(line);
    }

    public void setTg(ExtList tg){
        this.tg = tg;
    }

    public ExtList getSchf(){
        return schf;
    }

    public ExtList getTg(){
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

    public ExtList getAggregate_attnum_list() {
        return aggregate_attnum_list;
    }

    public String makeQuery(WhereInfo where){
        Boolean flag = false;
        StringBuffer buf = new StringBuffer();
        //SELECT句作成
        //make SELECT clause
        buf.append("SELECT ");
        for(int index = 0; index < this.schf.size(); index++){
            int attnum = (Integer)this.schf.get(index);
            String att = atts.get(attnum).toString();
            boolean isAgg = false;
            String func_att = new String();
//            Log.out("aggregate_list::"+aggregate_list);
            if(this.aggregate_attnum_list.contains(attnum)){
                //集約だったらfunction_name(att)の形にして追加
                String function_name = new String();
                String agg_str = new String();
                for(Object o: aggregate_list) {
//                    Log.out("o::"+o);
//                    Log.out("attnum::"+attnum);
//                    Log.out("idxof::"+o.toString().indexOf(attnum));
                    if (Integer.parseInt(o.toString().split(" ")[0]) == attnum) {
                        agg_str = o.toString();
                    }
                }
//                Log.out("agg_str::"+agg_str);
                function_name = agg_str.split(" ")[1];
                func_att = function_name + "(" + att + ")";
                isAgg = true;
            }
            if(!isAgg){
                //集約じゃなかったらそのまま追加
                if(index == 0){
                    buf.append(att);
                }else{
                    buf.append(", "+att);
                }
            }else{
                if(index == 0){
                    buf.append(func_att);
                }else{
                    buf.append(", "+func_att);
                }
            }
        }

        //FROM句作成
        //make From clause
        buf.append(" FROM ");
        buf.append(fi.getLine());

        //WHERE句作成
        //make Where clause
        Iterator e2 = where.getWhereClause().iterator();
        while (e2.hasNext()) {
            WhereParse whe = (WhereParse) e2.next();
//            Log.out("whe::"+whe);
            if (this.tg.containsAll(whe.getUseTables())) {
                if (flag) {
                    buf.append(" AND " + whe.getLine());
//                    Log.info(buf.toString());
                } else {
                    flag = true;
                    buf.append(" WHERE "+whe.getLine());
                }
            }
        }

        //Group By句作成
        buf.append(" GROUP BY ");
        int j = 0;
//        Log.out("schf::"+schf);
//        Log.out("agg_attnum_list::"+aggregate_attnum_list);
        for(Object attnum: this.schf){
            if(!this.aggregate_attnum_list.contains(attnum)) {
                if (j == 0) {
                    buf.append(atts.get((int) attnum).toString());
                    j++;
                }else{
                    buf.append(", " + atts.get((int) attnum).toString());
                }
            }
        }

        buf.append(";");

        return buf.toString();
    }
}
