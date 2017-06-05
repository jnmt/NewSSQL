package supersql.codegenerator.VR;

import supersql.codegenerator.Connector;
import supersql.codegenerator.ITFE;
import supersql.codegenerator.Manager;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;

public class VRC3 extends Connector {

	private VREnv vrEnv;
	private VREnv vrEnv2;

	public VRC3(Manager manager, VREnv henv, VREnv henv2) {
		this.vrEnv = henv;
		this.vrEnv2 = henv2;
	}

	@Override
	public String getSymbol() {
		return "VRC3";
	}
	
	@Override
	public String work(ExtList data_info) {
		
		String parentfile = vrEnv.fileName;
		StringBuffer parentcode = new StringBuffer();
		StringBuffer parentcss = new StringBuffer();
		StringBuffer parentheader = new StringBuffer();
		StringBuffer parentfooter = new StringBuffer();

		
		////////C2から

		this.setDataList(data_info);

		if (decos.containsKey("form")) {
			vrEnv2.code
					.append("<form" + vrEnv.getFormNumber() + "start />");
			if (decos.getStr("form").toLowerCase().equals("search")) {
				vrEnv.setSearch(true);
			}
		}

		if (decos.containsKey("insert")) {
			vrEnv.setIDU("insert");
		}
		if (decos.containsKey("update")) {
			vrEnv.setIDU("update");
		}
		if (decos.containsKey("delete")) {
			vrEnv.setIDU("delete");
		}

		// tk
		// start////////////////////////////////////////////////////////////////
		vrEnv.append_css_def_td(vrEnv.getClassID(this), this.decos);
		
		
		
		
		int i = 0;

		if (decos.containsKey("form")) {
			vrEnv.code.append(VRFunction.createForm(decos));
			vrEnv.setFormItemFlg(true, null);
		}
		

		while (this.hasMoreItems()) {

			ITFE tfe = tfes.get(i);
			if(VRAttribute.genre.equals("")){/// kotani 16/10/04
				if(vrEnv.gLevel == 0){
					VRAttribute.groupcount++;
				}else{
					//vrEnv.code.append("<category" + vrEnv.getClassID(tfe) + " > \n");
				}
			}else{
				//vrEnv.code.append("<category " + vrEnv.getClassID(tfe) + " name = \"" +VRAttribute.genre+ "\"> \n");

			}
			String classid = vrEnv.getClassID(tfe);

			this.worknextItem();

			Log.out("</TD>");////</TR>消した

			i++;

		}
		
		if(vrEnv.gLevel == 2 && VRManager.gindex.get(vrEnv.gLevel-2) == 1 && VRManager.gindex.get(vrEnv.gLevel-1) == 1){
			try {
				String l=VRManager.multiexh.get(VRManager.nest1count);
				VRManager.multiexh.set(VRManager.nest1count,l+"%");//gindex[]++
			} catch (Exception e) {
				VRManager.multiexh.add("%");
			}
		}
		
		if(VRAttribute.gjudge == 0){
			if(VRAttribute.billnum >= 2){
				VRAttribute.billnum = 0;
			}
		}
		
		Log.out("TFEId = " + vrEnv.getClassID(this));
		vrEnv.append_css_def_td(vrEnv.getClassID(this), this.decos);
		return null;

	}

}
