package supersql.codegenerator.VR;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;

import com.mysql.jdbc.StatementInterceptorV2;

import supersql.codegenerator.CodeGenerator;
import supersql.codegenerator.ITFE;
import supersql.codegenerator.Jscss;
import supersql.codegenerator.Manager;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.common.Utils;
import supersql.dataconstructor.DataConstructor;
import supersql.extendclass.ExtList;

public class VRManager extends Manager {

	private VREnv vrEnv;
	private VREnv vrEnv2;
	public static int i=0;
	public static boolean vrflag = false;
	
	public static ArrayList<String> multiexh = new ArrayList<>();////展示物を複数くっつけて並べる、使わない
	public static ArrayList<Integer> gindex = new ArrayList<>();////展示物を複数くっつけて並べる、使わない
	public static int nest1count = 0;

	public VRManager(VREnv henv, VREnv henv2) {
		this.vrEnv = henv;
		this.vrEnv2 = henv2;
	}

	private void connectOutdir(String outdir, String outfile) {
		// added by goto 20120627 start
		String fileDir = new File(vrEnv.outFile).getAbsoluteFile()
				.getParent();
		if (fileDir.length() < vrEnv.outFile.length()
				&& fileDir
				.equals(vrEnv.outFile.substring(0, fileDir.length())))
			vrEnv.outFile = vrEnv.outFile.substring(fileDir.length() + 1); // 鐃緒申鐃出パワ申鐃春ワ申鐃緒申鐃緒申名
		// added by goto 20120627 end

		String tmpqueryfile = new String();
		if (vrEnv.outFile.indexOf("/") > 0) {
			if (outfile != null) {
				if (vrEnv.outFile.startsWith(".")
						|| vrEnv.outFile.startsWith("/")) {
					tmpqueryfile = vrEnv.outFile.substring(vrEnv.outFile
							.indexOf("/") + 1);
				}
			} else {
				tmpqueryfile = vrEnv.outFile.substring(vrEnv.outFile
						.lastIndexOf("/") + 1);
			}
		} else {
			tmpqueryfile = vrEnv.outFile;
		}
		if (!outdir.endsWith("/")) {
			outdir = outdir.concat("/");
		}
		vrEnv.outFile = outdir.concat(tmpqueryfile);
	}

	private String getOutfile(String outfile) {
		String out = new String();
		if (outfile.indexOf(".xml") > 0) {
			out = outfile.substring(0, outfile.indexOf(".xml"));
		} else {
			out = outfile;
		}
		return out;
	}

	private int indexOf(String string) {
		// TODO 鐃緒申動鐃緒申鐃緒申鐃緒申鐃曙た鐃潤ソ鐃獣ド¥申鐃緒申鐃緒申鐃緒申
		return 0;
	}

	private int lastIndexOf(String string) {
		// TODO 鐃緒申動鐃緒申鐃緒申鐃緒申鐃曙た鐃潤ソ鐃獣ド¥申鐃緒申鐃緒申鐃緒申
		return 0;
	}

	protected void getOutfilename() {
		String file = GlobalEnv.getfilename();
		String outdir = GlobalEnv.getoutdirectory();
		String outfile = GlobalEnv.getoutfilename();
		vrEnv.outDir = outdir;

		/*
		 * 鐃緒申鐃熟フワ申鐃緒申?(outfilename)鐃緒申鐃緒申鐃所さ?鐃銃わ申???
		 * html_env.outfile鐃緒申globalenv.outfilename鐃祝わ申?
		 * 鐃緒申?鐃淑鰹申鐃塾とわ申鐃熟ワ申鐃緒申?鐃春ワ申鐃緒申?鐃緒申名鐃緒申(filename)鐃祝わ申?
		 */
		if (GlobalEnv.getQuery() != null) {
			vrEnv.outFile = "./fromquery";

		} else if (outfile == null) {
			if (file.toLowerCase().indexOf(".sql") > 0) {
				vrEnv.outFile = file.substring(0,
						file.toLowerCase().indexOf(".sql"));
			} else if (file.toLowerCase().indexOf(".ssql") > 0) {
				vrEnv.outFile = file.substring(0,
						file.toLowerCase().indexOf(".ssql"));
			}
		} else {
			vrEnv.outFile = getOutfile(outfile);
		}

		if (vrEnv.outFile.indexOf("/") > 0) {
			vrEnv.linkOutFile = vrEnv.outFile.substring(vrEnv.outFile
					.lastIndexOf("/") + 1);
		} else {
			vrEnv.linkOutFile = vrEnv.outFile;
		}
		/*
		 * //tk start if(html_env.outfile.lastIndexOf("\\") != -1) {
		 * html_env.outfile =
		 * html_env.outfile.substring(html_env.outfile.lastIndexOf("\\"));
		 * Log.out("outfile log:"+html_env.outfile); } //tk end
		 */
		/*
		 * 鐃緒申鐃緒申鐃緒申妊鐃����?(outdirectory)�����ꤵ?�Ƥ�???
		 * outdirectory��filename��Ĥʤ�����Τ�file�Ȥ�?
		 */

		if (outdir != null) {
			connectOutdir(outdir, outfile);
		}
	}

