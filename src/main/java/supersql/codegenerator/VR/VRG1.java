package supersql.codegenerator.VR;

import supersql.codegenerator.Grouper;
import supersql.codegenerator.Manager;
import supersql.common.Log;
import supersql.extendclass.ExtList;

public class VRG1 extends Grouper {
	
	private VREnv vrEnv;
	private VREnv vr_env2;
	boolean retFlag = false;	// 20140602_masato pagenationフラグ
	boolean pageFlag = false;	// 20140602_masato pagenationフラグ

	public VRG1(Manager manager, VREnv henv, VREnv henv2) {
		this.vrEnv = henv;
		this.vr_env2 = henv2;
	}

	@Override
	public String getSymbol() {
		return "VRG1";
	}

	@Override
	public String work(ExtList data_info) {
		Log.out("------- G1 -------");
		if(vrEnv.gLevel == 0){
			VRAttribute.groupcount++;
			VRAttribute.idcountarray.add(VRAttribute.idcount);//picture,wall
			VRAttribute.idcount = 0;//picture,wall 初期化
			vrEnv.currentNode = vrEnv.currentNode.appendChild(vrEnv.xml.createElement("group"));
			VRC1.N3flag = false;//N次元初期化
		
		}
		
		this.setDataList(data_info);
		vrEnv.append_css_def_td(VREnv.getClassID(this), this.decos);
		
		int i = 0;			
		int j = 0;			
		int k = 0;		
		if (decos.containsKey("vr_x")) { //vr_xがあったら  複合反復子
			i = Integer.parseInt(decos.getStr("vr_x"));
			retFlag = true;
			if(!VRAttribute.componexflag){
				VRAttribute.compx[VRAttribute.cgcount] = i;
				VRAttribute.compflag[VRAttribute.cgcount] = 1;
			}
			VRAttribute.componexflag = true;
		}
		if (decos.containsKey("vr_y")) {///column->row_x, row->vr_y 複合反復子
			j = Integer.parseInt(decos.getStr("vr_y"));
			retFlag = true;
			if(!VRAttribute.componeyflag){
				VRAttribute.compy[VRAttribute.cgcount] = j;
				VRAttribute.compflag[VRAttribute.cgcount] = 1;
			}
			VRAttribute.componeyflag = true;
		}
		if (decos.containsKey("vr_z")) {//複合反復子
			k = Integer.parseInt(decos.getStr("vr_z"));
			retFlag = true;
			if(!VRAttribute.componezflag){
				VRAttribute.compz[VRAttribute.cgcount] = k;
				VRAttribute.compflag[VRAttribute.cgcount] = 1;
			}
			VRAttribute.componezflag = true;
		}
		
//		if(vrEnv.gLevel == VRcjoinarray.gLemaxlist.get(VRAttribute.groupcount)-2){
//			VRAttribute.floorarray.add(1);
//		}else
		if(vrEnv.gLevel == VRcjoinarray.gLemaxlist.get(VRAttribute.groupcount)-1){
			VRAttribute.exharray.add(1);
		}
		

		while (this.hasMoreItems()) {
			
			VRAttribute.genre = "";
			VRAttribute.Ngenre = "";
			
			try {
				int l=VRManager.gindex.get(vrEnv.gLevel);
				VRManager.gindex.set(vrEnv.gLevel,l+1);//gindex[]++
			} catch (Exception e) {
				VRManager.gindex.add(1);	//gindex[]=1
			}

			vrEnv.gLevel++;
			VRAttribute.elearraySeq = 0;///n2 kotani
			this.worknextItem();
			vrEnv.gLevel--;
		}
		VRManager.gindex.set(vrEnv.gLevel, 0);
		
		if(vrEnv.gLevel == 0){
			VRManager.nest1count++;
		}
		
		for(int l=0; l<VRAttribute.elearrayXML.size();l++){//n2 kotani
			vrEnv.currentNode.appendChild(VRAttribute.elearrayXML.get(l));
		}

		VRAttribute.elearrayXML.clear();//初期化
		VRAttribute.elearraySeq = 0;//初期化
		
		
		if (VREnv.getFormItemFlg()) {
			VREnv.incrementFormPartsNumber();
		}

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
