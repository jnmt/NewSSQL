//proposed process
package supersql.dataconstructor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;


import jdk.nashorn.internal.objects.Global;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.common.Utils;
import supersql.dataconstructor.optimizer.predicates.Predicate;
import supersql.db.ConnectDB;
import supersql.db.GetFromDB;
import supersql.db.SQLManager;
import supersql.extendclass.ExtList;
import supersql.extendclass.QueryBuffer;
import supersql.parser.Preprocessor;
import supersql.parser.Start_Parse;

import javax.management.Query;

public class DataConstructor {

	private ExtList data_info;

	private ArrayList<SQLQuery> sqlQueries = null;
	private QueryDivider qd;
	private String key = null;
	private Attribute keyAtt = null;
	private int col = -1;
	private long[] exectime = new long[4];
	private final int ISDIVIS = 0;
	private final int MAKESQL = 1;
	private final int EXECSQL = 2;
	private final int MKETREE = 3;
	private boolean flag = true;
	public static String SQL_string; // added by goto 20130306
										// "FROM鐃淑わ申鐃緒申鐃緒申鐃緒申鐃出削申"

	public DataConstructor(Start_Parse parser) {

		ExtList sep_sch;
		ExtList sep_data_info;

		MakeSQL msql = null;

		// Make schema
		sep_sch = parser.sch;
		GlobalEnv.afterMakeSch = System.currentTimeMillis();
//		Log.info("Schema: " + sep_sch);

		// Check Optimization Parameters
		if (GlobalEnv.getOptLevel() == 0 || !GlobalEnv.isOptimizable()
				|| Start_Parse.isDbpediaQuery() || Start_Parse.isJsonQuery()) {
			sqlQueries = null;
		} else {
		// Initialize QueryDivider
			long start = System.nanoTime();

//			try {
//				qd = new QueryDivider(parser);
//
//				if (qd.MakeGraph()) {
//					// if graph was made successfully, divide
//					sqlQueries = qd.divideQuery();
//				}
//			} catch (Exception e) {
//				;
//				// System.out.println( e.getMessage() ); //commented out by goto
//				// 20120620
//			}

			long end = System.nanoTime();
			exectime[ISDIVIS] = end - start;
		}

		// Make SQL
		if ((sqlQueries == null || sqlQueries.size() < 2)
				&& !Start_Parse.isDbpediaQuery()) {
			// if graph was not made successfully or
			// if graph has only one connected component
			// query cannot be divided
			GlobalEnv.beforeMakeSQL = System.currentTimeMillis();
			msql = new MakeSQL(parser);
			GlobalEnv.afterMakeSQL = System.currentTimeMillis();
		}
		sep_data_info = new ExtList();
		GlobalEnv.beforeSchemaToData = System.currentTimeMillis();
		if (Start_Parse.isDbpediaQuery()) {
//			sep_data_info = schemaToData(parser, sep_sch, sep_data_info);
		} else if (Start_Parse.isJsonQuery()) {
//			sep_data_info = schemaToDataFromApi(parser, msql, sep_sch,
//					sep_data_info);
		} else {
			sep_data_info = schemaToData(parser, msql, sep_sch, sep_data_info);
		}
		GlobalEnv.afterSchemaToData = System.currentTimeMillis();
		data_info = sep_data_info;

		Log.out("## Result ##");
		Log.out(data_info);
	}

//	private ExtList schemaToDataFromApi(Start_Parse parser, MakeSQL msql,
//			ExtList sep_sch, ExtList sep_data_info) {
//		String[] fromInfos = Start_Parse.get_from_info_st()
//				.split("api\\(|,|\\)");
//		String url = fromInfos[1];
//		url = url.substring(url.indexOf("'") + 1,
//				url.indexOf("'", url.indexOf("'") + 1));
//		int attno = parser.get_att_info().size();
//		String[] array = new String[attno];
//		int i = 0;
//		for (Object info : parser.get_att_info().values()) {
//			String infoText = ((AttributeItem) info).toString();
//			array[i] = infoText;
//			i++;
//		}
//		sep_data_info = getDataFromApi(url, array, msql, sep_sch);
//		sep_data_info = makeTree(sep_sch, sep_data_info);
//		return sep_data_info;
//	}

//	private ExtList getDataFromApi(String url,
//			String[] array, MakeSQL msql, ExtList sep_sch) {
//		ExtList<ExtList<String>> data = new ExtList<ExtList<String>>();
//		String createSql = "";
//		String insertSql = "";
//		try {
//			ArrayList<String> newArray = new ArrayList<String>();
//			String fromLine = "";
//			for(int i = 0; i < array.length; i++){
//				String tableName = array[i].split("\\.")[0];
//				if(!newArray.contains(tableName)){
//					newArray.add(tableName);
//					fromLine += " " + tableName + ",";
//				}
//			}
//			fromLine = fromLine.substring(0, fromLine.length() - 1);
//			for (int i = 0; i < newArray.size(); i++) {
//				ArrayList<String> elements = new ArrayList<String>();
//				String element = newArray.get(i);
//				String itemsUrl = url.replaceAll(":table_name", element);
//				String itemsJson = Utils.sendGet(itemsUrl);
//				JSONArray items = new JSONArray(itemsJson);
//				for (int j = 0; j < items.length(); j++) {
//					JSONObject item = items.getJSONObject(j);
//					Iterator<String> keyIterator = item.keys();
//					if (j == 0) {
//						createSql += "CREATE TABLE " + element + "(";
//						while (keyIterator.hasNext()) {
//							String key = keyIterator.next();
//							createSql += key + ",";
//						}
//						createSql = createSql.substring(0, createSql.length() - 1) + ");\n";
//					}
//					insertSql += "INSERT INTO " + element + " VALUES " + "(";
//					keyIterator = item.keys();
//					while(keyIterator.hasNext()){
//						String key = keyIterator.next();
//						insertSql += "'" + item.get(key).toString() + "',";
//					}
//					insertSql = insertSql.substring(0, insertSql.length() - 1) + ");\n";
//				}
//			}
//
//			msql.setFrom(new FromInfo(fromLine));
//			
//			String sqlString = msql.makeSQL(sep_sch);
//
//			SQLManager manager = new SQLManager("jdbc:sqlite::memory:",
//					GlobalEnv.getusername(), "org.sqlite.JDBC", GlobalEnv.getpassword());
//			manager.ExecSQL(sqlString, createSql, insertSql);
//			data = manager.GetBody();
//
//			return data;
//		} catch (Exception e) {
//			Log.err("Could not connect to the Api server");
//			e.printStackTrace();
//			throw new IllegalStateException();
//		}
//	}
//
//	private ExtList schemaToData(Start_Parse parser, ExtList sep_sch,
//			ExtList sep_data_info) {
//		int attno = parser.get_att_info().size();
//		String[] array = new String[attno];
//		int i = 0;
//		for (Object info : parser.get_att_info().values()) {
//			String infoText = ((AttributeItem) info).toString();
//			array[i] = infoText;
//			i++;
//		}
//		sep_data_info = getDataFromDBPedia(parser.get_where_info()
//				.getSparqlWhereQuery(), array);
//		sep_data_info = makeTree(sep_sch, sep_data_info);
//		return sep_data_info;
//	}

