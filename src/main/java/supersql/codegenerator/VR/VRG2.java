package supersql.codegenerator.VR;

import org.stringtemplate.v4.compiler.STParser.ifstat_return;

import supersql.codegenerator.Grouper;
import supersql.codegenerator.Manager;
import supersql.codegenerator.Modifier;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;

public class VRG2 extends Grouper {

	private VREnv vrEnv;
	private VREnv vr_env2;
	boolean retFlag = false;	// 20140611_masato pagenationフラグ
	boolean pageFlag = false;	// 20140611_masato pagenationフラグ

	public VRG2(Manager manager, VREnv henv, VREnv henv2) {
		this.vrEnv = henv;
		this.vr_env2 = henv2;
	}

	@Override
	public String getSymbol() {
		return "VRG2";
	}

	@Override
	public String work(ExtList data_info) {

		Log.out("------- G2 -------");
		if(vrEnv.gLevel == 0){			
			vrEnv.currentNode = vrEnv.currentNode.appendChild(vrEnv.xml.createElement("group"));
			VRAttribute.groupcount++;
			VRAttribute.idcountarray.add(VRAttribute.idcount);//picture,wall
			VRAttribute.idcount = 0;//picture,wall 初期化
			VRC1.N3flag = false;//N次元初期化
			
		}
		
		
		this.setDataList(data_info);
		if (VREnv.getSelectFlg()){
			data_info = (ExtList) data_info.get(0);
		}
		
		vrEnv.append_css_def_td(VREnv.getClassID(this), this.decos);

		int i = 0;				// 20140526_masato
		int j = 0;				// 20140611_masato
		int k = 0;	
		if (decos.containsKey("vr_x")) {//複合反復子
			i = Integer.parseInt(decos.getStr("vr_x"));
			retFlag = true;
			if(!VRAttribute.componexflag){
				VRAttribute.compx[VRAttribute.cgcount] = i;
				VRAttribute.compflag[VRAttribute.cgcount] = 2;
			}
			VRAttribute.componexflag = true;
		}
		if (decos.containsKey("vr_y")) {///column->row_x, row->vr_y　//複合反復子
			j = Integer.parseInt(decos.getStr("vr_y"));
			retFlag = true;
			if(!VRAttribute.componeyflag){
				VRAttribute.compy[VRAttribute.cgcount] = j;
				VRAttribute.compflag[VRAttribute.cgcount] = 2;
			}
			VRAttribute.componeyflag = true;
		}
		if (decos.containsKey("vr_z")) {//複合反復子
			k = Integer.parseInt(decos.getStr("vr_z"));
			retFlag = true;
			if(!VRAttribute.componezflag){
				VRAttribute.compz[VRAttribute.cgcount] = k;
				VRAttribute.compflag[VRAttribute.cgcount] = 2;
			}
			VRAttribute.componezflag = true;
		}

//		if(vrEnv.gLevel == VRcjoinarray.gLemaxlist.get(VRAttribute.groupcount)-2){
//			VRAttribute.floorarray.add(2);
//		}else 
		if(vrEnv.gLevel == VRcjoinarray.gLemaxlist.get(VRAttribute.groupcount)-1){
			VRAttribute.exharray.add(2);
		}


		while (this.hasMoreItems()) {
			VRAttribute.genre = "";
			VRAttribute.Ngenre = "";

			// 20140528_masato
			VRAttribute.elearraySeq = 0;//n2 kotani

			try {
				int l=VRManager.gindex.get(vrEnv.gLevel);
				VRManager.gindex.set(vrEnv.gLevel,l+1);//gindex[]++
			} catch (Exception e) {
				VRManager.gindex.add(1);	//gindex[]=1
			}

			vrEnv.gLevel++;
			Log.out("selectFlg" + VREnv.getSelectFlg());
			Log.out("selectRepeatFlg" + VREnv.getSelectRepeat());
			Log.out("formItemFlg" + VREnv.getFormItemFlg());

			String classid = VREnv.getClassID(tfe);

			//TODO: check this has nothing to do with VR
			if (GlobalEnv.isOpt() && !VREnv.getSelectRepeat()) {
				vr_env2.code.append("<tfe type=\"repeat\" dimension=\"2\"");
				vr_env2.code.append(" border=\"" + vrEnv.tableBorder
						+ "\"");

				if (decos.containsKey("tablealign"))
					vr_env2.code.append(" align=\""
							+ decos.getStr("tablealign") + "\"");
				if (decos.containsKey("tablevalign"))
					vr_env2.code.append(" valign=\""
							+ decos.getStr("tablevalign") + "\"");

				if (decos.containsKey("class")) {
					vr_env2.code.append(" class=\"");
					vr_env2.code.append(decos.getStr("class") + " ");
				}
				if (vrEnv.writtenClassId.contains(VREnv.getClassID(this))) {
					if (decos.containsKey("class")) {
						vr_env2.code.append(VREnv.getClassID(this) + "\"");
					} else {
						vr_env2.code.append(" class=\""
								+ VREnv.getClassID(this) + "\"");
					}
				} else if (decos.containsKey("class")) {
					vr_env2.code.append("\"");
				}

				if (decos.containsKey("tabletype")) {
					vr_env2.code.append(" tabletype=\""
							+ decos.getStr("tabletype") + "\"");
					if (decos.containsKey("cellspacing")) {
						vr_env2.code.append(" cellspacing=\""
								+ decos.getStr("cellspacing") + "\"");
					}
					if (decos.containsKey("cellpadding")) {
						vr_env2.code.append(" cellpadding=\""
								+ decos.getStr("cellpadding") + "\"");
					}
				}
				vr_env2.code.append(">");
			}

			this.worknextItem();

			//TODO: check what this does
			if (vrEnv.notWrittenClassId.contains(classid)
					&& vrEnv.code.indexOf(classid) >= 0) {
				vrEnv.code.delete(vrEnv.code.indexOf(classid),
						vrEnv.code.indexOf(classid) + classid.length() + 1);
			}

			vrEnv.gLevel--;
		}
		VRManager.gindex.set(vrEnv.gLevel, 0);
		if(vrEnv.gLevel == 0){
			VRManager.nest1count++;
		}

		for(int l=0; l<VRAttribute.elearrayXML.size();l++){///n2 kotani
			vrEnv.currentNode.appendChild(VRAttribute.elearrayXML.get(l));
		}
		VRAttribute.elearrayXML.clear();//初期化
		VRAttribute.elearraySeq = 0;//初期化


		if(vrEnv.gLevel == 0){
			VRAttribute.componexflag = false;
			VRAttribute.componeyflag = false;
			VRAttribute.componezflag = false;
			VRAttribute.cgcount++;

			vrEnv.currentNode = vrEnv.currentNode.getParentNode();
			VRAttribute.grouptag++;
			VRAttribute.genrearray22.add(VRAttribute.genrecount);
		}				
		Log.out("TFEId = " + VREnv.getClassID(this));

		return null;
	}
}