	@Override
	public void finish() {

	}

	@Override
	public void generateCode(ITFE tfe_info, ExtList data_info) {

		VREnv.initAllFormFlg();

		vrEnv.countFile = 0;
		vrEnv.code = new StringBuffer();
		vrEnv.css = new StringBuffer();
		vrEnv.header = new StringBuffer();
		vrEnv.footer = new StringBuffer();
		vrEnv.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv.writtenClassId = new Vector();
		vrEnv.notWrittenClassId = new Vector();
		vrEnv2.countFile = 0;
		vrEnv2.code = new StringBuffer();
		vrEnv2.css = new StringBuffer();
		vrEnv2.header = new StringBuffer();
		vrEnv2.footer = new StringBuffer();
		vrEnv2.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv2.writtenClassId = new Vector<String>();
		VREnv localenv = new VREnv();

		/*** start oka ***/

		// ���Ϥ�?�ե���?̾����?
		getOutfilename();

		Log.out("[HTMLManager:generateCode]");

		// ?�ֳ�¦��G3��??
		if (tfe_info instanceof VRG3) {
			//tfe_info.work(data_info);
//			return;
		}

		// ?�ֳ�¦��G3�Ǥʤ�??]
		vrEnv.fileName = vrEnv.outFile + ".xml";
		vrEnv2.fileName = vrEnv.outFile + ".xml";

		vrEnv.setOutlineMode();
		if (data_info.size() == 0
				// added by goto 20130306 "FROM�ʤ��������к� 3/3"
				&& !DataConstructor.SQL_string
				.equals("SELECT DISTINCT  FROM ;") && !DataConstructor.SQL_string.equals("SELECT  FROM ;")) {
			Log.out("no data");
			vrEnv.code.append("<div class=\"nodata\" >");
			vrEnv.code.append("NO DATA FOUND");
			vrEnv.code.append("</div>");
		} else
			tfe_info.work(data_info);
		VREnv.cs_code.append("9 "+tfe_info+"\n");
		
		vrEnv.header.append("<?xml version=\"1.0\" ?>");///kotaniadd
		//htmlEnv.getHeader();
		vrEnv.code = new StringBuffer(vrEnv.code.substring(0,vrEnv.code.lastIndexOf("<group>")));
		vrEnv.getFooter();
		//htmlEnv2.header.append("<?xml version=\"1.0\" encoding=\""+ Utils.getEncode() + "\"?><SSQL>");
		//htmlEnv2.header.append("<?xml version=\"1.0\" ?>");//上の行をこれに変更
		//htmlEnv2.footer.append("</SSQL>");
		try {

			if(CodeGenerator.getMedia().equalsIgnoreCase("vr")){
/////////////////////////////xmlcreateに使った
				if (!GlobalEnv.isOpt()) {
					// changed by goto 20120715 start
					// PrintWriter pw = new PrintWriter(new BufferedWriter(new
					// FileWriter(
					// html_env.filename)));
					PrintWriter pw;
					if (vrEnv.charset != null) {
						pw = new PrintWriter(new BufferedWriter(
								new OutputStreamWriter(new FileOutputStream(
										vrEnv.fileName), vrEnv.charset)));
						Log.info("File encoding: " + vrEnv.charset);
					} else
						pw = new PrintWriter(new BufferedWriter(new FileWriter(
								vrEnv.fileName)));
					// Log.info("File encoding: "+((html_env.charset!=null)?
					// html_env.charset : "UTF-8"));
					// changed by goto 20120715 end

					if (GlobalEnv.cssout() == null)
						pw.println(vrEnv.header);
					pw.println(vrEnv.code);
					pw.println(vrEnv.footer);
					pw.close();

					
				}

				// xml
				if (GlobalEnv.isOpt()) {

					vrEnv2.fileName = vrEnv.outFile + ".xml";
					PrintWriter pw2 = new PrintWriter(new BufferedWriter(
							new FileWriter(vrEnv2.fileName)));
					if (GlobalEnv.cssout() == null)
						pw2.println(vrEnv2.header);
					pw2.println(vrEnv2.code);
					pw2.println(vrEnv2.footer);
					pw2.close();
					VRoptimizer xml = new VRoptimizer();
					String xml_str = xml.generateHtml(vrEnv2.fileName);
					PrintWriter pw = new PrintWriter(new BufferedWriter(
							new FileWriter(vrEnv.fileName)));
					pw.println(vrEnv.header);
					pw.println(xml_str);
					// StringBuffer footer = new
					// StringBuffer("</div></body></html>");
					pw.println(vrEnv.footer);
					pw.close();
				}

				if (GlobalEnv.cssout() != null) {
					PrintWriter pw3 = new PrintWriter(new BufferedWriter(
							new FileWriter(GlobalEnv.cssout())));
					pw3.println(vrEnv.header);
					pw3.close();
				}
				// add 20141204 masato for ehtml
			} else {
				Log.ehtmlInfo("=-=-=-=");
				Log.ehtmlInfo(vrEnv.header);
				Log.ehtmlInfo(vrEnv.code);
				Log.ehtmlInfo(vrEnv.footer);
			}

			VREnv.initAllFormFlg();
			//Jscss.process();	//goto 20141209
			//VRfilecopy.process(); 
			VRfilecreate.process(vrEnv.outFile); 
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
			Log.err("Error: specified outdirectory \""
					+ vrEnv.outDir + "\" is not found to write "
					+ vrEnv.fileName);
			GlobalEnv.addErr("Error: specified outdirectory \""
					+ vrEnv.outDir + "\" is not found to write "
					+ vrEnv.fileName);
			// comment out by chie
			// System.exit(-1);
		} catch (IOException e) {
			System.err
			.println("Error[HTMLManager]: File IO Error in HTMLManager");
			e.printStackTrace();
			GlobalEnv
			.addErr("Error[HTMLManager]: File IO Error in HTMLManager");
			// comment out by chie
			// System.exit(-1);
		}

	}

