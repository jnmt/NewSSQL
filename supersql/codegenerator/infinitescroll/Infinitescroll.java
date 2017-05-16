package supersql.codegenerator.infinitescroll;

import supersql.codegenerator.DecorateList;
import supersql.codegenerator.ITFE;
import supersql.codegenerator.Incremental;
import supersql.codegenerator.Sass;
import supersql.codegenerator.TFE;
import supersql.codegenerator.Compiler.Compiler;
import supersql.codegenerator.HTML.HTMLEnv;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5Attribute;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5C1;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5C2;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5Env;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5Function;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5G1;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5G2;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5Manager;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5_dynamic;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5_form;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5_show;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;
import supersql.parser.Embed;

public class Infinitescroll {

	InfiniteEnv html_Env;
	static StringBuffer codes;

	public static void C1(Mobile_HTML5C1 C1, Mobile_HTML5Env html_env, ExtList data_info, ExtList data, ExtList<TFE> tfes, int tfeItems){
		String outType = "div";
		
		String classid_for_ifs = "";
		String[] ifs_div_String = {"", ""};
		codes = new StringBuffer();
		StringBuffer tmp = new StringBuffer();

		String classid = Mobile_HTML5Env.getClassID(C1);

		if(C1.decos.containsKey("insert")){
			Mobile_HTML5Env.setIDU("insert");
		}	
		if(C1.decos.containsKey("update")){
			Mobile_HTML5Env.setIDU("update");
		}
		if(C1.decos.containsKey("delete")){
			Mobile_HTML5Env.setIDU("delete");
		}
		html_env.append_css_def_td(classid, C1.decos);

		//20130325  table0
		if(C1.decos.containsKey("table0"))	C1.table0Flg = true;
		else							C1.table0Flg = false;
		//20130314  table
		if(C1.decos.containsKey("table") || C1.table0Flg || Mobile_HTML5C2.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.tableFlg){
			C1.tableFlg = true;
		}//else	tableFlg = false;

		//20130326  div
		if(C1.decos.containsKey("div")){
			C1.divFlg = true;
			C1.tableFlg = false;
		}//else divFlg = false;

		//20161203 bootstrap
		if(Sass.isFirstElementFlg()){
			C1.firstFlg = true;
			Sass.firstElementFlg(false);
		}

		if(!GlobalEnv.isOpt()){
			//20160914 bootstrap
			if(!Sass.isBootstrapFlg()){
				//20130503  Panel
				//				C1.panelFlg = panelProcess1(C1.decos, html_env);

				//20130330 tab
				//tab1
				if(C1.decos.containsKey("tab1")){
					html_env.code.append("<div data-role=\"content\"> <div id=\"tabs\">\n<ul>\n");
					html_env.code.append("	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">");
					
					tmp.append("<div data-role=\"content\"> <div id=\"tabs\">\n<ul>\n");
					tmp.append("	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">");
					
					if(!C1.decos.getStr("tab1").equals("")){
						html_env.code.append(C1.decos.getStr("tab1"));
						tmp.append(C1.decos.getStr("tab1"));
					}
					else{
						html_env.code.append("tab1");
						tmp.append("tab1");
					}
					html_env.code.append("</a></li>\n");
					html_env.code.append("</ul>\n<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
					
					tmp.append("</a></li>\n");
					tmp.append("</ul>\n<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
				}
				//tab2〜tab15
				else{
					int i=2;
					while(i<=Mobile_HTML5Env.maxTab){		//html_env.maxTab=15
						//Log.info("i="+i+" !!");
						if(C1.decos.containsKey("tab"+i) || (i==2 && C1.decos.containsKey("tab"))){
							//replace: </ul>の前に<li>〜</li>を付加
							String a = "</ul>";
							String b = "	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">";
							if(C1.decos.containsKey("tab"+i))
								if(!C1.decos.getStr("tab"+i).equals(""))	b += C1.decos.getStr("tab"+i);
								else				            		b += "tab"+i;
							else
								if(!C1.decos.getStr("tab").equals(""))		b += C1.decos.getStr("tab");
								else				            		b += "tab";
							b += "</a></li>\n";
							Mobile_HTML5Manager.replaceCode(html_env, a, b+a);

							//replace: 最後の</div></div></div>カット
							Mobile_HTML5Manager.replaceCode(html_env, "</div></div></div>", "");

							//    	        		//replace: 不要な「<div class=〜」をカット
							//    	        		if(!Mobile_HTML5Manager.replaceCode(html_env, "<div class=\""+Mobile_HTML5Env.getClassID(this)+" \">", "")){
							//    	        		}

							html_env.code.append("<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
							tmp.append("<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
							break;
						}
						i++;
					}
				}

				//20130312 collapsible
				if(C1.decos.containsKey("collapse")){
					html_env.code.append("<DIV data-role=\"collapsible\" data-content-theme=\"c\" style=\"padding: 0px 12px;\">\n");
					tmp.append("<DIV data-role=\"collapsible\" data-content-theme=\"c\" style=\"padding: 0px 12px;\">\n");

					//header
					if(!C1.decos.getStr("collapse").equals("")){
						html_env.code.append("	<h1>"+C1.decos.getStr("collapse")+"</h1>\n");
						tmp.append("	<h1>"+C1.decos.getStr("collapse")+"</h1>\n");
					}else{
						html_env.code.append("<h1>Contents</h1>\n");
						tmp.append("<h1>Contents</h1>\n");
					}
				}

				//20130309
				//20160527 bootstrap
				if(!C1.tableFlg){
					//        		if(html_env.written_classid.contains(classid))
					html_env.code.append("<DIV Class=\"ui-grid #"+Mobile_HTML5Env.uiGridCount+" "+classid+"\"");
					tmp.append("<DIV Class=\"ui-grid #"+Mobile_HTML5Env.uiGridCount+" "+classid+"\"");
					//        		else
					//        			html_env.code.append("<DIV Class=\"ui-grid #"+Mobile_HTML5Env.uiGridCount+"\"");
					Mobile_HTML5Env.uiGridCount++;
				}
				if(!C1.tableFlg){
					html_env.code.append(">");		//20130309
					tmp.append(">");		//20130309
				}

				//20130314  table
				if(C1.tableFlg){
					//					html_env.code.append(getTableStartTag(html_env, C1.decos, C1)+"<TR>"); // taji comment
				}
			}//20160914 ifmobile

			//20160527 bootstrap
			else if(Sass.isBootstrapFlg()){
				if(!C1.tableFlg){
					if(C1.firstFlg){
						html_env.code.append("<DIV Class=\"row\">\n");
						html_env.code.append("<DIV Class=\""+classid+"\">\n");
						
						tmp.append("<DIV Class=\"row\">\n");
						tmp.append("<DIV Class=\""+classid+"\">\n");

						if(Sass.outofloopFlg.peekFirst()){
							//            				Sass.makeRowClass();
							//            				Sass.makeClass(classid);
							//            				Sass.defineGridBasic(classid, decos);

							//            				Sass.makeClass(classid);
							//            				Sass.defineGridBasic(classid, decos);
							//            				Sass.closeBracket();
							Sass.makeColumn(classid, C1.decos, "", -1);
						}
					}

					html_env.code.append("<DIV Class=\"row\">\n");
					tmp.append("<DIV Class=\"row\">\n");
					if(Sass.outofloopFlg.peekFirst()){
						//            			Sass.makeRowClass();
					}
				}

				if(C1.tableFlg){
					//					html_env.code.append(getTableStartTag(html_env, C1.decos, C1)+"<TR>"); //taji commentout
				}
			}

		}

		//			System.out.println("C1 tableFlg = " + tableFlg + ", divFlg = " + divFlg);
		int i = 0;
		if(Sass.outofloopFlg.peekFirst()){
			C1.gridMap = Sass.beforeC1WhileProcess(tfes);
			//        	Log.info(gridMap);
		}
		Mobile_HTML5.beforeWhileProcess(C1.getSymbol(), C1.decos, html_env);
		Infinite.beforeWhileProcess(C1.getSymbol(), C1.decos, html_env, ifs_div_String, classid_for_ifs, tmp);
		while (C1.hasMoreItems()) {
			ITFE tfe = (ITFE) tfes.get(i);
			DecorateList decos2 = ((TFE)tfe).decos;
			String classid2 = Mobile_HTML5Env.getClassID(tfe);
			C1.Count = ( (C1.gridInt>=C1.jj)? C1.jj:C1.gridInt );

			if(!Sass.isBootstrapFlg()){
				if(C1.decos.containsKey("table0") || Mobile_HTML5C2.table0Flg || Mobile_HTML5G1.table0Flg || Mobile_HTML5G2.table0Flg)	C1.table0Flg = true;
				if(C1.decos.containsKey("table") || Mobile_HTML5C2.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.tableFlg || C1.table0Flg)	C1.tableFlg=true;
				if(C1.decos.containsKey("div")){
					C1.divFlg = true;
					C1.tableFlg = false;
				}//else divFlg = false;

				if(!C1.tableFlg){	//div
					//20131002
					int tfesItemNum = tfes.size();
					Mobile_HTML5Attribute.attributeDivWidth = Mobile_HTML5.getDivWidth("C1", C1.decos, tfesItemNum - Mobile_HTML5Function.func_null_count);	//null()
					html_env.code.append("\n<div class=\"ui-block "+classid2+"\">\n");	//20130309
					tmp.append("\n<div class=\"ui-block "+classid2+"\">\n");
					//added by goto 20161113  for function class width
					Mobile_HTML5Attribute.setWidth(classid2, C1.decos, html_env);
				}
				//20130314  table
				if(C1.tableFlg){
					html_env.code.append("<TD valign=\"middle\" class=\"" + classid2 + " nest\">\n");
					tmp.append("<TD valign=\"middle\" class=\"" + classid2 + " nest\">\n");
				}
				if(C1.decos.containsKey("text")){
					Mobile_HTML5Function.textFlg2 = true;
				}
			}else if(Sass.isBootstrapFlg()){
				((TFE)tfe).decos.put("C1","Done");
				if(Sass.outofloopFlg.peekFirst()){
					if(C1.gridMap.get(classid2).containsKey("xs")){
						decos2.put("xs", ""+C1.gridMap.get(classid2).get("xs"));
					}
					if(C1.gridMap.get(classid2).containsKey("sm")){
						decos2.put("sm", ""+C1.gridMap.get(classid2).get("sm"));
					}
					if(C1.gridMap.get(classid2).containsKey("md")){
						decos2.put("md", ""+C1.gridMap.get(classid2).get("md"));
					}
					if(C1.gridMap.get(classid2).containsKey("lg")){
						decos2.put("lg", ""+C1.gridMap.get(classid2).get("lg"));
					}
				}
				html_env.code.append("<div class=\"" + classid2 +"\">\n");
				tmp.append("<div class=\"" + classid2 +"\">\n");
				//taji commentout
				//				if(Sass.outofloopFlg.peekFirst()){
				//					Sass.(classid2, decos2, C1.getSymbol(), C1.responsiveId);
				//				}
			}

			html_env.cNum++;
			html_env.xmlDepth++;
			Mobile_HTML5.whileProcess1_2(C1.getSymbol(), C1.decos, html_env, data, data_info, tfe, tfes, tfeItems);
			C1.worknextItem();
			tmp.append(codes.toString());
			Mobile_HTML5.whileProcess2_1(C1.getSymbol(), C1.decos, html_env, data, data_info, tfe, tfes, tfeItems);
			html_env.cNum--;
			html_env.xmlDepth--;
			if(C1.decos.containsKey("table0") || Mobile_HTML5C2.table0Flg || Mobile_HTML5G1.table0Flg || Mobile_HTML5G2.table0Flg)	C1.table0Flg = true;
			if(C1.decos.containsKey("table") || Mobile_HTML5C2.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.tableFlg || C1.table0Flg)	C1.tableFlg=true;
			if(C1.decos.containsKey("div")){
				C1.divFlg = true;
				C1.tableFlg = false;
			}//else divFlg = false;

			C1.ii++;
			C1.jj++;
			C1.gridInt++;
			if(Mobile_HTML5Function.func_null_count<1){	//null()
				if(!Sass.isBootstrapFlg()){
					if(!C1.tableFlg){
						html_env.code.append("</div>\n");	//20130309 20160527 bootstrap
						tmp.append("</div>\n");
					}
					if(C1.tableFlg){
						html_env.code.append("</TD>\n");	//20130314  table
						tmp.append("</TD>\n");	//20130314  table
					}
				}
				else if(Sass.isBootstrapFlg()){
					html_env.code.append("\n</DIV>\n");//.classid2
					tmp.append("\n</DIV>\n");//.classid2
					if(Sass.outofloopFlg.peekFirst()){
						//	            		Sass.closeBracket();//classid2
					}
				}
			}

			i++;

			Mobile_HTML5.whileProcess2_2(C1.getSymbol(), C1.decos, html_env, data, data_info, tfe, null, -1);

		}
		Infinite.afterWhileProcess(C1.getSymbol(), classid, C1.decos, html_env, ifs_div_String, classid_for_ifs, tmp);
		Mobile_HTML5.afterWhileProcess(C1.getSymbol(), classid, C1.decos, html_env);

		if(!Sass.isBootstrapFlg()){
			//20130309
			if(!C1.tableFlg){
				html_env.code.append("\n</DIV c1>\n");			//20130309
				tmp.append("\n</DIV c1>\n");
			}

			//20130314  table
			if(C1.tableFlg){
				html_env.code.append("</TR></TABLE>\n");	//20130309
				tmp.append("</TR></TABLE>\n");
				//	      		tableFlg = false;
				//	      		table0Flg = false;			//20130325 table0
			}

			//20130312 collapsible
			if(C1.decos.containsKey("collapse")){
				html_env.code.append("</DIV>");
				tmp.append("</DIV>");
			}

			//20130330 tab
			int a=1;
			while(a<=Mobile_HTML5Env.maxTab){
				//Log.info("a="+a);
				if(C1.decos.containsKey("tab"+a) || (a==1 && C1.decos.containsKey("tab"))){
					html_env.code.append("</div></div></div>\n");
					tmp.append("</div></div></div>\n");
					Mobile_HTML5Env.tabCount++;
					break;
				}
				a++;
			}

			//20130503  Panel
			//			panelProcess2(C1.decos, html_env, C1.panelFlg);

			C1.jj=0;

			if(C1.divFlg)	C1.divFlg = false;		//20130326  div
		}
		else if(Sass.isBootstrapFlg()){
			//        	html_env.code.append("\n</DIV>\n");//.row
			//        	html_env.code.append("\n</DIV>\n");//.TFE
			//      		if(Sass.outofloopFlg.peekFirst()){
			//      			Sass.closeBracket();
			//      			Sass.closeBracket();
			//      		}
			//      		if(!decos.containsKey("C1") && !decos.containsKey("G1")){
			//        		html_env.code.append("\n</DIV>\n");
			//        		if(Sass.outofloopFlg.peekFirst()){
			//        			Sass.closeBracket();
			//        		}
			//        	}
			html_env.code.append("</DIV>\n");//.row
			tmp.append("</DIV>\n");//.row
			if(Sass.outofloopFlg.peekFirst()){
				//        		Sass.closeBracket();//row
			}

			if(C1.firstFlg){
				html_env.code.append("</DIV>\n");//.classid
				html_env.code.append("</DIV>\n");//.row
				
				tmp.append("</DIV>\n");//.classid
				tmp.append("</DIV>\n");//.row

				if(Sass.outofloopFlg.peekFirst()){
					//        			Sass.closeBracket();//classid
					//        			Sass.closeBracket();//row
				}
				C1.firstFlg = false;
			}
		}
		Mobile_HTML5.postProcess(C1.getSymbol(), classid, C1.decos, html_env);	//Post-process (後処理)
		codes.append(tmp.toString());
	}

	public static void C2(Mobile_HTML5C2 C2, Mobile_HTML5Env html_env, ExtList data_info, ExtList data, ExtList<TFE> tfes, int tfeItems){
		String outType = "div";
		String classid = Mobile_HTML5Env.getClassID(C2);

		String classid_for_ifs = "";
		String[] ifs_div_String = {"", ""};
		codes = new StringBuffer();
		StringBuffer tmp = new StringBuffer();
		
		//		if(html_env.xmlDepth!=0){
		//			// 親のoutTypeを継承
		//			outType = html_env.outTypeList.get(html_env.xmlDepth-1);
		//		}
		//		if (C2.decos.containsKey("table") || !outType.equals("div")) {
		//			html_env.outTypeList.add(html_env.xmlDepth, "table");
		//		} else {
		//			html_env.outTypeList.add(html_env.xmlDepth, "div");
		//		}
		//		if (C2.decos.containsKey("div")) {
		//			html_env.outTypeList.add(html_env.xmlDepth, "div");
		//		}
		//			System.out.println("C2 tableFlg = " + tableFlg + ", divFlg = " + divFlg);
		html_env.append_css_def_td(html_env.getClassID(C2), C2.decos);
		//modified by taji
		Mobile_HTML5.beforeWhileProcess(C2.getSymbol(), C2.decos, html_env);
		Infinite.beforeWhileProcess(C2.getSymbol(), C2.decos, html_env, ifs_div_String, classid_for_ifs, tmp);
		int i = 0;
		while (C2.hasMoreItems()) {
			ITFE tfe = (ITFE) tfes.get(i);
			DecorateList decos2 = ((TFE)tfe).decos;
			String classid2 = Mobile_HTML5Env.getClassID(tfe);
			if(!Sass.isBootstrapFlg()){
				if(C2.decos.containsKey("table0") || Mobile_HTML5C1.table0Flg || Mobile_HTML5G1.table0Flg || Mobile_HTML5G2.table0Flg)	C2.table0Flg = true;
				if(C2.decos.containsKey("table") || Mobile_HTML5C1.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.tableFlg || C2.table0Flg)	C2.tableFlg=true;
				if(C2.decos.containsKey("div")){
					C2.divFlg = true;
					C2.tableFlg = false;
				}//else divFlg = false;

				//20130312 collapsible
				if(C2.decos.containsKey("collapse")){
					html_env.code.append("<p>\n");
					tmp.append("<p>\n");
				}
				//20160527 bootstrap
				else if(!C2.tableFlg && !Mobile_HTML5Function.textFlg2){
					//20130309
					//					html_env.code.append("<div class=\""+classid2+" \">\n");
					html_env.code.append("<div class=\""+classid+" \">\n");
					tmp.append("<div class=\""+classid+" \">\n");
				}

				//20130314  table
				if(C2.tableFlg){
					html_env.code.append("<TR><TD valign=\"middle\" class=\""
							+ classid2 + " nest\">\n");
					tmp.append("<TR><TD valign=\"middle\" class=\""
							+ classid2 + " nest\">\n");
					Log.out("<TR><TD class=\"nest "
							+ classid2 + " nest\"> decos:" + C2.decos);
				}
			}else if(Sass.isBootstrapFlg()){
				html_env.code.append("<DIV Class=\"row\">\n");
				html_env.code.append("<div class=\"" + classid2 +"\">\n");
				
				tmp.append("<DIV Class=\"row\">\n");
				tmp.append("<div class=\"" + classid2 +"\">\n");
				
				if(Sass.outofloopFlg.peekFirst()){
					Sass.makeColumn(classid2, decos2, "", -1);
				}
			}

			html_env.cNum++;
			html_env.xmlDepth++;
			Mobile_HTML5.whileProcess1_2(C2.getSymbol(), C2.decos, html_env, data, data_info, tfe, tfes, tfeItems);
			C2.worknextItem();
			tmp.append(codes.toString());
			Mobile_HTML5.whileProcess2_1(C2.getSymbol(), C2.decos, html_env, data, data_info, tfe, tfes, tfeItems);
			if(!Sass.isBootstrapFlg()){
				if(C2.decos.containsKey("table0") || Mobile_HTML5C1.table0Flg || Mobile_HTML5G1.table0Flg || Mobile_HTML5G2.table0Flg)	C2.table0Flg = true;
				if(C2.decos.containsKey("table") || Mobile_HTML5C1.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.tableFlg || C2.table0Flg)	C2.tableFlg=true;
				if(C2.decos.containsKey("div")){
					C2.divFlg = true;
					C2.tableFlg = false;
				}//else divFlg = false;
				//20130314  table
				if(C2.tableFlg){
					html_env.code.append("</TD></TR>\n");
					tmp.append("</TD></TR>\n");
				}
				//Log.out("</TD></TR>");

				//20130312 collapsible
				if(C2.decos.containsKey("collapse")){
					html_env.code.append("</p>\n");
					tmp.append("</p>\n");
				}
				//20160527 bootstrap
				else if(!C2.tableFlg && !Mobile_HTML5Function.textFlg && !Mobile_HTML5Function.textFlg2){	//20130914  "text"
					html_env.code.append("\n</div>");
					tmp.append("\n</div>");
				}
				if(Mobile_HTML5Function.textFlg){					//20130914  "text"
					Mobile_HTML5Function.textFlg = false;
				}
			}else if(Sass.isBootstrapFlg()){
				html_env.code.append("</div>\n");//classid2
				html_env.code.append("</div>\n");//row
				
				tmp.append("</div>\n");//classid2
				tmp.append("</div>\n");//row
				if(Sass.outofloopFlg.peekFirst()){
				}
			}
			html_env.code.append("\n");		//20130309
			tmp.append("\n");

			html_env.cNum--;
			html_env.xmlDepth--;
			Mobile_HTML5.whileProcess2_2(C2.getSymbol(), C2.decos, html_env, data, data_info, tfe, null, -1);
			i++;
		}
		Infinite.afterWhileProcess(C2.getSymbol(), classid, C2.decos, html_env, ifs_div_String, classid_for_ifs, tmp);
		Mobile_HTML5.afterWhileProcess(C2.getSymbol(), classid, C2.decos, html_env);
		codes.append(tmp.toString());
	}

	public static void G2(Mobile_HTML5G2 G2, Mobile_HTML5Env html_env, Mobile_HTML5Env html_env2, ExtList data_info, ExtList data, ITFE tfe){
		String classid = Mobile_HTML5Env.getClassID(G2);
		String classid2 = Mobile_HTML5Env.getClassID(tfe);
		String row = "";
		String column = "";
		String classid_for_ifs = "";
		String[] ifs_div_String = {"", ""};
		codes = new StringBuffer();
		StringBuffer tmp = new StringBuffer();
		if(!Infinite.preProcess(G2.getSymbol(), G2.decos, html_env)) return;	//Pre-process (前処理)
		

		if(G2.decos.containsKey("infinite-scroll")){
			classid_for_ifs = classid + "_wrapper";
			DecorateList deco_ifs = new DecorateList();
			deco_ifs.put("infinite-scroll", "");
			html_env.append_css_def_td(G2.getSymbol(), classid_for_ifs, classid2 ,deco_ifs);
			G2.decos.remove("infinite-scroll");
			ifs_div_String = Mobile_HTML5.ifs_div_start(G2.getSymbol(), html_env, classid_for_ifs, ifs_div_String);
		}
		// ページネーション
		if(Mobile_HTML5Env.getSelectFlg())
			data_info = (ExtList) data_info.get(0);
		html_env.append_css_def_td(classid, G2.decos);

		//20130325  table0
		if(G2.decos.containsKey("table0"))	Mobile_HTML5G2.table0Flg = true;
		else							Mobile_HTML5G2.table0Flg = false;
		//20130314  table
		if(G2.decos.containsKey("table") || Mobile_HTML5G2.table0Flg || Mobile_HTML5C1.tableFlg || Mobile_HTML5C2.tableFlg || Mobile_HTML5G1.tableFlg){
			Mobile_HTML5G2.tableFlg = true;
		}//else	tableFlg = false;

		//20130326  div
		if(G2.decos.containsKey("div")){
			Mobile_HTML5G2.divFlg = true;
			Mobile_HTML5G2.tableFlg = false;
		}//else divFlg = false;

		//20130914  "text"
		if(G2.decos.containsKey("text")){
			Mobile_HTML5Function.textFlg2 = true;
		}

		//20161203 bootstrap
		if(Sass.isFirstElementFlg()){
			G2.firstFlg = true;
			Sass.firstElementFlg(false);
		}

		if(!GlobalEnv.isOpt()){
			if(!Sass.isBootstrapFlg()){
				//20130503  Panel
				//				panelFlg = Mobile_HTML5C1.panelProcess1(G2.decos, html_env);

				//20130330 tab
				//tab1
				if(G2.decos.containsKey("tab1")){
					html_env.code.append("<div data-role=\"content\"> <div id=\"tabs\">\n<ul>\n");
					html_env.code.append("	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">");
					if(!G2.decos.getStr("tab1").equals(""))	html_env.code.append(G2.decos.getStr("tab1"));
					else          							html_env.code.append("tab1");
					html_env.code.append("</a></li>\n");
					html_env.code.append("</ul>\n<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
				}
				//tab2〜tab15
				else{
					int i=2;
					while(i<=Mobile_HTML5Env.maxTab){		//HTMLEnv.maxTab=15
						if(G2.decos.containsKey("tab"+i) || (i==2 && G2.decos.containsKey("tab"))){
							//replace: </ul>の前に<li>〜</li>を付加
							String a = "</ul>";
							String b = "	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">";
							if(G2.decos.containsKey("tab"+i))
								if(!G2.decos.getStr("tab"+i).equals(""))	b += G2.decos.getStr("tab"+i);
								else				            		b += "tab"+i;
							else
								if(!G2.decos.getStr("tab").equals(""))		b += G2.decos.getStr("tab");
								else				            		b += "tab";
							b += "</a></li>\n";
							Mobile_HTML5Manager.replaceCode(html_env, a, b+a);

							//replace: 最後の</div></div></div>カット
							Mobile_HTML5Manager.replaceCode(html_env, "</div></div></div>", "");

							//    	        		//replace: 不要な「<div class=〜」をカット
							//    	        		Mobile_HTML5Manager.replaceCode(html_env, "<div class=\""+Mobile_HTML5Env.getClassID(this)+" \">", "");

							html_env.code.append("<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
							break;
						}
						i++;
					}
				}

				//20130312 collapsible
				if(G2.decos.containsKey("collapse")){
					html_env.code.append("<DIV data-role=\"collapsible\" data-content-theme=\"c\" style=\"padding: 0px 12px;\">\n");

					//header
					if(!G2.decos.getStr("collapse").equals(""))
						html_env.code.append("	<h1>"+G2.decos.getStr("collapse")+"</h1>\n");
					else
						html_env.code.append("<h1>Contents</h1>\n");
				}

				//20130309
				//20130314  table
				if(Mobile_HTML5G2.tableFlg){
					if(G2.row>1 && Mobile_HTML5G2.tableFlg)	Mobile_HTML5G2.tableStartTag = Mobile_HTML5C1.getTableStartTag(html_env, G2.decos, G2);
					else					html_env.code.append(Mobile_HTML5C1.getTableStartTag(html_env, G2.decos, G2)+"\n");
				}
			}else if(Sass.isBootstrapFlg()){
				//        		if(!decos.containsKey("C1") && !decos.containsKey("G1")){
				//            		html_env.code.append("<DIV Class=\"row\">");
				//            		if(Sass.outofloopFlg.peekFirst()){
				//            			Sass.makeRowClass();
				//            		}
				//            	}
				//        		html_env.code.append("<DIV Class=\""+classid+"\">");
				//        		if(Sass.outofloopFlg.peekFirst()){
				//        			Sass.makeClass(classid);
				//        			Sass.defineGridBasic(classid, decos);
				//	      		}
				//        		Sass.beforeLoop();
				if(G2.firstFlg){
					html_env.code.append("<DIV Class=\"row\">\n");
					html_env.code.append("<DIV Class=\""+classid+"\">\n");
					
					tmp.append("<DIV Class=\"row\">\n");
					tmp.append("<DIV Class=\""+classid+"\">\n");

					if(Sass.outofloopFlg.peekFirst()){
						//        				Sass.makeRowClass();
						//        				Sass.makeClass(classid);
						//        				Sass.defineGridBasic(classid, decos);

						//        				Sass.makeClass(classid);
						//        				Sass.defineGridBasic(classid, decos);
						//        				Sass.closeBracket();
						Sass.makeColumn(classid, G2.decos, "", -1);
					}
				}
				Sass.beforeLoop();
			}
		}
		Mobile_HTML5.beforeWhileProcess(G2.getSymbol(), G2.decos, html_env, ifs_div_String);
		Infinite.beforeWhileProcess(G2.getSymbol(), G2.decos, html_env, ifs_div_String, classid_for_ifs, tmp);
		while (G2.hasMoreItems()) {
			// System.out.println("ここ: tableFlg = " + tableFlg +
			// ", divFlg = " + divFlg);
			Mobile_HTML5.gLevel1++;
			Mobile_HTML5.whileProcess1_1(G2.getSymbol(), G2.decos, html_env, data, data_info, tfe, null, -1);
			//			String classid2 = Mobile_HTML5Env.getClassID(tfe);
			DecorateList decos2 = ((TFE)tfe).decos;
			Mobile_HTML5Function.setGlvl(html_env.getGlevel());	//added by goto 20130914  "SEQ_NUM"
			//[重要] For [ [], ]!        	
			Mobile_HTML5G1.jj = 0;
			Mobile_HTML5G1.gridInt = 0;

			if(G2.decos.containsKey("table0") || Mobile_HTML5C1.table0Flg || Mobile_HTML5C2.table0Flg || Mobile_HTML5G1.table0Flg)	Mobile_HTML5G2.table0Flg = true;
			if(G2.decos.containsKey("table") || Mobile_HTML5C1.tableFlg || Mobile_HTML5C2.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.table0Flg)	Mobile_HTML5G2.tableFlg=true;
			if(G2.decos.containsKey("div")){
				Mobile_HTML5G2.divFlg = true;
				Mobile_HTML5G2.tableFlg = false;
			}

			html_env.setGlevel(html_env.getGlevel() + 1);
			if(G2.rowFlg){
				html_env.code = new StringBuffer();
				html_env.countfile++;
				html_env.filename = html_env.outfile + "_row" + G2.rowFileNum + "_" + G2.j + Compiler.getExtension();
				html_env.nextbackfile = html_env.linkoutfile + "_row" + G2.rowFileNum + "_" + G2.j + Compiler.getExtension();
				html_env.setOutlineMode();
			}
			if( Mobile_HTML5Env.getSelectRepeat() ){//if form_select
			}else{
				if(!Sass.isBootstrapFlg()){
					//20130312 collapsible
					if(G2.decos.containsKey("collapse")){
						html_env.code.append("<p>\n");
						tmp.append("<p>\n");
					}
					//20130309
					if(!Mobile_HTML5G2.tableFlg){
						html_env.code.append("\n<div class=\""+classid+" "+Mobile_HTML5_show.addShowCountClassName(G2.decos)+"\">\n");	//20130309  div
						tmp.append("\n<div class=\""+classid+" "+Mobile_HTML5_show.addShowCountClassName(G2.decos)+"\">\n");	//20130309  div
					}else if(Mobile_HTML5G2.tableFlg){
						//20130314  table
						html_env.code.append("<TR><TD class=\"" + classid + " "+Mobile_HTML5_show.addShowCountClassName(G2.decos)+" nest\">\n");
						tmp.append("<TR><TD class=\"" + classid + " "+Mobile_HTML5_show.addShowCountClassName(G2.decos)+" nest\">\n");
						Log.out("<TR><TD class=\"" + classid + " nest\">");
					}
				}else if(Sass.isBootstrapFlg()){
					html_env.code.append("<DIV Class=\"row\">\n");
					html_env.code.append("<div class=\"" + classid2 +"\">\n");
					
					tmp.append("<DIV Class=\"row\">\n");
					tmp.append("<div class=\"" + classid2 +"\">\n");
					
					if(Sass.outofloopFlg.peekFirst()){
						Sass.makeColumn(classid2, decos2, "", -1);
					}
				}
			}

			html_env.xmlDepth++;
			Mobile_HTML5.whileProcess1_2(G2.getSymbol(), G2.decos, html_env, data, data_info, tfe, null, -1);
			G2.worknextItem();
			tmp.append(codes.toString());
			Mobile_HTML5.whileProcess2_1(G2.getSymbol(), G2.decos, html_env, data, data_info, tfe, null, -1);
			if(G2.decos.containsKey("table0") || Mobile_HTML5C1.table0Flg || Mobile_HTML5C2.table0Flg || Mobile_HTML5G1.table0Flg)	Mobile_HTML5G2.table0Flg = true;
			if(G2.decos.containsKey("table") || Mobile_HTML5C1.tableFlg || Mobile_HTML5C2.tableFlg || Mobile_HTML5G1.tableFlg || Mobile_HTML5G2.table0Flg)	Mobile_HTML5G2.tableFlg=true;
			if(G2.decos.containsKey("div")){
				Mobile_HTML5G2.divFlg = true;
				Mobile_HTML5G2.tableFlg = false;
			}

			html_env.xmlDepth--;
			if(Mobile_HTML5Env.getSelectRepeat()){

			}else{	 
				html_env2.code.append("</tfe>");
				if(!Sass.isBootstrapFlg()){
					if(!Mobile_HTML5G2.tableFlg){
						if(!Mobile_HTML5Function.textFlg2){
							html_env.code.append("</div>\n");		//20130309  div	//20130914  "text"
						}
					}else if(Mobile_HTML5G2.tableFlg){
						html_env.code.append("</TD></TR>\n");			//20130314  table
						Log.out("</TD></TR>");
					}
				}else if(Sass.isBootstrapFlg()){
					html_env.code.append("</div>\n");//classid2
					html_env.code.append("</div>\n");//row
					
					tmp.append("</div>\n");//classid2
					tmp.append("</div>\n");//row
					
					if(Sass.outofloopFlg.peekFirst()){
						//                		Sass.closeBracket();//classid2
						//                		Sass.closeBracket();//row
					}
				}

				html_env.code = Embed.postProcess(html_env.code);	//goto 20130915-2  "<$  $>"

				//20130312 collapsible
				if(G2.decos.containsKey("collapse")){
					html_env.code.append("</p>\n");
					tmp.append("</p>\n");
				}
			}
			//20160527 bootstrap
			if(Sass.isBootstrapFlg()){
				Sass.afterFirstLoop();
			}

			html_env.setGlevel(html_env.getGlevel() - 1);
			Mobile_HTML5G2.tableDivHeader_Count1++;	//20131001 tableDivHeader

			//added by goto 20130413  "row Prev/Next"
			if(G2.rowFlg){
				G2.codeBuf.append(html_env.code);
				if((G2.rowNum+1)%G2.row==0){
					Mobile_HTML5G2.createHTMLfile_ForPrevNext(html_env, G2.codeBuf);
					G2.j++;
					G2.codeBuf = new StringBuffer();
				}
				G2.rowNum++;
			}
			if(!Mobile_HTML5.whileProcess2_2(G2.getSymbol(), G2.decos, html_env, data, data_info, tfe, null, -1)){
				break;
			}
			
			Mobile_HTML5.gLevel1--;
		}
		Infinite.afterWhileProcess(G2.getSymbol(), classid, G2.decos, html_env, ifs_div_String, classid_for_ifs, tmp);
		Mobile_HTML5.afterWhileProcess(G2.getSymbol(), classid, G2.decos, html_env, ifs_div_String);
		if (Sass.isBootstrapFlg()){
			Sass.afterLoop();
			if(G2.firstFlg){
				html_env.code.append("</DIV>\n");//.classid
				html_env.code.append("</DIV>\n");//.row

				tmp.append("</DIV>\n");//.classid
				tmp.append("</DIV>\n");//.row
				
				if(Sass.outofloopFlg.peekFirst()){
					//        			Sass.closeBracket();//classid
					//        			Sass.closeBracket();//row
				}
				G2.firstFlg = false;
			}
		}

		//added by goto 20130413  "row Prev/Next"
		if(G2.rowFlg){
			if(G2.rowNum%G2.row!=0){	//最後の child HTML を create
				Mobile_HTML5G2.createHTMLfile_ForPrevNext(html_env, G2.codeBuf);
			}
			// taji todo
			//			html_env.filename = parentfile;
			//			html_env.code = parentcode;
			//			html_env.header = parentheader;
			//			html_env.footer = parentfooter;
			//			html_env.nextbackfile = parentnextbackfile;
			Log.out("TFEId = " + classid);
			html_env.append_css_def_td(classid, G2.decos);

			int first = 1, last = ((G2.rowNum%G2.row!=0)? (G2.rowNum/G2.row+1):(G2.rowNum/G2.row));
			Mobile_HTML5G2.PrevNextProcess(html_env, G2.rowNum, G2.row, first, last, 1);
		}

		if(Mobile_HTML5Env.getSelectRepeat()){		
			if(Mobile_HTML5Env.getSelectRepeat()){
				//chie
				html_env2.code.append("</select></VALUE></tfe>");
				html_env.code.append("</select></TD></TR>\n");
				Log.out("</TD></TR>");
				Mobile_HTML5Env.setSelectRepeat(false);
				Mobile_HTML5Env.incrementFormPartsNumber();
			}else{
				Mobile_HTML5Env.incrementFormPartsNumber();
			}
		}

		//20130314  table
		if(Mobile_HTML5G2.tableFlg){
			if(!(G2.row>1 && Mobile_HTML5G2.tableFlg))	html_env.code.append("</TABLE>\n");		//20130309
			Mobile_HTML5G2.tableFlg = false;
			Mobile_HTML5G2.table0Flg = false;		//20130325 table0
		}
		Log.out("</TABLE>");

		//20130312 collapsible
		if(G2.decos.containsKey("collapse")){
			html_env.code.append("</DIV>");
			tmp.append("</DIV>");
		}

		//20130330 tab
		int a=1;
		while(a<=Mobile_HTML5Env.maxTab){
			if(G2.decos.containsKey("tab"+a) || (a==1 && G2.decos.containsKey("tab"))){
				html_env.code.append("</div></div></div>\n");
				tmp.append("</div></div></div>\n");
				Mobile_HTML5Env.tabCount++;
				break;
			}
			a++;
		}

		//20130503  Panel
		//		Mobile_HTML5C1.panelProcess2(G2.decos, html_env, G2.panelFlg);

		if(Mobile_HTML5G2.divFlg)	Mobile_HTML5G2.divFlg = false;		//20130326  div

		//added by goto 20130413  "row Prev/Next"
		if(G2.rowFlg){
			G2.rowFileNum++;
			G2.rowFlg = false;
			G2.tableStartTag = "";
		}

		//20130914  "text"
		if(Mobile_HTML5Function.textFlg2){
			Mobile_HTML5Function.textFlg2 = false;
		}

		//        if(Sass.isBootstrapFlg()){
		//
		//        }
		codes.append(tmp.toString());
		Mobile_HTML5.postProcess(G2.getSymbol(), classid, G2.decos, html_env);	//Post-process (後処理)

		//added by goto 20130914  "SEQ_NUM"
		Mobile_HTML5Function.Func_seq_num_initialization(html_env.getGlevel());
	}

	public static void G1(Mobile_HTML5G1 G1, Mobile_HTML5Env html_env, ExtList data_info, ExtList data, ITFE tfe){
		String classid = Mobile_HTML5Env.getClassID(G1);
		String classid2 = Mobile_HTML5Env.getClassID(tfe);
		String row = "";
		String column = "";
		String[] ifs_div_String = {"", ""};

		if(G1.decos.containsKey("infinite-scroll")){
			String classid_for_ifs = classid + "_wrapper";
			DecorateList deco_ifs = new DecorateList();
			deco_ifs.put("infinite-scroll", "");
			html_env.append_css_def_td(G1.getSymbol(), classid_for_ifs, classid2, deco_ifs);
			G1.decos.remove("infinite-scroll");
			ifs_div_String = Mobile_HTML5.ifs_div_start(G1.getSymbol(), html_env, classid_for_ifs, ifs_div_String);
		}
		html_env.append_css_def_td(classid, G1.decos);
		// ページネーション
		if (G1.decos.containsKey("row") && G1.decos.containsKey("column")) {
			html_env.g1PaginationRowNum = Integer.parseInt(G1.decos
					.getStr("row"));
			row = " row=\'" + html_env.g1PaginationRowNum + "\'";
			html_env.g1PaginationColumnNum = Integer.parseInt(G1.decos
					.getStr("column"));
			column = " column=\'" + html_env.g1PaginationColumnNum + "\'";
		} else if (G1.decos.containsKey("column")) { // 複合反復子
			html_env.g1RetNum = Integer.parseInt(G1.decos.getStr("column"));
			column = " column=\'" + html_env.g1RetNum + "\'";
		}

		if(!GlobalEnv.isOpt()){
			if(!Sass.isBootstrapFlg()){
				//20130503  Panel
				//				G1.panelFlg = Mobile_HTML5C1.panelProcess1(G1.decos, html_env);

				//20130330 tab
				//tab1
				if(G1.decos.containsKey("tab1")){
					html_env.code.append("<div data-role=\"content\"> <div id=\"tabs\">\n<ul>\n");
					html_env.code.append("	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">");
					if(!G1.decos.getStr("tab1").equals(""))	html_env.code.append(G1.decos.getStr("tab1"));
					else          							html_env.code.append("tab1");
					html_env.code.append("</a></li>\n");
					html_env.code.append("</ul>\n<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
				}
				//tab2〜tab15
				else{
					int i=2;
					while(i<=Mobile_HTML5Env.maxTab){		//HTMLEnv.maxTab=15
						if(G1.decos.containsKey("tab"+i) || (i==2 && G1.decos.containsKey("tab"))){
							//replace: </ul>の前に<li>〜</li>を付加
							String a = "</ul>";
							String b = "	<li><a href=\"#tabs-"+Mobile_HTML5Env.tabCount+"\">";
							if(G1.decos.containsKey("tab"+i))
								if(!G1.decos.getStr("tab"+i).equals(""))	b += G1.decos.getStr("tab"+i);
								else				            		b += "tab"+i;
							else
								if(!G1.decos.getStr("tab").equals(""))		b += G1.decos.getStr("tab");
								else				            		b += "tab";
							b += "</a></li>\n";
							Mobile_HTML5Manager.replaceCode(html_env, a, b+a);

							//replace: 最後の</div></div></div>カット
							Mobile_HTML5Manager.replaceCode(html_env, "</div></div></div>", "");

							//replace: 不要な「<div class=〜」をカット
							Mobile_HTML5Manager.replaceCode(html_env, "<div class=\""+classid+" \">", "");

							html_env.code.append("<div id=\"tabs-"+Mobile_HTML5Env.tabCount+"\">\n");
							break;
						}
						i++;
					}
				}

				//20130312 collapsible
				if(G1.decos.containsKey("collapse")){
					html_env.code.append("<DIV data-role=\"collapsible\" data-content-theme=\"c\" style=\"padding: 0px 12px;\">\n");

					//header
					if(!G1.decos.getStr("collapse").equals(""))
						html_env.code.append("	<h1>"+G1.decos.getStr("collapse")+"</h1>\n");
					else
						html_env.code.append("<h1>Contents</h1>\n");
				}
				//20130309
				if(!G1.tableFlg){
					//        		if(html_env.written_classid.contains(classid))
					html_env.code.append("\n<DIV Class=\"ui-grid ##"+Mobile_HTML5Env.uiGridCount2+" "+classid+"\"");
					//        		else
					//        			html_env.code.append("\n<DIV Class=\"ui-grid ##"+Mobile_HTML5Env.uiGridCount2+"\"");
					html_env.code.append(">\n");
					Mobile_HTML5Env.uiGridCount2++;
				}

				//20130314  table
				if(G1.tableFlg){
					//added by goto 20130318  横スクロール
					if(G1.numberOfColumns < 0)	html_env.code.append("<div style=\"overflow:auto;\">\n");	//20130917  [ ],10@{table}

					if(G1.row>1 && G1.tableFlg)	Mobile_HTML5G2.tableStartTag = Mobile_HTML5C1.getTableStartTag(html_env, G1.decos, G1)+"<TR>";
					else					html_env.code.append(Mobile_HTML5C1.getTableStartTag(html_env, G1.decos, G1)+"<TR>");
				}
			}else if(Sass.isBootstrapFlg()){
				//        		if(!decos.containsKey("C1") && !decos.containsKey("G1")){
				//            		html_env.code.append("<DIV Class=\"row\">");
				//            		if(Sass.outofloopFlg.peekFirst()){
				//            			Sass.makeRowClass();
				//            		}
				//            	}
				//        		
				//        		html_env.code.append("<DIV Class=\""+classid+"\">");
				//        		html_env.code.append("<DIV Class=\"row\">");
				//        		if(Sass.outofloopFlg.peekFirst()){
				//        			Sass.makeClass(classid);
				//        			Sass.defineGridBasic(classid, decos);
				//        			Sass.makeRowClass();
				//	      		}
				//        		Sass.beforeLoop();

				if(G1.firstFlg){
					html_env.code.append("<DIV Class=\"row\">\n");
					html_env.code.append("<DIV Class=\""+classid+"\">\n");
					if(Sass.outofloopFlg.peekFirst()){        				
						//        				Sass.makeClass(classid);
						//        				Sass.defineGridBasic(classid, decos);
						//        				Sass.closeBracket();
						Sass.makeColumn(classid, G1.decos, "", -1);
					}
				}

				html_env.code.append("<DIV Class=\"row\">\n");
				if(Sass.outofloopFlg.peekFirst()){
					//        			Sass.makeRowClass();
				}

				Sass.beforeLoop();

				//				if(decos.containsKey("slide")){
				//					html_env.code.append("<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n"
				//							+ "<!-- Indicators -->\n"
				//							+ "<ol class=\"carousel-indicators\">\n");
				//					for(int i = 0; i < this.numberOfColumns; i++){
				//						if(i == 0){
				//							html_env.code.append("<li data-target=\"#carousel-example-generic\" data-slide-to=\""+ i +"\" class=\"active\"></li>\n");
				//						}else{
				//							html_env.code.append("<li data-target=\"#carousel-example-generic\" data-slide-to=\""+ i +"\"></li>\n");
				//						}
				//					}
				//					html_env.code.append("</ol>\n"
				//							+ "<!-- Wrapper for slides -->\n"
				//							+ "<div class=\"carousel-inner\" role=\"listbox\">\n");
				//				}
				//added 161125 taji for @slide	
			}
		}
		// System.out.println("G1 tableFlg = " + tableFlg + ", divFlg = " +
		// divFlg);
		html_env.append_css_def_td(HTMLEnv.getClassID(G1), G1.decos);
		Mobile_HTML5.beforeWhileProcess(G1.getSymbol(), G1.decos, html_env, ifs_div_String);
		while (G1.hasMoreItems()) {
			Mobile_HTML5.gLevel1++;
			Mobile_HTML5.whileProcess1_1(G1.getSymbol(), G1.decos, html_env, data, data_info, tfe, null, -1);

			Mobile_HTML5Function.setGlvl(html_env.getGlevel());	//added by goto 20130914  "SEQ_NUM"
			if(G1.decos.containsKey("table0") || Mobile_HTML5C1.table0Flg || Mobile_HTML5C2.table0Flg || Mobile_HTML5G2.table0Flg)	G1.table0Flg = true;
			if(G1.decos.containsKey("table") || Mobile_HTML5C1.tableFlg || Mobile_HTML5C2.tableFlg || Mobile_HTML5G2.tableFlg || G1.table0Flg)	G1.tableFlg=true;
			if(G1.decos.containsKey("div")){
				G1.divFlg = true;
				G1.tableFlg = false;
			}
			html_env.setGlevel(html_env.getGlevel() + 1);

			if(G1.rowFlg){
				html_env.code = new StringBuffer();
				html_env.countfile++;
				html_env.filename = html_env.outfile + "_row" + Mobile_HTML5G2.rowFileNum + "_" + G1.j + Compiler.getExtension();
				html_env.nextbackfile = html_env.linkoutfile + "_row" + Mobile_HTML5G2.rowFileNum + "_" + G1.j + Compiler.getExtension();
				html_env.setOutlineMode();
			}


			//20130309
			G1.Count = ( ((G1.gridInt>=G1.jj)&&(Mobile_HTML5G1.G1Flg))? G1.jj:G1.gridInt );
			G1.Count %= G1.numberOfColumns;


			//20130917  [ ],10@{table}
			if(G1.tableFlg && G1.numberOfColumns > 1 && G1.Count == 0){
				if(G1.table_column_num>0)	html_env.code.append("</TR><TR>\n");
				else					G1.table_column_num++;
			}

			if(!Sass.isBootstrapFlg()){
				//20130309
				if(!G1.tableFlg){
					//20131002
					//TODO style=を.cssへ
					String divWidth = Mobile_HTML5.getDivWidth("G1", G1.decos, G1.numberOfColumns - Mobile_HTML5Function.func_null_count);	//null()
					if(!G1.decos.containsKey("column")){
						if(G1.Count!=0)	html_env.code.append("\n<div class=\"ui-block"+" "+classid2+" "+classid2+"-"+G1.G1_count+"\">\n");
						else{
							if(!Mobile_HTML5_dynamic.dynamicDisplay){
								html_env.code.append("\n<div class=\"ui-block"+" "+classid2+" "+classid2+"-"+G1.G1_count+"\" style=\"clear:left;\">\n");
							}else{
								//html_env.code.append("\n<div class=\"ui-block"+" "+classid2+" "+classid2+"-"+G1_count+"\" '.(($j++>0)? '' : 'style=\"clear:left;\"').'>\n");
								html_env.code.append("\n<div class=\"ui-block"+" "+classid2+" "+classid2+"-"+G1.G1_count+"\" '.(($i"+(Mobile_HTML5.gLevel0+1)+">0)? '' : 'style=\"clear:left;\"').'>\n");	//TODO d2 change if ?
							}
						}
						if(G1.gridInt<1)	Mobile_HTML5Attribute.attributeDivWidth2 += "."+classid2+"-"+G1.G1_count+"{ width:"+divWidth+"; }\n";
					}else{
						if(G1.Count!=0)	html_env.code.append("\n<div class=\"ui-block"+" "+classid2+"\">\n");
						else			html_env.code.append("\n<div class=\"ui-block"+" "+classid2+"\" style=\"clear:left;\">\n");
						Mobile_HTML5Attribute.attributeDivWidth = divWidth;
					}
					//System.out.println(this.decos+ " "+ divWidth+" "+gridInt);
				}
				//20130314  table
				//20160527 bootstrap
				else if(G1.tableFlg){
					html_env.code.append("<TD class=\"" + classid2 + " nest\">\n");
				}

				classid = classid2;

				//    	    if(Mobile_HTML5Env.dynamicFlg){	//20130529 dynamic
				//	      		//☆★
				//	      		Log.info("★★G1-1 tfe : " + tfe);
				//	    		//☆★            Log.info("G1 tfe : " + tfe);
				//	            //☆★            Log.info("G1 tfes : " + this.tfes);
				//	            //☆★            Log.info("G1 tfeItems : " + this.tfeItems);
				//	      	}
			}else if(Sass.isBootstrapFlg()){
				G1.decos.put("G1",""+(G1.numberOfColumns - Mobile_HTML5Function.func_null_count));
				html_env.code.append("<div class=\"" + classid2 +"\">\n");
				if(Sass.outofloopFlg.peekFirst()){
					//            		Sass.makeClass(classid2);
					//            		Sass.defineGridBasic(classid2, (tfe).decos);

					//            		Sass.makeClass(classid2);
					//            		Sass.defineGridBasic(classid2, (tfe).decos);
					//            		Sass.closeBracket();
					//taji comment out
					//					Sass.makeColumn(classid2, (tfe).decos, getSymbol(), responsiveId);
					//				}
				}
			}

			Mobile_HTML5.whileProcess1_2(G1.getSymbol(), G1.decos, html_env, data, data_info, tfe, null, -1);

			G1.worknextItem();
			Mobile_HTML5.whileProcess2_1(G1.getSymbol(), G1.decos, html_env, data, data_info, tfe, null, -1);

			if(G1.decos.containsKey("table0") || Mobile_HTML5C1.table0Flg || Mobile_HTML5C2.table0Flg || Mobile_HTML5G2.table0Flg)	Mobile_HTML5G1.table0Flg = true;
			if(G1.decos.containsKey("table") || Mobile_HTML5C1.tableFlg || Mobile_HTML5C2.tableFlg || Mobile_HTML5G2.tableFlg || Mobile_HTML5G1.table0Flg)	Mobile_HTML5G1.tableFlg=true;
			if(G1.decos.containsKey("div")){
				G1.divFlg = true;
				G1.tableFlg = false;
			}

			G1.ii++;
			G1.jj++;
			G1.gridInt++;

			//20160527 bootstrap
			if(!Sass.isBootstrapFlg()){
				if(!G1.tableFlg)	html_env.code.append("</div>");	//20130309
				else if(G1.tableFlg)	        html_env.code.append("</TD>\n");    //20130314 table
			}else if(Sass.isBootstrapFlg()){
				html_env.code.append("</div>\n");//classid2
				if(Sass.outofloopFlg.peekFirst()){
					//            		Sass.closeBracket();//classid2
				}
				Sass.afterFirstLoop();
			}

			html_env.setGlevel(html_env.getGlevel() - 1);

			Mobile_HTML5G2.tableDivHeader_Count1++;	//20131001 tableDivHeader

			//added by goto 20130413  "row Prev/Next"
			if(G1.rowFlg){
				G1.codeBuf.append(html_env.code);
				if((G1.rowNum+1)%(G1.row*G1.numberOfColumns)==0){
					Mobile_HTML5G2.createHTMLfile_ForPrevNext(html_env, G1.codeBuf);
					G1.j++;
					G1.codeBuf = new StringBuffer();
				}
				G1.rowNum++;
			}

			if(!Mobile_HTML5.whileProcess2_2(G1.getSymbol(), G1.decos, html_env, data, data_info, tfe, null, -1))	break;
			Mobile_HTML5.gLevel1--;
		}
		Mobile_HTML5.afterWhileProcess(G1.getSymbol(), classid2, G1.decos, html_env, ifs_div_String);

		//added by goto 20130413  "row Prev/Next"
		if(G1.rowFlg){
			if(G1.rowNum%(G1.row*G1.numberOfColumns)!=0){	//最後の child HTML を create
				Mobile_HTML5G2.createHTMLfile_ForPrevNext(html_env, G1.codeBuf);
			}
			//ファイル名・コード等をparent HTMLのものへ戻す
			//					html_env.filename = parentfile;
			//					html_env.code = parentcode;
			//					html_env.header = parentheader;
			//					html_env.footer = parentfooter;
			//					html_env.nextbackfile = parentnextbackfile;
			Log.out("TFEId = " + classid);
			html_env.append_css_def_td(classid, G1.decos);

			int first = 1, last = ((G1.rowNum%(G1.row*G1.numberOfColumns)!=0)? (G1.rowNum/(G1.row*G1.numberOfColumns)+1):(G1.rowNum/(G1.row*G1.numberOfColumns)));	//for G1
			Mobile_HTML5G2.PrevNextProcess(html_env, G1.rowNum, G1.row, first, last, G1.numberOfColumns);
		}

		/* 
//	    		//,で結合(水平結合)した際
//	    		//replace: 不要な「<div class=〜」をカット
//				String[] s = {"a","b","c","d","e"};
//				int j=0;
//				while(!HTMLManager.replaceCode(html_env, "<div class=\"ui-block-"+s[j]+" "+HTMLEnv.getClassID(this)+"\">", "")){
//					j++;
//					if(j>4) break;
//				}
		 */

		if(Mobile_HTML5Env.getFormItemFlg()){		
			Mobile_HTML5Env.incrementFormPartsNumber();
		}

		if(!Sass.isBootstrapFlg()){
			if(!G1.tableFlg)	html_env.code.append("\n</DIV>\n");			//20130309	//20160527 bootstrap
			else if (G1.tableFlg){	//20160527 bootstrap
				if(!(G1.row>1 && G1.tableFlg))	html_env.code.append("</TR></TABLE>\n");	//20130314  table
				G1.tableFlg = false;
				G1.table0Flg = false;		//20130325 table0
				if(G1.numberOfColumns < 0)	html_env.code.append("</div>\n");	//added by goto 20130318  横スクロール		//20130917  [ ],10@{table}
			}
		}else if(Sass.isBootstrapFlg()){
			if(G1.decos.containsKey("slide")){
				html_env.code.append("</div>\n");
				html_env.code.append("<!-- Controls -->\n"
						+ "<a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n"
						+ "<span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n"
						+ "<span class=\"sr-only\">Previous</span>\n"
						+ "</a>\n"
						+ "<a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n"
						+ "<span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n"
						+ "<span class=\"sr-only\">Next</span>\n"
						+ "</a>\n"
						+ "</div>\n");
			}
			//        	html_env.code.append("\n</DIV>\n");//.row
			//        	html_env.code.append("\n</DIV>\n");//.TFE
			//      		if(Sass.outofloopFlg.peekFirst()){
			//      			Sass.closeBracket();
			//      			Sass.closeBracket();
			//      		}
			//      		if(!decos.containsKey("C1") && !decos.containsKey("G1")){
			//        		html_env.code.append("\n</DIV>\n");
			//        		if(Sass.outofloopFlg.peekFirst()){
			//        			Sass.closeBracket();
			//        		}
			//        	}

			html_env.code.append("</DIV>\n");//.row
			if(Sass.outofloopFlg.peekFirst()){
				//        		Sass.closeBracket();//row
			}

			if(G1.firstFlg){
				html_env.code.append("</DIV>\n");//.classid
				html_env.code.append("</DIV>\n");//.row
				if(Sass.outofloopFlg.peekFirst()){
					//        			Sass.closeBracket();//classid
					//        			Sass.closeBracket();//row
				}
				G1.firstFlg = false;
			}
		}
		if(G1.divFlg)	G1.divFlg = false;		//20130326  div

		G1.G1Flg=false;
		Log.out("</TR></TABLE>");

		//20130312 collapsible
		if(G1.decos.containsKey("collapse")){
			html_env.code.append("</DIV>");
		}

		//20130330 tab
		int a=1;
		while(a<=Mobile_HTML5Env.maxTab){
			if(G1.decos.containsKey("tab"+a) || (a==1 && G1.decos.containsKey("tab"))){
				html_env.code.append("</div></div></div>\n");
				Mobile_HTML5Env.tabCount++;
				break;
			}
			a++;
		}

		//20130503  Panel
		//				Mobile_HTML5C1.panelProcess2(G1.decos, html_env, G1.panelFlg);

		//added by goto 20130413  "row Prev/Next"
		if(G1.rowFlg){
			Mobile_HTML5G2.rowFileNum++;
			G1.rowFlg = false;
			Mobile_HTML5G2.tableStartTag = "";
		}
		Mobile_HTML5.postProcess(G1.getSymbol(), classid2, G1.decos, html_env);	//Post-process (後処理)
	}
}
