package supersql.dataconstructor;

import java.util.*;
import java.util.stream.Collectors;

import supersql.codegenerator.AttributeItem;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;
import supersql.extendclass.QueryBuffer;
import supersql.parser.*;
//ryuryu


public class MakeSQL {

	//test
	private FromInfo from;

	private WhereInfo where;

	private Hashtable atts;

	private ExtList table_group;

	public MakeSQL(Start_Parse p) {
		setFrom(p.get_from_info());
		where = p.whereInfo;
		atts = p.get_att_info();
		MakeGroup mg = new MakeGroup(atts, where);
		table_group = mg.getTblGroup();
		Log.out("[MakeSQL:table_group]" + table_group);

	}

	public String makeSQL(ExtList sep_sch) {


		boolean flag;
		int i, idx;
		Integer itemno;
		ExtList schf;
		Log.out("[sep_sch]=" + sep_sch);
		schf = sep_sch.unnest();
		Log.out("[schf]" + schf);
		//			StringBuffer buf = new StringBuffer("SELECT ");
		//hanki start
		StringBuffer buf;

		if (Preprocessor.isAggregate()) {
			buf = new StringBuffer("SELECT ALL ");
		}
		{
			if(Start_Parse.distinct){
				buf = new StringBuffer("SELECT DISTINCT ");
			}
			else{
				buf = new StringBuffer("SELECT ");
			}
			//ryuryu(end)/////////////////////////////////////////////////////
		}
		//hanki end

		int tmp_flag = 0; //ryuryu
//		Log.info("atts::"+atts);
		HashSet tg1 = new HashSet();
		//SELECT句に属性追加
		Hashtable<Integer, String> atts_list = new Hashtable<>();
		for (idx = 0; idx < schf.size(); idx++) {
			itemno = (Integer) (schf.get(idx));
			AttributeItem att1 = (AttributeItem) (atts.get(itemno));
			atts_list.put(itemno, att1.getSQLimage());

			//ryuryu
			/*if (idx != 0) {
				buf.append(", " + att1.getSQLimage());
			} else {
				buf.append(att1.getSQLimage());
			}*/

			//ryuryu(start)//////////////////////////////////////////////////////////////////////////////////////////
			if (idx != 0) {
				buf.append(", " + att1.getSQLimage());
			}
			else{
				buf.append(att1.getSQLimage());
			}


			////			else if(SSQLparser.xpathExist == 1){
			////
			////				if (idx != 0) {
			////					if(att1.getSQLimage().equals(SSQLparser.tmpXpath1)){
			////						buf.append(", " + SSQLparser.Xpath.replace("\"", "'"));
			////						tmp_flag = 1;
			////					}
			////
			////					else if(att1.getSQLimage().equals(SSQLparser.tmpXmlQuery1)){
			////						String tmp_xmlquery = new String();
			////						tmp_xmlquery = (SSQLparser.DB2_XQUERY.replace("\"", "'")).replace((SSQLparser.tmpXmlQuery2 + "',"), (SSQLparser.tmpXmlQuery2 + "' PASSING "));
			////						tmp_xmlquery = tmp_xmlquery.replace((SSQLparser.tmpXmlQuery1 + ")"), (SSQLparser.tmpXmlQuery1 + " AS \"a\")"));
			////						buf.append(", " + tmp_xmlquery);
			////						tmp_flag = 1;
			////					}
			////
			////					else{
			////						if(tmp_flag==0){
			////							buf.append(", " + att1.getSQLimage());
			////						}
			////						else{
			////							buf.append(" " + att1.getSQLimage());
			////							tmp_flag=0;
			////						}
			////					}
			////				}
			//
			//				else {
			//					if(att1.getSQLimage().equals(SSQLparser.tmpXpath1)){
			//						String tmp = SSQLparser.Xpath.replace("\"", "'");
			//						tmp = tmp.replace("),", ")");
			//						buf.append(tmp);
			//
			//						XMLFunction.xpath_first = 1;
			//					}
			//
			//					else if(att1.getSQLimage().equals(SSQLparser.tmpXmlQuery1)){
			//						String tmp_xmlquery = new String();
			//						tmp_xmlquery = (SSQLparser.DB2_XQUERY.replace("\"", "'")).replace((SSQLparser.tmpXmlQuery2 + "',"), (SSQLparser.tmpXmlQuery2 + "' PASSING "));
			//						tmp_xmlquery = tmp_xmlquery.replace((SSQLparser.tmpXmlQuery1 + ")"), (SSQLparser.tmpXmlQuery1 + " AS \"a\")"));
			//						buf.append(tmp_xmlquery);
			//
			//						XMLFunction.xpath_first = 1;
			//					}
			//
			//					else{
			//						buf.append(att1.getSQLimage());
			//					}
			//				}
			//			}
			//ryuryu(end)//////////////////////////////////////////////////////////////////////////////////////////

			for (int j = 0; j < table_group.size(); j++) {
//				Log.out("att1::"+att1.getUseTables());
//				Log.out("able_group::"+table_group.get(j));
//				Log.out("tg1::"+tg1);
				if (((HashSet) (table_group.get(j))).containsAll(att1.getUseTables())) {
					tg1.addAll((HashSet) table_group.get(j));
				}
			}
		}
		Log.out("[tg1]" + tg1);
		QueryBuffer q = new QueryBuffer();
		if(GlobalEnv.isMultiGB() || GlobalEnv.isOrderFrom()) {
			treenum++;
			q.forestNum = treenum;
			q.treeNum = treenum;
			q.setSep_sch(sep_sch);
			q.setAtts(atts_list);
			q.setTg(tg1);
		}
		// From
		flag = false;

		buf.append(" FROM ");

		//Iterator it = tg1.iterator();		//changed by goto 20120523

		Log.out("FROM_INFO:" + getFrom());

		//tk to use outer join////
		try{
			//changed by goto 20120523 start
			//���܂ł�SSQL�ł́A��ӂȑ����̏ꍇ�ł����Ă��K���������̑O��
			//�u�e�[�u����.�v��t����(qualify����)�K�v��������
			//���L�̕ύX�ɂ��A���̖������P����
			//�i����ɂ��A�ʏ��SQL���l�A���j�[�N�ȗ񖼂̑O�ɂ�qualification�͕s�v�ƂȂ�j

			buf.append(((FromParse) getFrom().getFromTable().get("")).getLine());
			/*while (it.hasNext()) {
				String tbl = (String) it.next();
				tbl = (String) it.next();

				Log.out("tbl:"+tbl);
				Log.out("buf@Make:"+ buf);

				if (flag) {
					buf.append(", "
						+ ((FromParse) from.getFromTable().get(tbl)).getLine());
				} else {
					flag = true;
					buf.append(((FromParse) from.getFromTable().get(tbl)).getLine());
				}
			}*/
			//changed by goto 20120523 end

			//tk to use outer join//////////////
		}catch(NullPointerException e){
//			buf.append(getFrom().getLine());
			//add tbt 180711
			//not to use unused table in from clause
			String fClauseBefore = getFrom().getLine();
			String fClauseAfter = new String();
			if(!From.hasJoinItems()) {
				for (String tb : fClauseBefore.split(",")) {
					tb = tb.trim();
					String tAlias = new String();
					if(tb.split(" ").length == 2) {
						tAlias = tb.split(" ")[1];
					}else{
						tAlias = tb;
					}
					if (tg1.contains(tAlias)) {
						fClauseAfter += tb;
						fClauseAfter += ",";
					}
				}
				if (fClauseAfter.charAt(fClauseAfter.length() - 1) == ',') {
					fClauseAfter = fClauseAfter.substring(0, fClauseAfter.length() - 1);
				}
				buf.append(fClauseAfter);
			}else{
				buf.append(fClauseBefore);
			}
			if(GlobalEnv.isOrderFrom() || GlobalEnv.isMultiGB()) {
				if (fClauseAfter != "") {
					q.setFromInfo(fClauseAfter);
				} else {
					q.setFromInfo(fClauseBefore);
				}
				q.setAggregate_attnum_list(new ExtList());
				q.setAggregate_list(new ExtList());
				q.makeQuery(where);
				ArrayList<QueryBuffer> qb = new ArrayList<>();
				qb.add(q);
				GlobalEnv.qbs.add(qb);
			}
		}

		//tk/////////////

		// Where
		flag = false;
		Iterator e2 = where.getWhereClause().iterator();
		while (e2.hasNext()) {
			WhereParse whe = (WhereParse) e2.next();
//			Log.out("whe::"+whe);
			if (tg1.containsAll(whe.getUseTables())) {
				if (flag) {
					buf.append(" AND " + whe.getLine());
//					Log.info(buf.toString());
				} else {
					flag = true;
					buf.append(" WHERE " + whe.getLine());
//					Log.info(buf.toString());
				}
			}
		}

		// buf.append(" limit 5 offset 0"); //todo if infinite-scroll flag = true, add this to sql query.
		if (! GlobalEnv.getdbms().equals("db2")){
			buf.append(";");
		}

		return buf.toString();

	}