	// tk
	// start///////////////////////////////////////////////////////////////////////
	@Override
	public StringBuffer generateCode2(ITFE tfe_info, ExtList data_info) {
		VREnv.initAllFormFlg();

		vrEnv.countFile = 0;
		vrEnv.code = new StringBuffer();
		vrEnv.css = new StringBuffer();
		vrEnv.header = new StringBuffer();
		vrEnv.footer = new StringBuffer();
		vrEnv.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv.writtenClassId = new Vector();
		vrEnv.embedFlag = true;

		vrEnv2.countFile = 0;
		vrEnv2.code = new StringBuffer();
		vrEnv2.css = new StringBuffer();
		vrEnv2.header = new StringBuffer();
		vrEnv2.footer = new StringBuffer();
		String xml_str = null;
		StringBuffer returncode = new StringBuffer();
		// ���Ϥ�?�ե���?̾����?
		getOutfilename();

		Log.out("[HTMLManager:generateCode2]");

		// ?�ֳ�¦��G3��??
		if (tfe_info instanceof VRG3) {
			tfe_info.work(data_info);
			VREnv.cs_code.append("10 "+tfe_info+"\n");
			return vrEnv.code;
		}
		// ?�ֳ�¦��G3�Ǥʤ�??
		vrEnv.setOutlineMode();
		tfe_info.work(data_info);
		VREnv.cs_code.append("100 "+tfe_info+"\n");

		vrEnv2.header.append("<?xml version=\"1.0\" encoding=\"Shift_JIS\"?><SSQL>");
		vrEnv2.footer.append("</SSQL>");

		if (GlobalEnv.isOpt()) {
			int i = 0;
			while (vrEnv2.code.indexOf("&", i) != -1) {
				i = vrEnv2.code.indexOf("&", i);
				vrEnv2.code = vrEnv2.code.replace(i, i + 1, "&amp;");
				i++;
			}
			StringBuffer xml_string = new StringBuffer();
			xml_string.append(vrEnv2.header);
			xml_string.append(vrEnv2.code);
			xml_string.append(vrEnv2.footer);
			VRoptimizer xml = new VRoptimizer();
			// System.out.println(xml_string); //commented out by goto 20120620
			xml_str = xml.generateHtml(xml_string);
			returncode.append(xml_str);
		}
		vrEnv.embedFlag = false;

		if (vrEnv.script.length() >= 5) {
			StringBuffer result = new StringBuffer();

			result.append(vrEnv.script);
			result.append("<end of script>\n");
			result.append(vrEnv.code);

			return result;
		} else {
			if (GlobalEnv.isOpt())
				return returncode;
			else
				return vrEnv.code;

		}
	}

