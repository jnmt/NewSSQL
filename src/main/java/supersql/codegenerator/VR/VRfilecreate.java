package supersql.codegenerator.VR;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.standard.RequestingUserName;

import org.antlr.v4.codegen.CodeGenerator;
import org.antlr.v4.parse.ANTLRParser.ruleAltList_return;
import org.apache.derby.tools.sysinfo;
import org.apache.log4j.net.SyslogAppender;
import org.jsoup.safety.Cleaner;
import org.junit.Ignore;
import org.slf4j.helpers.FormattingTuple;
import org.stringtemplate.v4.compiler.STParser.ifstat_return;

import com.gargoylesoftware.htmlunit.javascript.host.canvas.rendering.AwtRenderingBackend;
import com.ibm.db2.jcc.a.b;
import com.ibm.db2.jcc.a.f;
import com.ibm.db2.jcc.am.i;
import com.ibm.db2.jcc.am.id;
import com.ibm.db2.jcc.am.in;
import com.ibm.db2.jcc.am.k;
import com.ibm.db2.jcc.am.s;
import com.ibm.db2.jcc.am.uf;
import com.ibm.db2.jcc.sqlj.StaticSection;
//import com.sun.org.apache.xpath.internal.operations.Mult;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.steadystate.css.parser.selectors.IdConditionImpl;

//import jdk.nashorn.internal.ir.annotations.Ignore;
import supersql.common.GlobalEnv;
public class VRfilecreate{

	private static final String fs = GlobalEnv.OS_FS;
	private static String filename;
	public static String template_scene;//museum(moduleでも使う)
	public static String template_stand;//stand(moduleでも使う)
	public static String b = "";
	public static String scene = "";//VRfilecreateで使うflag。museumかshopか判断。
	
	public static String light_r;//20180511 kotani module 光源色R
	public static String light_g;//20180511 kotani module 光源色G
	public static String light_b;//20180511 kotani module 光源色B
	public static String exh_distancex;//20180513 kotani module 展示物(台)の距離x軸
	public static String exh_distancey;//20180513 kotani module 展示物(台)の距離y軸
	public static String exh_distancez;//20180513 kotani module 展示物(台)の距離z軸
	public static float room_sizex;//20180513 kotani module 部屋の大きさx軸
	public static float room_sizey;//20180513 kotani module 部屋の大きさy軸
	public static float room_sizez;//20180513 kotani module 部屋の大きさz軸
	public static float roomx;//20180513 kotani module//部屋の大きさ÷2 x軸
	public static float roomz;//20180513 kotani module//部屋の大きさ÷2 z軸
	public static float stand_sizex;//20180518 kotani module 展示物(台)のサイズx軸
	public static float stand_sizey;//20180518 kotani module 展示物(台)のサイズy軸
	public static float stand_sizez;//20180518 kotani module 展示物(台)のサイズz軸
	public static float picture_sizex;//20180731 kotani module pictureのサイズx軸
	public static float picture_distancex;//20180513 kotani module　pictureの距離x軸
	public static float picture_distancey;//20180513 kotani module　pictureの距離y軸
	public static float wallstand_sizex;//20180731 kotani module 壁の展示物(台)のサイズx軸
	public static float wallstand_sizey;//20180731 kotani module 壁の展示物(台)のサイズy軸
	public static float wallstand_sizez;//20180731 kotani module 壁の展示物(台)のサイズz軸
	public static float wallexh_distancex;//20180513 kotani module　壁の展示物(台)の距離x軸
	public static float wallexh_distancey;//20180513 kotani module　壁の展示物(台)の距離y軸
	public static String template_wallstand;//20180802 kotani module 壁の展示台
	public static float wallexh_high;//20181105 ケース内での上下距離
	public static float moduleobjhigh = 0;
	
	//picture,wall
	private static String rightx = "";
	private static String rlz = "";
	private static String leftx = "";
	private static String fbx = "";
	private static String frontz = "";
	private static String backz = "";
	private static String rly = "";
	private static String fby = "";
	private static ArrayList<Float> xcoor = new ArrayList<>();//絵画のx座標
	private static ArrayList<Float> ycoor = new ArrayList<>();//絵画のy座標
	private static ArrayList<Float> zcoor = new ArrayList<>();//絵画のz座標
	private static int norexhint1 = 0;//普通のidのexharrayの要素数 ビル複数
	private static int pictexhint1 = 0;//pictがついているexharrayの要素数 ビル複数
	private static int wallexhint1 = 0;//wallがついているexharrayの要素数 ビル複数
	
	private static ArrayList<Integer> cjoinarray2 = new ArrayList<Integer>();
	

	public static void process(String outFileName) {

		filename = outFileName;
		String s = "";/////ジャンル出す
		String lightcolorstr = "";
		
		for(int i=1; i<=VRAttribute.groupcount; i++){
			for(int j=VRcjoinarray.gLemaxlist.get(i)-1; j>=1; j--){
				if(j==1){
					VRC1.Nclassct2[i][j] = VRC1.Nclassct1[i][j];
				}else{
					VRC1.Nclassct2[i][j] = VRC1.Nclassct1[i][j]/VRC1.Nclassct1[i][j-1];
				}
			}
		}
		cjoinarray2.add(0);
		for(int i=0; i<VRAttribute.cjoinarray.size(); i++){
			if(VRAttribute.cjoinarray.get(i).equals(",")){
				cjoinarray2.add(1);
			}else if(VRAttribute.cjoinarray.get(i).equals("!")){
				cjoinarray2.add(2);
			}else if(VRAttribute.cjoinarray.get(i).equals("%")){
				cjoinarray2.add(3);
			}
		}
		
		//free space
//		for(int i=0; i<3; i++){
//			for(int j=0; j<3; j++){
//				System.out.println(VRAttribute.wallarray[i][j]);
//			}
//		}
//		for(int i=0; i< 3; i++){
//			System.out.println(VRAttribute.compz[i]);
//		}
//		for(int i=0; i<cjoinarray2.size(); i++){
//			System.out.println(cjoinarray2.get(i));
//		}
//		for(int i=0; i<VRAttribute.multiexhary.size(); i++){
//			System.out.println(VRAttribute.multiexhary.get(i));
//		}
//		for(int i=0; i<VRAttribute.exharray.size(); i++){
//			System.out.println(VRAttribute.exharray.get(i));
//		}
		
		
		
		//free space
		
		VRAttribute.idcountarray.add(VRAttribute.idcount);//picture,wall
		VRAttribute.groupcount1 = VRAttribute.groupcount;
		
		if(VRAttribute.groupcount == 1){//////ビルが一個だけだった時	
			
			if(VRAttribute.lightflagarray[0] == 1){//kotani light-color 180521 light-colorは後回し　途中!!
				for(int i=0, j=0; VRAttribute.exhcountarray[i] != 0; i++){
					String a = "";
					if(i == 0){
						for(; j<VRAttribute.exhcountarray[i];j++){			
							if(j == 0){
								a = VRAttribute.lightcolorarray.get(j);
							}else if(VRAttribute.lightcolorarray.get(j-1).equals(VRAttribute.lightcolorarray.get(j))){
								a = VRAttribute.lightcolorarray.get(j);
							}else{
								a = "White";
							}
						}
					}else{
						j = 0;
						int q=0;
						for(int p=0; p<i;p++)
							j += VRAttribute.exhcountarray[p];
						for(int p=0; p<=i;p++)
							q += VRAttribute.exhcountarray[p];
						
						for(; j<q; j++){
							if(j == VRAttribute.exhcountarray[i]){
								a = VRAttribute.lightcolorarray.get(j);
							}else if(VRAttribute.lightcolorarray.get(j-1).equals(VRAttribute.lightcolorarray.get(j))){
								a = VRAttribute.lightcolorarray.get(j);
							}else{
								a = "White";
							}
						}
					}
					lightcolorstr += a+",";
				}
				lightcolorstr = lightcolorstr.substring(0,lightcolorstr.length()-1);/////最後のカンマとる ここでlightcolorstrに値が無駄なく代入される
			}
			
			
			
			int norexhint = 0;//normal
			boolean pictflag = false;//picture
			int pictexhint = 0;//pictがついているexharrayの要素数
			for(int i=0; i<VRAttribute.picturearray[0].length;i++){
				if(VRAttribute.picturearray[1][i] == 1){
					pictflag = true;
					pictexhint = i;
					break;
				}
			}
			if(pictflag){
				for(int i=0; i<VRAttribute.picturearray[0].length;i++){
					if(i >= VRAttribute.exharray.size())//床がなかった場合、getCS2とかのexharrayで配列はみ出すからそれの防止
						break;
					if(VRAttribute.picturearray[1][i] == 0){
						norexhint = i;
						break;
					}
				}
			}
			boolean wallflag = false;//wall
			int wallexhint = 0;//wallがついているexharrayの要素数
			for(int i=0; i<VRAttribute.wallarray[1].length;i++){
				if(VRAttribute.wallarray[1][i] == 1){
					wallflag = true;
					wallexhint = i;
					break;
				}
			}	
			if(wallflag){
				for(int i=0; i<VRAttribute.wallarray[1].length;i++){
					if(i >= VRAttribute.exharray.size())//床がなかった場合、getCS2とかのexharrayで配列はみ出すからそれの防止
						break;
					if(VRAttribute.wallarray[1][i] == 0){
						norexhint = i;
						break;
					}
				}
			}
			
			boolean arbitraryflag = false;
			for(int i=0; i<VRAttribute.arbitraryarray.length;i++){
				if(VRAttribute.arbitraryarray[1] == 1){
					arbitraryflag = true;
					break;
				}
			}	
			
			getCS1(pictflag, wallflag);//picture,wall
			
							
			for(int i=1; i<=VRAttribute.groupcount; i++){
				b += "				if(groupflag ==" + i + "){\n";

				for(int k=0; k<VRAttribute.genrearray2.size(); k++){/////ジャンル出すはじめ
					s += VRAttribute.genrearray2.get(k)+",";
				}

				s = s.substring(0,s.length()-1);/////最後のカンマとる
				if(arbitraryflag){//arbitrary
					if(pictflag){
						arbitraryCS2(s, pictflag, wallflag, VRAttribute.exharray.get(pictexhint),0);//picture,wall
					}else if(wallflag){
						arbitraryCS2(s, pictflag, wallflag, 0, VRAttribute.exharray.get(wallexhint));//picture,wall
					}else{
						arbitraryCS2(s, pictflag, wallflag, 0, 0);
					}
				}else if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
					VRAttribute.exharray.get(wallexhint);
					if(pictflag){
						getCS2(VRAttribute.exharray.get(norexhint), s, pictflag, wallflag, VRAttribute.exharray.get(pictexhint),0);//picture,wall
					}else if(wallflag){
						getCS2(VRAttribute.exharray.get(norexhint), s, pictflag, wallflag, 0, VRAttribute.exharray.get(wallexhint));//picture,wall
					}else{
						getCS2(VRAttribute.exharray.get(i-1), s, pictflag, wallflag, 0, 0);
					}
				}else{
					if(pictflag){
						compgetCS2(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1], s, pictflag, wallflag, VRAttribute.exharray.get(pictexhint),0);
					}else if(wallflag){
						compgetCS2(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1], s, pictflag, wallflag, 0, VRAttribute.exharray.get(wallexhint));
					}else{
						compgetCS2(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1], s, pictflag, wallflag, 0, 0);
					}
				}
				s = "";////////ジャンル出す終わり
				
				if(VRcjoinarray.gLemaxlist.get(i) >= 3)
					NCS2_3(i);

				if(VRAttribute.floorarray.get(i-1) == 1){
					if(scene.equals("museum")){
						b += "					int objx = 0;//museum change\n";
					}else if(VRManager.VRmoduleflag){
						 b += "					float objx = 0;//museum change\n";
					}
				}else if(VRAttribute.floorarray.get(i-1) == 2){
				}else if(VRAttribute.floorarray.get(i-1) == 3){
					if(scene.equals("museum")){
						b += "					int objz = 0;//museum change\n";
					}else if(VRManager.VRmoduleflag){
						 b += "					float objz = 0;//museum change\n";
					}
				}
				
				//picture,wall
				if(pictflag){
					getCS3(pictflag, wallflag, VRAttribute.exharray.get(norexhint), VRAttribute.floorarray.get(i-1), "entrance", "", VRAttribute.genrearray2.size(), VRAttribute.exharray.get(pictexhint), 0);
				}else if(wallflag){
					getCS3(pictflag, wallflag, VRAttribute.exharray.get(norexhint), VRAttribute.floorarray.get(i-1), "entrance", "", VRAttribute.genrearray2.size(), 0, VRAttribute.exharray.get(wallexhint));
				}else{
					getCS3(pictflag, wallflag, VRAttribute.exharray.get(i-1), VRAttribute.floorarray.get(i-1), "entrance", "", VRAttribute.genrearray2.size(), 0, 0);
				}
				
				
				if(VRAttribute.arbitraryarray[1] == 1){//arbitrary
					arbitraryCS4_2(i);
				}else{
					if(pictflag || wallflag){
						if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
							getCS4_1(VRAttribute.exharray.get(norexhint));
						}else{
							compgetCS4_1(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1]);
						}
					}else{
						if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
							getCS4_1(VRAttribute.exharray.get(i-1));
						}else{
							compgetCS4_1(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1]);
						}
					}
					
					String m = VRAttribute.multiexhary.get(0);////[name,name]start
					String array[] = m.split("");////TFE一個ずつ入ってる
					for(int j=0; j<VRAttribute.multiexhcount.get(0);j++){//[id,id]みたいに展示物並べる奴
						if(j == 0){
							if(pictflag || wallflag){
								b += "												if(k == " + norexhint + "){\n";
							}else{
								b += "												if(k == " + j + "){\n";
							}
						}else{
							b += "												}else if(k == " + j + "){\n";
							b += "													if(exhmoveflag == " + (j-1) + "){\n";
							if(array[j-1].equals(",")){
								b += "	 													exhmovex -= "+stand_sizex+"f;\n";	
							}else if(array[j-1].equals("!")){
								b += "	 													exhmovey += "+stand_sizey+"f;\n";
							}else if(array[j-1].equals("%")){
								b += "	 													exhmovez -= "+stand_sizez+"f;\n";
							}
							b += "														exhmoveflag++;\n";
							b += "													}\n";
						}
						if(wallflag || pictflag){
							if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
								getCS4_2(VRAttribute.exharray.get(norexhint), VRAttribute.floorarray.get(i-1),i);
							}else{
								compgetCS4_2(VRAttribute.floorarray.get(i-1), VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1], VRAttribute.compflag[i-1], i);
							}
						}else{
							if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
								getCS4_2(VRAttribute.exharray.get(i-1), VRAttribute.floorarray.get(i-1),i);
							}else{
								compgetCS4_2(VRAttribute.floorarray.get(i-1), VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1], VRAttribute.compflag[i-1], i);
							}
						}
					}
				}
				
				//picture,wall
				if(pictflag){
					getCS5_1(pictflag, wallflag, VRAttribute.floorarray.get(i-1), VRAttribute.exharray.get(pictexhint), 0,i);
				}else if(wallflag){
					getCS5_1(pictflag, wallflag, VRAttribute.floorarray.get(i-1), 0, VRAttribute.exharray.get(wallexhint), i);
				}else{
					getCS5_1(pictflag, wallflag, VRAttribute.floorarray.get(i-1), 0, 0, i);
				}
				
				if(VRAttribute.arbitraryarray[1] == 1)//arbitrary
					b += "													manum = 0;\n";

				b += getCS5_2();

				getCS6(VRAttribute.floorarray.get(i-1));
				getCS7(VRAttribute.floorarray.get(i-1), "entrance", "", VRAttribute.groupcount);
				getCS8(VRAttribute.floorarray.get(i-1), 1);
			}
		}else{////ビルが複数の時
			
			boolean pictflag1 = false;//picture
			for(int i=1; i<VRAttribute.picturearray.length;i++){
				for(int j=0; j<VRAttribute.picturearray[i].length; j++){
					if(VRAttribute.picturearray[i][j] == 1){
						pictflag1 = true;//picture 1が配列に含まれているかどうか
						break;
					}
				}
			}
			boolean wallflag1 = false;//picture
			for(int i=1; i<VRAttribute.wallarray.length;i++){
				for(int j=0; j<VRAttribute.wallarray[i].length; j++){
					if(VRAttribute.wallarray[i][j] == 1){
						wallflag1 = true;//picture 1が配列に含まれているかどうか
						break;
					}
				}
			}
			getCS1(pictflag1, wallflag1);//picture,wall
			
			
			for(int i=1; i<=VRAttribute.groupcount1; i++){//ループ始まり
				
				boolean pictflag2 = false;//picture グループ更新するたびに初期化
				for(int j=0; j<VRAttribute.picturearray[i].length; j++){//picture flag立てる
					if(VRAttribute.picturearray[i][j] == 1){
						pictflag2 = true;
						pictexhint1 = j;
						break;
					}
				}
				if(pictflag2){
					pictexhint1 += VRAttribute.genrearray22.get(i-1);//前のビルの分を加味
					for(int j=0; j<VRAttribute.picturearray[i].length; j++){//picture flag立てる
						if(j >= VRAttribute.exharray.size())//床がなかった場合、getCS2とかのexharrayで配列はみ出すからそれの防止
							break;
						if(VRAttribute.picturearray[i][j] == 0){
							norexhint1 = j;
							break;
						}
					}
					pictexhint1 += VRAttribute.idcountarray.get(i-1);//前のビルの分を加味
					norexhint1 += VRAttribute.idcountarray.get(i-1);//前のビルの分を加味
				}
				
				boolean wallflag2 = false;//wall グループ更新するたびに初期化
				for(int j=0; j<VRAttribute.wallarray[i].length; j++){//wall flag立てる
					if(VRAttribute.wallarray[i][j] == 1){
						wallflag2 = true;
						wallexhint1 = j;
						break;
					}
				}
				if(wallflag2){
					wallexhint1 += VRAttribute.genrearray22.get(i-1);//前のビルの分を加味
					for(int j=0; j<VRAttribute.wallarray[i].length; j++){//wall flag立てる
						if(j >= VRAttribute.exharray.size())//床がなかった場合、getCS2とかのexharrayで配列はみ出すからそれの防止
							break;
						if(VRAttribute.wallarray[i][j] == 0){
							norexhint1 = j;
							break;
						}
					}
					wallexhint1 += VRAttribute.idcountarray.get(i-1);//前のビルの分を加味
					norexhint1 += VRAttribute.idcountarray.get(i-1);//前のビルの分を加味
				}

				if(i == 1){
					b += "				if(groupflag == " + i + "){\n";
				}else{
					b += "				}else if(groupflag == " + i + "){\n";
				}

				if(i != 1){//iが2以上だったら
					if(VRcjoinarray.gLemaxlist.get(i-1) < 3){//moduleの時  N次元あとで修正 N次元分同様にして*aみたいな感じで 2次元のことしか考えてない
						int a = VRAttribute.genrearray22.get(i-1) - VRAttribute.genrearray22.get(i-2);//aは部屋の数
						if(",".equals(VRAttribute.cjoinarray.get(i-2))){//前のビル　○(結合子)　今のビル　
							if(VRAttribute.floorarray.get(i-2) == 1){
								b +="					billmovex += " + -room_sizex*a + "f;\n";
							}else if(VRAttribute.floorarray.get(i-2) == 2){
								b +="					billmovex += -"+room_sizex+"f;\n";
							}else{
								b +="					billmovex += -"+room_sizex+"f;\n";
								b +="					billmovez += " + -room_sizez*(a-1) + "f;\n";
							}
						}else if("!".equals(VRAttribute.cjoinarray.get(i-2))){
							if(VRAttribute.floorarray.get(i-2) == 1){
								b +="					billmovex += " + -room_sizex*(a-1) + "f;\n";
								b +="					billmovey += "+room_sizey+"f;\n";
							}else if(VRAttribute.floorarray.get(i-2) == 2){
								b +="					billmovey += " + room_sizey*a + "f;\n";
							}else{
								b +="					billmovey += "+room_sizey+"f;\n";
								b +="					billmovez += " + -room_sizez*(a-1) + "f;\n";
							}
						}else if("%".equals(VRAttribute.cjoinarray.get(i-2))){
							if(VRAttribute.floorarray.get(i-2) == 1){
								b +="					billmovex += " + -room_sizex*(a-1) + "f;\n";
								b +="					billmovez += -"+room_sizez+"f;\n";
							}else if(VRAttribute.floorarray.get(i-2) == 2){
								b +="					billmovez += -"+room_sizez+"f;\n";
							}else{
								b +="					billmovez += " + -room_sizez*a + "f;\n";
							}
						}
					}else if(VRcjoinarray.gLemaxlist.get(i-1) >=3){
						int x = 1;
						int y = 1;
						int z = 1;
			
						for(int j = 1; j<= VRcjoinarray.gLemaxlist.get(i-1)-1; j++){
							if(VRAttribute.Nfloorarray[i-1][j] == 1){
								x *= VRC1.Nclassct2[i-1][j];
							}else if(VRAttribute.Nfloorarray[i-1][j] == 2){
								y *= VRC1.Nclassct2[i-1][j];
							}else if(VRAttribute.Nfloorarray[i-1][j] == 3){
								z *= VRC1.Nclassct2[i-1][j];
							}
						}
						
						if(",".equals(VRAttribute.cjoinarray.get(i-2))){//前のビル　○(結合子)　今のビル　
								b +="					billmovex += " + -room_sizex*x + "f;\n";
						}else if("!".equals(VRAttribute.cjoinarray.get(i-2))){
								b +="					billmovey += " + room_sizey*y + "f;\n";
						}else if("%".equals(VRAttribute.cjoinarray.get(i-2))){
								b +="					billmovez += " + -room_sizez*z + "f;\n";
						}
					}
				}


				for(int k=VRAttribute.genrearray22.get(i-1); k<VRAttribute.genrearray22.get(i); k++){/////ジャンル出すはじめ
					s += VRAttribute.genrearray2.get(k)+",";
				}
				s = s.substring(0,s.length()-1);/////最後のカンマとる
				if(VRAttribute.arbitraryarray[i] == 1){//arbitrary
					if(pictflag2){
						arbitraryCS2(s, pictflag2, wallflag2, VRAttribute.exharray.get(pictexhint1), 0);
					}else if(wallflag2){
						arbitraryCS2(s, pictflag2, wallflag2, 0, VRAttribute.exharray.get(wallexhint1));
					}else{
						arbitraryCS2(s, pictflag2, wallflag2, 0, 0);
					}
				}else if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
					if(pictflag2){
						getCS2(VRAttribute.exharray.get(norexhint1), s, pictflag2, wallflag2, VRAttribute.exharray.get(pictexhint1), 0);
					}else if(wallflag2){
						getCS2(VRAttribute.exharray.get(norexhint1), s, pictflag2, wallflag2, 0, VRAttribute.exharray.get(wallexhint1));
					}else{
						getCS2(VRAttribute.exharray.get(VRAttribute.genrearray22.get(i)-1), s, pictflag2, wallflag2, 0, 0);
					}
				}else{
					if(pictflag2){
					compgetCS2(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1], s, pictflag2, wallflag2, VRAttribute.exharray.get(pictexhint1), 0);
					}else if(wallflag2){
						compgetCS2(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1], s, pictflag2, wallflag2, 0, VRAttribute.exharray.get(wallexhint1));
					}else{
						compgetCS2(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1], s, pictflag2, wallflag2, 0, 0);
					}
				}
				s = "";////////ジャンル出す終わり
				if(VRcjoinarray.gLemaxlist.get(i) >= 3)
					NCS2_3(i);

				if(VRAttribute.floorarray.get(i-1) == 1){
					if(scene.equals("museum")){
						b += "					int objx = 0;//museum change\n";
					}else if(VRManager.VRmoduleflag){
						 b += "					float objx = 0;//museum change\n";
					}
					 b += "\n";
				}else if(VRAttribute.floorarray.get(i-1) == 2){
				}else if(VRAttribute.floorarray.get(i-1) == 3){
					if(scene.equals("museum")){
						b += "					int objz = 0;//museum change\n";
					}else if(VRManager.VRmoduleflag){
						 b += "					float objz = 0;//museum change\n";
					}
					b += "\n";
				}
				
				//picture,wall
				if(pictflag2){
					if(i == 1){//始まり、entranceがある建物
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1), "entrance", VRAttribute.cjoinarray.get(i-1), VRAttribute.genrearray22.get(i), VRAttribute.exharray.get(pictexhint1), 0);
					}else if((i != VRAttribute.groupcount1) && (i != 1)){//中間の建物 entranceもexitもない
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), VRAttribute.cjoinarray.get(i-1), VRAttribute.genrearray22.get(i) - VRAttribute.genrearray22.get(i-1), VRAttribute.exharray.get(pictexhint1), 0);
					}else if(i == VRAttribute.groupcount1){//exitがある建物
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), "exit", VRAttribute.genrearray22.get(i) - VRAttribute.genrearray22.get(i-1), VRAttribute.exharray.get(pictexhint1), 0);
					}
				}else if(wallflag2){
					if(i == 1){//始まり、entranceがある建物
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1), "entrance", VRAttribute.cjoinarray.get(i-1), VRAttribute.genrearray22.get(i), 0, VRAttribute.exharray.get(wallexhint1));
					}else if((i != VRAttribute.groupcount1) && (i != 1)){//中間の建物 entranceもexitもない
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), VRAttribute.cjoinarray.get(i-1), VRAttribute.genrearray22.get(i) - VRAttribute.genrearray22.get(i-1), 0, VRAttribute.exharray.get(wallexhint1));
					}else if(i == VRAttribute.groupcount1){//exitがある建物
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), "exit", VRAttribute.genrearray22.get(i) - VRAttribute.genrearray22.get(i-1), 0, VRAttribute.exharray.get(wallexhint1));
					}
				}else{
					if(i == 1){//始まり、entranceがある建物
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(VRAttribute.genrearray22.get(i)-1), VRAttribute.floorarray.get(i-1), "entrance", VRAttribute.cjoinarray.get(i-1), VRAttribute.genrearray22.get(i), 0,0);
					}else if((i != VRAttribute.groupcount1) && (i != 1)){//中間の建物 entranceもexitもない
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(VRAttribute.genrearray22.get(i)-1), VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), VRAttribute.cjoinarray.get(i-1), VRAttribute.genrearray22.get(i) - VRAttribute.genrearray22.get(i-1), 0,0);
					}else if(i == VRAttribute.groupcount1){//exitがある建物
						getCS3(pictflag2, wallflag2, VRAttribute.exharray.get(VRAttribute.genrearray22.get(i)-1), VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), "exit", VRAttribute.genrearray22.get(i) - VRAttribute.genrearray22.get(i-1), 0,0);
					}
				}
				
				
				
						
				if(VRAttribute.arbitraryarray[i] == 1){//arbitrary
					arbitraryCS4_2(i);
				}else{
					if(pictflag2 || wallflag2){
						if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
							getCS4_1(VRAttribute.exharray.get(norexhint1));
						}else{
							compgetCS4_1(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1]);
						}
					}else{
						if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
							getCS4_1(VRAttribute.exharray.get(VRAttribute.genrearray22.get(i)-1));
						}else{
							compgetCS4_1(VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1] ,VRAttribute.compflag[i-1]);
						}
					}
					
					
					String m = VRAttribute.multiexhary.get(i-1);////[name,name]start
					String array[] = m.split("");////TFE一個ずつ入ってる
	
					for(int j=0; j<VRAttribute.multiexhcount.get(i-1);j++){//[id,id]みたいに展示物並べる奴
						if(j == 0){
							if(pictflag2 || wallflag2){
								j = norexhint1-VRAttribute.idcountarray.get(i-1);
								b += "												if(k == " + j + "){\n";
							}else{
								b += "												if(k == " + j + "){\n";
							}
						}else{
							b += "												}else if(k == " + j + "){\n";
							b += "													if(exhmoveflag == " + (j-1) + "){\n";
							if(array[j-1].equals(",")){
								b += "	 													exhmovex -= "+stand_sizex+"f;\n";	
							}else if(array[j-1].equals("!")){
								b += "	 													exhmovey += "+stand_sizey+"f;\n";
							}else if(array[j-1].equals("%")){
								b += "	 													exhmovez -= "+stand_sizez+"f;\n";
							}
							b += "														exhmoveflag++;\n";
							b += "													}\n";
						}
						if(pictflag2 || wallflag2){
							if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
								getCS4_2(VRAttribute.exharray.get(norexhint1), VRAttribute.floorarray.get(i-1),i);
							}else{
								compgetCS4_2(VRAttribute.floorarray.get(i-1), VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1], VRAttribute.compflag[i-1], i);
							}
						}else{
							if(VRAttribute.compx[i-1] == 0 && VRAttribute.compy[i-1] == 0 && VRAttribute.compz[i-1] == 0){
								getCS4_2(VRAttribute.exharray.get(VRAttribute.genrearray22.get(i)-1), VRAttribute.floorarray.get(i-1),i);
							}else{
								compgetCS4_2(VRAttribute.floorarray.get(i-1), VRAttribute.compx[i-1], VRAttribute.compy[i-1], VRAttribute.compz[i-1], VRAttribute.compflag[i-1], i);
							}
						}
						
					}
				}
				
				//picture,wall
				if(pictflag2){
					getCS5_1(pictflag2, wallflag2, VRAttribute.floorarray.get(i-1), VRAttribute.exharray.get(pictexhint1),0, i);
				}else if(wallflag2){
					getCS5_1(pictflag2, wallflag2, VRAttribute.floorarray.get(i-1), 0, VRAttribute.exharray.get(wallexhint1), i);
				}else{
					getCS5_1(pictflag2, wallflag2, VRAttribute.floorarray.get(i-1), 0, 0, i);
				}
				
				
				if(VRAttribute.arbitraryarray[i] == 1)//arbitrary
					b += "												manum = 0;\n";
				
				b += getCS5_2();

				getCS6(VRAttribute.floorarray.get(i-1));
				if(i == 1){
					getCS7(VRAttribute.floorarray.get(i-1), "entrance" ,VRAttribute.cjoinarray.get(i-1), VRAttribute.groupcount);
				}else if((i != VRAttribute.groupcount1) && (i != 1)){
					getCS7(VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), VRAttribute.cjoinarray.get(i-1), VRAttribute.groupcount);
				}else if(i == VRAttribute.groupcount1){
					getCS7(VRAttribute.floorarray.get(i-1), VRAttribute.cjoinarray.get(i-2), "exit", VRAttribute.groupcount);
				}
				
				
				getCS8(VRAttribute.floorarray.get(i-1), i);