	private ExtList schemaToData(Start_Parse parser, MakeSQL msql,
			ExtList sep_sch, ExtList sep_data_info) {

		long start, end;
		if (msql != null) {
			GlobalEnv.beforeGetFromDB = System.currentTimeMillis();
			getFromDB(msql, sep_sch, sep_data_info);
			GlobalEnv.afterGetFromDB = System.currentTimeMillis();
			//tbt add 1807118
			//make nested_tuples for each trees from forest
			GlobalEnv.beforeMakeTree = System.currentTimeMillis();
			if(GlobalEnv.isMultiQuery()){
				ExtList result = new ExtList();
				for (int i = 0; i < GlobalEnv.qbs.size(); i++) {
					ArrayList<QueryBuffer> qb = GlobalEnv.qbs.get(i);
					for (int j = 0; j < qb.size(); j++) {
						QueryBuffer q = qb.get(j);
						ExtList flatResult = new ExtList(q.getResult());
						q.constructedResult = makeTree(q.sep_sch, flatResult);
						q.showDebug();
					}
				}
				//merge constructed result
				ArrayList<ArrayList<QueryBuffer>> sameTree = new ArrayList<>();
				for (int i = 0; i < GlobalEnv.qbs.size(); i++) {
					ArrayList<QueryBuffer> qb = GlobalEnv.qbs.get(i);
					for (int j = 0; j < qb.size(); j++) {
						QueryBuffer q = qb.get(j);
						if(sameTree.size() >= q.treeNum + 1){
							sameTree.get(q.treeNum).add(q);
						}else{
							ArrayList<QueryBuffer> tmp = new ArrayList<>();
							tmp.add(q);
							sameTree.add(tmp);
						}
					}
				}
				for (int i = 0; i < sameTree.size(); i++) {
					ArrayList<QueryBuffer> tree = sameTree.get(i);
					System.out.println("----tree start----");
					for (int j = 0; j < tree.size(); j++) {
						tree.get(j).showDebug();
					}
					System.out.println("++++tree end++++");
				}
				for (int i = 0; i < sameTree.size(); i++) {
					if(sameTree.get(i).size() > 1){
						ArrayList<QueryBuffer> tree = sameTree.get(i);
						QueryBuffer qb_result = tree.get(0);
						for (int j = 1; j < tree.size(); j++) {
							qb_result = mergeQueryBuffer(qb_result, tree.get(j));
						}
					}
				}
				System.exit(0);
			}else {
				sep_data_info = makeTree(sep_sch, sep_data_info);
			}
			GlobalEnv.afterMakeTree = System.currentTimeMillis();
			//tbt end
		} else {
			getTuples(sep_sch, sep_data_info);
			start = System.nanoTime();
			sep_data_info = MakeTree(qd.getSchema());
//			 System.out.println(sep_data_info);
			end = System.nanoTime();

			exectime[MKETREE] = end - start;
		}

		return sep_data_info;

	}

