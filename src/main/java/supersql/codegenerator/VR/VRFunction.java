package supersql.codegenerator.VR;

import supersql.codegenerator.Function;
import supersql.codegenerator.Manager;
import supersql.common.Log;
import supersql.extendclass.ExtList;
import org.w3c.dom.Element;

public class VRFunction extends Function {
	
	protected static String updateFile;

	
	public static String opt(String s) {
		if (s.contains("\"")) {
			s = s.replaceAll("\"", "");
			System.out.println("s");
		}
		if (s.startsWith("./")) {
			s = s.substring(2, s.length());
		}
		if (s.startsWith("/")) {
			s = s.substring(1, s.length());
		}
		return s;
	}

	private VREnv vrEnv;
	private VREnv vrEnv2;

	public VRFunction() {

	}

	public VRFunction(Manager manager, VREnv henv, VREnv henv2) {
		super();
		this.vrEnv = henv;
		this.vrEnv2 = henv2;
	}

	protected void Func_null() {
		return;
	}

	protected String className() { // added 20130703
		if (decos.containsKey("class"))
			return " class=\"" + decos.getStr("class") + "\" ";
		return "";
	}

	// Function��work�᥽�å�
	@Override
	public String work(ExtList data_info) {
		this.setDataList(data_info);
		
		String FuncName = this.getFuncName();
		
		System.out.print("data info:"+data_info);
		switch (FuncName) {
		case "cube":
			if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
				Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
				Element cube = vrEnv.xml.createElement("cube");
				cube.setAttribute("size", data_info.get(0).toString());
				n2.appendChild(cube);
			} else {
				Element n2 = vrEnv.xml.createElement("n2");
				n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
				Element cube = vrEnv.xml.createElement("cube");
				cube.setAttribute("size", data_info.get(0).toString());
				n2.appendChild(cube);
				VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
			}
			VRAttribute.elearraySeq++;
			break;
			
		case "torus":
			if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
				Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
				Element torus = vrEnv.xml.createElement("torus");
				torus.setAttribute("r1", data_info.get(0).toString());
				torus.setAttribute("r2", data_info.get(1).toString());
				n2.appendChild(torus);
			} else {
				Element n2 = vrEnv.xml.createElement("n2");
				n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
				Element torus = vrEnv.xml.createElement("torus");
				torus.setAttribute("r1", data_info.get(0).toString());
				torus.setAttribute("r2", data_info.get(1).toString());
				n2.appendChild(torus);
				VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
			}
			VRAttribute.elearraySeq++;
			break;
			
		case "pyramid":
			if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
				Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
				Element pyramid = vrEnv.xml.createElement("pyramid");
				pyramid.setAttribute("size", data_info.get(0).toString());
				pyramid.setAttribute("height", data_info.get(1).toString());
				n2.appendChild(pyramid);
			} else {
				Element n2 = vrEnv.xml.createElement("n2");
				n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
				Element pyramid = vrEnv.xml.createElement("pyramid");
				pyramid.setAttribute("size", data_info.get(0).toString());
				pyramid.setAttribute("height", data_info.get(1).toString());
				n2.appendChild(pyramid);
				VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
			}
			VRAttribute.elearraySeq++;
			break;
			//object内に装飾はしない
		case "color":
//			Log.info("color:"+data_info);
//			String nest_funcname = .get(0).toString(); 
			
			break;
			
			
			
		}
		//No functions supported in VR yet
		Log.out("TFEId = " + VREnv.getClassID(this));
//		htmlEnv.append_css_def_td(VREnv.getClassID(this), this.decos);
		return null;
	}
}
