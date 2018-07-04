package supersql.dataconstructor;

import java.lang.reflect.Array;
import java.util.*;

import com.google.common.collect.HashBasedTable;
import supersql.codegenerator.AttributeItem;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;
import supersql.extendclass.QueryBuffer;
import supersql.parser.FromInfo;
import supersql.parser.FromParse;
import supersql.parser.Preprocessor;
import supersql.parser.Start_Parse;
//ryuryu
import supersql.parser.WhereInfo;
import supersql.parser.WhereParse;

public class MakeSQL {

	//test
	private FromInfo from;

	private WhereInfo where;

	private Hashtable atts;

	private ExtList table_group;

	private ArrayList<Integer> unusedAtts = new ArrayList<>();

	public MakeSQL(Start_Parse p) {
		setFrom(p.get_from_info());
		where = p.whereInfo;
		atts = p.get_att_info();
		Enumeration keys = atts.keys();
		while(keys.hasMoreElements()){
			Object key = keys.nextElement();
			unusedAtts.add((int)key);
		}
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
		Log.out("atts::"+atts);
		HashSet tg1 = new HashSet();
		//SELECT句に属性追加
		for (idx = 0; idx < schf.size(); idx++) {
			itemno = (Integer) (schf.get(idx));
			AttributeItem att1 = (AttributeItem) (atts.get(itemno));

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
			buf.append(getFrom().getLine());
		}
		//tk/////////////

		// Where
		flag = false;
		Iterator e2 = where.getWhereClause().iterator();
		while (e2.hasNext()) {
			WhereParse whe = (WhereParse) e2.next();
			Log.out("whe::"+whe);
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
//	public boolean isRestAtts(){
//
//	}
	public boolean remainUnUsedAtts(){
//		System.out.println("unusedAtts::"+unusedAtts);
		return (unusedAtts.size() > 0);
	}



	public ArrayList<String> makeMultipleSQL(ExtList sep_sch){
		dim.clear();
		ExtList agg_list = Preprocessor.getAggregateList();
		ArrayList<Integer> agg_nums = new ArrayList<>();
		for(Object agg: agg_list){
			agg_nums.add(Integer.parseInt(agg.toString().split(" ")[0]));
		}
		Hashtable<ExtList, ExtList> depend_list = new Hashtable<>();
//		Log.out("sep_sch_size::"+((ExtList)sep_sch.get(0)).size());
		makeDim((ExtList)sep_sch.get(0), 0);
		Log.info("dim::"+dim);
		ExtList dim_all = new ExtList();
		ExtList agg_set = new ExtList();
		for(ArrayList<Integer> d: dim){
			for(int d_num: d){
				if(!agg_nums.contains(d_num)){
					dim_all.add(d_num);
				}
			}
//			Log.out("dim_all::"+dim_all);
//			Log.out("agg_nums::"+agg_nums);
			boolean flag = false;
			ExtList agg_n = new ExtList();
			for(int agg_num: agg_nums){
				//同階層だったら一緒にまとめる
//				Log.out("d::"+d);
				if(d.contains(agg_num)){
					agg_n.add(agg_num);
					flag = true;
				}
//				Log.out("flag::"+flag);
			}
//			Log.out("agg_n::"+agg_n);
			if(flag){
//				Log.out("innn");
				agg_set.add(agg_n);
				ExtList tmp = new ExtList();
				for(Object o: dim_all){
					tmp.add(o);
				}
				depend_list.put(agg_n, tmp);
			}
//			Log.out("depend_list::"+depend_list);
		}
		Log.info("depend_list::"+depend_list);
//		Log.out("agg_set::"+agg_set);
		QueryBuffer qb[] = new QueryBuffer[agg_set.size()];
		ArrayList<String> queries = new ArrayList<>();
		String from_line = getFrom().getLine();
		Hashtable table_alias = new Hashtable();
		for(String f:from_line.split(",")){
			table_alias.put(f.trim().split(" ")[1], f.trim().split(" ")[0]);
		}
		ArrayList<String> usedAtts = new ArrayList<>();
		for(int i = 0; i < qb.length; i++){
			ExtList sep_sch_tmp = new ExtList();
			Object t = agg_set.get(i);
			int num = ((ExtList)t).size();
			if(num > 1){
				for(int l = 0; l < num; l++){
					sep_sch_tmp.add(((ExtList) t).get(l));
				}
			}else {
				sep_sch_tmp.add(((ExtList)t).get(0));
			}
			for(Object o: depend_list.get(agg_set.get(i))){
				sep_sch_tmp.add(o);
			}
			for(Object o: sep_sch_tmp){
				int key = (int)o;
				if(unusedAtts.contains(key)){
					unusedAtts.remove(unusedAtts.indexOf(key));
				}
			}
//			Log.out("sep_sch_tmp::"+sep_sch_tmp);
			qb[i] = new QueryBuffer(sep_sch_tmp);
			Hashtable att_tmp = new Hashtable();
			ExtList att_list = new ExtList();
			for(Object attnum: sep_sch_tmp){
				att_tmp.put(attnum, ((AttributeItem)atts.get(attnum)).getSQLimage());
				att_list.add(((AttributeItem)atts.get(attnum)).getSQLimage());
			}
			qb[i].setAtts(att_tmp);
			ExtList tg = new ExtList();
//			Log.out("att_list::"+att_list);
			for(Object o: att_list){
				if(!tg.contains(o.toString().split("\\.")[0])) {
					tg.add(o.toString().split("\\.")[0]);
				}
			}
//			Log.out("tg::"+tg);
			qb[i].setTg(tg);
			String from_tmp = new String();
			int j = 0;
			for(Object o: tg){
				String table = table_alias.get(String.valueOf(o)).toString();
				if(j == 0) {
					from_tmp = table + " " + o.toString();
					j++;
				}else{
					from_tmp += ", " + table + " " + o.toString();
				}
			}
			qb[i].setFromInfo(from_tmp);
			ExtList agg_tmp = new ExtList();
			for(Object o: agg_list){
				for(Object p: (ExtList)agg_set.get(i)){
					if(o.toString().indexOf(p.toString()) != -1){
						agg_tmp.add(o);
						break;
					}
				}
			}
			qb[i].setAggregate_list(agg_tmp);
			qb[i].setAggregate_attnum_list((ExtList)t);
			queries.add(qb[i].makeQuery(where));
		}

		return queries;
	}

	public void makeDim(ExtList sep_sch_m, int idx){
//		Log.out("sep_sch_m::"+sep_sch_m);
//		Log.out("dimm::"+dim);
		for(int i = 0; i < sep_sch_m.size(); i++){
			if(sep_sch_m.get(i) instanceof ExtList){
				idx++;
				makeDim((ExtList)sep_sch_m.get(i), idx);
				idx--;
			}else{
				try {
					dim.get(idx).add((Integer) sep_sch_m.get(i));
				}catch(IndexOutOfBoundsException e){
					ArrayList<Integer> tmp = new ArrayList<>();
					tmp.add((Integer) sep_sch_m.get(i));
					dim.add(tmp);
				}
			}
		}

	}

	public ArrayList<String> makeRemainSQL(ExtList sep_sch) {
		ExtList sep_sch_l = sep_sch;
		System.out.println("sep_sch_l::"+sep_sch_l);
		ArrayList<String> queries = new ArrayList<>();
		ArrayList<Integer> aggregateNumber = new ArrayList<>();
		for(Object o: Preprocessor.getAggregateList()){
			aggregateNumber.add(Integer.parseInt(o.toString().split(" ")[0]));
		}
		for(Object o: sep_sch_l){
			ExtList tree = ((ExtList)o).unnest();
			for(int j = 0; j < unusedAtts.size(); j++){
				int i = unusedAtts.get(j);
				if(tree.contains(i)){
					for(int k: aggregateNumber){
						((ExtList)o).removeContent(k);
					}
					queries.add(makeSQL((ExtList)o));
					for(Object b: tree){
						int key = (int)b;
						if(unusedAtts.contains(key)){
							unusedAtts.remove(unusedAtts.indexOf(key));
						}
					}
				}
			}
		}
		return queries;
	}
	////tbt end

	public FromInfo getFrom() {
		return from;
	}

	public void setFrom(FromInfo fromInfo) {
		this.from = fromInfo;
	}
}