	ArrayList<Integer> plist;

	private QueryBuffer mergeQueryBuffer(QueryBuffer qb1, QueryBuffer qb2) {
		ExtList sep_sch1 = qb1.sep_sch;
		ExtList sep_sch2 = qb2.sep_sch;

		ExtList cr1 = qb1.constructedResult;
		ExtList cr2 = qb2.constructedResult;



		ExtList resultss = mergeSepSch((ExtList)sep_sch1.get(0), (ExtList)sep_sch2.get(0));
		System.out.println("mergedSepSch:::"+resultss);
		System.exit(0);
		ExtList result = mergeResult(sep_sch1, sep_sch2, cr1, cr2);
		return null;
	}

	private ExtList mergeSepSch(ExtList sep_sch1, ExtList sep_sch2) {
		ExtList ssf1 = sep_sch1.unnest();
		ExtList ssf2 = sep_sch2.unnest();
		ExtList resultssf = new ExtList();
		TreeSet ts = new TreeSet();
		for (int i = 0; i < ssf1.size(); i++) {
			ts.add(Integer.parseInt(ssf1.get(i).toString()));
		}
		for (int i = 0; i < ssf2.size(); i++) {
			ts.add(Integer.parseInt(ssf2.get(i).toString()));
		}
		Iterator itr = ts.iterator();
		while(itr.hasNext()){
			resultssf.add(itr.next());
		}
		plist = new ArrayList<>();
		for (int i = 0; i < resultssf.size(); i++) {
			if(ssf1.contains(resultssf.get(i))){
				if(ssf2.contains(resultssf.get(i))){
					plist.add(2);
				}else {
					plist.add(1);
				}
			}else{
				plist.add(0);
			}
		}
		ExtList resultss = mergeSepSch(sep_sch1, sep_sch2, true);
		return resultss;
	}

	private int idx1 = 0;
	private int idx2 = 0;