	//tbt make 180601
	//for divisions of a SQL query depends on aggregates
	private ArrayList<ArrayList<Integer>> dim = new ArrayList();
	private int treenum = -1;

	//make multiple queries depends on aggregation
	public ArrayList<QueryBuffer> makeMultipleSQL(ExtList sep_sch){
		treenum++;
		ExtList unusedAtts = sep_sch.unnest();
		int unusedBeforeNum = unusedAtts.size();

		long beforeMakeMultipleSQL_Tree = System.currentTimeMillis();
		dim.clear();
		ExtList agg_list = Preprocessor.getAggregateList(); //get aggrigate list
		ArrayList<Integer> agg_nums = new ArrayList<>(); //to contain only the index of attributes which is aggregated(not aggregate type name)
		for(Object agg: agg_list){
			agg_nums.add(Integer.parseInt(agg.toString().split(" ")[0]));
		}
		Hashtable<ExtList, ExtList> depend_list = new Hashtable<>();
		//make dependency list of each attributes
		makeDim((ExtList)sep_sch.get(0));
		ExtList notAggregatedNum = new ExtList();
		ExtList agg_set = new ExtList();
		//See from the top dimension of dim list
		//We make dependency list based on aggregation.
		//e.g.
		//if sep_sch is [0, 1, [[2], 3, 4], 5], dim = [[0, 1, 5], [3, 4], [2]], aggregate is 2 and 4.
		//we make depend_list = {[2]=[0, 1, 5, 3, 4], [4]=[0, 1, 5, 3]}
		for(ArrayList<Integer> d: dim){
			// その階層で集約に使われている属性番号と使われていない属性番号の分別
			ArrayList<Integer> aggregated = (ArrayList)d.stream()
					.filter((num) -> agg_nums.contains(num))
					.collect(Collectors.toList());
			ArrayList<Integer> notAggregated = (ArrayList)d.stream()
					.filter((num) -> !agg_nums.contains(num))
					.collect(Collectors.toList());
			// 次階層でも使いたいので使われていない方はnotAggregatedNumに追加していく
			notAggregated.forEach((num) -> notAggregatedNum.add(num));
			// 集約があったら(使われている属性があったら)depend_listに追加, ExtListに変化させる(面倒)
			ExtList aggregatedExt = new ExtList();
			aggregated.forEach((num) -> aggregatedExt.add(num));
			ExtList notAggregatedExt = new ExtList();
			notAggregatedNum.forEach((num) -> notAggregatedExt.add(num));
			if(aggregated.size() > 0){
				depend_list.put(aggregatedExt, notAggregatedExt);
			}
		}
		depend_list.entrySet().forEach((entry) -> agg_set.add(entry.getKey()));

		//make query buffer. the numbers of qb is agg_set.size()
		ArrayList<QueryBuffer> qbs = new ArrayList<>();
		for(Object t: agg_set){
			QueryBuffer qb;
			ExtList sep_sch_tmp = new ExtList();
			// 集約の個数
			int num = ((ExtList) t).size();
			// どの階層での集約か知りたい
			int dim_num = 0;
			for (int j = 0; j < dim.size(); j++) {
				if (dim.get(j).contains(((ExtList) t).get(0))) {
					dim_num = j;
					break;
				}
			}
			// それを元にその階層までの属性番号を抽出してくる
			ExtList tmp_sep = extractSepSch(sep_sch, dim_num);

			//sep_sch_tmp contains use attributes.
			for (int l = 0; l < num; l++) {
				sep_sch_tmp.add(((ExtList) t).get(l));
			}
			for (Object o : depend_list.get(t)) {
				sep_sch_tmp.add(o);
			}
			ExtList tmp_sep_flat = tmp_sep.unnest();
			// 抽出してきた属性番号に該当しないtmp_sepの要素を消す
			tmp_sep_flat.stream()
					.filter((n) -> !sep_sch_tmp.contains(n))
					.forEach((n) -> tmp_sep.removeContent(n));

			//remove attribute number from unusedAtts.
			for(Object o: sep_sch_tmp){
				int key = (int)o;
				if(unusedAtts.contains(key)){
					unusedAtts.remove(unusedAtts.indexOf(key));
				}
			}
			//set sep_sch to qb
			qb = new QueryBuffer();
			qb.treeNum = treenum;
			qb.setSep_sch(tmp_sep);
			Hashtable att_tmp = new Hashtable();
			ExtList att_list = new ExtList();
			//make att_tmp and att_list.
			//att_tmp is a set of attribute number and attribute name.
			//att_list is a list of attribute name.
			for(Object attnum: sep_sch_tmp){
				att_tmp.put(attnum, atts.get(attnum));
				att_list.add(((AttributeItem)atts.get(attnum)).getSQLimage());
			}
			//set att_tmp to qb
			qb.setAtts(att_tmp);
			HashSet tg = new HashSet();
			//make tg. tg is a list of using table aliases.
			for(Object o: att_list){
				if(!tg.contains(o.toString().split("\\.")[0])) {
					tg.add(o.toString().split("\\.")[0]);
				}
			}
			//set tg to qb
			qb.setTg(tg);
			String from = getFrom().getLine();
			qb.setFromInfo(from);
			ExtList agg_tmp = new ExtList();
			//make aggregation list (e.g.[2 count]) which will be used.
			for(Object o: agg_list){
				for(Object p: (ExtList)t){
					if(o.toString().indexOf(p.toString()) != -1){
						agg_tmp.add(o);
						break;
					}
				}
			}
			//set aggregation list to qb.
			qb.setAggregate_list(agg_tmp);
			//set aggregation attribute num to qb.
			qb.setAggregate_attnum_list((ExtList)t);
			//make query by qb
			qb.makeQuery(where);
			long aftereMakeMultipleSQL_One = System.currentTimeMillis();
//			System.out.println();
//			Log.info("Make One SQL Time : " + (aftereMakeMultipleSQL_One - beforeMakeMultipleSQL_One) + "ms");
//			Log.info("Query is : " + qb.getQuery());
			qbs.add(qb);
		}
		if(unusedAtts.size() == unusedBeforeNum){
			QueryBuffer qb = new QueryBuffer();
			qb.setSep_sch(sep_sch);
			qb.treeNum = treenum;
			Hashtable<Integer, String> att_set = new Hashtable<>();
			for (int i = 0; i < sep_sch.unnest().size(); i++) {
				int attnum = (int)sep_sch.unnest().get(i);
				String attname = atts.get(attnum).toString();
				att_set.put(attnum, attname);
			}
			qb.setAtts(att_set);
			HashSet<String> tg = new HashSet<>();
			for(Map.Entry<Integer, String> entry: att_set.entrySet()) {
				String name = entry.getValue();
				if(!tg.contains(name.split("\\.")[0])) {
					tg.add(name.split("\\.")[0]);
				}
			}
			qb.setTg(tg);
			String from = getFrom().getLine();
			qb.setFromInfo(from);
			ExtList tmp = new ExtList();
			qb.setAggregate_list(tmp);
			//set aggregation attribute num to qb.
			qb.setAggregate_attnum_list(tmp);
			//make query by qb
			qb.makeQuery(where);
			qbs.add(qb);
//			System.out.println();
//			Log.info("Query is : " + qb.getQuery());
			//remove attribute numbers from unusedAtts
			for(Object b: sep_sch.unnest()){
				int key = (int)b;
				if(unusedAtts.contains(key)){
					unusedAtts.remove(unusedAtts.indexOf(key));
				}
			}
		}else if(unusedAtts.size() > 0){
			int dim_num_set = -1;
			for (int i = 0; i < unusedAtts.size(); i++) {
				int uAtt = (int)unusedAtts.get(i);
				for (int j = 0; j < dim.size(); j++) {
					if(dim.get(j).contains(uAtt)){
						if(dim_num_set < j){
							dim_num_set = j;
							break;
						}
					}
				}
			}
			ExtList sep_sch_remain = new ExtList();
			sep_sch_remain = extractSepSch(sep_sch, dim_num_set);
			for (int i = 0; i < agg_set.size(); i++) {
				ExtList agg = (ExtList)agg_set.get(i);
				for (int j = 0; j < agg.size(); j++) {
					int aggnum = (int)agg.get(j);
					sep_sch_remain.removeContent(aggnum);
				}
			}
			QueryBuffer qb = new QueryBuffer();
			qb.setSep_sch(sep_sch_remain);
			qb.treeNum = treenum;
			Hashtable<Integer, String> att_set = new Hashtable<>();
			for (int i = 0; i < sep_sch_remain.unnest().size(); i++) {
				int attnum = (int)sep_sch_remain.unnest().get(i);
				String attname = atts.get(attnum).toString();
				att_set.put(attnum, attname);
			}
			qb.setAtts(att_set);
			HashSet<String> tg = new HashSet<>();
			for(Map.Entry<Integer, String> entry: att_set.entrySet()) {
				String name = entry.getValue();
				if(!tg.contains(name.split("\\.")[0])) {
					tg.add(name.split("\\.")[0]);
				}
			}
			qb.setTg(tg);
			String from = getFrom().getLine();
			qb.setFromInfo(from);
			ExtList tmp = new ExtList();
			qb.setAggregate_list(tmp);
			//set aggregation attribute num to qb.
			qb.setAggregate_attnum_list(tmp);
			//make query by qb
			qb.makeQuery(where);
			qbs.add(qb);
//				System.out.println();
//				Log.info("Query is : " + qb.getQuery());
				//remove attribute numbers from unusedAtts
			for(Object b: sep_sch_remain.unnest()){
				int key = (int)b;
				if(unusedAtts.contains(key)){
					unusedAtts.remove(unusedAtts.indexOf(key));
				}
			}
		}
		return qbs;
	}



