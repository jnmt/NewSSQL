package supersql.codegenerator.VR;

import java.io.Serializable;

import supersql.codegenerator.Connector;
import supersql.codegenerator.ITFE;
import supersql.codegenerator.Incremental;
import supersql.codegenerator.Manager;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;

public class VRC2 extends Connector implements Serializable {

	private VREnv vrEnv;
	private VREnv vrEnv2;

	// 鐃緒申鐃藷ストラク鐃緒申
	public VRC2(Manager manager, VREnv henv, VREnv henv2) {
		this.vrEnv = henv;
		this.vrEnv2 = henv2;
	}

	@Override
	public String getSymbol() {
		return "VRC2";
	}

	// C2鐃緒申work鐃潤ソ鐃獣ワ申
	@Override
	public String work(ExtList data_info) {
		Log.out("------- C2 -------");
		Log.out("tfes.contain_itemnum=" + tfes.contain_itemnum());
		Log.out("tfessize=" + tfes.size());
		Log.out("countconnetitem=" + countconnectitem());

		this.setDataList(data_info);

			if (decos.containsKey("form")) {
				vrEnv2.code.append("<form" + VREnv.getFormNumber()
						+ "start />");
				if (decos.getStr("form").toLowerCase().equals("search")) {
					VREnv.setSearch(true);
				}
			}

			if (decos.containsKey("insert")) {
				VREnv.setIDU("insert");
			}
			if (decos.containsKey("update")) {
				VREnv.setIDU("update");
			}
			if (decos.containsKey("delete")) {
				VREnv.setIDU("delete");
			}

			String classname;
			if (this.decos.containsKey("class")) {
				classname = this.decos.getStr("class");
			} else {
				classname = VREnv.getClassID(this);
			}
			
			// tk
			// start////////////////////////////////////////////////////////////////
			vrEnv.append_css_def_td(VREnv.getClassID(this), this.decos);

			if (!GlobalEnv.isOpt()) {
				if (vrEnv.decorationStartFlag.size() > 0) {
					if (vrEnv.decorationStartFlag.get(0)) {
//						VRDecoration.fronts.get(0).append("<TABLE cellSpacing=\"0\" cellPadding=\"0\" border=\"");
//						VRDecoration.fronts.get(0).append(vrEnv.tableBorder + "\"");
//						VRDecoration.fronts.get(0).append(vrEnv.getOutlineMode());
//						VRDecoration.classes.get(0).append(" class=\"");
						VRDecoration.ends.get(0).append(classname);
//						VRDecoration.ends.get(0).append("\">");
						vrEnv.decorationStartFlag.set(0, false);
					} else {
//						VRDecoration.ends.get(0).append("<TABLE cellSpacing=\"0\" cellPadding=\"0\" border=\"");
//						VRDecoration.ends.get(0).append(vrEnv.tableBorder + "\"");
//						VRDecoration.ends.get(0).append(vrEnv.getOutlineMode());
//						VRDecoration.ends.get(0).append(" class=\"");
						VRDecoration.ends.get(0).append(classname);
//						VRDecoration.ends.get(0).append("\">");
					}
				} else {
//					vrEnv.code
//							.append("<TABLE cellSpacing=\"0\" cellPadding=\"0\" border=\"");
//					vrEnv.code.append(vrEnv.tableBorder + "\" ");
//					vrEnv.code.append(vrEnv.getOutlineMode());
					if (vrEnv.writtenClassId.contains(VREnv.getClassID(this))) {
//						vrEnv.code.append(" class=\"");
//						vrEnv.code.append(VREnv.getClassID(this));
					}
	
					if (decos.containsKey("class")) {
						if (!vrEnv.writtenClassId.contains(VREnv
								.getClassID(this))) {
//							vrEnv.code.append(" class=\"");
						} else {
//							vrEnv.code.append(" ");
						}
						vrEnv.code.append(decos.getStr("class") + "\" ");
					} else if (vrEnv.writtenClassId.contains(VREnv
							.getClassID(this))) {
//						vrEnv.code.append("\" ");
					}
//					vrEnv.code.append(">");
				}
			}
			if (GlobalEnv.isOpt()) {
				vrEnv2.code.append("<tfe type=\"connect\" dimension=\"2\"");
				if (decos.containsKey("tablealign"))
					vrEnv2.code.append(" align=\""
							+ decos.getStr("tablealign") + "\"");
				if (decos.containsKey("tablevalign"))
					vrEnv2.code.append(" valign=\""
							+ decos.getStr("tablevalign") + "\"");
				if (decos.containsKey("height"))
					vrEnv2.code.append(" height=\"" + decos.getStr("height")
							+ "\"");
				if (decos.containsKey("tabletype")) {
					vrEnv2.code.append(" tabletype=\""
							+ decos.getStr("tabletype") + "\"");
					if (decos.containsKey("cellspacing")) {
						vrEnv2.code.append(" cellspacing=\""
								+ decos.getStr("cellspacing") + "\"");
					}
					if (decos.containsKey("cellpadding")) {
						vrEnv2.code.append(" cellpadding=\""
								+ decos.getStr("cellpadding") + "\"");
					}
					if (decos.containsKey("border")) {
						vrEnv2.code.append(" border=\""
								+ decos.getStr("border").replace("\"", "")
								+ "\"");
					}

					if (decos.containsKey("tableborder")) {
						vrEnv2.code.append(" tableborder=\""
								+ decos.getStr("tableborder").replace("\"", "")
								+ "\"");
					}
				} else {
					if (decos.containsKey("border")) {
						vrEnv2.code.append(" border=\""
								+ decos.getStr("border").replace("\"", "")
								+ "\"");
					} else {
						vrEnv2.code.append(" border=\""
								+ vrEnv.tableBorder.replace("\"", "") + "\"");
					}
					if (decos.containsKey("tableborder")) {
						vrEnv2.code.append(" tableborder=\""
								+ decos.getStr("tableborder").replace("\"", "")
								+ "\"");
					}
				}
				if (vrEnv.writtenClassId.contains(VREnv.getClassID(this))) {
					vrEnv2.code.append(" class=\"");
					vrEnv2.code.append(VREnv.getClassID(this));
				}

				if (decos.containsKey("class")) {
					if (!vrEnv.writtenClassId.contains(VREnv
							.getClassID(this))) {
						vrEnv2.code.append(" class=\"");
					} else {
						vrEnv2.code.append(" ");
					}
					vrEnv2.code.append(decos.getStr("class"));
				} else if (vrEnv.writtenClassId.contains(VREnv
						.getClassID(this))) {
					vrEnv2.code.append("\" ");
				}

				if (decos.containsKey("form")) {
					vrEnv2.code.append(" form=\"" + VREnv.getFormNumber()
							+ "\" ");
				}

				vrEnv2.code.append(">");
			}
			/*
			 * if(decos.containsKey("outborder"))
			 * vr_env.code.append(" noborder ");
			 */

			// vr_env2.code.append(">");

			// System.out.println(vr_env.code);

			// tk
			// end//////////////////////////////////////////////////////////////////

			// Log.out("<TABLE class=\""+VREnv.getClassID(this) + "\">");

			int i = 0;

			if (decos.containsKey("form")) {
				vrEnv.code.append(VRFunction.createForm(decos));
				VREnv.setFormItemFlg(true, null);
			}

			while (this.hasMoreItems()) {
				vrEnv.cNum++;
				vrEnv.xmlDepth++;
				ITFE tfe = tfes.get(i);

				if(VRAttribute.genre.equals("")){// kotani 16/10/04
					if(vrEnv.gLevel == 0){
						VRAttribute.groupcount++;
					}
				}
				String classid = VREnv.getClassID(tfe);
				
				// Log.out("<TR><TD class=\"nest "
				// + VREnv.getClassID(tfe) + " nest\"> decos:" + decos);
				this.worknextItem();

//				if (vrEnv.notWrittenClassId.contains(classid)) {
//					vrEnv.code.delete(vrEnv.code.indexOf(classid),
//							vrEnv.code.indexOf(classid) + classid.length()
//									+ 1);
//				}

				if (vrEnv.decorationStartFlag.size() > 0) {
					//VRDecoration.ends.get(0).append("</TD></TR>\n");
				} else {
					//vrEnv.code.append("</TD></TR>\n");
					// Log.out("</TD></TR>");
				}
				i++;
				vrEnv.cNum--;
				vrEnv.xmlDepth--;
			}


			if(VRAttribute.gjudge == 0){
				if(VRAttribute.billnum >= 2){
					VRAttribute.billnum = 0;
				}
			}

			vrEnv2.code.append("</tfe>");
			// Log.out("</TABLE>");
			if (decos.containsKey("form")) {
				vrEnv2.code.append("<form" + VREnv.getFormNumber()
						+ "end />");
				vrEnv.code.append(VREnv.exFormNameCreate());
				vrEnv.code.append("</form>");
				VREnv.setFormItemFlg(false, null);
				VREnv.incrementFormNumber();
				if (decos.getStr("form").toLowerCase().equals("search"))
					VREnv.setSearch(false);
			}

			if (vrEnv.decorationStartFlag.size() > 0) {
				if (vrEnv.decorationStartFlag.get(0)) {
					VRDecoration.ends.get(0).append("</TABLE>\n");
					vrEnv.decorationStartFlag.set(0, false);
				} else {
					VRDecoration.ends.get(0).append("</TABLE>\n");
				}
			} else {
				vrEnv.code.append("</TABLE>\n");
			}

			Log.out("TFEId = " + VREnv.getClassID(this));
			// vr_env.append_css_def_td(VREnv.getClassID(this), this.decos);
			// System.out.println("</Connector" + vrEnv.cNum + ">");
			// vrEnv.xmlCode.append("</Connector" + vrEnv.cNum + ">\n");
			Log.out("+++++++ C2 +++++++");
			return null;
		}
	}