	private ExtList mergeSepSch(ExtList sep_sch1, ExtList sep_sch2, Boolean hoge){
		ExtList result =new ExtList();

		while(plist.size() > 0){
			if(plist.get(0) == 2){
				result.add(Integer.parseInt(sep_sch1.get(idx1).toString()));
				idx1++;
				idx2++;
			}else if(plist.get(0) == 1){
				result.add(Integer.parseInt(sep_sch1.get(idx1).toString()));
				idx1++;
			}else{
				result.add(Integer.parseInt(sep_sch2.get(idx2).toString()));
				idx2++;
			}
			plist.remove(0);

			if(idx2 >= sep_sch2.size() && idx1 >= sep_sch1.size()){
				break;
			}
			if(plist.get(0) == 2 && (idx1 >= sep_sch1.size() || idx2 >= sep_sch2.size())){
				break;
			}
			if(idx2 >= sep_sch2.size()){
				idx2--;
			}
			if(idx1 >= sep_sch1.size()){
				idx1--;
			}
			ExtList tmp;
			if(sep_sch1.get(idx1) instanceof ExtList && !(sep_sch2.get(idx2) instanceof ExtList)){
				if(plist.get(0) == 0){
					continue;
				}
				int pre_idx1 = idx1;
				idx1 = 0;
				tmp = mergeSepSch((ExtList)sep_sch1.get(pre_idx1), sep_sch2, true);
				idx1 = pre_idx1 + 1;
				result.add(tmp);
			}else if(!(sep_sch1.get(idx1) instanceof ExtList) && sep_sch2.get(idx2) instanceof ExtList){
				if(plist.get(0) == 1){
					continue;
				}
				int pre_idx2 = idx2;
				idx2 = 0;
				tmp = mergeSepSch(sep_sch1, (ExtList)sep_sch2.get(pre_idx2), true);
				idx2 = pre_idx2 + 1;
				result.add(tmp);
			}else if(sep_sch1.get(idx1) instanceof ExtList && sep_sch2.get(idx2) instanceof ExtList){
				int pre_idx1 = idx1;
				idx1 = 0;
				int pre_idx2 = idx2;
				idx2 = 0;
				tmp = mergeSepSch((ExtList)sep_sch1.get(pre_idx1), (ExtList)sep_sch2.get(pre_idx2), true);
				idx1 = pre_idx1 + 1;
				idx2 = pre_idx2 + 1;
				result.add(tmp);
			}
		}
		return result;
	}

	private ExtList mergeResult(ExtList sep_sch1, ExtList sep_sch2, ExtList cr1, ExtList cr2) {
		return null;
	}

	static int count = 0;


	private ExtList[] getTuples(ExtList sep_sch, ExtList sep_data_info) {

		long start, end;
		start = System.nanoTime();

		ExtList[] table;
		GetFromDB gfd;
		int comp_size;

		comp_size = sqlQueries.size();
		table = new ExtList[comp_size];

		if (GlobalEnv.isMultiThread()) {
			System.out.println("[Enter MultiThread mode]");
			ConnectDB cdb = new ConnectDB(GlobalEnv.geturl(),
					GlobalEnv.getusername(), GlobalEnv.getDriver(),
					GlobalEnv.getpassword());
			System.out.println(GlobalEnv.geturl() + GlobalEnv.getusername()
					+ GlobalEnv.getpassword());

			cdb.setName("CDB1");
			cdb.run();

			gfd = new GetFromDB(cdb);
		}

		else {
			gfd = new GetFromDB();
		}

		long time = 0;

		// changed by goto 20120630
		Log.info("sqlQueries.size() = " + sqlQueries.size());
		for (int i = 0; i < sqlQueries.size() ; i++) {
			table[i] = new ExtList();

			long time1 = System.nanoTime();
			String s = sqlQueries.get(i).getString();
			time += (System.nanoTime() - time1);

			gfd.execQuery(s, table[i]);
			sqlQueries.get(i).setResult(table[i]);
		}

		gfd.close();
		end = System.nanoTime();

		exectime[EXECSQL] = end - start - time;
		exectime[MAKESQL] = time;

		Log.out("## DB result ##");

		return table;

	}

