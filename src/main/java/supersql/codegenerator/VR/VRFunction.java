package supersql.codegenerator.VR;

import supersql.codegenerator.Function;
import supersql.codegenerator.Manager;
import supersql.common.Log;
import supersql.extendclass.ExtList;

import java.awt.GradientPaint;
import java.awt.print.Printable;
import java.util.Arrays;

import org.w3c.dom.Element;

import com.gargoylesoftware.htmlunit.javascript.host.Location;
import com.mysql.fabric.xmlrpc.base.Value;

import net.sourceforge.htmlunit.corejs.javascript.commonjs.module.provider.CachingModuleScriptProviderBase;

public class VRFunction extends Function {



	//	public static Element color;
	private final int COLOR = 0;
	private final int GRADIENTCOLOR = 1;
//	private final int COLORHSV = 2;
	private final int PULSE = 2;
	private final int HOP = 3;
	private final int ROTATE = 4;
	private final int LOCATION = 5;
	protected static String updateFile;
	private static Element[] options = new Element[6];
	public static Location[] locations = new Location[1]; 


	public static String opt(String s) {
		if (s.contains("\"")) {
			s = s.replaceAll("\"", "");
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
		//2017/09/21 tatsu AddFunction
		this.setDataList(data_info);

		String FuncName = this.getFuncName();

		switch (FuncName) {

		case "asset":
			try{
				if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
					//					Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
					Element asset = vrEnv.xml.createElement("Asset");
					asset.setAttribute("name", getArg(0).getStr());
					asset.setAttribute("size", getArg(1).getStr());
					if(decos.containsKey("target")){
						asset.setAttribute("target", decos.getStr("target"));
					}
					addOptions(asset);
					//					n2.appendChild(asset);
					vrEnv.currentNode.appendChild(asset);
				} else {
					Element asset = vrEnv.xml.createElement("Asset");
					//					Element n2 = vrEnv.xml.createElement("n2");  //n2エレメントの作成
					//					n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
					/*location Element start
					 * after if(x,y,zがあるかないか)*/
					asset.setAttribute("name", getArg(0).getStr());
					asset.setAttribute("size", getArg(1).getStr());
					if(decos.containsKey("target")){
						asset.setAttribute("target", decos.getStr("target"));
					}
					addOptions(asset);
					//					n2.appendChild(asset);
					//					VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
					vrEnv.currentNode.appendChild(asset);
				}
				VRAttribute.elearraySeq++;

			} catch (Exception e) {
				// TODO: handle exception
				for (int i = 0; i < sizeArg(); i++) {
					getArg(i).workAtt();
				}

			}
			break;




		case "object":
			switch (getArg(0).getStr()) {
			case "cube":
				if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
					//					Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
					Element cube = vrEnv.xml.createElement("cube");
					cube.setAttribute("size", getArg(1).getStr());
					addOptions(cube);
					vrEnv.currentNode.appendChild(cube);
				} else {
					//					Element n2 = vrEnv.xml.createElement("n2");  //n2エレメントの作成
					//					n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
					Element cube = vrEnv.xml.createElement("cube");
					/*location Element start
					 * konoato if(x,y,zがあるかないか)*/
					cube.setAttribute("size", getArg(1).getStr());
					addOptions(cube);
					vrEnv.currentNode.appendChild(cube);
					//					VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
				}
				VRAttribute.elearraySeq++;
				break;

			case "torus":
				if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
//					Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
					Element torus = vrEnv.xml.createElement("torus");
					torus.setAttribute("rOut", getArg(1).getStr()); //r1が大半形
					torus.setAttribute("rIn", getArg(2).getStr()); //r2が小半径
					addOptions(torus);
					vrEnv.currentNode.appendChild(torus);
				} else {
//					Element n2 = vrEnv.xml.createElement("n2");
//					n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
					Element torus = vrEnv.xml.createElement("torus");
					torus.setAttribute("rOut", getArg(1).getStr());
					torus.setAttribute("rIn", getArg(2).getStr());
//					n2.appendChild(torus);
					addOptions(torus);
					vrEnv.currentNode.appendChild(torus);
//					VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
				}
				VRAttribute.elearraySeq++;
				break;

			case "pyramid":
				if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
//					Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
					Element pyramid = vrEnv.xml.createElement("pyramid");
					pyramid.setAttribute("size", getArg(1).getStr());
					pyramid.setAttribute("height", getArg(2).getStr());
					addOptions(pyramid);
					vrEnv.currentNode.appendChild(pyramid);
//					n2.appendChild(pyramid);
				} else {
//					Element n2 = vrEnv.xml.createElement("n2");
//					n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
					Element pyramid = vrEnv.xml.createElement("pyramid");
					pyramid.setAttribute("size", getArg(1).getStr());
					pyramid.setAttribute("height", getArg(2).getStr());
//					n2.appendChild(pyramid);
					addOptions(pyramid);
					vrEnv.currentNode.appendChild(pyramid);
//					VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
				}
				VRAttribute.elearraySeq++;
				break;
				//object内に装飾はしない
			case "cuboid":
				if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
//					Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
					Element cuboid = vrEnv.xml.createElement("cuboid");
					cuboid.setAttribute("l_size", getArg(1).getStr());
					cuboid.setAttribute("w_size", getArg(2).getStr());
					cuboid.setAttribute("d_size", getArg(3).getStr());
					addOptions(cuboid);
					vrEnv.currentNode.appendChild(cuboid);
//					n2.appendChild(cuboid);
				} else {
//					Element n2 = vrEnv.xml.createElement("n2");
//					n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
					Element cuboid = vrEnv.xml.createElement("cuboid");
					cuboid.setAttribute("l_size", getArg(1).getStr());
					cuboid.setAttribute("w_size", getArg(2).getStr());
					cuboid.setAttribute("d_size", getArg(3).getStr());
//					n2.appendChild(cuboid);
					addOptions(cuboid);
					vrEnv.currentNode.appendChild(cuboid);
//					VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
				}
				VRAttribute.elearraySeq++;
				break;

			case "sphere":
				if (VRAttribute.elearrayXML.size() > VRAttribute.elearraySeq) {
					//					Element n2 = VRAttribute.elearrayXML.get(VRAttribute.elearraySeq);
					Element sphere = vrEnv.xml.createElement("sphere");
					sphere.setAttribute("size", getArg(1).getStr());
					addOptions(sphere);
					vrEnv.currentNode.appendChild(sphere);
				} else {
					//					Element n2 = vrEnv.xml.createElement("n2");
					//					n2.setAttribute("seq", Integer.toString(VRAttribute.elearraySeq));
					Element sphere = vrEnv.xml.createElement("sphere");
					sphere.setAttribute("size", getArg(1).getStr());

					addOptions(sphere);
					vrEnv.currentNode.appendChild(sphere);
					//					VRAttribute.elearrayXML.add(VRAttribute.elearraySeq,n2);
				}
				VRAttribute.elearraySeq++;
				break;

			case "text":
				Element text = vrEnv.xml.createElement("text");
				String contents = getArg(1).getStr();
				String t_size = getArg(2).getStr();
				text.setAttribute("contents",contents);
				text.setAttribute("size", t_size);
				addOptions(text);
				vrEnv.currentNode.appendChild(text);
				break;

			case "obj":
				for (int i = 0; i < this.sizeArg(); i++)
					getArg(i).workAtt();
				break;

			default:
				break;

			}
			break;
			//object内のswitch文の終わり	


		case "location":
			Element oldLocate = options[LOCATION];    //color(color()) block
			String lX = getArg(sizeArg()-3).getStr();
			String lY = getArg(sizeArg()-2).getStr();
			String lZ = getArg(sizeArg()-1).getStr();
			Element location = vrEnv.xml.createElement("location");
			location.setAttribute("x", lX);
			location.setAttribute("y", lY);
			location.setAttribute("z", lZ);
			options[LOCATION] = location;
			for (int i = 0; i < sizeArg()-3; i++) {
				getArg(i).workAtt();
			}
			options[LOCATION] = oldLocate;
			break;

		case "color":
			Element oldColor = options[COLOR];    //color(color()) block
			String colorname; 
			colorname = getArg(sizeArg()-1).getStr();
			Element color = vrEnv.xml.createElement("color");
			color.setTextContent(colorname);
			options[COLOR] = color;	
			for (int i = 0; i < sizeArg()-1; i++) {
				getArg(i).workAtt();
			}
			options[COLOR] = oldColor;
			break;
			
		case "color_gradient":
			Element oldGradientColor = options[GRADIENTCOLOR];
			float min_value;
			float max_value;
			String min_color;
			String max_color;
			float value;
			String result;
			min_color = getArg(sizeArg()-5).getStr();
			min_value = Float.parseFloat(getArg(sizeArg()-4).getStr());
			max_color = getArg(sizeArg()-3).getStr();
			max_value = Float.parseFloat(getArg(sizeArg()-2).getStr());
			value = Float.parseFloat(getArg(sizeArg()-1).getStr());
			System.out.println("balue"+value);
			System.out.println("minbalue"+min_value);
			System.out.println("maxbalue"+max_value);
			value = (value - min_value) / (max_value - min_value);
			
			if (value <= 0) {
				value = 0;
			}
			result = value + "";
			Element gradientColor = vrEnv.xml.createElement("gradient");
			gradientColor.setAttribute("min_c", min_color);
			gradientColor.setAttribute("max_c", max_color);
			gradientColor.setTextContent(result);
			options[GRADIENTCOLOR] = gradientColor;	
			for (int i = 0; i < sizeArg()-5; i++) {
				getArg(i).workAtt();
			}
			options[GRADIENTCOLOR] = oldGradientColor;
			
			break;

			//		case "color_RGBA":
			//			Element oldColorRgba = options[COLORRGBA];    //color(color()) block
			//			
			//			colorr = getArg(sizeArg()-3).getStr();
			//			Element colorrgba = vrEnv.xml.createElement("color");
			//			color.setTextContent(colorname);
			//			options[COLOR] = color;	
			//			for (int i = 0; i < sizeArg()-1; i++) {
			//				getArg(i).workAtt();
			//			}
			//			options[COLOR] = oldColor;
			//			break;
			//			
			//		case "color_HSV":
			//			Element oldColor = options[COLOR];    //color(color()) block
			//			String colorname; 
			//			colorname = getArg(sizeArg()-1).getStr();
			//			Element color = vrEnv.xml.createElement("color");
			//			color.setTextContent(colorname);
			//			options[COLOR] = color;	
			//			for (int i = 0; i < sizeArg()-1; i++) {
			//				getArg(i).workAtt();
			//			}
			//			options[COLOR] = oldColor;
			//			break;

		case "pulse":
			Element oldpulse = options[PULSE];
			String pScale = getArg(sizeArg()-2).getStr();
			String pSpeed = getArg(sizeArg()-1).getStr();
			Element pulse = vrEnv.xml.createElement("pulse");
			pulse.setAttribute("speed",pSpeed);
			pulse.setAttribute("scale", pScale);
			options[PULSE] = pulse;
			for (int i = 0; i < sizeArg()-2; i++) {
				getArg(i).workAtt();
			}
			options[PULSE] = oldpulse;

			break;

		case "hop":			
			Element oldhop = options[HOP];
			String hSpeed = getArg(sizeArg()-3).getStr();
			String hTop = getArg(sizeArg()-2).getStr();
			String hAxis = getArg(sizeArg()-1).getStr();
			Element hop = vrEnv.xml.createElement("hop");
			hop.setAttribute("speed", hSpeed);
			hop.setAttribute("top", hTop);
			hop.setAttribute("axis", hAxis);
			options[HOP] = hop;
			for (int i = 0; i < sizeArg()-3; i++) {
				getArg(i).workAtt();
			}
			options[HOP] = oldhop;

			break;

		case "rotate":
			Element oldrotate = options[ROTATE];
			String rX = getArg(sizeArg()-3).getStr();
			String rY = getArg(sizeArg()-2).getStr();
			String rZ = getArg(sizeArg()-1).getStr();
			Element rotate = vrEnv.xml.createElement("rotate");
			rotate.setAttribute("x", rX);
			rotate.setAttribute("y", rY);
			rotate.setAttribute("z", rZ);
			if(decos.containsKey("target")){
				rotate.setAttribute("target", decos.getStr("target"));
			}
			options[ROTATE] = rotate;
			for (int i = 0; i < sizeArg()-3; i++) {
				getArg(i).workAtt();
			}
			options[ROTATE] = oldrotate;
			break;

		case "union":
			//			String tfe = getTFE();

			break;

		default:
			break;


		}
		//No functions supported in VR yet
		Log.out("TFEId = " + VREnv.getClassID(this));
		//		htmlEnv.append_css_def_td(VREnv.getClassID(this), this.decos);
		return null;
	}

	private void addOptions(Element object){
		for (int i=0; i < options.length; i++){
			if (options[i]!= null) {
				object.appendChild(options[i].cloneNode(true));
			}
		}
	}
}
