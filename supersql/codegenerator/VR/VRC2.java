package supersql.codegenerator.VR;

import org.stringtemplate.v4.compiler.STParser.ifstat_return;

import com.ibm.db2.jcc.am.t;

import supersql.codegenerator.Connector;
import supersql.codegenerator.ITFE;
import supersql.codegenerator.Manager;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;

public class VRC2 extends Connector {

	private VREnv vrEnv;
	private VREnv vrEnv2;

	public VRC2(Manager manager, VREnv henv, VREnv henv2) {
		this.vrEnv = henv;
		this.vrEnv2 = henv2;
	}

	@Override
	public String getSymbol() {
		return "VRC2";
	}

	@Override
	public String work(ExtList data_info) {
		Log.out("------- C2 -------");
		Log.out("tfes.contain_itemnum=" + tfes.contain_itemnum());
		Log.out("tfessize=" + tfes.size());
		Log.out("countconnetitem=" + countconnectitem());

		this.setDataList(data_info);

		if (decos.containsKey("form")) {
			vrEnv2.code
					.append("<form" + VREnv.getFormNumber() + "start />");
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

		// tk
		// start////////////////////////////////////////////////////////////////
		vrEnv.append_css_def_td(VREnv.getClassID(this), this.decos);


		if (GlobalEnv.isOpt()) {
			vrEnv2.code.append("<tfe type=\"connect\" dimension=\"2\"");
			if (decos.containsKey("tablealign"))
				vrEnv2.code.append(" align=\"" + decos.getStr("tablealign")
						+ "\"");
			if (decos.containsKey("tablevalign"))
				vrEnv2.code.append(" valign=\"" + decos.getStr("tablevalign")
						+ "\"");
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
							+ decos.getStr("border").replace("\"", "") + "\"");
				}

				if (decos.containsKey("tableborder")) {
					vrEnv2.code.append(" tableborder=\""
							+ decos.getStr("tableborder").replace("\"", "")
							+ "\"");
				}
			} else {
				if (decos.containsKey("border")) {
					vrEnv2.code.append(" border=\""
							+ decos.getStr("border").replace("\"", "") + "\"");
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
				if (!vrEnv.writtenClassId.contains(VREnv.getClassID(this))) {
					vrEnv2.code.append(" class=\"");
				} else {
					vrEnv2.code.append(" ");
				}
				vrEnv2.code.append(decos.getStr("class"));
			} else if (vrEnv.writtenClassId
					.contains(VREnv.getClassID(this))) {
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
		 * html_env.code.append(" noborder ");
		 */

		// tk
		// end//////////////////////////////////////////////////////////////////

		// Log.out("<TABLE class=\""+HTMLEnv.getClassID(this) + "\">");

		int i = 0;

		if (decos.containsKey("form")) {
			vrEnv.code.append(VRFunction.createForm(decos));
			VREnv.setFormItemFlg(true, null);
		}

		while (this.hasMoreItems()) {
			
			ITFE tfe = tfes.get(i);
			if(VRAttribute.genre.equals("")){// kotani 16/10/04
				if(vrEnv.gLevel == 0){
					VRAttribute.groupcount++;
				}else{
				}
			}else{
			}
			String classid = VREnv.getClassID(tfe);

			this.worknextItem();

			Log.out("</TD>");

			i++;

		}

		if(VRAttribute.gjudge == 0){
			if(VRAttribute.billnum >= 2){
				VRAttribute.billnum = 0;
			}
		}
		
		vrEnv2.code.append("</tfe>");
		if (decos.containsKey("form")) {
			vrEnv2.code.append("<form" + VREnv.getFormNumber() + "end />");
			vrEnv.code.append(VREnv.exFormNameCreate());
			vrEnv.code.append("</form>");
			VREnv.setFormItemFlg(false, null);
			VREnv.incrementFormNumber();
			if (decos.getStr("form").toLowerCase().equals("search"))
				VREnv.setSearch(false);
		}

		if(vrEnv.gLevel == 2 && VRManager.gindex.get(vrEnv.gLevel-2) == 1 && VRManager.gindex.get(vrEnv.gLevel-1) == 1){
			try {
				String l=VRManager.multiexh.get(VRManager.nest1count);
				VRManager.multiexh.set(VRManager.nest1count,l+"!");//gindex[]++
			} catch (Exception e) {
				VRManager.multiexh.add("!");
			}
		}

		Log.out("TFEId = " + VREnv.getClassID(this));
		return null;

	}

}