	private ExtList divideSepSch(ExtList list){
		ExtList sameList = new ExtList();
		ExtList result = new ExtList();
		Boolean noExtList = true;
		for (int i = 0; i < list.size(); i++) {
			Object factor = list.get(i);
			if(factor instanceof ExtList){
				noExtList = false;
				ExtList tmp = divideSepSch((ExtList)factor);
				for (int j = 0; j < tmp.size(); j++) {
					ExtList oneSepSch = new ExtList(sameList);
					oneSepSch.add(tmp.get(j));
					result.add(oneSepSch);
				}
			}else{
				sameList.add(factor);
				if(result.size() > 0){
					for (int j = 0; j < result.size(); j++) {
						((ExtList)result.get(j)).add(factor);
					}
				}
			}
		}
		if(noExtList){
			ExtList tmp = new ExtList();
			tmp.add(list);
			return  tmp;
		}else{
			return result;
		}
	}

	private ExtList getFromDB(MakeSQL msql, ExtList sep_sch,
			ExtList sep_data_info) {

		// MakeSQL
		long start, end;
		start = System.nanoTime();
		//tbt add 180601

		GlobalEnv.qbs = new ArrayList<>();
		long makesql_start = 0;
		if(!GlobalEnv.isMultiQuery()) {
			makesql_start = System.currentTimeMillis();
			SQL_string = msql.makeSQL(sep_sch);
			long makesql_end = System.currentTimeMillis();
			System.out.println();
			Log.info("Make SQL Time:" + (makesql_end - makesql_start) + "ms");
			Log.info("Query is : " + SQL_string);
		}else{
			//if the query contains aggregations, divide query.
			makesql_start = System.currentTimeMillis();
			int treeNum = sep_sch.size();
			for (int i = 0; i < treeNum; i++) {
				ExtList result = divideSepSch((ExtList)sep_sch.get(i));
				ArrayList<QueryBuffer> qb = new ArrayList<>();
				for (int j = 0; j < result.size(); j++) {
					ExtList tmp = new ExtList();
					tmp.add(result.get(j));
//					System.out.println("sep_sch is "+result.get(j));
					qb = new ArrayList<>(msql.makeMultipleSQL(tmp));
					for (QueryBuffer q: qb) {
						q.forestNum = i;
					}
					GlobalEnv.qbs.add(qb);
				}
			}
//			System.out.println("sep_sch_final:::"+sep_sch);
		}
		end = System.nanoTime();
		exectime[MAKESQL] = end - start;
		Log.out("## SQL Query ##");
		if(!GlobalEnv.isMultiQuery())
			Log.out(SQL_string);
		else {
			for (int i = 0; i < GlobalEnv.qbs.size(); i++) {
				ArrayList<QueryBuffer> qb_tmp = GlobalEnv.qbs.get(i);
				for (int j = 0; j < qb_tmp.size(); j++) {
					QueryBuffer q = qb_tmp.get(j);
					System.out.println("Forest is "+q.forestNum);
					System.out.println("Tree is "+q.treeNum);
					System.out.println("sep_sch is "+q.sep_sch);
					System.out.println("query is "+q.getQuery());
				}
				System.out.println();

			}
		}

		// Connect to DB
		start = System.nanoTime();

		GetFromDB gfd;
		if (GlobalEnv.isMultiThread()) {
			System.out.println("[Enter MultiThread mode]");
			ConnectDB cdb = new ConnectDB(GlobalEnv.geturl(),
					GlobalEnv.getusername(), GlobalEnv.getDriver(),
					GlobalEnv.getpassword());
			System.out.println(GlobalEnv.geturl() + GlobalEnv.getusername()
					+ GlobalEnv.getpassword());

			cdb.setName("CDB1");
			cdb.run();

			gfd = new GetFromDB(cdb);
		}

		else {
			gfd = new GetFromDB();
		}
		//180705 tbt add to retrieve data by multiple SQL queries
		//Be aware of the deference between shallow copy and deep copy.
		if(GlobalEnv.isMultiQuery()){
			for (ArrayList<QueryBuffer> qb: GlobalEnv.qbs) {
				for (QueryBuffer q: qb) {
					Long execQuery_start = System.currentTimeMillis();
					gfd.execQuery(q.getQuery(), sep_data_info);
					Long execQuery_end = System.currentTimeMillis();
					Log.info("tuples num : " + sep_data_info.size());
					Log.info("Query Exec Time taken:" + (execQuery_end - execQuery_start) + "ms");
					ExtList tmp = new ExtList(sep_data_info);
					q.setResult(tmp);
				}
			}
		}else {
			Long execQuery_start = System.currentTimeMillis();
			gfd.execQuery(SQL_string, sep_data_info);
			Long execQuery_end = System.currentTimeMillis();
			Log.info("tuples num : " + sep_data_info.size());
			Log.info("Query Exec Time taken:" + (execQuery_end - execQuery_start) + "ms");
		}
		gfd.close();
		end = System.nanoTime();
		exectime[EXECSQL] = end - start;

		Log.info("## DB result ##");
		if(!GlobalEnv.isMultiQuery())
			Log.out("result:"+sep_data_info);
		else{
			for (ArrayList<QueryBuffer> qb: GlobalEnv.qbs) {
				for (QueryBuffer q: qb) {
					System.out.println("Forest number:"+q.forestNum);
					System.out.println("Tree is "+q.treeNum);
					System.out.println("sep_sch is "+q.sep_sch);
					System.out.println("result:"+q.getResult());
				}
			}
		}
		/*
		if(GlobalEnv.isMultiQuery()) {
			ArrayList<QueryBuffer> qbs_flat = new ArrayList<>();
			for (ArrayList<QueryBuffer> qb: qbs) {
				for (QueryBuffer q:qb){
					qbs_flat.add(q);
				}
			}
			ExtList synthesizedResult = new ExtList();
			ExtList attributeList = new ExtList();
			for(int i = 0; i < sep_sch.size(); i++){
				ExtList tmp = new ExtList();
				ExtList tmp2 = new ExtList();
				synthesizedResult.add(tmp);
				attributeList.add(tmp2);
			}
			for (int i = 0; i < qbs_flat.size(); i++) {
				QueryBuffer qb = qbs_flat.get(i);
				if(((ExtList)synthesizedResult.get(qb.forestNum)).size() == 0){
					ExtList result = new ExtList(qb.getResult());
					ExtList schf = new ExtList(qb.getSchf());
					((ExtList)synthesizedResult.get(qb.forestNum)).add(result);
					((ExtList)attributeList.get(qb.forestNum)).add(schf);
				}else{
					ExtList compResult = (ExtList)((ExtList)synthesizedResult.get(qb.forestNum)).get(0);
					ExtList compSchf = (ExtList)((ExtList)attributeList.get(qb.forestNum)).get(0);
					ArrayList<Integer> sameAttNum = new ArrayList<>();
//					System.out.println("compResult:"+compResult);
//					System.out.println("compSchf:"+compSchf);
//					System.out.println("synthesizedResult:"+synthesizedResult);
//					System.out.println("attributeList:"+attributeList);
					//同じ属性番号探し
					for (int j = 0; j < compSchf.size(); j++) {
						for (int k = 0; k < qb.getSchf().size(); k++) {
							if((int)compSchf.get(j) == (int)((ExtList)qb.getSchf()).get(k)){
								sameAttNum.add((int)compSchf.get(j));
							}
						}
					}
					//属性番号が同じとこを比較
					ExtList tmpResultSet = new ExtList();
					ExtList tmpSchf = new ExtList();
					for (int j = 0; j < compResult.size(); j++) {
//						System.out.println("comp:"+compResult.get(j));
						for (int k = 0; k < qb.getResult().size(); k++) {
//							System.out.println("qb:"+qb.getResult().get(k));
							boolean differentFlag = false;
							for (int l = 0; l < sameAttNum.size(); l++) {
								if(!((ExtList)compResult.get(j)).get(compSchf.indexOf(sameAttNum.get(l))).toString().equals(((ExtList)qb.getResult().get(k)).get(qb.getSchf().indexOf(sameAttNum.get(l))).toString())){
									differentFlag = true;
									break;
								}
							}
//							System.out.println("flag:"+differentFlag);
							if(differentFlag){
								//違う部分があったら次
								continue;
							}else{
								//全部同じだったら合成
								ExtList tmpResult = new ExtList();
								int max = Math.max((int)qb.getSchf().get(qb.getSchf().size() - 1), (int)compSchf.get(compSchf.size() - 1));
//								System.out.println("max:"+max);
//								System.out.println("qb.scfh:"+qb.getSchf());
//								System.out.println("qb.result:"+qb.getResult());
//								System.out.println("compschf:"+compSchf);
//								System.out.println("compResult:"+compResult);
								for (int l = 0; l <= max; l++) {
									if(compSchf.contains(l)){
										tmpResult.add(((ExtList)compResult.get(j)).get(compSchf.indexOf(l)));
										if(!tmpSchf.contains(l)) {
											tmpSchf.add(l);
										}
									}else if(qb.getSchf().contains(l)){
										tmpResult.add(((ExtList)qb.getResult().get(k)).get(qb.getSchf().indexOf(l)));
										if(!tmpSchf.contains(l)) {
											tmpSchf.add(l);
										}
									}
								}
								//入れ方考えないと
								//tmpResultを溜め込んで後で全部やったら更新
//								System.out.println("Synth:"+synthesizedResult);
//								System.out.println("tmpResult:"+tmpResult);
//								System.out.println("attL:"+attributeList);
//								System.out.println("tmpS:"+tmpSchf);
								tmpResultSet.add(tmpResult);
							}
						}
//						System.out.println("tmpResultSet:"+tmpResultSet);
					}
					ExtList tmptmpResultSet = new ExtList();
					tmptmpResultSet.add(tmpResultSet);
					synthesizedResult.remove(qb.forestNum);
					synthesizedResult.add(qb.forestNum, tmptmpResultSet);
					ExtList tmptmpSchf = new ExtList();
					tmptmpSchf.add(tmpSchf);
					attributeList.remove(qb.forestNum);
					attributeList.add(qb.forestNum, tmptmpSchf);
				}
			}
//			System.out.println("synthesizedResult:"+synthesizedResult);
//			System.out.println("attL:"+attributeList);
			sep_data_info.clear();
			for (Object o:synthesizedResult) {
				sep_data_info.add(((ExtList)o).get(0));
			}
		}
		*/
		//tbt end

		//170714 tbt add for the thing that only single attribute([e.salary]!) won't return empty cell
		//if each tuples is single, remove empty tuple
		try{
			if(((ExtList)sep_data_info.get(0)).size() == 1){
				for(int i = 0; i < sep_data_info.size(); i++){
					if(((ExtList)sep_data_info.get(i)).get(0).toString().isEmpty()){
						sep_data_info.remove(i);
						i--;
					}
				}
				Log.out("removed:"+sep_data_info);
			}
		}catch(Exception e){
			
		}
		
		//add "dummy" for null tuples
		//skip at aggregate and codegenerator
//		for(int i = 0; i < sep_data_info.size(); i++){
//			for(int j = 0; j < ((ExtList)sep_data_info.get(i)).size(); j++){
//				if(((ExtList)sep_data_info.get(i)).get(j).equals("")){
//					((ExtList)sep_data_info.get(i)).remove(j);
//					((ExtList)sep_data_info.get(i)).add(j, "dummydummydummy");
//				}
//			}
//		}
//		Log.out("add_dummy:"+sep_data_info);
		//tbt end
		return sep_data_info;

	}

