package supersql.codegenerator.VR;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;

import supersql.codegenerator.HTML.HTMLEnv;
import supersql.codegenerator.Mobile_HTML5.Mobile_HTML5Env;
import supersql.codegenerator.Web.WebEnv;
import supersql.common.GlobalEnv;
import supersql.common.Log;

//added by goto 20141201
public class VRfilecopy {
	private static final String fs = GlobalEnv.OS_FS;
	private static final String outdirPath = GlobalEnv.getOutputDirPath();
	
	public VRfilecopy() {

	}
	
	public static void process() {
			copyJSCSS_to_outputDir();	//goto 20141201
	}
	
	
	//copy JSCSS to the output directory
	private static void copyJSCSS_to_outputDir() {
		String ep = GlobalEnv.EXE_FILE_PATH;
		
		File from = null;

		//from = new File(ep+fs+"VR");//////////////////////////////////////////kotani 16/10/04
//		String path = ep+fs+"VR"+fs;
//		if(VRAttribute.exhflag){
//			if(VRAttribute.floorflag == 1){
//				from = new File(path+"x"+fs+"xG1");
//			}else if(VRAttribute.floorflag == 2){
//				from = new File(path+"x"+fs+"xG2");
//			}else if(VRAttribute.floorflag == 3){
//				from = new File(path+"x"+fs+"xG3");
//			}
//		}else{
//			if(VRAttribute.floorflag == 1){
//				from = new File(path+"z"+fs+"zG1");
//			}else if(VRAttribute.floorflag == 2){
//				from = new File(path+"z"+fs+"zG2");
//			}else if(VRAttribute.floorflag == 3){
//				from = new File(path+"z"+fs+"zG3");
//			}
//		}
		/////////kotani 16/10/04 end
		if (!directoryCopy(from, new File(outdirPath)))
			Log.err("<<Warning>> Copy JSCSS failed.");
	}
	
	//directoryCopy
	private static Boolean directoryCopy(File fromDir, File toDir) {
		File[] fromFile = fromDir.listFiles();
		toDir = new File(toDir.getPath() + fs + fromDir.getName());
		
		toDir.mkdir();

		if (fromFile != null) {
			for (File f : fromFile) {
				if (f.isFile()) {
					if (!fileCopy(f, toDir)) {
						return false;
					}
				} else {
					if (!directoryCopy(f, toDir)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	//fileCopy
	private static Boolean fileCopy(File file, File dir) {
		File copyFile = new File(dir.getPath() + fs + file.getName());
		
		if (!copyFile.isHidden()) {	//if it's not a hidden file
			FileChannel channelFrom = null;
			FileChannel channelTo = null;
			
			try {
				copyFile.createNewFile();
				channelFrom = new FileInputStream(file).getChannel();
				channelTo = new FileOutputStream(copyFile).getChannel();
				channelFrom.transferTo(0, channelFrom.size(), channelTo);
				return true;
			} catch (IOException e) {
				return false;
			} finally {
				try {
					if (channelFrom != null) {
						channelFrom.close();
					}
					if (channelTo != null) {
						channelTo.close();
					}
					copyFile.setLastModified(file.lastModified());	//copy the update date
				} catch (IOException e) {
					return false;
				}
			}
		}
		return true;
	}

	
	//createFile
	//create a new file to the fileName directory 
	private static boolean createFile(String fileName, String content) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter
					(new FileOutputStream(fileName), "UTF-8")));
			pw.println(content);
			pw.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