	//make dimensions about query dependency
	//[0, 1, [[2], 3, 4], 5] -> [[0, 1, 5], [3, 4], [2]]
	public void makeDim(ExtList sep_sch){
		makeDim(sep_sch, 0);
	}

	public void makeDim(ExtList sep_sch_m, int idx){
		for(int i = 0; i < sep_sch_m.size(); i++){
			if(sep_sch_m.get(i) instanceof ExtList){
				//if the child is extlist, increment idx and recursive call
				idx++;
				makeDim((ExtList)sep_sch_m.get(i), idx);
				idx--;
			}else{
				if(dim.size() > idx){
					//if there are already exist list corresponding to idx, add attribute number
					dim.get(idx).add((Integer) sep_sch_m.get(i));
				}else{
					//if there are NOT, to contain attributes make empty lists and add to dim
					//e.g.
					//idx = 2 and dim is [[1]]
					//dim become [[0, 1], [], []]
					int sub = idx - dim.size();
					for (int j = 0; j <= sub; j++) {
						ArrayList<Integer> tmp = new ArrayList<>();
						dim.add(tmp);
					}
					//and add
					//dim become [[0, 1], [], [2]]
					dim.get(idx).add((Integer) sep_sch_m.get(i));
				}
			}
		}

	}

	public ExtList extractSepSch(ExtList src, int lim) {
		ExtList result = new ExtList();
		for (int i = 0; i < src.size(); i++) {
			Object factor = src.get(i);
			if(factor instanceof ExtList){
				if(lim >= 0){
					ExtList tmp = extractSepSch((ExtList)factor, lim - 1);
					result.add(tmp);
				}
			}else{
				result.add(factor);
			}
		}
		return result;
	}

	////tbt end

	public FromInfo getFrom() {
		return from;
	}

	public void setFrom(FromInfo fromInfo) {
		this.from = fromInfo;
	}
}