	private ExtList makeTree(ExtList sep_sch, ExtList sep_data_info) {

		// MakeTree
		long start, end;
		start = System.nanoTime();

		TreeGenerator tg = new TreeGenerator();

		sep_data_info = tg.makeTree(sep_sch, sep_data_info);
		
		end = System.nanoTime();

		exectime[MKETREE] = end - start;

		Log.out("## constructed Data ##");
		Log.out(sep_data_info);
		return sep_data_info;
	}

	public ExtList getData() {
		return data_info;
	}

	private ExtList MakeTree(ExtList schema) {
		// added by ria
		Object o;
		ExtList buf = new ExtList();
		for (int i = 0; i < schema.size(); i++) {
			o = schema.get(i);

			if (!(o instanceof ExtList)) {
				if (keyAtt == null) {
					keyAtt = (Attribute) o;
					buf.add(keyAtt.getTuple());
					// System.out.println(buf);
					key = keyAtt.getTuple().toString();
					col = keyAtt.getColumn();
				} else {
					Attribute a = (Attribute) o;
					if (a == keyAtt) {
						buf.add(keyAtt.getTuple());
						// System.out.println(buf);
						key = keyAtt.getTuple().toString();
					} else {
						// add here checking if the keyAtt is a connector
						buf.add(a.getTuple(key, col));
						// System.out.println(buf);
						a.delTuples(key, col);
					}
				}
			} else if (IsLeaf((ExtList) o)) {

				ExtList obj = (ExtList) o;
				ExtList temp = new ExtList();

				Attribute a = (Attribute) obj.get(0);
				temp.addAll((a.getTuples(key, col)));

				if (temp.size() == 0) {
					flag = false;
				} else {
					flag = true;
				}

				buf.add(temp);
				// System.out.println(buf);

				if (keyAtt != null) {
					keyAtt.delTuples(key, col);
				}

			} else {
				if (schema.size() == 1) {
					ExtList temp = new ExtList();
					do {
						ExtList temp2 = MakeTree((ExtList) o);
						if (!temp2.isEmpty()) {
							temp.add(temp2);
							if (keyAtt != null) {
								keyAtt.delTuples(key, col);
							}
						}
					} while ((keyAtt != null) && keyAtt.getSize() != 0);

					buf.add(temp);
					// System.out.println(buf);
					flag = true;
				} else {
					ExtList temp = new ExtList();
					temp.add(MakeTree((ExtList) o));

					if (flag) {
						buf.add(temp);
						// System.out.println(buf);
					}
				}
			}
		}
		if (!flag) {
			buf = new ExtList();
		}

		return buf;
	}