//				if(i != VRAttribute.groupcount1){
//					getCS9(VRAttribute.cjoinarray.get(i-1), VRAttribute.floorarray.get(i-1));
//				}
//				getCS10(i, VRAttribute.floorarray.get(i-1));
								
			}
		}
		b += getCS11();
		createfile(outFileName+".cs", b);
	}
	private static void pictureCS0(int exhflag){
		ArrayList<Float> xcoor2 = new ArrayList<>();
		ArrayList<Float> zcoor2 = new ArrayList<>();
		xcoor.clear();
		ycoor.clear();
		zcoor.clear();
		xcoor2.clear();
		zcoor2.clear();
		rightx = "";
		rlz = "";
		leftx = "";
		fbx = "";
		frontz = "";
		backz = "";
		rly = "";
		fby = "";
		
		if(exhflag == 1){
			for(float i=room_sizex/2 - wallexh_distancex; i>-room_sizex/2 + wallexh_distancex; i -= wallexh_distancex){
				xcoor.add(i);//museumだと11個
			}
			for(float i=room_sizez/2 - wallexh_distancex; i>-room_sizez/2 + wallexh_distancex; i -= wallexh_distancex){
				zcoor.add(i);//museumだと6個
			}
			
			
			for(int i=0; i<xcoor.size(); i++){
				fbx += xcoor.get(i)+"f, ";
			}
			fbx = fbx.substring(0,fbx.length()-2);/////最後のカンマとる
			
			for(int i=0; i<zcoor.size(); i++){
				rlz += zcoor.get(i)+"f, ";
			}
			rlz = rlz.substring(0,rlz.length()-2);/////最後のカンマとる
			
			float a = room_sizex/2 - (room_sizex/50)*0.3f;
			for(int i=0; i<zcoor.size(); i++){
				leftx += String.valueOf(a)+"f, ";
			}
			leftx = leftx.substring(0,leftx.length()-2);/////最後のカンマとる
			
			float b = -room_sizex/2 + (room_sizex/50)*0.3f;
			for(int i=0; i<zcoor.size(); i++){
				rightx += String.valueOf(b)+"f, ";
			}
			rightx = rightx.substring(0,rightx.length()-2);/////最後のカンマとる
			
			float c = room_sizez/2 - (room_sizez/30)*0.3f;
			for(int i=0; i<xcoor.size(); i++){
				frontz += String.valueOf(c)+"f, ";
			}
			frontz = frontz.substring(0,frontz.length()-2);/////最後のカンマとる
			
			float d = -room_sizez/2 + (room_sizez/30)*0.3f;
			for(int i=0; i<xcoor.size(); i++){
				backz += String.valueOf(d)+"f, ";
			}
			backz = backz.substring(0,backz.length()-2);/////最後のカンマとる
		}else if(exhflag == 2){
			for(float i=wallexh_distancey; i<room_sizey; i += wallexh_distancey){
				ycoor.add(i);//museumだと3個
			}
			for(float i=room_sizex/2 - wallexh_distancex; i>-room_sizex/2 + wallexh_distancex; i -= wallexh_distancex){
				xcoor2.add(i);//museumだと11個
			}
			for(int i=0; i< xcoor2.size(); i++){
				for(int j=0; j< ycoor.size(); j++){
					xcoor.add(xcoor2.get(i));
				}
			}
			for(float i=room_sizez/2 - wallexh_distancex; i>-room_sizez/2 + wallexh_distancex; i -= wallexh_distancex){
				zcoor2.add(i);//museumだと6個
			}
			for(int i=0; i< zcoor2.size(); i++){
				for(int j=0; j< ycoor.size(); j++){
					zcoor.add(zcoor2.get(i));
				}
			}
			
			
			for(int i=0; i<xcoor.size(); i++){
				fbx += xcoor.get(i)+"f, ";
			}
			fbx = fbx.substring(0,fbx.length()-2);/////最後のカンマとる
			
			for(int i=0; i<zcoor.size(); i++){
				rlz += zcoor.get(i)+"f, ";
			}
			rlz = rlz.substring(0,rlz.length()-2);/////最後のカンマとる
			
			for(int i=0; i<zcoor2.size(); i++){
				for(int j=0; j<ycoor.size(); j++){
					rly += String.valueOf(ycoor.get(j))+"f, ";///////////////////////////////////////////////
				}
			}
			rly = rly.substring(0,rly.length()-2);/////最後のカンマとる
			
			
			for(int i=0; i< xcoor2.size(); i++){
				for(int j=0; j<ycoor.size(); j++){
					fby += String.valueOf(ycoor.get(j))+"f, ";
				}
			}
			fby = fby.substring(0,fby.length()-2);/////最後のカンマとる
			
			
			float a = room_sizex/2 - (room_sizex/50)*0.3f;
			for(int i=0; i<(ycoor.size()*zcoor2.size()); i++){
				leftx += String.valueOf(a)+"f, ";
			}
			leftx = leftx.substring(0,leftx.length()-2);/////最後のカンマとる
			
			float b = -room_sizex/2 + (room_sizex/50)*0.3f;
			for(int i=0; i<(ycoor.size()*zcoor2.size()); i++){
				rightx += String.valueOf(b)+"f, ";
			}
			rightx = rightx.substring(0,rightx.length()-2);/////最後のカンマとる
			
			float c = room_sizez/2 - (room_sizez/30)*0.3f;
			for(int i=0; i<(ycoor.size()*xcoor.size()); i++){
				frontz += String.valueOf(c)+"f, ";
			}
			frontz = frontz.substring(0,frontz.length()-2);/////最後のカンマとる
			
			float d = -room_sizez/2 + (room_sizez/30)*0.3f;
			for(int i=0; i<(ycoor.size()*xcoor.size()); i++){
				backz += String.valueOf(d)+"f, ";
			}
			backz = backz.substring(0,backz.length()-2);/////最後のカンマとる
			
		}
	}
	
	private static void wallCS0(int exhflag){
		ArrayList<Float> xcoor2 = new ArrayList<>();
		ArrayList<Float> zcoor2 = new ArrayList<>();
		xcoor.clear();
		ycoor.clear();
		zcoor.clear();
		xcoor2.clear();
		zcoor2.clear();
		rightx = "";
		rlz = "";
		leftx = "";
		fbx = "";
		frontz = "";
		backz = "";
		rly = "";
		fby = "";
		
		if(exhflag == 1){
			for(float i=room_sizex/2 - wallexh_distancex; i>-room_sizex/2 + wallexh_distancex; i -= wallexh_distancex){
				xcoor.add(i);//museumだと11個
			}
			for(float i=room_sizez/2 - wallexh_distancex; i>-room_sizez/2 + wallexh_distancex; i -= wallexh_distancex){
				zcoor.add(i);//museumだと6個
			}
			
			for(int i=0; i<xcoor.size(); i++){
				fbx += xcoor.get(i)+"f, ";
			}
			fbx = fbx.substring(0,fbx.length()-2);/////最後のカンマとる
			
			
			for(int i=0; i<zcoor.size(); i++){
				rlz += zcoor.get(i)+"f, ";
			}
			rlz = rlz.substring(0,rlz.length()-2);/////最後のカンマとる
			
			
			float a = room_sizex/2 - (room_sizex/50)*0.3f - wallstand_sizex/2;
			for(int i=0; i<zcoor.size(); i++){
				leftx += String.valueOf(a)+"f, ";
			}
			leftx = leftx.substring(0,leftx.length()-2);/////最後のカンマとる
			
			float b = -room_sizex/2 + (room_sizex/50)*0.3f - wallstand_sizex/2;
			for(int i=0; i<zcoor.size(); i++){
				rightx += String.valueOf(b)+"f, ";
			}
			rightx = rightx.substring(0,rightx.length()-2);/////最後のカンマとる
			
			float c = room_sizez/2 - (room_sizez/30)*0.3f - wallstand_sizez/2;
			for(int i=0; i<xcoor.size(); i++){
				frontz += String.valueOf(c)+"f, ";
			}
			frontz = frontz.substring(0,frontz.length()-2);/////最後のカンマとる
			
			float d = -room_sizez/2 + (room_sizez/30)*0.3f + wallstand_sizez/2;
			for(int i=0; i<xcoor.size(); i++){
				backz += String.valueOf(d)+"f, ";
			}
			backz = backz.substring(0,backz.length()-2);/////最後のカンマとる
		}else if(exhflag == 2){

			for(float i=wallexh_distancey; i<room_sizey; i += wallexh_distancey){
				ycoor.add(i);//museumだと3個
			}

			for(float i=room_sizex/2 - wallexh_distancex; i>-room_sizex/2 + wallexh_distancex; i -= wallexh_distancex){
				xcoor2.add(i);//museumだと11個
			}
			for(int i=0; i< xcoor2.size(); i++){
				for(int j=0; j< ycoor.size(); j++){
					xcoor.add(xcoor2.get(i));//
				}
			}
			for(float i=room_sizez/2 - wallexh_distancex; i>-room_sizez/2 + wallexh_distancex; i -= wallexh_distancex){
				zcoor2.add(i);//museumだと6個
			}
			for(int i=0; i< zcoor2.size(); i++){
				for(int j=0; j< ycoor.size(); j++){
					zcoor.add(zcoor2.get(i));
				}
			}
			
			
			for(int i=0; i<xcoor.size(); i++){
				fbx += xcoor.get(i)+"f, ";
			}
			fbx = fbx.substring(0,fbx.length()-2);/////最後のカンマとる
			
			for(int i=0; i<zcoor.size(); i++){
				rlz += zcoor.get(i)+"f, ";
			}
			rlz = rlz.substring(0,rlz.length()-2);/////最後のカンマとる
			
			for(int i=0; i< zcoor2.size(); i++){
				for(int j=0; j<ycoor.size(); j++){
					rly += String.valueOf(ycoor.get(j))+"f, ";
				}
			}
			rly = rly.substring(0,rly.length()-2);/////最後のカンマとる
			
			for(int i=0; i< xcoor2.size(); i++){
				for(int j=0; j<ycoor.size(); j++){
					fby += String.valueOf(ycoor.get(j))+"f, ";
				}
			}
			fby = fby.substring(0,fby.length()-2);/////最後のカンマとる
			
			
			float a = room_sizex/2 - (room_sizex/50)*1.3f;
			for(int i=0; i<(ycoor.size()*zcoor2.size()); i++){
				leftx += String.valueOf(a)+"f, ";
			}
			leftx = leftx.substring(0,leftx.length()-2);/////最後のカンマとる
			
			float b = -room_sizex/2 + (room_sizex/50)*1.3f;
			for(int i=0; i<(ycoor.size()*zcoor2.size()); i++){
				rightx += String.valueOf(b)+"f, ";
			}
			rightx = rightx.substring(0,rightx.length()-2);/////最後のカンマとる
			
			float c = room_sizez/2 - (room_sizez/30)*1.3f;
			for(int i=0; i<(ycoor.size()*xcoor.size()); i++){
				frontz += String.valueOf(c)+"f, ";
			}
			frontz = frontz.substring(0,frontz.length()-2);/////最後のカンマとる
			
			float d = -room_sizez/2 + (room_sizez/30)*1.3f;
			for(int i=0; i<(ycoor.size()*xcoor.size()); i++){
				backz += String.valueOf(d)+"f, ";
			}
			backz = backz.substring(0,backz.length()-2);/////最後のカンマとる
			
		}
	}
	
	private static void getCS1(boolean pictflag, boolean wallflag){
		b += "using System;\n";
		b += "using System.ComponentModel;\n";
		b += "using System.Linq;\n";
		b += "using System.Text;\n";
		b += "using System.Xml;\n";
		b += "using UnityEngine;\n";
		b += "using System.Collections;\n";
		b += "using UnityEngine.UI;\n";
		b += "using System.Collections.Generic;\n";
		b += "\n";
		b += "public class NewBehaviourScript : MonoBehaviour {\n";
		b += "	static int num = 0;\n";
		b += "	public Rigidbody rigid;\n";
		b += "	public Vector3 size = new Vector3(0, 0, 0);\n";

		b += "	static float billmovex = 0;\n";
		b += "	static float billmovey = 0;\n";
		b += "	static float billmovez = 0;\n";
		
		b += "	float exhmovex = 0f;\n";
		b += "	float exhmovey = 0f;\n";
		b += "	float exhmovez = 0f;\n";
		b += "	int exhmoveflag = 0;\n";
		b += "	static int manum = 0;\n";
		int max = 0;
		for(int i=0; i< VRcjoinarray.gLemaxlist.size();i++){
			if(max < VRcjoinarray.gLemaxlist.get(i))
				max = VRcjoinarray.gLemaxlist.get(i);
		}
		if(max >= 3){//N次元
			for(int i=1; i <= max-2; i++){
				b += "	float N"+i+"movex = 0f;\n";
				b += "	float N"+i+"movey = 0f;\n";
				b += "	float N"+i+"movez = 0f;\n";
			}
		}
		
		
		b += "	void Start () {\n";
		if(VRManager.VRmoduleflag){
			b += "		float xscale = "+room_sizex/50+"f;\n";//部屋の大きさとの対比
			b += "		float yscale = "+room_sizey/20+"f;\n";
			b += "		float zscale = "+room_sizez/30+"f;\n";
			b += "		float room_sizex = "+room_sizex+"f;\n";
			b += "		float room_sizey = "+room_sizey+"f;\n";
			b += "		float room_sizez = "+room_sizez+"f;\n";
			b += "		float roomx = "+roomx+"f;\n";
			b += "		float roomz = "+roomz+"f;\n";
			b += "		float exhibition_distancex = "+exh_distancex+"f;\n";
			b += "		float exhibition_distancey = "+exh_distancey+"f;\n";
			b += "		float exhibition_distancez = "+exh_distancez+"f;\n";
			b += "\n";
		}
		b += "		GameObject[] array = new GameObject[500];\n";
		b += "		int groupflag = 1;\n";
		b += "\n";
		b += "		XmlDocument xmlDocument = new XmlDocument();\n";
		b += "		xmlDocument.Load(\""+filename+".xml\");\n";
		b += "		XmlElement elem = xmlDocument.DocumentElement; //elem.Nameはdoc\n";
		b += 	"\n";
		b += "		XmlNodeList elemList1 = xmlDocument.GetElementsByTagName(\"id\");\n";
		b += "		XmlNodeList elemList2 = xmlDocument.GetElementsByTagName(\"name\");\n";
		if(pictflag){
			b +="		XmlNodeList elemList3 = xmlDocument.GetElementsByTagName(\"placement\");\n";
			b +="\n";
			b +="		Texture2D[] texture = Resources.LoadAll<Texture2D>(\"WallImage\");\n";
			b +="		int imagelen = texture.Length;\n";
			b +="		String[] texture_str = new String[imagelen];\n";
			b +="		\n";
			b +="		Sprite[] texture_sprite = new Sprite[imagelen];\n";
			b +="		for(int i=0; i<imagelen ;i++){\n";
			b +="			texture_sprite[i] = Sprite.Create(texture[i], new Rect(0, 0, texture[i].width, texture[i].height), new Vector2(0.5f, 0.5f));//画像をスプライトにする\n";	
			b +="		}\n";
		}
		if(wallflag){
			b +="		XmlNodeList elemList3 = xmlDocument.GetElementsByTagName(\"placement\");\n";
			b += "		GameObject[] wallarray = new GameObject[500];\n";
			b +="\n";
		}
		b += "\n";
		b += "		if (elem.HasChildNodes == true) {\n";
		if(max == 2){//N次元 181014
			b += "	        XmlNode childNode2 = elem.FirstChild;\n";
			b += "	        while (childNode2 != null) {\n";
		}else{
			b += "	        XmlNode NNode1 = elem.FirstChild;\n";
			b += "	        while (NNode1 != null) {\n";
		}
		b += "\n";
}
	

	private static void getCS2(int exhflag, String s, boolean pictflag, boolean wallflag, int pictexhflag, int wallexhflag){
		b +="					String[] genrearray = {"+ s + "};//タイトル表示\n";
		b +="					int museumcount = 0;//分類属性ごとの部屋の数\n";
		if(scene.equals("museum")){
			b +="					float objhigh = 2.8f;\n";
			b +="					float standhigh = 1.25f;\n";
		}else if(VRManager.VRmoduleflag){
			float min_stand = stand_sizez;
			if(stand_sizex < stand_sizez)
				min_stand = stand_sizex;//展示台の短い方に展示物のサイズを合わせる
			b +="					float objhigh = "+ ((0.2*room_sizey/20+stand_sizey)+(min_stand/2)) +"f;\n";
			moduleobjhigh = (0.2f*room_sizey/20+stand_sizey)+(min_stand/2);
			b +="					float standhigh = "+ (0.25*room_sizey/20+stand_sizey/2) +"f;\n";
		}
		if(exhflag == 1){
			b +="					int r;\n";
			if(scene.equals("museum")){
				b +="					int[] xarray = new int[500];\n";
				b +="					int[] xxarray = new int[100];\n";
				b +="					int[] zarray = new int[100];\n";
				b +="					for(int n=10,k=0; n >= -10; n = n-5,k++){\n";
				b +="						zarray[k] = n;\n";
				b +="					}\n";
				
				b +="					for(int m=20, l=0; m >= -20; m = m-5,l++){	\n";
				b +="						xxarray[l] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){    	\n";
				b +="						if(q == 9){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						xarray[p] = xxarray[q];	\n";
				b +="					}   \n";
				b +="\n";
			}else if(VRManager.VRmoduleflag){
				b +="					float[] xarray = new float[500];\n";
				b +="					float[] xxarray = new float[100];\n";
				b +="					float[] zarray = new float[100];\n";
				b +="\n";
				b +="					int s=0,l=0;\n";
				b +="					for(float n=roomz; n >= -roomz; n = n-exhibition_distancez, s++){\n";
				b +="						zarray[s] = n;\n";
				b +="					}\n";

				b +="					for(float m=roomx; m >= -roomx; m = m-exhibition_distancex, l++){	\n";
				b +="						xxarray[l] = m;\n";
				b +="					}\n";
				double i = Math.floor((room_sizex-10) / Integer.parseInt(exh_distancex)) + 1;
				//module 40=x軸の部屋の大きさ-10　iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
				b +="					for(int p=0, q=0; p<500; p++,q++){    	\n";
				b +="						if(q == "+i+"f){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						xarray[p] = xxarray[q];	\n";
				b +="					}   \n";
				b +="\n";
			}
		}else if(exhflag == 2){
			if(scene.equals("museum")){
				b +=	"					ArrayList yarray = new ArrayList();\n";
				b +=		"					\n";
				b +=		"					for(int n=0; n<500; n++){\n";
				b +=		"						yarray.Add(n*2);\n";
				b +=		"					}\n";
				b +=		"\n";	
			}else if(VRManager.VRmoduleflag){
				b +=	"					ArrayList yarray = new ArrayList();\n";
				b +=		"					\n";
				b +=		"					for(int n=0; n<500; n++){\n";
				b +=		"						yarray.Add(n*"+exh_distancey+"f);\n";
				b +=		"					}\n";
				b +=		"\n";
			}
			
		}else if(exhflag == 3){
			b +="					int r;\n";
			if(scene.equals("museum")){
				b +="					int[] xarray = new int[100];\n";
				b +="					int[] zarray = new int[500];\n";
				b +="					int[] zzarray = new int[100];\n";
				b +="					\n";
				b +="					for(int n=20,k=0; n >= -20; n = n-5,k++){\n";
				b +="						xarray[k] = n;\n";
				b +="					}\n";
				
				b +="					for(int m=10, l=0; m >= -10; m = m-5,l++){\n";
				b +="						zzarray[l] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){    	\n";
				b +="						if(q == 5){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						zarray[p] = zzarray[q];	\n";
				b +="					}\n";
				b +="\n";
			}else if(VRManager.VRmoduleflag){
				b +="					float[] xarray = new float[100];\n";
				b +="					float[] zarray = new float[500];\n";
				b +="					float[] zzarray = new float[100];\n";
				b +="					\n";
				b +="					int s=0,l=0;\n";
				b +="					for(float n=roomx; n >= -roomx; n = n-exhibition_distancex, s++){\n";
				b +="						xarray[s] = n;\n";
				b +="					}\n";

				b +="					for(float m=roomz; m >= -roomz; m = m-exhibition_distancez, l++){\n";
				b +="						zzarray[l] = m;\n";
				b +="					}\n";
				double i = Math.floor((room_sizez-10) / Integer.parseInt(exh_distancez)) + 1;
				//module 20=z軸の部屋の大きさ-10 iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
				b +="					for(int p=0, q=0; p<500; p++,q++){    	\n";
				b +="						if(q == "+i+"f){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						zarray[p] = zzarray[q];	\n";
				b +="					}\n";
				b +="\n";
			}
		}
		pictwallCS2(pictflag, wallflag, pictexhflag, wallexhflag);
		b +="\n";
	}
	
	private static void pictwallCS2(boolean pictflag, boolean wallflag, int pictexhflag, int wallexhflag){
		int pictwallexhflag = 0;
		if(pictexhflag != 0){
			pictwallexhflag = pictexhflag;
		}else if(wallexhflag != 0){
			pictwallexhflag = wallexhflag;
		}
		if(wallflag || pictflag){
			b +="\n";
			b +="					var turnarray = new List<int>();//turnする時の展示物(imagenum)の数\n";
			b +="					var turny = new List<float>();//展示物のRotate(0,y,0)のy値\n";
			b +="					var imagex = new List<float>();\n";
			b +="					var imagez = new List<float>();\n";
			if(pictwallexhflag == 2){
				b +="					var imagey = new List<float>();\n";
			}
		}
		
		
		if(pictwallexhflag == 1){
			if(scene.equals("museum")){
				if(pictflag){
					b +="					var rightx = new List<float>(){-24.7f,-24.7f,-24.7f,-24.7f,-24.7f,-24.7f};\n";
					b +="					var leftx = new List<float>(){24.7f,24.7f,24.7f,24.7f,24.7f,24.7f};\n";
					b +="					var frontz = new List<float>(){14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f};\n";
					b +="					var backz = new List<float>(){-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f};\n";
				}else if(wallflag){
					b +="					var rightx = new List<float>(){-23.7f, -23.7f, -23.7f, -23.7f, -23.7f, -23.7f};\n";
					b +="					var leftx = new List<float>(){23.7f, 23.7f, 23.7f, 23.7f, 23.7f, 23.7f};\n";
					b +="					var frontz = new List<float>(){13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f};\n";
					b +="					var backz = new List<float>(){-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f};\n";
				}
				b +="					var rlz = new List<float>(){-10,-6,-2,2,6,10};//right & left\n";
				b +="					var fbx = new List<float>(){20,16,12,8,4,0,-4,-8,-12,-16,-20};//front & back \n";
			}else if(VRManager.VRmoduleflag){
				if(pictflag){
					pictureCS0(pictwallexhflag);
				}else if(wallflag){
					wallCS0(pictwallexhflag);
				}
				b +="					var rightx = new List<float>(){"+rightx+"};\n";
				b +="					var rlz = new List<float>(){"+rlz+"};//right & left\n";
				b +="					var leftx = new List<float>(){"+leftx+"};\n";
				b +="					var fbx = new List<float>(){"+fbx+"};//front & back \n";
				b +="					var frontz = new List<float>(){"+frontz+"};\n";
				b +="					var backz = new List<float>(){"+backz+"};\n";
			}
		}else if(pictwallexhflag == 2){
			if(scene.equals("museum")){
				if(pictflag){
					b +="					var rightx = new List<float>(){-24.7f, -24.7f, -24.7f,-24.7f, -24.7f, -24.7f,-24.7f, -24.7f, -24.7f,-24.7f, -24.7f, -24.7f,-24.7f, -24.7f, -24.7f,-24.7f, -24.7f, -24.7f};\n";
					b +="					var leftx = new List<float>(){24.7f, 24.7f, 24.7f,24.7f, 24.7f, 24.7f,24.7f, 24.7f, 24.7f,24.7f, 24.7f, 24.7f,24.7f, 24.7f, 24.7f,24.7f, 24.7f, 24.7f};\n";
					b +="					var frontz = new List<float>(){14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f,14.7f};\n";
					b +="					var backz = new List<float>(){-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f,-14.7f};\n";
				}else if(wallflag){
					b +="					var rightx = new List<float>(){-23.7f, -23.7f, -23.7f,-23.7f, -23.7f, -23.7f,-23.7f, -23.7f, -23.7f,-23.7f, -23.7f, -23.7f,-23.7f, -23.7f, -23.7f,-23.7f, -23.7f, -23.7f};\n";
					b +="					var leftx = new List<float>(){23.7f, 23.7f, 23.7f,23.7f, 23.7f, 23.7f,23.7f, 23.7f, 23.7f,23.7f, 23.7f, 23.7f,23.7f, 23.7f, 23.7f,23.7f, 23.7f, 23.7f};\n";
					b +="					var frontz = new List<float>(){13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f,13.7f};\n";
					b +="					var backz = new List<float>(){-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f,-13.7f};\n";
				}
				b +="					var rlz = new List<float>(){10,10,10, 6,6,6, 2,2,2, -2,-2,-2, -6,-6,-6, -10,-10,-10 };\n";
				b +="					var fbx = new List<float>(){20,20,20, 16,16,16, 12,12,12, 8,8,8, 4,4,4, 0,0,0, -4,-4,-4, -8,-8,-8, -12,-12,-12, -16,-16,-16, -20,-20,-20};\n";
				b +="					var rly = new List<float>(){5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15};\n";
				b +="					var fby = new List<float>(){5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15,5,10,15};\n";
			}else if(VRManager.VRmoduleflag){
				if(pictflag){
					pictureCS0(pictwallexhflag);
				}else if(wallflag){
					wallCS0(pictwallexhflag);
				}
				b +="					var rightx = new List<float>(){"+rightx+"};\n";
				b +="					var rlz = new List<float>(){"+rlz+"};//right & left\n";
				b +="					var leftx = new List<float>(){"+leftx+"};\n";
				b +="					var fbx = new List<float>(){"+fbx+"};//front & back \n";
				b +="					var frontz = new List<float>(){"+frontz+"};\n";
				b +="					var backz = new List<float>(){"+backz+"};\n";
				b +="					var rly = new List<float>(){"+rly+"};\n";
				b +="					var fby = new List<float>(){"+fby+"};\n";
			}
		}
	}
	
	private static void compgetCS2(int compx, int compy, int compz ,int compflag, String s,  boolean pictflag, boolean wallflag, int pictexhflag, int wallexhflag){//複合反復子
			b +="					String[] genrearray = {"+ s + "};//タイトル表示\n";
			b +="					int r;\n";
			b +="					float objhigh = 2.8f;\n";
			b +="					float standhigh = 1.25f;\n";
			b +="					int museumcount = 0;//分類属性ごとの部屋の数\n";
			b +="					\n";
			
		if(compx == -1 || compy == -1 || compz == -1){////,5%系、CodeGeneratorの714行目で-1の印つけてる
			if(compx == -1){//2番目
				if(scene.equals("museum")){
					b +="					int[] xarray = new int[100];\n";
					b +="					for(int n=20,k=0; n >= -20; n -= 5,k++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] xarray = new float[100];\n";
					b +="					int s=0;\n";
					b +="					for(float n=roomx; n >= -roomx; n -= exhibition_distancex, s++){\n";
				}
				b +="						xarray[s] = n;\n";
				b +="					}\n";
			}else if(compy == -1){
				if(scene.equals("museum")){
					b +="					int[] yarray = new int[100];\n";
					b +="					for(int n=0,k=0; k<100; n += 2, k++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] yarray = new float[100];\n";
					b +="					int s=0;\n";
					b +="					for(float n=0; s<100; n += "+exh_distancey+"f, s++){\n";
				}
				b +="						yarray[s] = n;\n";
				b +="					}\n";
			}else if(compz == -1){
				if(scene.equals("museum")){
					b +="					int[] zarray = new int[100];\n";
					b +="					for(int n=10,s=0; n >= -10; n -= 5,s++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] zarray = new float[100];\n";
					b +="					int s=0;\n";
					b +="					for(float n="+roomz+"f; n >= -"+roomz+"f; n -= "+exh_distancez+"f,s++){\n";
				}
				b +="						zarray[s] = n;\n";
				b +="					}\n";
			}
			
			if(compflag == 1){//1番目
				if(scene.equals("museum")){
					b +="					int[] xarray = new int[500];\n";
					b +="					int[] xxarray = new int[100];\n";
					b +="					for(int m=20, l=0; l<"+ compx +"; m = m-5,l++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] xarray = new float[500];\n";
					b +="					float[] xxarray = new float[100];\n";
					b +="					int l=0;\n";
					b +="					for(float m=roomx; l<"+ compx +"; m = m-exhibition_distancex, l++){\n";
				}
				b +="						xxarray[l] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){ \n";
				b +="						if(q == "+ compx +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						xarray[p] = xxarray[q];	\n";
				b +="					} \n";
			}else if(compflag == 2){
				if(scene.equals("museum")){
					b +="					int[] yarray = new int[500];\n";
					b +="					int[] yyarray = new int[100];\n";
					b +="					for(int m=0, d=0; d<"+ compy +"; m += 2,d++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] yarray = new float[500];\n";
					b +="					float[] yyarray = new float[100];\n";
					b +="					int d=0;\n";
					b +="					for(float m=0f; d<"+ compy +"; m += "+exh_distancey+",d++){\n";
				}
				b +="						yyarray[d] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){ \n";
				b +="						if(q == "+ compy +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						yarray[p] = yyarray[q];	\n";
				b +="					} \n";
			}else if(compflag == 3){
				if(scene.equals("museum")){
					b +="					int[] zarray = new int[500];\n";
					b +="					int[] zzarray = new int[100];\n";
					b +="					for(int m=10, u=0; u<"+ compz +"; m -= 5,u++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] zarray = new float[500];\n";
					b +="					float[] zzarray = new float[100];\n";
					b +="					int u=0;\n";
					b +="					for(float m="+roomz+"f; u<"+ compz +"; m -= "+exh_distancez+"f,u++){\n";
				}
				b +="						zzarray[u] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){ \n";
				b +="						if(q == "+ compz +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						zarray[p] = zzarray[q];	\n";
				b +="					}   \n";
			}
			
			if(compx == 0){///無いTFE(記号)について
				if(scene.equals("museum")){
					b +="					int[] xarray = new int[500];\n";
					b +="					for(int k=0; k<500; k++){\n";
					b +="						xarray[k] = 20;\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] xarray = new float[500];\n";
					b +="					for(int k=0; k<500; k++){\n";
					b +="						xarray[k] = roomx;\n";
				}
				b +="					}\n";
			}else if(compy == 0){
				b +="					int[] yarray = new int[500];\n";
				b +="					for(int k=0; k<500; k++){\n";
				b +="						yarray[k] = 0;\n";
				b +="					}\n";
			}else if(compz == 0){
				if(scene.equals("museum")){
					b +="					int[] zarray = new int[500];\n";
					b +="					for(int k=0; k<500; k++){\n";
					b +="						zarray[k] = 10;\n";
				}else if(VRManager.VRmoduleflag){
					b +="					float[] zarray = new float[500];\n";
					b +="					for(int k=0; k<500; k++){\n";
					b +="						zarray[k] = roomz;\n";
				}
				b +="					}\n";
			}
		}else{///,5%4!系
			if(scene.equals("museum")){
				b +="					int[] xarray = new int[500];\n";
				b +="					int[] xxarray = new int[100];\n";
				b +="					int[] zarray = new int[500];\n";
				b +="					int[] zzarray = new int[100];\n";
				b +="					int[] yarray = new int[500];\n";
				b +="					int[] yyarray = new int[100];\n";
			}else if(VRManager.VRmoduleflag){
				b +="					float[] xarray = new float[500];\n";
				b +="					float[] xxarray = new float[100];\n";
				b +="					float[] zarray = new float[500];\n";
				b +="					float[] zzarray = new float[100];\n";
				b +="					float[] yarray = new float[500];\n";
				b +="					float[] yyarray = new float[100];\n";
			}
			
			if(compflag == 1){///1番目の記号
				if(scene.equals("museum")){
					b +="					for(int m=20, l=0; l<"+ compx +"; m = m-5,l++){	\n";
				}else if(VRManager.VRmoduleflag){
					b +="					int l=0;\n";
					b +="					for(float m=roomx; l<"+ compx +"; m = m-exhibition_distancex, l++){\n";
				}
				b +="						xxarray[l] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){  \n";
				b +="						if(q == "+ compx +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						xarray[p] = xxarray[q];	\n";
				b +="					}\n";
			}else if(compflag == 2){
				if(scene.equals("museum")){
					b +="					for(int m=0, d=0; d<"+ compy +"; m += 2, d++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					int d=0;\n";
					b +="					for(float m=0f; d<"+ compy +"; m += "+exh_distancey+"f, d++){\n";
				}
				b +="						yyarray[d] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){\n";
				b +="						if(q == "+ compy +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						yarray[p] = yyarray[q];	\n";
				b +="					}\n";
			}else if(compflag == 3){
				if(scene.equals("museum")){
					b +="					for(int m=10, u=0; u<"+ compz +"; m = m-5,u++){	\n";
				}else if(VRManager.VRmoduleflag){
					b +="					int u=0;\n";
					b +="					for(float m=roomz; u<"+ compz +"; m = m-"+exh_distancez+"f,u++){	\n";
				}
				b +="						zzarray[u] = m;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){  \n";
				b +="						if(q == "+ compz +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						zarray[p] = zzarray[q];	\n";
				b +="					}\n";
			}
			
			if(compx != 0 && compflag != 1){//2番目
				if(scene.equals("museum")){
					b +="					for(int n=20,s=0; s<"+ compx +"; n = n-5,s++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					int s=0;\n";
					b +="					for(float n=roomx; s<"+ compx +"; n = n-exhibition_distancex, s++){\n";
				}
				b +="						xxarray[s] = n;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){ \n";
				b +="						if(q == "+ compx +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						xarray[p] = xxarray[q];	\n";
				b +="					}\n";
			}else if(compy != 0 && compflag != 2){
				if(scene.equals("museum")){
					b +="					for(int n=0,s=0; s<"+ compy +"; n += 2,s++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					int s=0;\n";
					b +="					for(float n=0; s<"+ compy +"; n += "+exh_distancey+"f,s++){\n";
				}
				b +="						yyarray[s] = n;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){  \n";
				b +="						if(q == "+ compy +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						yarray[p] = yyarray[q];	\n";
				b +="					}\n";
			}else if(compz != 0 && compflag != 3){
				if(scene.equals("museum")){
					b +="					for(int n=10,s=0; s<"+ compz +"; n = n-5,s++){\n";
				}else if(VRManager.VRmoduleflag){
					b +="					int s=0;\n";
					b +="					for(float n=roomz; s<"+ compz +"; n = n-"+exh_distancez+"f,s++){\n";
				}
				b +="						zzarray[s] = n;\n";
				b +="					}\n";
				b +="					for(int p=0, q=0; p<500; p++,q++){ \n";
				b +="						if(q == "+ compz +"){\n";
				b +="							q=0;\n";
				b +="						}\n";
				b +="						zarray[p] = zzarray[q];	\n";
				b +="					}\n";
			}
			
			if(compx == 0){//3番目
				if(scene.equals("museum")){
					b +="					for(int m=20, l=0; l<9; m -= 5,l++){	\n";
				}else if(VRManager.VRmoduleflag){
					double i = Math.floor((room_sizex-10) / Integer.parseInt(exh_distancex)) + 1;
					//module 40=x軸の部屋の大きさ-10　iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
					b +="					int l=0;\n";
					b +="					for(float m=roomx; l<"+i+"; m -= exhibition_distancex, l++){	\n";
				}
				b +="						xxarray[l] = m; 	\n";
				b +="					}	\n";
				b +="					for(int p=0,q=0; p<500; p++){ \n";
				b +="						if((p!=0) && (p%("+ compy +"*"+ compz +")==0)){\n";
				b +="							q++;\n";
				b +="						}\n";
				b +="						xarray[p] = xxarray[q];	\n";
				b +="					}\n";
			}else if(compy == 0){
				if(scene.equals("museum")){
					b +="					for(int m=0, d=0; d<10; m += 2, d++){\n";
				}else if(VRManager.VRmoduleflag){
					double i = Math.floor(room_sizey / Integer.parseInt(exh_distancey));
					//module　iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
					b +="					int d=0;\n";
					b +="					for(float m=0f; d<"+i+"; m += "+exh_distancey+"f, d++){\n";
				}
				b +="						yyarray[d] = m; \n";
				b +="					}\n";
				b +="					for(int p=0,q=0; p<500; p++){ \n";
				b +="						if((p!=0) && (p%("+ compx +"*"+ compz +")==0)){\n";
				b +="							q++;\n";
				b +="						}\n";
				b +="						yarray[p] = yyarray[q];	\n";
				b +="					}\n";
			}else if(compz == 0){
				if(scene.equals("museum")){
					b +="					for(int m=10, u=0; u<5; m -= 5, u++){	\n";
				}else if(VRManager.VRmoduleflag){
					double i = Math.floor((room_sizez-10) / Integer.parseInt(exh_distancez)) + 1;
					//module 20=z軸の部屋の大きさ-10　iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
					b +="					int u=0;\n";
					b +="					for(float m=roomz; u<"+i+"; m -= "+exh_distancez+"f, u++){	\n";
				}
				b +="						zzarray[u] = m; 	\n";
				b +="					}	\n";
				b +="					for(int p=0,q=0; p<500; p++){ \n";
				b +="						if((p!=0) && (p%("+ compx +"*"+ compy +")==0)){\n";
				b +="							q++;\n";
				b +="						}\n";
				b +="						zarray[p] = zzarray[q];	\n";
				b +="					}\n";
			}
		}
		pictwallCS2(pictflag, wallflag, pictexhflag, wallexhflag);
		b +="\n";
	}
	
	private static void arbitraryCS2(String s, boolean pictflag, boolean wallflag, int pictexhflag, int wallexhflag){
b +="					String[] genrearray = {"+ s + "};//タイトル表示\n";
b +="					int museumcount = 0;//分類属性ごとの部屋の数\n";
b +="					float[] markx = new float[100];//mark\n";
b +="					float[] marky = new float[100];//mark\n";
b +="					float[] markz = new float[100];//mark\n";
b +="					try {//mark\n";
b +="						for(int ma=0; ;ma++){\n";
b +="							if(GameObject.Find(\"Prefab/mark (\"+ ma +\")\").transform.position.x == null)\n";
b +="								break;\n";
b +="							GameObject mark = Resources.Load(\"Prefab/mark (\"+ma+\")\") as GameObject;	\n";
b +="							markx[ma] = mark.transform.position.x;	\n";
b +="							marky[ma] = mark.transform.position.y;	\n";
b +="							markz[ma] = mark.transform.position.z;	\n";
b +="						}//ma=5 0-5\n";
b +="					}       \n";
b +="					catch (NullReferenceException ex) {\n";
b +="						Debug.Log(\"arbitrary arrangement\");\n";
b +="					}\n";
b +="\n";
		pictwallCS2(pictflag, wallflag, pictexhflag, wallexhflag);
b +="\n";
	}

	private static void NCS2_3(int groupcount){//N次元
		b+="\n";
		b+="\n";
		for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
				b+="					if (NNode"+i+".HasChildNodes == true) {\n";
				b+="						for (int Nnum"+i+" = 0; Nnum"+i+" < NNode"+i+".ChildNodes.Count; Nnum"+i+"++, museumcount=0) {\n";
			if(i == VRcjoinarray.gLemaxlist.get(groupcount)-2){
				b+="							XmlNode childNode2 = NNode"+i+".FirstChild;\n";
			}else{
				b+="							XmlNode NNode"+(i+1)+" = NNode"+i+".FirstChild;\n";
			}
		}
		b+="\n";
		b+="\n";
	}
	
	
	private static void getCS3(boolean pictflag, boolean wallflag, int exhflag,int floorflag, String prejoin, String afterjoin, int museumcount, int pictexhflag, int wallexhflag){//museumcountは部屋数

		
		int pictwallexhflag = 0;
		if(pictexhflag != 0){
			pictwallexhflag = pictexhflag;
		}else if(wallexhflag != 0){
			pictwallexhflag = wallexhflag;
		}
		if(pictflag){
			b+="					\n";		
			b+="					GameObject  Canvas = Instantiate(Resources.Load(\"Prefab/Canvas\")) as GameObject; //canvas複製\n";
			b+="					GameObject[] work_image = new GameObject[imagelen];\n";	
			b+="					for(int i=0; i<imagelen; i++){\n";
			b+="							work_image[i] = new GameObject(texture[i].name);//texture[i].nameはstring型 workimageの名前をidにする\n";
			b+="					}\n";
			b+="					for(int i=0; i<texture_sprite.Length ;i++){\n";
			b+="						work_image[i].transform.parent = Canvas.transform;//work_imageをcanvasの子オブジェクトに\n";
			b+="						work_image[i].AddComponent<RectTransform>().anchoredPosition = new Vector3(0, 0, 0);//画像の位置(アンカーポジション)を追加して画面の真ん中にする\n";
			b+="					\n";
			b+="						work_image[i].AddComponent<Image>().sprite = texture_sprite[i];//スプライト画像をworkimageに追加\n";
			b+="						work_image[i].GetComponent<Image>().preserveAspect = true;//アスペクト比は元の画像の比率を維持\n";
			b+="						work_image[i].GetComponent<Image>().SetNativeSize();//画像のサイズを元画像と同じサイズにする\n";
			b+="					\n";
			b+="						float sdx = work_image[i].GetComponent<RectTransform>().sizeDelta.x;//サイズ取得\n";
			b+="						float sdy = work_image[i].GetComponent<RectTransform>().sizeDelta.y;\n";
			b+="						float y = sdy / sdx;\n";
			b+="						work_image[i].GetComponent<RectTransform>().sizeDelta = new Vector2(2,2*y);//サイズ変更　\n";
			b+="					}\n";
			b+="					\n";
		}
		///musuemcountはint a = VRAttribute.genrearray22.get(i-1) - VRAttribute.genrearray22.get(i-2);(複数ビル)か、genrearray2(単数ビル)
		b+="		        	if(childNode2.HasChildNodes == true){\n";
		b+="	        			XmlNode childNode = childNode2.FirstChild; //category\n";
		b+="				        while (childNode != null) { //childNode.Nameはcategory\n";
		b+="				        	museumcount++;\n";
		if(pictflag || wallflag){
			if(pictwallexhflag == 1){
				if(scene.equals("museum")){
					b+="				        	int imagey = 5;\n";
				}else if(VRManager.VRmoduleflag){
					b+="				        	float imagey ="+wallexh_distancey+"f;\n";
				}
			}
			b+="				        	turnarray.Clear();\n";
			b+="				        	turny.Clear();\n";
			b+="				        	imagex.Clear();\n";
			b+="				        	imagez.Clear();\n";
			if(pictwallexhflag == 2){
				b+="				        	imagey.Clear();\n";
			}

					for(int i=1; i<=museumcount; i++){
						if(i == 1){//1部屋目
							b+="				        	if(museumcount == 1){\n";
							if("entrance".equals(prejoin)){//前にビルが連結されてなくて、ここが入り口の時
								pictureLeft(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(6);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(18);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
								}
								
								if(floorflag == 1){
									pictureBack(pictwallexhflag);
								}else if(floorflag == 2){
									if("".equals(afterjoin) || "!".equals(afterjoin)){
										pictureBack(pictwallexhflag);
										pictureRight(pictwallexhflag);
										if(scene.equals("museum")){
											if(pictwallexhflag == 1){
												b+="			     				turnarray.Add(17);//6+11\n";
											}else if(pictwallexhflag == 2){
												b+="			     				turnarray.Add(51);//18+33\n";
											}
										}else if(VRManager.VRmoduleflag){
											b+="			     				turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
										}
									}else if(",".equals(afterjoin)){
										pictureBack(pictwallexhflag);
									}else if("%".equals(afterjoin)){
										pictureRight(pictwallexhflag);
									}				
								}else if(floorflag == 3){
									pictureRight(pictwallexhflag);
								}	
							}else if(",".equals(prejoin)){//前にビルが連結されている場合
								if(floorflag == 1){
									pictureBack(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(11);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(33);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
									}
								}else if(floorflag == 2){
									pictureBack(pictwallexhflag);
									pictureRight(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(11);\n";
											b+="		       	        		turnarray.Add(17);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(33);\n";
											b+="		       	        		turnarray.Add(51);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
										b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									}
								}else if(floorflag == 3){
									pictureRight(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(6);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(18);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
									}
								}	
								pictureFront(pictwallexhflag);
							}else if("!".equals(prejoin)){
								pictureFront(pictwallexhflag);
								pictureLeft(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(11);\n";
										b+="		       	        		turnarray.Add(17);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(33);\n";
										b+="		       	        		turnarray.Add(51);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
									b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
								}
								if(floorflag == 1){
									pictureBack(pictwallexhflag);					
								}else if(floorflag == 2){
									pictureBack(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(28);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(84);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+(xcoor.size()+xcoor.size()+zcoor.size())+");\n";
									}
									pictureRight(pictwallexhflag);
								}else if(floorflag == 3){
									pictureRight(pictwallexhflag);
								}
							}else if("%".equals(prejoin)){
								pictureLeft(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(6);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(18);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
								}
								if(floorflag == 1){
									pictureBack(pictwallexhflag);
								}else if(floorflag == 2){
									pictureBack(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(17);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(51);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									}
									pictureRight(pictwallexhflag);
								}else if(floorflag == 3){
									pictureRight(pictwallexhflag);
								}
							}
						}else if(i>1 && i<=museumcount-1){//真ん中の部屋	
							b += "							}else if(museumcount == " + i + "){\n";
							if(floorflag == 1){
								pictureFront(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(6);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(18);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
								}
								pictureBack(pictwallexhflag);
							}else if(floorflag == 2){
								pictureFront(pictwallexhflag);
								pictureLeft(pictwallexhflag);
								pictureBack(pictwallexhflag);
								pictureRight(pictwallexhflag);					
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(11);\n";
										b+="		       	        		turnarray.Add(17);\n";
										b+="		       	        		turnarray.Add(28);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(33);\n";
										b+="		       	        		turnarray.Add(51);\n";
										b+="		       	        		turnarray.Add(84);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
									b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									b+="		       	        		turnarray.Add("+(xcoor.size()+xcoor.size()+zcoor.size())+");\n";
								}
							}else if(floorflag == 3){
								pictureLeft(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(6);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(18);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
								}
								pictureRight(pictwallexhflag);
							}
						}else if(i == museumcount){//最後の部屋
							b += "							}else if(museumcount == " + i + "){\n";
							if("exit".equals(afterjoin)){
								if(floorflag == 1){
									pictureFront(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(11);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(33);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
									}
								}else if(floorflag == 2){
									pictureLeft(pictwallexhflag);
									pictureFront(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(6);\n";
											b+="		       	        		turnarray.Add(17);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(18);\n";
											b+="		       	        		turnarray.Add(51);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
										b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									}
								}else if(floorflag == 3){
									pictureLeft(pictwallexhflag);
									if(scene.equals("museum")){
										b+="		       	        		turnarray.Add(6);\n";
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
									}
								}
								pictureRight(pictwallexhflag);
							}else if((",".equals(afterjoin) || "!".equals(afterjoin)|| "%".equals(afterjoin) || "".equals(afterjoin)) && floorflag == 2){
								pictureLeft(pictwallexhflag);
								pictureBack(pictwallexhflag);
								pictureRight(pictwallexhflag);
								pictureFront(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(6);\n";
										b+="		       	        		turnarray.Add(17);\n";
										b+="		       	        		turnarray.Add(23);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(18);\n";
										b+="		       	        		turnarray.Add(51);\n";
										b+="		       	        		turnarray.Add(69);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
									b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size()+zcoor.size())+");\n";
								}
							}else if("".equals(afterjoin)){//ビルが一個。出口はない。
								if(floorflag == 1){
									pictureFront(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(11);\n";
											b+="		       	        		turnarray.Add(22);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(33);\n";
											b+="		       	        		turnarray.Add(66);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
										b+="		       	        		turnarray.Add("+xcoor.size()*2+");\n";
									}
								}else if(floorflag == 3){
									pictureLeft(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(6);\n";
											b+="		       	        		turnarray.Add(17);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(18);\n";
											b+="		       	        		turnarray.Add(51);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
										b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									}
								}
								pictureBack(pictwallexhflag);
								pictureRight(pictwallexhflag);				
							}else if(",".equals(afterjoin)){
								pictureBack(pictwallexhflag);
								if(scene.equals("museum")){
									if(pictwallexhflag == 1){
										b+="		       	        		turnarray.Add(11);\n";
									}else if(pictwallexhflag == 2){
										b+="		       	        		turnarray.Add(33);\n";
									}
								}else if(VRManager.VRmoduleflag){
									b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
								}
								if(floorflag == 1){
									pictureFront(pictwallexhflag);
								}else if(floorflag == 3){
									pictureLeft(pictwallexhflag);
								}					
							}else if("!".equals(afterjoin)){
								if(floorflag == 1){
									pictureFront(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(11);\n";
											b+="		       	        		turnarray.Add(17);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(33);\n";
											b+="		       	        		turnarray.Add(51);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
										b+="		       	        		turnarray.Add("+(xcoor.size()+zcoor.size())+");\n";
									}
								}else if(floorflag == 3){
									pictureLeft(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(6);\n";
											b+="		       	        		turnarray.Add(12);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(18);\n";
											b+="		       	        		turnarray.Add(36);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
										b+="		       	        		turnarray.Add("+(zcoor.size()*2)+");\n";
									}
								}
								pictureRight(pictwallexhflag);
								pictureBack(pictwallexhflag);
							}else if("%".equals(afterjoin)){
								if(floorflag == 1){
									pictureFront(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(11);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(33);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+xcoor.size()+");\n";
									}
								}else if(floorflag == 3){
									pictureLeft(pictwallexhflag);
									if(scene.equals("museum")){
										if(pictwallexhflag == 1){
											b+="		       	        		turnarray.Add(6);\n";
										}else if(pictwallexhflag == 2){
											b+="		       	        		turnarray.Add(18);\n";
										}
									}else if(VRManager.VRmoduleflag){
										b+="		       	        		turnarray.Add("+zcoor.size()+");\n";
									}
								}
								pictureRight(pictwallexhflag);
							}
						}
					}
			b+="				        	}\n";
		}
		
		b+="				          	if (childNode.HasChildNodes == true) {\n";
		b+="					            for (int i=0; i < childNode.ChildNodes.Count; i++) {\n";
		b+="					              	XmlNode dataNode2= childNode.ChildNodes[i]; //dataNode.Nameは二個目のcategory\n";
		b+="\n";
		b+="									if (dataNode2.HasChildNodes == true) {//n2 change\n";
		b+="									    for (int k=0; k < dataNode2.ChildNodes.Count; k++) {\n";
		b+="									      	XmlNode dataNode= dataNode2.ChildNodes[k]; \n";
		b+="\n";
		if(pictflag || wallflag){
			b+="						     		        for (int j1=0, j=0, j2=0, j3=0; j1 < dataNode.ChildNodes.Count; j1++) {//image\n";
			b+="			\n";
			b+="						     		       		if(elemList3[num].InnerXml == \"floor\"){//image,wall   \n";		
		}else{
			b+="											for (int j=0; j < dataNode.ChildNodes.Count; j++) {//element\n";
		}
		b+="\n";
		b+="												array[j] = Instantiate(Resources.Load(elemList1[num].InnerXml)) as GameObject;\n";
		
	}
	
	
	private static void pictureFront(int exhflag){
		b+=	"			     				imagex.AddRange(fbx);\n";
		b+=	"			     				imagez.AddRange(frontz);\n";
		b+=	"			     				turny.Add(180);\n";
		if(exhflag == 2){
			b+=	"			     				imagey.AddRange(fby);\n";
		}
	}
	private static void pictureBack(int exhflag){
		b+=	"			     				imagex.AddRange(fbx);\n";
		b+=	"			     				imagez.AddRange(backz);\n";
		b+=	"			     				turny.Add(0);\n";
		if(exhflag == 2){
			b+=	"			     				imagey.AddRange(fby);\n";
		}
	}
	private static void pictureLeft(int exhflag){
		b+="			     				imagex.AddRange(leftx);\n";
		b+=	"			     				imagez.AddRange(rlz);\n";
		b+=	"			     				turny.Add(-90.1f);\n";
		if(exhflag == 2){
			b+=	"			     				imagey.AddRange(rly);\n";
		}
	}
	private static void pictureRight(int exhflag){
		b+=	"			     				imagex.AddRange(rightx);\n";
		b+=	"			     				imagez.AddRange(rlz);\n";
		b+=	"			     				turny.Add(90.1f);\n";
		if(exhflag == 2){
			b+=	"			     				imagey.AddRange(rly);\n";
		}
	}
	
	private static void getCS4_1(int exhflag){
		if(exhflag == 1){
			if(scene.equals("museum")){
				b+="												r = j/9;\n";
			}else if(VRManager.VRmoduleflag){
				double i = Math.floor((room_sizex-10) / Integer.parseInt(exh_distancex)) + 1;
				//module 40=x軸の部屋の大きさ-10　iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
				int j = (int)i;
				b+="												r = j/"+j+";\n";				
			}
		}else if(exhflag == 3){
			if(scene.equals("museum")){
				b+="												r = j/5; \n";		
			}else if(VRManager.VRmoduleflag){
				double i = Math.floor((room_sizez-10) / Integer.parseInt(exh_distancez)) + 1;
				//module 20=z軸の部屋の大きさ-10　iはその軸方向に並べる展示物の数 Math.floorで小数点以下切り捨て
				int j = (int)i;
				b+="												r = j/"+j+"; \n";						
			}
		}
		b+="						\n";
	}
	
	private static void compgetCS4_1(int compx, int compy, int compz, int compflag){
		if(compflag == 1){
			b+="												r = j/"+ compx +";\n";
		}else if(compflag == 2){
			b+="												r = j/"+ compy +";\n";
		}else if(compflag == 3){
			b+="												r = j/"+ compz +";\n";
		}
		b+="						\n";
	}
		
	private static void getCS4_2(int exhflag, int floorflag, int groupcount){
		if(exhflag == 1){
			if(floorflag == 1){
				b+="													array[j].transform.position  = new Vector3 (xarray[j]+objx, objhigh, zarray[r]);\n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(xarray[j]+objx, standhigh, zarray[r]);  \n";
				b+="													\n";
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f+objx, standhigh+1.4f, zarray[r]+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3(xarray[j]+"+0.5*(stand_sizex/1.3)+"f+objx, standhigh+"+1.6*(stand_sizey/2)+"f, zarray[r]+0.7f);  \n";
				}
			}else if(floorflag ==2){
				b+="													array[j].transform.position  = new Vector3 (xarray[j], objhigh, zarray[r]); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(xarray[j], standhigh, zarray[r]);  \n";
				b+="													\n";
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f, standhigh+1.4f, zarray[r]+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3(xarray[j]+"+0.5*(stand_sizex/1.3)+"f, standhigh+"+1.6*(stand_sizey/2)+"f, zarray[r]+0.7f);  \n";
				}

			}else if(floorflag == 3){
				b+="													array[j].transform.position  = new Vector3 (xarray[j], objhigh, zarray[r]+objz); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(xarray[j], standhigh, zarray[r]+objz); \n";
				b+="													\n";
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f, standhigh+1.4f, zarray[r]+objz+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3(xarray[j]+"+0.5*(stand_sizex/1.3)+"f, standhigh+"+1.6*(stand_sizey/2)+"f, zarray[r]+objz+0.7f);  \n";
				}			
			}
	
		}else if(exhflag == 2){
			if(floorflag == 1){
				b+="													array[j].transform.position  = new Vector3 (objx, objhigh+(int)yarray[j], 0); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(objx, standhigh, 0);  \n";
				b+="			\n";	
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(0.5f+objx, standhigh+1.4f+(int)yarray[j], 0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3("+0.5*(stand_sizex/1.3)+"f+objx, standhigh+"+1.6*(stand_sizey/2)+"f+(int)yarray[j], 0.7f);  \n";
				}
			}else if(floorflag == 2){
				b+="													array[j].transform.position  = new Vector3 (0, objhigh+(int)yarray[j], 0); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(0, standhigh, 0);  \n";
				b+="			\n";	
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(0.5f, standhigh+1.4f+(int)yarray[j], 0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3("+0.5*(stand_sizex/1.3)+"f, standhigh+"+1.6*(stand_sizey/2)+"f+(int)yarray[j], 0.7f);  \n";
				}

			}else if(floorflag == 3){
				b+="													array[j].transform.position  = new Vector3 (0, objhigh+(int)yarray[j], objz); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(0, standhigh, objz);  \n";
				b+="			\n";	
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(0.5f, standhigh+1.4f+(int)yarray[j], objz+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3("+0.5*(stand_sizex/1.3)+"f, standhigh+"+1.6*(stand_sizey/2)+"f+(int)yarray[j], objz+0.7f);  \n";
				}
			}
		}else if(exhflag == 3){
			if(floorflag == 1){
				b+="													array[j].transform.position  = new Vector3 (xarray[r]+objx, objhigh, zarray[j]); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(xarray[r]+objx, standhigh, zarray[j]);  \n";
				b+="			\n";	
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(xarray[r]+0.5f+objx, standhigh+1.4f, zarray[j]+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3(xarray[r]+"+0.5*(stand_sizex/1.3)+"f+objx, standhigh+"+1.6*(stand_sizey/2)+"f, zarray[j]+0.7f);  \n";
				}
			}else if(floorflag == 2){
				b+="													array[j].transform.position  = new Vector3 (xarray[r], objhigh, zarray[j]); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(xarray[r], standhigh, zarray[j]);  \n";
				b+="			\n";	
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(xarray[r]+0.5f, standhigh+1.4f, zarray[j]+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3(xarray[r]+"+0.5*(stand_sizex/1.3)+"f, standhigh+"+1.6*(stand_sizey/2)+"f, zarray[j]+0.7f);  \n";
				}

			}else if(floorflag == 3){
				b+="													array[j].transform.position  = new Vector3 (xarray[r], objhigh, zarray[j]+objz); \n";
				b+="\n";	
				b+="													//stand生成 \n";
				b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
				b+="													stand.transform.position= new Vector3(xarray[r], standhigh, zarray[j]+objz);  \n";
				b+="			\n";	
				b+="													//オブジェクトのテキスト生成 \n";
				b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
				b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
				b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
				b+="													messageText.transform.Rotate(0,180,0); \n";
				if(scene.equals("museum")){
					b+="													messageText.transform.position= new Vector3(xarray[r]+0.5f, standhigh+1.4f, zarray[j]+objz+0.7f);  \n";
				}else if(VRManager.VRmoduleflag){
					b+="													messageText.transform.position= new Vector3(xarray[r]+"+0.5*(stand_sizex/1.3)+"f, standhigh+"+1.6*(stand_sizey/2)+"f, zarray[j]+objz+0.7f);  \n";
				}			
			}
		}	
		b+="													messageText.transform.localScale = new Vector3(0.22f, 0.22f, 0.22f); \n";
		if(VRManager.VRmoduleflag)
			b += "													stand.transform.localScale = new Vector3("+stand_sizex+"f, "+stand_sizey+"f, "+stand_sizez+"f); \n";
		b += "\n";
		b+="													array[j].transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="													stand.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="													messageText.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="													array[j].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
		b+="													stand.transform.position  += new Vector3 (exhmovex, 0, exhmovez); \n";
		b+="													messageText.transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez); 	\n";
		
		if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
			for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
				b+="													array[j].transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				b+="													stand.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				b+="													messageText.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
			}
		}
		b += "	 											}\n";/////[name,name]end
	}
		
	private static void compgetCS4_2(int floorflag, int compx, int compy, int compz, int compflag, int groupcount){//2番目のTFEとfloorで場合分け	
		b+="													//stand生成 \n";
		b+="													GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
		b+="			\n";	
		b+="													//オブジェクトのテキスト生成 \n";
		b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
		b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
		b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
		b+="													messageText.transform.Rotate(0,180,0); \n";
		b+="													messageText.transform.localScale = new Vector3(0.22f, 0.22f, 0.22f); \n";
		b+="\n";
		if(floorflag == 1){
			if(compx != 0 && compflag != 1){//2番目
				b+="													array[j].transform.position  = new Vector3 (xarray[r]+objx, objhigh+yarray[j], zarray[j]); \n";
				b+="													stand.transform.position= new Vector3(xarray[r]+objx, standhigh, zarray[j]);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[r]+0.5f+objx, standhigh+1.4f+yarray[j], zarray[j]+0.7f);  \n";
			}else if(compy != 0 && compflag != 2){
				b+="													array[j].transform.position  = new Vector3 (xarray[j]+objx, objhigh+yarray[r], zarray[j]); \n";
				b+="													stand.transform.position= new Vector3(xarray[j]+objx, standhigh, zarray[j]);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f+objx, standhigh+1.4f+yarray[r], zarray[j]+0.7f);  \n";
			}else if(compz != 0 && compflag != 3){
				b+="													array[j].transform.position  = new Vector3 (xarray[j]+objx, objhigh+yarray[j], zarray[r]); \n";
				b+="													stand.transform.position= new Vector3(xarray[j]+objx, standhigh, zarray[r]);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f+objx, standhigh+1.4f+yarray[j], zarray[r]+0.7f);  \n";
			}
		}else if(floorflag == 2){
			if(compx != 0 && compflag != 1){//2番目
				b+="													array[j].transform.position  = new Vector3 (xarray[r], objhigh+yarray[j], zarray[j]); \n";
				b+="													stand.transform.position= new Vector3(xarray[r], standhigh, zarray[j]);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[r]+0.5f, standhigh+1.4f+yarray[j], zarray[j]+0.7f);  \n";
			}else if(compy != 0 && compflag != 2){
				b+="													array[j].transform.position  = new Vector3 (xarray[j], objhigh+yarray[r], zarray[j]); \n";
				b+="													stand.transform.position= new Vector3(xarray[j], standhigh, zarray[j]);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f, standhigh+1.4f+yarray[r], zarray[j]+0.7f);  \n";
			}else if(compz != 0 && compflag != 3){
				b+="													array[j].transform.position  = new Vector3 (xarray[j], objhigh+yarray[j], zarray[r]); \n";
				b+="													stand.transform.position= new Vector3(xarray[j], standhigh, zarray[r]);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f, standhigh+1.4f+yarray[j], zarray[r]+0.7f);  \n";
			}
		}else if(floorflag == 3){
			if(compx != 0 && compflag != 1){//2番目
				b+="													array[j].transform.position  = new Vector3 (xarray[r], objhigh+yarray[j], zarray[j]+objz); \n";
				b+="													stand.transform.position= new Vector3(xarray[r], standhigh, zarray[j]+objz);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[r]+0.5f, standhigh+1.4f+yarray[j], zarray[j]+objz+0.7f);  \n";
			}else if(compy != 0 && compflag != 2){
				b+="													array[j].transform.position  = new Vector3 (xarray[j], objhigh+yarray[r], zarray[j]+objz); \n";
				b+="													stand.transform.position= new Vector3(xarray[j], standhigh, zarray[j]+objz);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f, standhigh+1.4f+yarray[r], zarray[j]+objz+0.7f);  \n";
			}else if(compz != 0 && compflag != 3){
				b+="													array[j].transform.position  = new Vector3 (xarray[j], objhigh+yarray[j], zarray[r]+objz); \n";
				b+="													stand.transform.position= new Vector3(xarray[j], standhigh, zarray[r]+objz);  \n";
				b+="													messageText.transform.position= new Vector3(xarray[j]+0.5f, standhigh+1.4f+yarray[j], zarray[r]+objz+0.7f);  \n";
			}
		}	
		b += "\n";
		b+="													array[j].transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="													stand.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="													messageText.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="													array[j].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
		b+="													stand.transform.position  += new Vector3 (exhmovex, 0, exhmovez); \n";
		b+="													messageText.transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez); 	\n";
		if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
			for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
				b+="													array[j].transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				b+="													stand.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				b+="													messageText.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
			}
		}
		b += "	 											}\n";/////[name,name]end
	}
	
	private static void arbitraryCS4_2(int groupcount){
		b+="						\n";
		if(scene.equals("museum")){
			b+="	 												array[j].transform.position  = new Vector3 (markx[manum]+objx, marky[manum]+1.55f, markz[manum]);\n";
		}else if(VRManager.VRmoduleflag){
			b+="	 												array[j].transform.position  = new Vector3 (markx[manum]+objx, marky[manum]+"+1.55*(stand_sizey/2)+"f, markz[manum]);\n";
		}
		b+="	 												//stand生成 \n";
		b+="	 												GameObject stand = Instantiate(Resources.Load(\""+template_stand+"/Stand\")) as GameObject; \n";
		b+="	 												stand.transform.position = new Vector3(markx[manum]+objx, marky[manum], markz[manum]);\n";
		b+="\n";
		b+="	 												//オブジェクトのテキスト生成 \n";
		b+="	 												GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
		b+=" 													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify \n";
		b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
		b+="	 												messageText.transform.Rotate(0,180,0); \n";
		if(scene.equals("museum")){
			b+="	 												messageText.transform.position= new Vector3(markx[manum]+0.5f+objx, marky[manum]+1.4f, markz[manum]+0.7f);\n";
		}else if(VRManager.VRmoduleflag){
			b+="	 												messageText.transform.position= new Vector3(markx[manum]+"+0.5*(stand_sizex/1.3)+"f+objx, marky[manum]+"+1.4*(stand_sizey/2)+"f, markz[manum]+0.7f);\n";
		}
		b+="	 												messageText.transform.localScale = new Vector3(0.22f, 0.22f, 0.22f); \n";
		b+="	 												if(manum == markx.Length-1){\n";
		b+="	 													manum = 0;\n";
		b+="	 												}else{\n";
		b+="	 													manum++;\n";
		b+="	 												}\n";
		b+="\n";
		b+="	 												array[j].transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="	 												stand.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="	 												messageText.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		b+="	 												array[j].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
		b+="	 												stand.transform.position  += new Vector3 (exhmovex, 0, exhmovez); \n";
		b+="	 												messageText.transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
		if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
			for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
				b+="													array[j].transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				b+="													stand.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				b+="													messageText.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
			}
		}
	}

	private static void getCS5_1(boolean pictflag, boolean wallflag, int floorflag, int pictexhflag, int wallexhflag, int groupcount){
		int pictwallexhflag = 0;
		if(pictexhflag != 0){
			pictwallexhflag = pictexhflag;
		}else if(wallexhflag != 0){
			pictwallexhflag = wallexhflag;
		}
		b += "\n";
		b += "												size = Get(array[j]);\n";
		b += "												array[j].AddComponent<Rigidbody>();\n";
		b += "												rigid = array[j].GetComponent<Rigidbody>();\n";
		b += "												if (rigid) {\n";
		b += "												     rigid.constraints = RigidbodyConstraints.FreezeAll;\n";
		b += "												}\n";
		b += "												array[j].tag = \"GameController\";\n";
		b += "												array[j].AddComponent<BoxCollider>();\n";
		b += "\n";
		b += "												float mx = array[j].transform.localScale.x;\n";
		b += "												float my = array[j].transform.localScale.y;\n";
		b += "												float mz = array[j].transform.localScale.z;\n";

		b += "												float nx = size.x;\n";
		b += "												float ny = size.y;\n";
		b += "												float nz = size.z;\n";
		b += "												\n";
		b += "												float max = nx;\n";
		b += "												if(max < ny){\n";
		b += "													max = ny;\n";
		b += "												}\n";
		b += "												if(max < nz){\n";
		b += "													max = nz;\n";
		b += "												}\n";
		if(scene.equals("museum")){
			b += "												float rate = 1.2f / max;\n";
		}else if(VRManager.VRmoduleflag){
			float min_stand = stand_sizez;
			if(stand_sizex < stand_sizez)
				min_stand = stand_sizex;//展示台の短い方に展示物のサイズを合わせる
			b += "												float rate = ("+min_stand+"f-0.1f) / max;\n";
			b += "												\n";
		}
		b += "												array[j].transform.localScale = new Vector3(mx*rate, my*rate, mz*rate); \n";
		b += "												num++;\n";
		if(pictflag){
			b+="													j++;\n";
			b+="												}else{\n";//image pictureタグがYesの時 j2は1部屋あたりの画像数だけど、2週目には0にリセット
			b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
			b+="													int a;\n";
			b+="													for(a = 0; a<work_image.Length; a++){\n";
			b+="														if(work_image[a].name == elemList1[num].InnerXml){\n";
			b+="														break;\n";
			b+="														}\n";
			b+="													}\n";
			b+="				\n";
			if(pictwallexhflag == 1){
				b+="													if(j2 >= imagex.Count){\n";
				if(scene.equals("museum")){
					b+="														imagey += 5;\n";
				}else if(VRManager.VRmoduleflag){
					b+="														imagey += "+ wallexh_distancey +"f;\n";
				}
				b+="														j2 = 0;	\n";
				b+="													}\n";
			}
			b+="					\n";
			b+="													if(j2 < turnarray[0]){//一番はじめの面で回転しているy度数 1面目\n";
			b+="														work_image[a].transform.Rotate(0,turny[0],0); \n";
			b+="														messageText.transform.Rotate(0,turny[0],0); 	\n";
			b+="													}\n";
			b+="\n";
			b+="													if(turnarray.Count == 1){//2面ある時\n";
			b+="														if(j2 >= turnarray[0]){//2面目\n";
			b+="															work_image[a].transform.Rotate(0,turny[1],0); \n";
			b+="															messageText.transform.Rotate(0,turny[1],0); 		\n";
			b+="														}\n";
			b+="													}else if(turnarray.Count == 2){//3面ある時\n";
			b+="														if(j2 >= turnarray[0] && j2 < turnarray[1]){//2面目\n";
			b+="															work_image[a].transform.Rotate(0,turny[1],0); \n";
			b+="															messageText.transform.Rotate(0,turny[1],0); 		\n";
			b+="														}\n";
			b+="														if(j2 >= turnarray[1]){//3面目\n";
			b+="															work_image[a].transform.Rotate(0,turny[2],0); \n";
			b+="															messageText.transform.Rotate(0,turny[2],0); \n";
			b+="														}\n";
			b+="													}else if(turnarray.Count == 3){//4面ある時\n";
			b+="														if(j2 >= turnarray[0] && j2 < turnarray[1]){//2面目\n";
			b+="															work_image[a].transform.Rotate(0,turny[1],0); \n";
			b+="															messageText.transform.Rotate(0,turny[1],0); 		\n";
			b+="														}\n";
			b+="														if(j2 >= turnarray[1] && j2 < turnarray[2]){//3面目\n";
			b+="															work_image[a].transform.Rotate(0,turny[2],0); \n";
			b+="															messageText.transform.Rotate(0,turny[2],0); \n";
			b+="														}\n";
			b+="														if(j2 >= turnarray[2]){//4面目\n";
			b+="															work_image[a].transform.Rotate(0,turny[3],0); \n";
			b+="															messageText.transform.Rotate(0,turny[3],0); \n";
			b+="														}\n";
			b+="													}\n";
			b+="				\n";	
			b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" );\n";
			b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
			b+="													messageText.transform.Rotate(0,180,0); \n";
			if(pictwallexhflag == 1){	
				if(floorflag == 1){
					b+="													work_image[a].transform.position  = new Vector3 (imagex[j2]+objx, imagey, imagez[j2]);\n";
					b+="													messageText.transform.position = new Vector3 (imagex[j2]+objx, imagey-1, imagez[j2]);  \n";
				}else if(floorflag == 2){
					b+="													work_image[a].transform.position  = new Vector3 (imagex[j2], imagey+(objhigh-2.8f), imagez[j2]);\n";
					b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey+(objhigh-3.8f), imagez[j2]);\n";
				}else if(floorflag == 3){	
					b+="													work_image[a].transform.position  = new Vector3 (imagex[j2], imagey, imagez[j2]+objz);\n";
					b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey-1, imagez[j2]+objz);  \n";
				}
			}else if(pictwallexhflag == 2){
				if(floorflag == 1){
					b+="													work_image[a].transform.position  = new Vector3 (imagex[j2]+objx, imagey[j2], imagez[j2]);\n";
					b+="													messageText.transform.position = new Vector3 (imagex[j2]+objx, imagey[j2]-1, imagez[j2]);  \n";
				}else if(floorflag == 2){
					b+="													work_image[a].transform.position  = new Vector3 (imagex[j2], imagey[j2]+(objhigh-2.8f), imagez[j2]);\n";
					b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey[j2]+(objhigh-3.8f), imagez[j2]);\n";
				}else if(floorflag == 3){	
					b+="													work_image[a].transform.position  = new Vector3 (imagex[j2], imagey[j2], imagez[j2]+objz);\n";
					b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey[j2]-1, imagez[j2]+objz);  \n";
				}
			}
			
			b+="													messageText.transform.localScale = new Vector3(0.22f, 0.22f, 0.22f); \n";
			b+="													messageText.GetComponent<Renderer>().material.color = Color.black;\n";
			b+="\n";
			b+="													work_image[a].transform.position  += new Vector3 (billmovex, billmovey, billmovez);\n";
			b+="													messageText.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			b+="													work_image[a].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
			b+="													messageText.transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
			if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
				for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
					b+="													work_image[a].transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
					b+="													messageText.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				}
			}
			
			b+="\n";
			b+="													num++;		\n";
			b+="													j2++;\n";
			b+="												}\n";
		}
		if(wallflag){
			b+="												j++;\n";
			b+="												}else{\n";
			b+="													GameObject  messageText = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
			b+="													wallarray[j3] = Instantiate(Resources.Load(elemList1[num].InnerXml)) as GameObject;\n";
			b+="													GameObject wallstand = Instantiate(Resources.Load(\""+template_wallstand+"/WallStand\")) as GameObject;//WallCase生成 \n";
			b+="\n";
			
			if(pictwallexhflag == 1){
				b+="													if(j2 >= imagex.Count){\n";
				if(scene.equals("museum")){
					b+="														imagey += 5;\n";
				}else if(VRManager.VRmoduleflag){
					b+="														imagey += "+ wallexh_distancey +"f;\n";
				}
				b+="														j2 = 0;	\n";
				b+="													}\n";
			}
			
			
			b+="\n";											
			b+="													if(j2 < turnarray[0]){//一番はじめの面で回転しているy度数 1面目\n";
			b+="														Quaternion q = Quaternion.Euler(0f, turny[0], 0f);\n";
			b+="														wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation;\n";
			b+="														wallstand.transform.Rotate(0,turny[0],0); \n";
			b+="														messageText.transform.Rotate(0,turny[0],0); 	\n";
			b+="													}\n";
			b+="\n";
			b+="													if(turnarray.Count == 1){//2面ある時\n";
			b+="														if(j2 >= turnarray[0]){//2面目\n";
			b+="															Quaternion q = Quaternion.Euler(0f, turny[1], 0f);\n";
			b+="															wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation;\n";
			b+="															wallstand.transform.Rotate(0,turny[1],0); \n";
			b+="															messageText.transform.Rotate(0,turny[1],0); 	\n";	
			b+="														}\n";
			b+="													}else if(turnarray.Count == 2){//3面ある時\n";
			b+="														if(j2 >= turnarray[0] && j2 < turnarray[1]){//2面目\n";
			b+="															Quaternion q = Quaternion.Euler(0f, turny[1], 0f);\n";
			b+="															wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation;\n";
			b+="															wallstand.transform.Rotate(0,turny[1],0); \n";
			b+="															messageText.transform.Rotate(0,turny[1],0); 	\n";	
			b+="														}\n";
			b+="														if(j2 >= turnarray[1]){//3面目\n";
			b+="															Quaternion q = Quaternion.Euler(0f, turny[2], 0f);\n";
			b+="															wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation;\n";
			b+="															wallstand.transform.Rotate(0,turny[2],0); \n";
			b+="															messageText.transform.Rotate(0,turny[2],0); \n";
			b+="														}\n";
			b+="													}else if(turnarray.Count == 3){//4面ある時\n";
			b+="														if(j2 >= turnarray[0] && j2 < turnarray[1]){//2面目\n";
			b+="															Quaternion q = Quaternion.Euler(0f, turny[1], 0f);\n";
			b+="															wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation;\n";
			b+="															wallstand.transform.Rotate(0,turny[1],0); \n";
			b+="															messageText.transform.Rotate(0,turny[1],0); 	\n";	
			b+="														}\n";
			b+="														if(j2 >= turnarray[1] && j2 < turnarray[2]){//3面目\n";
			b+="															Quaternion q = Quaternion.Euler(0f, turny[2], 0f);\n";
			b+="															wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation;\n";
			b+="															wallstand.transform.Rotate(0,turny[2],0); \n";
			b+="															messageText.transform.Rotate(0,turny[2],0); \n";
			b+="														}\n";
			b+="														if(j2 >= turnarray[2]){//4面目\n";
			b+="															Quaternion q = Quaternion.Euler(0f, turny[3], 0f);\n";
			b+="															wallarray[j3].transform.rotation = q * wallarray[j3].transform.rotation; \n";
			b+="															wallstand.transform.Rotate(0,turny[3],0); \n";
			b+="															messageText.transform.Rotate(0,turny[3],0); \n";
			b+="														}\n";
			b+="													}\n";
			b+="\n";
			b+="													messageText.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" );\n";
			b+="													messageText.GetComponent<TextMesh>().text = elemList2[num].InnerXml.ToString(); \n";
			b+="													messageText.transform.Rotate(0,180,0); \n";
				
			if(scene.equals("museum")){
				if(pictwallexhflag == 1){
					if(floorflag == 1){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2]+objx, imagey-1, imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2]+objx, imagey, imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2]+objx, imagey-1, imagez[j2]);  \n";
					}else if(floorflag == 2){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey+(objhigh-2.8f)-1, imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey+(objhigh-2.8f), imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey+(objhigh-3.8f)-1, imagez[j2]);\n";
					}else if(floorflag == 3){	
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey-1, imagez[j2]+objz);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey, imagez[j2]+objz);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey-1, imagez[j2]+objz);  \n";
					}
				}else if(pictwallexhflag == 2){
					if(floorflag == 1){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2]+objx, imagey[j2]-1, imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2]+objx, imagey[j2], imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2]+objx, imagey[j2]-1, imagez[j2]);  \n";
					}else if(floorflag == 2){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey[j2]+(objhigh-2.8f)-1, imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey[j2]+(objhigh-2.8f), imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey[j2]+(objhigh-3.8f)-1, imagez[j2]);\n";
					}else if(floorflag == 3){	
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey[j2]-1, imagez[j2]+objz);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey[j2], imagez[j2]+objz);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey[j2]-1, imagez[j2]+objz);  \n";
					}
				}
				b+="													wallstand.transform.localScale = new Vector3(2, 2, 2); \n";
				b+="													if(imagex[j2] == rightx[0]){\n";
				b+="														messageText.transform.position  += new Vector3 (1,0,0); \n";
				b+="													}else if(imagex[j2] == leftx[0]){\n";
				b+="														messageText.transform.position  -= new Vector3 (1,0,0); \n";
				b+="													}\n";
				b+="													if(imagez[j2] == frontz[0]){\n";
				b+="														messageText.transform.position  -= new Vector3 (0,0,1); \n";
				b+="													}else if(imagez[j2] == backz[0]){\n";
				b+="														messageText.transform.position  += new Vector3 (0,0,1); \n";
			}else if(VRManager.VRmoduleflag){
				if(pictwallexhflag == 1){
					if(floorflag == 1){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2]+objx, imagey+("+wallexh_high+"f), imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2]+objx, imagey, imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2]+objx, imagey+("+wallexh_high+"f), imagez[j2]);  \n";
					}else if(floorflag == 2){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey+(objhigh-"+moduleobjhigh+"f)+("+wallexh_high+"f), imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey+(objhigh-"+moduleobjhigh+"f), imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey+(objhigh+"+(wallexh_high+moduleobjhigh-stand_sizey/2)+"f)+("+wallexh_high+"f), imagez[j2]);\n";
					}else if(floorflag == 3){	
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey+("+wallexh_high+"f), imagez[j2]+objz);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey, imagez[j2]+objz);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey+("+wallexh_high+"f), imagez[j2]+objz);  \n";
					}
				}else if(pictwallexhflag == 2){
					if(floorflag == 1){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2]+objx, imagey[j2]+("+wallexh_high+"f), imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2]+objx, imagey[j2], imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2]+objx, imagey[j2]+("+wallexh_high+"f), imagez[j2]);  \n";
					}else if(floorflag == 2){
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey[j2]+(objhigh-"+moduleobjhigh+"f)+("+wallexh_high+"f), imagez[j2]);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey[j2]+(objhigh-"+moduleobjhigh+"f), imagez[j2]);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey[j2]+(objhigh+"+(wallexh_high+moduleobjhigh-stand_sizey/2)+"f)+("+wallexh_high+"f), imagez[j2]);\n";
					}else if(floorflag == 3){	
						b+="													wallarray[j3].transform.position  = new Vector3 (imagex[j2], imagey[j2]+("+wallexh_high+"f), imagez[j2]+objz);\n";
						b+="													wallstand.transform.position  = new Vector3 (imagex[j2], imagey[j2], imagez[j2]+objz);\n";
						b+="													messageText.transform.position = new Vector3 (imagex[j2], imagey[j2]+("+wallexh_high+"f), imagez[j2]+objz);  \n";
					}
				}
				b+="													wallstand.transform.localScale = new Vector3("+wallstand_sizex+"f, "+wallstand_sizey+"f, "+wallstand_sizez+"f); \n";
				b+="													if(imagex[j2] == rightx[0]){\n";
				b+="														messageText.transform.position  += new Vector3 ("+wallstand_sizex/2+"f,0,0); \n";
				b+="													}else if(imagex[j2] == leftx[0]){\n";
				b+="														messageText.transform.position  -= new Vector3 ("+wallstand_sizex/2+"f,0,0); \n";
				b+="													}\n";
				b+="													if(imagez[j2] == frontz[0]){\n";
				b+="														messageText.transform.position  -= new Vector3 (0,0,"+wallstand_sizez/2+"f); \n";
				b+="													}else if(imagez[j2] == backz[0]){\n";
				b+="														messageText.transform.position  += new Vector3 (0,0,"+wallstand_sizez/2+"f); \n";
			}
			
			b+="													}\n";
			b+="\n";
			b+="													messageText.transform.localScale = new Vector3(0.22f, 0.22f, 0.22f); \n";
			b+="													messageText.GetComponent<Renderer>().material.color = Color.black;\n";
			b+="\n";
			b+="													wallarray[j3].transform.position  += new Vector3 (billmovex, billmovey, billmovez);\n";
			b+="													wallstand.transform.position  += new Vector3 (billmovex, billmovey, billmovez);\n";
			b+="													messageText.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			b+="													wallarray[j3].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
			b+="													wallstand.transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
			b+="													messageText.transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);\n";
			b+="\n";
			if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
				for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
					b+="													wallarray[j3].transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
					b+="													wallstand.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
					b+="													messageText.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				}
			}
			b+="\n";
			b+="													size = Get(wallarray[j3]);\n";
			b+="													wallarray[j3].AddComponent<Rigidbody>();\n";
			b+="													rigid = wallarray[j3].GetComponent<Rigidbody>();\n";
			b+="													if (rigid) {\n";
			b+="														rigid.constraints = RigidbodyConstraints.FreezeAll;\n";
			b+="													}\n";
			b+="													wallarray[j3].tag = \"GameController\";\n";
			b+="													wallarray[j3].AddComponent<BoxCollider>();\n";
			b+="\n";	
			b+="													float mx = wallarray[j3].transform.localScale.x;\n";
			b+="													float my = wallarray[j3].transform.localScale.y;\n";
			b+="													float mz = wallarray[j3].transform.localScale.z;\n";
			b+="													float nx = size.x;\n";
			b+="													float ny = size.y;\n";
			b+="													float nz = size.z;\n";
			b+="\n";
			b+="													float max = nx;\n";
			b+="													if(max < ny){\n";
			b+="														max = ny;\n";
			b+="													}\n";
			b+="													if(max < nz){\n";
			b+="														max = nz;\n";
			b+="													}\n";
			
			if(scene.equals("museum")){
				b+="													float rate = 1 / max;\n";
			}else if(VRManager.VRmoduleflag){
				float max = wallstand_sizex;
				if(max < wallstand_sizey){
					max  = wallstand_sizey;
				}
				if(max < wallstand_sizez){
					max  = wallstand_sizez;
				}
				b+="													float rate = "+max/2+"f / max;\n";
			}
			b+="													wallarray[j3].transform.localScale = new Vector3(mx*rate, my*rate, mz*rate); \n";
			b+="\n";
			b+="													num++;		\n";
			b+="													j2++;\n";
			b+="													j3++;\n";
			b+="												}\n";
		}
		
		b += "											} \n";
	}
	

	
	
	private static String getCS5_2(){
		return
"										} \n"+
"									} \n"+
"								} \n"+
"							} \n"+
"							childNode = childNode.NextSibling; \n"+
"							exhmovex = 0f;\n"+
"							exhmovey = 0f;\n"+
"							exhmovez = 0f;\n"+
"							exhmoveflag = 0;\n";
	}
	private static void getCS6(int floorflag){
		if(floorflag == 1){
			if(scene.equals("museum")){
				b += "							objx += -50;//museumchange\n";
			}else if(VRManager.VRmoduleflag){
				b += "							objx += -room_sizex;//museumchange\n";			
			}
		}else if(floorflag ==2){
			if(scene.equals("museum")){
				b +="							objhigh += 20.0f;\n";
				b +="	     			       	standhigh += 20.0f;\n";
			}else if(VRManager.VRmoduleflag){
				b +="							objhigh += room_sizey;\n";
				b +="	     			       	standhigh += room_sizey;\n";
			}
		}else if(floorflag == 3){
			if(scene.equals("museum")){
				b +="							objz += -30;//museumchange\n";
			}else if(VRManager.VRmoduleflag){
				b +="							objz += -room_sizez;//museumchange\n";
			}
		}
				b +="						}	\n";
				b +="					}\n";				
	}


	private static void getCS7(int floorflag, String prejoin, String afterjoin, int groupcount){
		//doors
		if(VRcjoinarray.gLemaxlist.get(groupcount) == 2){
			if("entrance".equals(prejoin) || "".equals(prejoin)){
				b +="						GameObject doors= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_entrance\n";
				if(scene.equals("museum")){
					b +="					doors.transform.position= new Vector3(0, 5, 15.2f);\n";
				}else if(VRManager.VRmoduleflag){
					b +="					doors.transform.position= new Vector3(0, room_sizey/4.0f, room_sizez/2.0f+0.2f);\n";
					b +="					doors.transform.localScale = new Vector3(10.3f*xscale, 10*yscale, 0.5f);\n";
//					b +="					doors.transform.localScale = new Vector3(5*xscale, 3.6f*yscale, 1);\n";
				}
					b +="					doors.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			}
		}
						
			if(floorflag == 1){///////////////////////////////////////////////////////////////////////////////////////
				b  += "					//museum生成\n";
				b  += "					for(int i=0; i<museumcount; i++){	\n";
				if(VRAttribute.Nopen[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1] == 1){
					b  += "						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/OpenMuseum\")) as GameObject;\n";
				}else{
					b  += "						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/DoorMuseum\")) as GameObject;\n";
				}
				if(scene.equals("museum")){
					b  += "						museum.transform.position = new Vector3(-50*i, 0, 0);\n" ;
				}else if(VRManager.VRmoduleflag){
					b  += "						museum.transform.position = new Vector3(-room_sizex*i, 0, 0);\n";
					b  += "						museum.transform.localScale = new Vector3(xscale,yscale,zscale);\n";
				}
				b  += "						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
				if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
					for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
						b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
					}
				}
				if(VRManager.VRmoduleflag){
					b  += "						GameObject　light = museum.transform.Find(\"Directional light\").gameObject;\n";
					b  += "						light.GetComponent<Light>().color  = new Color("+light_r+"f/255f, "+light_g+"f/255f, "+light_b+"f/255f, 1);\n";
					b  += "						GameObject　light1 = museum.transform.Find(\"Directional light (1)\").gameObject;\n";
					b  += "						light1.GetComponent<Light>().color  = new Color("+light_r+"f/255f, "+light_g+"f/255f, "+light_b+"f/255f, 1);\n";
					b  +="						light.transform.position = new Vector3(-room_sizex*i, 0, 0);\n" ;
					b  +="						light.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					b  +="						light1.transform.position = new Vector3(-room_sizex*i, 0, 0);\n" ;
					b  +="						light1.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
						for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
							b+="						light.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							b+="						light1.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
						}
					}
				}
				b  += "					}\n";				
				
				if(VRcjoinarray.gLemaxlist.get(groupcount) == 2){//N次元
					if(",".equals(prejoin)){
					}else{
						b  +=	"			 		for(int i=0; i<1; i++){	\n";
						b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallx\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum.transform.position= new Vector3(25, 10, 0);\n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum.transform.position= new Vector3(room_sizex/2.0f, room_sizey/2.0f, 0);\n";
							b  +=	"						museum.transform.localScale = new Vector3(xscale*0.5f,yscale*20,zscale*30);\n";
						}
						b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
						b  +=	"					}\n";
					}
					
					b  +=	"					for(int i=0; i<museumcount; i++){	\n";
					if("%".equals(prejoin) || "entrance".equals(prejoin)){b += "					if(i>=1){\n";}
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallz\")) as GameObject;\n";
					if(scene.equals("museum")){
						b  +=	"						museum.transform.position= new Vector3(-50*i,10, 15);\n";
					}else if(VRManager.VRmoduleflag){
						b  +=	"						museum.transform.position= new Vector3(-room_sizex*i, room_sizey/2.0f, room_sizez/2.0f);\n";
						b  += 	"						museum.transform.localScale = new Vector3(xscale*50,yscale*20,zscale*0.5f);\n";
					}
					b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
						for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
							b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
						}
					}
					if("%".equals(prejoin) || "entrance".equals(prejoin)){b += "					}\n";}
					b  +=	"					}\n";
					
					
					b  +=	"					for(int i=0; i<museumcount; i++){	\n";
					if("%".equals(afterjoin) || "exit".equals(afterjoin)){b += "					if(i < museumcount-1){\n";}
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallz\")) as GameObject;\n";
					if(scene.equals("museum")){
						b  +=	"						museum.transform.position= new Vector3(-50*i,10, -15);\n";  
					}else if(VRManager.VRmoduleflag){
						b  +=	"						museum.transform.position= new Vector3(-room_sizex*i, room_sizey/2.0f, -room_sizez/2.0f);\n";  
						b  += 	"						museum.transform.localScale = new Vector3(xscale*50,yscale*20,zscale*0.5f);\n";
					}
					b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
						for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
							b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
						}
					}
					if("%".equals(afterjoin) || "exit".equals(afterjoin)){b += "					}\n";}
					b  +=	"					}\n";
	
					
					if(",".equals(afterjoin)){					
					}else{
						b  +=	"					for(int i=0; i<1; i++){	\n";
						b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallx\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum.transform.position= new Vector3(25-(museumcount)*50,10, 0);\n" ;
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum.transform.position= new Vector3(room_sizex/2.0f-(museumcount)*room_sizex, room_sizey/2.0f, 0);\n";
							b  += 	"						museum.transform.localScale = new Vector3(xscale*0.5f,yscale*20,zscale*30);\n";
						}
						b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
						b  +=	"					}\n";
					}
				}
				
			}else if(floorflag == 2){///////////////////////////////////////////////////////////////////////////////////////
				b  +=	"					//museum生成\n";
				b  +=	"					for(int i=0; i<museumcount; i++){	\n";
				if(VRAttribute.Nopen[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1] == 1){
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/OpenMuseum\")) as GameObject;\n";
				}else{
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/DoorMuseum\")) as GameObject;\n";
				}
				if(scene.equals("museum")){
					b  +=	"						museum.transform.position = new Vector3(0, 20*i, 0); \n";
				}else if(VRManager.VRmoduleflag){
					b  +=	"						museum.transform.position = new Vector3(0, room_sizey*i, 0); \n";
					b  += 	"						museum.transform.localScale = new Vector3(xscale,yscale,zscale);\n";
				}
				b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
				if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
					for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
						b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
					}
				}
				if(VRManager.VRmoduleflag){
					b  += "						GameObject　light = museum.transform.Find(\"Directional light\").gameObject;\n";
					b  += "						light.GetComponent<Light>().color  = new Color("+light_r+"f/255f, "+light_g+"f/255f, "+light_b+"f/255f, 1);\n";
					b  += "						GameObject　light1 = museum.transform.Find(\"Directional light (1)\").gameObject;\n";
					b  += "						light1.GetComponent<Light>().color  = new Color("+light_r+"f/255f, "+light_g+"f/255f, "+light_b+"f/255f, 1);\n";
					b  +="						light.transform.position = new Vector3(0, 20*i, 0); \n";
					b  +="						light.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					b  +="						light1.transform.position = new Vector3(0, 20*i, 0); \n";
					b  +="						light1.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
						for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
							b+="						light.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							b+="						light1.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
						}
					}
					
				}
				b  +=	"\n";
				
				
				if(VRcjoinarray.gLemaxlist.get(groupcount) == 2){//N次元
					if("%".equals(prejoin) || "entrance".equals(prejoin)){b += "					if(i>=1){\n";}
						b  +=	"						GameObject museum1= Instantiate(Resources.Load(\""+ template_scene +"/Wallz\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum1.transform.position = new Vector3(0, 10+20*i, 15);\n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum1.transform.position = new Vector3(0, room_sizey/2.0f+room_sizey*i, room_sizez/2.0f);\n";
							b  += "							museum1.transform.localScale = new Vector3(xscale*50,yscale*20,zscale*0.5f);\n";
						}
						b  +=	"						museum1.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum1.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
	
					if("%".equals(prejoin) || "entrance".equals(prejoin)){b += "					}\n";}
						b  +=	"\n";
	
	
					if("exit".equals(afterjoin)){b += "					if(i < museumcount-1){\n";}
					if("%".equals(afterjoin)){b += "					if(i>=1){\n";}
						b  +=	"						GameObject museum2= Instantiate(Resources.Load(\""+ template_scene +"/Wallz\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum2.transform.position = new Vector3(0, 10+20*i, -15); \n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum2.transform.position = new Vector3(0, room_sizey/2.0f+room_sizey*i, -room_sizez/2.0f); \n";
							b  += "							museum2.transform.localScale = new Vector3(xscale*50,yscale*20,zscale*0.5f);\n";
						}
						b  +=	"						museum2.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum2.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
					if("%".equals(afterjoin) || "exit".equals(afterjoin)){b += "					}\n";}
						b  +=	"\n";
	
	
					if(",".equals(prejoin)){b += "					if(i>=1){\n";}
						b  +=	"						GameObject museum3= Instantiate(Resources.Load(\""+ template_scene +"/Wallx\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum3.transform.position = new Vector3(25, 10+20*i, 0); \n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum3.transform.position = new Vector3(room_sizex/2.0f, room_sizey/2.0f+room_sizey*i, 0); \n";
							b  += "							museum3.transform.localScale = new Vector3(xscale*0.5f,yscale*20,zscale*30);\n";
						}
						b  +=	"						museum3.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum3.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
					if(",".equals(prejoin)){b += "					}\n";}
					b  +=	"\n";
	
	
					if(",".equals(afterjoin)){b += "					if(i>=1){\n";}
						b  +=	"						GameObject museum4= Instantiate(Resources.Load(\""+ template_scene +"/Wallx\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum4.transform.position = new Vector3(-25, 10+20*i, 0); \n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum4.transform.position = new Vector3(-room_sizex/2.0f,  room_sizey/2.0f+room_sizey*i, 0); \n";
							b  += "							museum4.transform.localScale = new Vector3(xscale*0.5f,yscale*20,zscale*30);\n";
						}
						b  +=	"						museum4.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum4.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
						b += "					}\n";
					if(",".equals(afterjoin)){b += "					}\n";}
					
				}else if(VRcjoinarray.gLemaxlist.get(groupcount)>2){
					b += "					}\n";
				}
				b  +=	"\n";
				
			}else if(floorflag == 3){///////////////////////////////////////////////////////////////////////////////////////
				b  +=	"					//museum生成  \n";
				b  +=	"					for(int i=0; i<museumcount; i++){	\n";
				if(VRAttribute.Nopen[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1] == 1){
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/OpenMuseum\")) as GameObject;\n";
				}else{
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/DoorMuseum\")) as GameObject;\n";
				}
					if(scene.equals("museum")){
					b  +=	"						museum.transform.position= new Vector3(0, 0, -30*i); \n";
				}else if(VRManager.VRmoduleflag){
					b  +=	"						museum.transform.position= new Vector3(0, 0, -room_sizez*i); \n";
					b  += "							museum.transform.localScale = new Vector3(xscale,yscale,zscale);\n";
				}
				b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
				for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
					b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
				}
				if(VRManager.VRmoduleflag){
					b  += "						GameObject　light = museum.transform.Find(\"Directional light\").gameObject;\n";
					b  += "						light.GetComponent<Light>().color  = new Color("+light_r+"f/255f, "+light_g+"f/255f, "+light_b+"f/255f, 1);\n";
					b  += "						GameObject　light1 = museum.transform.Find(\"Directional light (1)\").gameObject;\n";
					b  += "						light1.GetComponent<Light>().color  = new Color("+light_r+"f/255f, "+light_g+"f/255f, "+light_b+"f/255f, 1);\n";
					b  +="						light.transform.position= new Vector3(0, 0, -30*i); \n";
					b  +="						light.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					b  +="						light1.transform.position= new Vector3(0, 0, -30*i); \n";
					b  +="						light1.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
						for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
							b+="						light.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							b+="						light1.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
						}
					}
				}
				b  +=	"					}\n";

				
				if(VRcjoinarray.gLemaxlist.get(groupcount) == 2){//N次元
					if("%".equals(prejoin) || "entrance".equals(prejoin)){
					}else{
						b  +=	"					for(int i=0; i<1; i++){	\n";
						b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallz\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum.transform.position= new Vector3(0, 10, 15); \n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum.transform.position= new Vector3(0, room_sizey/2.0f, room_sizez/2.0f); \n";
							b  += 	"						museum.transform.localScale = new Vector3(xscale*50,yscale*20,zscale*0.5f);\n";
						}
						b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
						b  +=	"					}\n";
					}
					
					
					b  +=	"					for(int i=0; i<museumcount; i++){	\n";
					if(",".equals(prejoin)){b += "					if(i>=1){\n";}
						b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallx\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum.transform.position= new Vector3(25, 10, -30*i); \n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum.transform.position= new Vector3(room_sizex/2.0f, room_sizey/2.0f, -room_sizez*i); \n";
							b  += 	"						museum.transform.localScale = new Vector3(xscale*0.5f,yscale*20,zscale*30);\n";
						}
						b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
					if(",".equals(prejoin)){b += "					}\n";}
					b  +=	"					}\n";
	
	
	
					b  +=	"					for(int i=0; i<museumcount; i++){	\n";
					if(",".equals(afterjoin)){b += "					if(i < museumcount-1){\n";}
					b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallx\")) as GameObject;\n";
					if(scene.equals("museum")){
						b  +=	"						museum.transform.position= new Vector3(-25, 10, -30*i); \n";
					}else if(VRManager.VRmoduleflag){
						b  +=	"						museum.transform.position= new Vector3(-room_sizex/2.0f, room_sizey/2.0f, -room_sizez*i); \n";
						b  += 	"						museum.transform.localScale = new Vector3(xscale*0.5f,yscale*20,zscale*30);\n";
					}
					b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
						for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
							b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
						}
					}
					if(",".equals(afterjoin)){b += "					}\n";}
					b  +=	"					}		\n";
	
	
					if("%".equals(afterjoin)|| "exit".equals(afterjoin)){
					}else{
						b  +=	"					for(int i=0; i<1; i++){	\n";
						b  +=	"						GameObject museum= Instantiate(Resources.Load(\""+ template_scene +"/Wallz\")) as GameObject;\n";
						if(scene.equals("museum")){
							b  +=	"						museum.transform.position= new Vector3(0, 10, 15-30*museumcount); //本当は15-30*(museumcount-1)\n";
						}else if(VRManager.VRmoduleflag){
							b  +=	"						museum.transform.position= new Vector3(0, room_sizey/2.0f, room_sizez/2.0f-room_sizez*museumcount);\n";
							b  +=	 "						museum.transform.localScale = new Vector3(xscale*50,yscale*20,zscale*0.5f);\n";
						}
						b  +=	"						museum.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
						if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
							for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
								b+="						museum.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
							}
						}
						b  +=	"					}\n";
					}
				}
			}
			
			
	}
	
	private static void getCS8(int floorflag, int groupcount){///タイトル生成、N次元の壁
		b +="					//タイトル生成とビル内案内矢印\n";
		b +="					for(int i=0; i<museumcount; i++){\n";//Arrow一回撤去
//		b +="						if(i < museumcount-1){\n";
//		b +="							GameObject Arrow= Instantiate(Resources.Load(\"Prefab/BlueArrow\")) as GameObject;\n";
		if(floorflag == 1){
//			if(scene.equals("museum")){
//				b +="							Arrow.transform.position = new Vector3(-20-50*i, 12, -10);\n";
//				b +="							Arrow.transform.localScale = new Vector3(2.5f, 1.5f, 2.5f);\n";
//			}else if(VRManager.VRmoduleflag){
//				b +="							Arrow.transform.position = new Vector3(-roomx-room_sizex*i, room_sizey-8, -roomz);\n";
//				b +="							Arrow.transform.localScale = new Vector3(2.5f*xscale, 1.5f*xscale, 2.5f);\n";
//			}
//			b +="							Arrow.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";	
//			if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
//				for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
//					b+="						Arrow.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
//				}
//			}
//			b +="							Arrow.transform.Rotate(0,180,0); \n";
//			b +="						}\n";
//			b +="\n";
			b +="						GameObject  messageText1 = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
			b +="						messageText1.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); \n";
			b +="						messageText1.GetComponent<TextMesh>().text = genrearray[i].ToString(); \n";
			b +="						messageText1.transform.Rotate(0,180,0); \n";
			if(scene.equals("museum")){
				b +="						messageText1.transform.position= new Vector3(20-50*i, 16, -13);\n";	
			}else if(VRManager.VRmoduleflag){
				b +="						messageText1.transform.position= new Vector3(roomx-room_sizex*i, room_sizey-4, -roomz-3);\n";	
			}
		}else if(floorflag == 2){
//			if(scene.equals("museum")){
//				b +="							Arrow.transform.position = new Vector3(-20, 12+20*i, -10);\n";
//				b +="							Arrow.transform.localScale = new Vector3(2.5f, 1.5f, 2.5f);\n";
//			}else if(VRManager.VRmoduleflag){
//				b +="							Arrow.transform.position = new Vector3(-roomx, room_sizey-8+room_sizey*i, -roomz);\n";
//				b +="							Arrow.transform.localScale = new Vector3(2.5f*xscale, 1.5f*xscale, 2.5f);\n";
//			}
//			b +="							Arrow.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
//			if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
//				for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
//					b+="						Arrow.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
//				}
//			}
//			b +="							Arrow.transform.Rotate(0,0,90); \n";
//			b +="						}\n";
			b +="					//タイトル生成\n";
			b +="						GameObject  messageText1 = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
			b +="						messageText1.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); \n";
			b +="						messageText1.GetComponent<TextMesh>().text = genrearray[i].ToString(); \n";
			b +="						messageText1.transform.Rotate(0,180,0); \n";
			if(scene.equals("museum")){
				b +="						messageText1.transform.position= new Vector3(20, 16+20*i, -13);\n";
			}else if(VRManager.VRmoduleflag){
				b +="						messageText1.transform.position= new Vector3(roomx, room_sizey-4+room_sizey*i, -roomz-3);\n";
			}

		}else if(floorflag == 3){
//			if(scene.equals("museum")){
//				b +="							Arrow.transform.position = new Vector3(-20, 12, -10-30*i); \n";	
//				b +="							Arrow.transform.localScale = new Vector3(2.5f, 1.5f, 2.5f);\n";
//			}else if(VRManager.VRmoduleflag){
//				b +="							Arrow.transform.position = new Vector3(-roomx, room_sizey-8, -roomz-room_sizez*i); \n";	
//				b +="							Arrow.transform.localScale = new Vector3(2.5f*xscale, 1.5f*xscale, 2.5f);\n";
//			}
//			b +="							Arrow.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
//			if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
//				for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
//					b+="						Arrow.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
//				}
//			}
//			b +="							Arrow.transform.Rotate(0,90,0); \n";
//			b +="						}\n";
//			b +="\n";
			b +="						GameObject  messageText1 = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
			b +="						messageText1.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" );  \n";
			b +="						messageText1.GetComponent<TextMesh>().text = genrearray[i].ToString(); \n";
			b +="						messageText1.transform.Rotate(0,180,0); \n";
			if(scene.equals("museum")){
				b +="						messageText1.transform.position= new Vector3(20, 16, -13-30*i);\n";
			}else if(VRManager.VRmoduleflag){
				b +="						messageText1.transform.position= new Vector3(roomx, room_sizey-4, -roomz-3-room_sizez*i);\n";
			}
		}
		if(scene.equals("museum")){
			b +="						messageText1.transform.localScale = new Vector3(2f, 2f, 2f); \n";
		}else if(VRManager.VRmoduleflag){
			b +="						messageText1.transform.localScale = new Vector3(2f*xscale, 2f*xscale, 2f*xscale); \n";
		}
		b +="						messageText1.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
		if(VRcjoinarray.gLemaxlist.get(groupcount) >=3){//N次元
			for(int i=1; i <= VRcjoinarray.gLemaxlist.get(groupcount)-2; i++){
				b+="						messageText1.transform.position  += new Vector3 (N"+i+"movex, N"+i+"movey, N"+i+"movez);\n";
			}
		}
		b +="					}					 \n";
		if(VRcjoinarray.gLemaxlist.get(groupcount) == 2){
			b +="					childNode2 = childNode2.NextSibling;\n";
		}else if(VRcjoinarray.gLemaxlist.get(groupcount) >= 3){//N次元
			int Nx = 0;
			int Ny = 0;
			int Nz = 0;//前の分類属性数入れとく
			int sumNx = 1;
			int sumNy = 1;
			int sumNz = 1;
			if(VRAttribute.Nfloorarray[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1] == 1){
				Nx = VRC1.Nclassct2[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1];
				sumNx = VRC1.Nclassct2[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1];
			}else if(VRAttribute.Nfloorarray[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1] == 2){
				Ny = VRC1.Nclassct2[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1];
				sumNy = VRC1.Nclassct2[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1];
			}else if(VRAttribute.Nfloorarray[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1] == 3){
				Nz = VRC1.Nclassct2[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1];
				sumNz = VRC1.Nclassct2[groupcount][VRcjoinarray.gLemaxlist.get(groupcount)-1];
			}
			b +="\n";
			b +="\n";
			for(int i=VRcjoinarray.gLemaxlist.get(groupcount)-2; i>=1; i--){
				if(VRAttribute.Nopen[groupcount][i] != 1){
					b +="					GameObject museum"+i+"= Instantiate(Resources.Load(\"Type_museum/DoorMuseum\")) as GameObject;\n";
					float posNx = 0;
					float posNy = 0;
					float posNz = 0;
					if(sumNx != 1)
						posNx = room_sizex/2 - room_sizex*sumNx/2;
					if(sumNy != 1)
						posNy = sumNy;
					if(sumNz != 1)
						posNz = room_sizez/2 - room_sizez*sumNz/2;
					b +="					museum"+i+".transform.position = new Vector3("+posNx+"f, "+posNy+"f, "+posNz+"f);\n";
					if(scene.equals("museum")){
						b +="					museum"+i+".transform.localScale = new Vector3("+sumNx+","+sumNy+","+sumNz+");//前の分類属性数分\n";
					}else if(VRManager.VRmoduleflag){
						b +="					museum"+i+".transform.localScale = new Vector3("+sumNx+"*xscale,"+sumNy+"*yscale,"+sumNz+"*zscale);//前の分類属性数分\n";
					}
					b +="					museum"+i+".transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					for(int j=1; j <= i; j++)
						b+="					museum"+i+".transform.position  += new Vector3 (N"+j+"movex, N"+j+"movey, N"+j+"movez);\n";
				}

				b +="					if(Nnum"+i+" != NNode"+i+".ChildNodes.Count-1){\n";
				if(VRAttribute.Nfloorarray[groupcount][i] == 1){
					if(Nx != 0){
						b +="						N"+i+"movex -= "+room_sizex+"f*"+Nx+"f;\n";
					}else{
						b +="						N"+i+"movex -= "+room_sizex+"f;\n";
					}
					Nx = VRC1.Nclassct2[groupcount][i];
					sumNx *=  VRC1.Nclassct2[groupcount][i];
				}else if(VRAttribute.Nfloorarray[groupcount][i] == 2){
					if(Ny != 0){
						b +="						N"+i+"movey += "+room_sizey+"f*"+Ny+"f;\n";
					}else{
						b +="						N"+i+"movey += "+room_sizey+"f;\n";
					}
					Ny = VRC1.Nclassct2[groupcount][i];
					sumNy *= VRC1.Nclassct2[groupcount][i];
				}else if(VRAttribute.Nfloorarray[groupcount][i] == 3){
					if(Nz != 0){
						b +="						N"+i+"movez -= "+room_sizez+"f*"+Nz+"f;\n";
					}else{
						b +="						N"+i+"movez -= "+room_sizez+"f;\n";
					}
					Nz = VRC1.Nclassct2[groupcount][i];
					sumNz *= VRC1.Nclassct2[groupcount][i];
				}
				b +="					}else if(Nnum"+i+" == NNode"+i+".ChildNodes.Count-1){\n";
				if(VRAttribute.Nfloorarray[groupcount][i] == 1){
					b +="						N"+i+"movex = 0;\n";
				}else if(VRAttribute.Nfloorarray[groupcount][i] == 2){
					b +="						N"+i+"movey = 0;\n";
				}else if(VRAttribute.Nfloorarray[groupcount][i] == 3){
					b +="						N"+i+"movez = 0;\n";
				}
				b +="					}\n";
				b +="					}\n";
				b +="					}\n";
				b +="\n";
			}
			b +="					NNode1 = NNode1.NextSibling;\n";
			b +="\n";
			b +="\n";
			
			float x1 = room_sizex/2 - room_sizex*sumNx/2;
			float x2 = room_sizex/2 - room_sizex*sumNx;
			float z1 = room_sizez/2 - room_sizez*sumNz/2;
			float z2 = room_sizez/2 - room_sizez*sumNz;
			
			b +="					GameObject front = Instantiate(Resources.Load(\"Type_museum/Wallz\")) as GameObject;//外壁\n";
			b +="					front.transform.position = new Vector3("+ x1 +"f, "+room_sizey/2*sumNy+"f, "+room_sizez/2+"f);\n";
			b +="					front.transform.localScale = new Vector3("+room_sizex*sumNx+"f, "+room_sizey*sumNy+"f, 0.5f); \n";
			b +="					front.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			b +="\n";

			b +="					GameObject left = Instantiate(Resources.Load(\"Type_museum/Wallx\")) as GameObject;\n";
			b +="					left.transform.position= new Vector3("+room_sizex/2+"f, "+room_sizey/2*sumNy+"f, "+z1+"f);\n";
			b +="					left.transform.localScale = new Vector3(0.5f, "+room_sizey*sumNy+"f, "+room_sizez*sumNz+"f); \n";
			b +="					left.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			b +="\n";

			b +="					GameObject back = Instantiate(Resources.Load(\"Type_museum/Wallz\")) as GameObject;\n";
			b +="					back.transform.position= new Vector3("+ x1 +"f, "+room_sizey/2*sumNy+"f, "+z2+"f);\n";
			b +="					back.transform.localScale = new Vector3("+room_sizex*sumNx+"f, "+room_sizey*sumNy+"f, 0.5f); \n";
			b +="					back.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			b +="\n";

			b +="					GameObject right = Instantiate(Resources.Load(\"Type_museum/Wallx\")) as GameObject;\n";
			b +="					right.transform.position= new Vector3("+x2+"f, "+room_sizey/2*sumNy+"f, "+z1+"f);\n";
			b +="					right.transform.localScale = new Vector3(0.5f, "+room_sizey*sumNy+"f, "+room_sizez*sumNz+"f); \n";
			b +="					right.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
			b +="\n";
			
			if(VRAttribute.cjoinarray.size() > 0){
				float x = sumNx*room_sizex;
				float z = sumNz*room_sizez;
				float y = room_sizey/4.0f;
				float xratio = room_sizex/50;
				float yratio = room_sizey/20;
				float zratio = room_sizez/30;
				float x3 =  room_sizex*sumNx - room_sizex/2;
				float z3 = room_sizez*sumNz - room_sizez/2;
	
				if(groupcount == 1){//ビルのはじめ
					b +="					GameObject doors= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_entrance\n";
					if(cjoinarray2.get(groupcount) == 1){//right
						b +="					doors.transform.position= new Vector3("+(-x3+sumNx*0.2)+"f, "+y+"f, 0);\n";
						b +="					doors.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
						b +="					doors.transform.Rotate(0,90,0); \n";
					}else if(cjoinarray2.get(groupcount) == 3){//back
						b +="					doors.transform.position= new Vector3(0,"+y+"f,"+(-z3+sumNz*0.2)+"f);\n";
						b +="					doors.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
					}
					b +="					doors.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
				}else if(groupcount == VRAttribute.cjoinarray.size()+1){//終わり
					b +="					GameObject doors= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_entrance\n";
					if(cjoinarray2.get(groupcount-1) == 1){//left
						b +="					doors.transform.position= new Vector3("+(room_sizex/2-sumNx*0.2)+"f, "+y+"f, 0);\n";
						b +="					doors.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
						b +="					doors.transform.Rotate(0,90,0); \n";
					}else if(cjoinarray2.get(groupcount-1) == 3){//front
						b +="					doors.transform.position= new Vector3(0, "+y+"f,"+(room_sizez/2-sumNz*0.2)+"f);\n";
						b +="					doors.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
					}
					b +="					doors.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
				}else{//中間
					b +="					GameObject doors1= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_entrance\n";
					b +="					GameObject doors2= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_entrance\n";
					if(cjoinarray2.get(groupcount) == 1){//right
						b +="					doors1.transform.position= new Vector3("+(-x3+sumNx*0.2)+"f, "+y+"f, 0);\n";
						b +="					doors1.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
						b +="					doors1.transform.Rotate(0,90,0); \n";
					}else if(cjoinarray2.get(groupcount) == 3){//back
						b +="					doors1.transform.position= new Vector3(0,"+y+"f,"+(-z3+sumNz*0.2)+"f);\n";
						b +="					doors1.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
					}
					if(cjoinarray2.get(groupcount-1) == 1){//left
						b +="					doors2.transform.position= new Vector3("+(room_sizex/2-sumNx*0.2)+"f, "+y+"f, 0);\n";
						b +="					doors2.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
						b +="					doors2.transform.Rotate(0,90,0); \n";
					}else if(cjoinarray2.get(groupcount-1) == 3){//front
						b +="					doors2.transform.position= new Vector3(0, "+y+"f,"+(room_sizez/2-sumNz*0.2)+"f);\n";
						b +="					doors2.transform.localScale = new Vector3(10.3f*"+xratio+"f, 10*"+yratio+"f, "+0.5*zratio*sumNz+"f);\n";
					}
					b +="					doors1.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
					b +="					doors2.transform.position  += new Vector3 (billmovex, billmovey, billmovez); \n";
				}
			}
		}
}

	private static void getCS9(String afterjoin, int floorflag){//To next build arrow
		b +="					//To next bulid arrow \n";
		b +="					GameObject Arrow1= Instantiate(Resources.Load(\"Prefab/RedArrow\")) as GameObject;\n";
		b +="					Arrow1.transform.position  = new Vector3 (billmovex, billmovey, billmovez); \n";
		if(scene.equals("museum")){
			b +="					Arrow1.transform.localScale = new Vector3(2.5f, 1.5f, 2.5f);\n";
		}else if(VRManager.VRmoduleflag){
			b +="					Arrow1.transform.localScale = new Vector3(2.5f*xscale, 1.5f*xscale, 2.5f);\n";
		}
		
		if(",".equals(afterjoin)){			
			b +="					Arrow1.transform.Rotate(0,180,0);\n";
		}else if("!".equals(afterjoin)){	
			b +="					Arrow1.transform.Rotate(0,0,90);\n";				
		}else if("%".equals(afterjoin)){
			b +="					Arrow1.transform.Rotate(0,90,0);\n";			
		}
		if(scene.equals("museum")){
			if(floorflag == 1){
				b +="					Arrow1.transform.position += new Vector3(-20-50*(museumcount-1), 12, -10);\n";							
			}else if(floorflag == 2){
				if(",".equals(afterjoin) || "%".equals(afterjoin)){
					b +="					Arrow1.transform.position += new Vector3(-20, 12, -10);\n";		
				}else if("!".equals(afterjoin)){
					b +="					Arrow1.transform.position += new Vector3(-20, 12+20*(museumcount-1), -10);\n";	
				}
			}else if(floorflag == 3){
				b +="					Arrow1.transform.position += new Vector3(-20, 12, -10-30*(museumcount-1));\n";	
			}
		}else if(VRManager.VRmoduleflag){
			if(floorflag == 1){
				b +="					Arrow1.transform.position += new Vector3(-roomx-room_sizex*(museumcount-1), room_sizey-8, -roomz);\n";							
			}else if(floorflag == 2){
				if(",".equals(afterjoin) || "%".equals(afterjoin)){
					b +="					Arrow1.transform.position += new Vector3(-roomx, room_sizey-8, -roomz);\n";		
				}else if("!".equals(afterjoin)){
					b +="					Arrow1.transform.position += new Vector3(-roomx, room_sizey-8+room_sizey*(museumcount-1), -roomz);\n";	
				}
			}else if(floorflag == 3){
				b +="					Arrow1.transform.position += new Vector3(-roomx, room_sizey-8, -roomz-room_sizez*(museumcount-1));\n";	
			}
		}		
	}
	
	private static void  getCS10(int i, int floorflag){//entranceとexitの文字
				if(i==1){//Entrance
					b +="					//entrance change \n";
					b +="					GameObject  messageText2 = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject; \n";
					b +="					messageText2.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify\n";
					b +="					messageText2.GetComponent<TextMesh>().text = \"Entrance\";\n";
					b +="					messageText2.GetComponent<Renderer>().material.color = Color.green;\n";
					if(scene.equals("museum")){
						b +="					messageText2.transform.position= new Vector3(-4, 13, 14.5f);\n";
						b +="					messageText2.transform.localScale = new Vector3(1.5f, 1.5f, 1.5f);\n";
					}else if(VRManager.VRmoduleflag){					
						b +="					messageText2.transform.position= new Vector3(-3.75f*xscale, room_sizey/2.0f+3,  room_sizez/2.0f-0.5f);\n";
						b +="					messageText2.transform.localScale = new Vector3(1.5f*xscale, 1.5f*xscale, 1.5f);\n";
					}
	
				}else if(i == VRAttribute.groupcount1){//exit
					b +="					///Exit change \n";
					b +="					GameObject  messageText2 = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject;\n";
					b +="					messageText2.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify\n";
					b +="					messageText2.GetComponent<TextMesh>().text = \"Exit\";  \n";
					b +="					messageText2.GetComponent<Renderer>().material.color = Color.green;\n";
					b +="					messageText2.transform.Rotate(0,180,0);\n";
					if(scene.equals("museum")){
						if(floorflag == 1){
							b +="					messageText2.transform.position= new Vector3(billmovex+1.7f-50*(museumcount-1), 13+billmovey, -14.5f+billmovez); \n";
						}else if(floorflag == 2){
							b +="					messageText2.transform.position= new Vector3(billmovex+1.7f, 13+billmovey+(museumcount-1)*20, -14.5f+billmovez); \n";	
						}else if(floorflag == 3){
							b +="					messageText2.transform.position= new Vector3(billmovex+1.7f, 13+billmovey, -14.5f+billmovez-30*(museumcount-1)); \n";	
						}
						b +="					messageText2.transform.localScale = new Vector3(1.5f, 1.5f, 1.5f);  \n";
					}else if(VRManager.VRmoduleflag){
						if(floorflag == 1){
							b +="					messageText2.transform.position= new Vector3(billmovex+1.7f*xscale-room_sizex*(museumcount-1), room_sizey/2.0f+3+billmovey, -room_sizez/2.0f+0.5f+billmovez); \n";
						}else if(floorflag == 2){
							b +="					messageText2.transform.position= new Vector3(billmovex+1.7f*xscale, room_sizey/2.0f+3+billmovey+(museumcount-1)*room_sizey, -room_sizez/2.0f+0.5f+billmovez); \n";	
						}else if(floorflag == 3){
							b +="					messageText2.transform.position= new Vector3(billmovex+1.7f*xscale, room_sizey/2.0f+3+billmovey, -room_sizez/2.0f+0.5f+billmovez-room_sizez*(museumcount-1)); \n";	
						}
						b +="					messageText2.transform.localScale = new Vector3(1.5f*xscale, 1.5f*xscale, 1.5f);  \n";
					}
					
					b +="\n";
					b +="					GameObject  messageText3 = Instantiate(Resources.Load(\"Prefab/TextPrefab\")) as GameObject;  \n";
					b +="					messageText3.GetComponent<Renderer>().material.shader = Shader.Find( \"shaderZOn\" ); //title modify  \n";
					b +="					messageText3.GetComponent<Renderer>().material.color = Color.green;		 \n";
					b +="					messageText3.transform.Rotate(0,180,0); 		 \n";
					if(scene.equals("museum")){
						b +="					GameObject doors1= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_exit\n";
						if(floorflag ==1){
							b +="					if(billmovey/20+1 > 1){\n";
							b +="						messageText3.GetComponent<TextMesh>().text = \"ここは\"+ (billmovey/20+1) +\"階です。地上へ降りる\\nには左コントローラーの\\nグリップを\"+ (billmovey/20) +\"回押してください。\";  \n";
							b +="						messageText3.transform.position= new Vector3(billmovex-5-50*(museumcount-1), 11+billmovey, -14.5f+billmovez);	 \n";
							b +="					}\n";		
							b +="					doors1.transform.position= new Vector3(billmovex-50*(museumcount-1), 5+billmovey, -15+billmovez); \n";
						}else if(floorflag == 2){
							b +="					if(billmovey/20+museumcount > 1){\n";
							b +="						messageText3.GetComponent<TextMesh>().text = \"ここは\"+ (billmovey/20+museumcount) +\"階です。地上へ降りる\\nには左コントローラーの\\nグリップを\"+ (billmovey/20+museumcount-1) +\"回押してください。\";  \n";
							b +="						messageText3.transform.position= new Vector3(billmovex-5, 11+billmovey+(museumcount-1)*20, -14.5f+billmovez);	 \n";
							b +="					}\n";
							b +="					doors1.transform.position= new Vector3(billmovex, 5+billmovey+(museumcount-1)*20, -15+billmovez); \n";
						}else if(floorflag == 3){
							b +="					if(billmovey/20+1 > 1){\n";
							b +="						messageText3.GetComponent<TextMesh>().text = \"ここは\"+ (billmovey/20+1) +\"階です。地上へ降りる\\nには左コントローラーの\\nグリップを\"+ (billmovey/20) +\"回押してください。\";  \n";
							b +="						messageText3.transform.position= new Vector3(billmovex-5, 11+billmovey, -14.5f+billmovez-30*(museumcount-1));	 \n";
							b +="					}\n";	
							b +="					doors1.transform.position= new Vector3(billmovex, 5+billmovey, -15+billmovez-30*(museumcount-1)); \n";
						}
					}else if(VRManager.VRmoduleflag){
						b +="					GameObject doors1= Instantiate(Resources.Load(\"Type_museum/doors\")) as GameObject;//doors_exit\n";
						b +="					doors1.transform.localScale = new Vector3(5*xscale, 3.6f*yscale, 1);\n";
						b +="					messageText3.transform.localScale = new Vector3(xscale, xscale, 1); \n";
						if(floorflag ==1){
							b +="					if(billmovey/20+1 > 1){\n";
							b +="						messageText3.GetComponent<TextMesh>().text = \"ここは\"+ (billmovey/room_sizex+1) +\"階です。地上へ降りる\\nには左コントローラーの\\nグリップを\"+ (billmovey/20) +\"回押してください。\";  \n";
							b +="						messageText3.transform.position= new Vector3(billmovex-5*xscale-room_sizex*(museumcount-1), room_sizey/4.0f+billmovey, -room_sizez/2.0f+0.5f+billmovez);	 \n";		
							b +="					}\n";		
							b +="					doors1.transform.position= new Vector3(billmovex-room_sizex*(museumcount-1), room_sizey/4.0f+billmovey, -room_sizez/2.0f+billmovez); \n";
						}else if(floorflag == 2){
							b +="					if(billmovey/20+museumcount > 1){\n";
							b +="						messageText3.GetComponent<TextMesh>().text = \"ここは\"+ (billmovey/20+museumcount) +\"階です。地上へ降りる\\nには左コントローラーの\\nグリップを\"+ (billmovey/20+museumcount-1) +\"回押してください。\";  \n";
							b +="						messageText3.transform.position= new Vector3(billmovex-5*xscale, room_sizey/4.0f+billmovey+(museumcount-1)*room_sizey, -room_sizez/2.0f+0.5f+billmovez);	 \n";
							b +="					}\n";
							b +="					doors1.transform.position= new Vector3(billmovex, room_sizey/4.0f+billmovey+(museumcount-1)*room_sizey, -room_sizez/2.0f+billmovez); \n";
						}else if(floorflag == 3){
							b +="					if(billmovey/20+1 > 1){\n";
							b +="						messageText3.GetComponent<TextMesh>().text = \"ここは\"+ (billmovey/20+1) +\"階です。地上へ降りる\\nには左コントローラーの\\nグリップを\"+ (billmovey/20) +\"回押してください。\";  \n";
							b +="						messageText3.transform.position= new Vector3(billmovex-5*xscale, room_sizey/4.0f+billmovey, -room_sizez/2.0f+0.5f+billmovez-room_sizez*(museumcount-1));	 \n";
							b +="					}\n";	
							b +="					doors1.transform.position= new Vector3(billmovex, room_sizey/4.0f+billmovey, -room_sizez/2.0f+billmovez-room_sizez*(museumcount-1)); \n";
						}
					}
				}
	}
	
	private static String getCS11(){
		return
				
"				}\n"+
"				groupflag++;\n"+
"			}\n"+
"		}\n"+
"	}\n"+
"\n"+
"	Vector3 Get(GameObject gameObject)\n"+
"        {\n"+
"            if(gameObject.GetComponent<Renderer>()){\n"+
"               return gameObject.GetComponent<Renderer>().bounds.size;\n"+
"            } else if(gameObject.GetComponent<Collider>()){\n"+
"               return gameObject.GetComponent<Collider>().bounds.size;\n"+
"            } else if(gameObject.GetComponent<Mesh>()){\n"+
"               return gameObject.GetComponent<Mesh>().bounds.size;\n"+
"            }\n"+
"        \n"+
"            if(gameObject.transform.childCount == 1){\n"+
"                return Get(gameObject.transform.GetChild(0).gameObject);\n"+
"            } else if(gameObject.transform.childCount == 0){\n"+
"            	return new Vector3(0,0,0);\n"+
"            } else {\n"+
"                return(new Vector3(GetSizeXParent(gameObject),GetSizeYParent(gameObject),GetSizeZParent(gameObject)));\n"+
"            }\n"+
"        }\n"+
"\n"+
"    float GetSizeXParent(GameObject gameObjectParent){\n"+
"        //GameObject[] childrenGameObjects = gameObjectTemp.\n"+
"            GameObject firstGameObject = null, lastGameObject = null;\n"+
"            firstGameObject = gameObjectParent.transform.GetChild(0).gameObject ;\n"+
"            lastGameObject = gameObjectParent.transform.GetChild(1).gameObject;\n"+
"            float sizeX = 0;\n"+
"            foreach (Transform child in gameObjectParent.transform)\n"+
"            {\n"+
"                if (child.transform.position.x < firstGameObject.transform.position.x)\n"+
"                {\n"+
"                    firstGameObject = child.gameObject;\n"+
"                    continue;\n"+
"                }\n"+
"\n"+ 
"                if (child.transform.position.x > lastGameObject.transform.position.x)\n"+
"                {\n"+
"                    lastGameObject = child.gameObject;\n"+
"                    continue;\n"+
"                }\n"+
"            }\n"+
"            \n"+
"            if ((firstGameObject != null) && (lastGameObject != null) && (firstGameObject != lastGameObject))\n"+
"            {\n"+
"                sizeX = (lastGameObject.transform.position.x - firstGameObject.transform.position.x) + Get(lastGameObject).x / 2 + Get(firstGameObject).x / 2;\n"+
"            }\n"+
"            \n"+
"            return sizeX;\n"+
"    }\n"+
"    \n"+
"    float GetSizeYParent(GameObject gameObjectParent){\n"+
"       //GameObject[] childrenGameObjects = gameObjectTemp.\n"+
"            GameObject firstGameObject = null, lastGameObject = null;\n"+
"            firstGameObject = gameObjectParent.transform.GetChild(0).gameObject ;\n"+
"            lastGameObject = gameObjectParent.transform.GetChild(1).gameObject;\n"+
"            float sizeY = 0;\n"+
"            foreach (Transform child in gameObjectParent.transform)\n"+
"            {\n"+
"                if (child.transform.position.y < firstGameObject.transform.position.y)\n"+
"                {\n"+
"                    firstGameObject = child.gameObject;\n"+
"                    continue;\n"+
"                }\n"+
"                \n"+
"                if (child.transform.position.y > lastGameObject.transform.position.y)\n"+
"                {\n"+
"                    lastGameObject = child.gameObject;\n"+
"                    continue;\n"+
"                }\n"+
"            }\n"+
"            \n"+
"            if ((firstGameObject != null) && (lastGameObject != null) && (firstGameObject != lastGameObject))\n"+
"            {\n"+
"                sizeY = (lastGameObject.transform.position.y - firstGameObject.transform.position.y) + Get(lastGameObject).y / 2 + Get(firstGameObject).y / 2;\n"+
"            }\n"+
"            \n"+
"            return sizeY;\n"+
"    }\n"+
"    \n"+
"    float GetSizeZParent(GameObject gameObjectParent){\n"+
"        //GameObject[] childrenGameObjects = gameObjectTemp.\n"+
"            GameObject firstGameObject = null, lastGameObject = null;\n"+
"            firstGameObject = gameObjectParent.transform.GetChild(0).gameObject ;\n"+
"            lastGameObject = gameObjectParent.transform.GetChild(1).gameObject;\n"+
"            float sizeY = 0;\n"+
"            foreach (Transform child in gameObjectParent.transform)\n"+
"            {\n"+
"                if (child.transform.position.z < firstGameObject.transform.position.z)\n"+
"                {\n"+
"                    firstGameObject = child.gameObject;\n"+
"                    continue;\n"+
"                }\n"+
"\n"+     
"                if (child.transform.position.z > lastGameObject.transform.position.z)\n"+
"                {\n"+
"                    lastGameObject = child.gameObject;\n"+
"                    continue;\n"+
"                }\n"+
"            }\n"+
"            \n"+
"            if ((firstGameObject != null) && (lastGameObject != null) && (firstGameObject != lastGameObject))\n"+
"            {\n"+
"                sizeY = (lastGameObject.transform.position.z - firstGameObject.transform.position.z) + Get(lastGameObject).z / 2 + Get(firstGameObject).z / 2;\n"+
"            }\n"+
"            \n"+
"            return sizeY;\n"+
"    }\n"+
"}\n";
	}


	
	



	
	/////////////////こっから先はディレクトリ生成について　今はまだ使ってない
	private static void createfile(String fn, String content){
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(
							fn), "UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		pw.println(content);
		pw.close();
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