	@Override
	public StringBuffer generateCode3(ITFE tfe_info, ExtList data_info) {
		VREnv.initAllFormFlg();

		vrEnv.countFile = 0;
		vrEnv.code = new StringBuffer();
		vrEnv.css = new StringBuffer();
		vrEnv.header = new StringBuffer();
		vrEnv.footer = new StringBuffer();
		vrEnv.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv.writtenClassId = new Vector();
		vrEnv.embedFlag = true;
		// ���Ϥ�?�ե���?̾����?
		getOutfilename();

		Log.out("[HTMLManager:generateCode]");

		// ?�ֳ�¦��G3��??
		if (tfe_info instanceof VRG3) {
			tfe_info.work(data_info);
			VREnv.cs_code.append("101 "+tfe_info+"\n");
			return vrEnv.code;
		}
		// ?�ֳ�¦��G3�Ǥʤ�??

		vrEnv.setOutlineMode();
		tfe_info.work(data_info);
		VREnv.cs_code.append("102 "+tfe_info+"\n");
		// html_env.getCSS();
		vrEnv.embedFlag = false;
		Log.out("header : " + vrEnv.header);
		return vrEnv.css;
	}

	@Override
	public StringBuffer generateCode4(ITFE tfe_info, ExtList data_info) {
		VREnv.initAllFormFlg();
		vrEnv.countFile = 0;
		vrEnv.code = new StringBuffer();
		vrEnv.css = new StringBuffer();
		vrEnv.header = new StringBuffer();
		vrEnv.footer = new StringBuffer();
		vrEnv.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv.writtenClassId = new Vector();

		vrEnv2.countFile = 0;
		vrEnv2.code = new StringBuffer();
		vrEnv2.css = new StringBuffer();
		vrEnv2.header = new StringBuffer();
		vrEnv2.footer = new StringBuffer();
		vrEnv2.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv2.writtenClassId = new Vector<String>();

		VREnv localenv = new VREnv();

		// ���Ϥ�?�ե���?̾����?
		getOutfilename();

		Log.out("[HTMLManager:generateCode]");

		// ?�ֳ�¦��G3�Ǥʤ�??
		vrEnv.fileName = vrEnv.outFile + ".xml";
		vrEnv2.fileName = vrEnv.outFile + ".xml";

		vrEnv.setOutlineMode();
		tfe_info.work(data_info);
		VREnv.cs_code.append("103 "+tfe_info+"\n");

		vrEnv.getFooter();
		vrEnv.embedFlag = false;
		Log.out("header : " + vrEnv.header);

		StringBuffer headfoot = new StringBuffer(vrEnv.header
				+ " ###split### " + vrEnv.footer);

		return headfoot;
	}

	@Override
	public StringBuffer generateCodeNotuple(ITFE tfe_info) {
		Log.out("no data found");
		vrEnv.code = new StringBuffer();
		vrEnv.code.append("<div class=\"nodata\" >");
		vrEnv.code.append("NO DATA FOUND");

		return vrEnv.code;
	}

	@Override
	public StringBuffer generateCssfile(ITFE tfe_info, ExtList data_info) {

		vrEnv.countFile = 0;
		vrEnv.code = new StringBuffer();
		vrEnv.css = new StringBuffer();
		vrEnv.header = new StringBuffer();
		vrEnv.footer = new StringBuffer();
		vrEnv.foreachFlag = GlobalEnv.getForeachFlag();
		vrEnv.writtenClassId = new Vector();
		vrEnv.embedFlag = true;
		// ���Ϥ�?�ե���?̾����?
		getOutfilename();

		Log.out("[HTMLManager:generateCode]");

		vrEnv.setOutlineMode();
		tfe_info.work(data_info);
		VREnv.cs_code.append("104 "+tfe_info+"\n");
		vrEnv.embedFlag = false;
		Log.out("header : " + vrEnv.header);
		return vrEnv.cssFile;
	}

	
	// tk
	// end///////////////////////////////////////////////////////////////////////////////
}