	private boolean IsLeaf(ExtList sch) {
		for (int i = 0; i < sch.size(); i++) {
			if (sch.get(i) instanceof ExtList)
				return false;
		}
		return true;
	}

	public static ExtList getDataFromDBPedia(String sparqlWhereQuery,
			String[] varNames) {
		BufferedReader br = null;
		String everything = "";
		try {
			br = new BufferedReader(new FileReader("dbpedia.config"));
		} catch (FileNotFoundException e1) {
			Log.err("*** DBPedia config file not found ***");
			e1.printStackTrace();
			throw new IllegalStateException();
		}
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			everything = sb.toString();
		} catch (IOException e) {
			Log.err("*** Error while reading the Dbpedia config file ***");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				Log.err("*** Error while closig the dbpedia config file ***");
				e.printStackTrace();
			}
		}
		try {
			Document doc;
			ExtList data = new ExtList();
			String query = everything + "\nSELECT ";
			for (int i = (varNames.length - 1); i >= 0; i--) {
				query += "?" + varNames[i] + " ";
			}
			query += " WHERE " + sparqlWhereQuery + "";
			doc = Jsoup.connect("http://dbpedia.org/sparql?")
					.data("default-graph-uri", "http://dbpedia.org")
					.data("query", query).data("format", "text/html")
					.data("debug", "on").timeout(0).get();
			Elements tdInfos = doc.getElementsByTag("td");
			int columnCount = 0;
			int rowCount = -1;
			for (Element info : tdInfos) {
				String infoText = info.html();
				columnCount %= varNames.length;
				if (columnCount == 0) {
					ExtList e = new ExtList();
					e.add(infoText);
					data.add(e);
					columnCount += 1;
					rowCount += 1;
				} else {
					((ExtList) data.get(rowCount)).add(infoText);
					columnCount += 1;
				}

			}
			return data;
		} catch (IOException e) {
			Log.err("*** Error while querying dbpedia, please check your internet connection and your query syntax ***");
			throw new IllegalStateException();
		}
	}
}
