package supersql.ctab;

import java.util.ArrayList;
import java.util.Hashtable;

import com.ibm.db2.jcc.a.a;
import com.ibm.db2.jcc.a.b;
import com.ibm.db2.jcc.am.ad;
import com.ibm.db2.jcc.am.in;
import com.ibm.db2.jcc.am.k;
import com.ibm.db2.jcc.am.l;
import com.ibm.db2.jcc.sqlj.n;
import com.sun.javafx.util.TempState;
import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.sun.org.apache.xml.internal.serializer.utils.AttList;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;

import jdk.nashorn.internal.objects.Global;
import sun.awt.im.InputMethodJFrame;
import sun.util.logging.resources.logging;
import supersql.codegenerator.CodeGenerator;
import supersql.codegenerator.TFE;
import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.dataconstructor.DataConstructor;
import supersql.extendclass.ExtList;

public class Ctab {
	public ExtList makeCtab(ExtList tfe){
		Log.info("start_tfe:"+tfe);
		//tfe's number is lt 3
		if(tfe.size() < 7){
			System.err.println("cross_tab function argument is insufficient. Three arguments are required.");
			return tfe;
		}
		
		//separate tfe arg
		ExtList tfe1 = (ExtList)tfe.get(2);
		ExtList tfe2 = (ExtList)tfe.get(4);
		ExtList tfe3 = (ExtList)tfe.get(6);
		Log.info("tfe1:"+tfe1);
		Log.info("tfe2:"+tfe2);
		Log.info("tfe3:"+tfe3);
		
		//add sorting information. add ascend sort.
		//if there exists, than we do nothing.
		Hashtable<String, String> sort_info = new Hashtable<String, String>(); //the pair of attribute name and sort info
		ExtList tfe1_sorted = addSort(tfe1, sort_info);
		ExtList tfe2_sorted = addSort(tfe2);
		
		return tfe;
	}

	private ExtList addSort(ExtList tfe2) {	
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private ExtList addSort(ExtList tfe1, Hashtable<String, String> sort_info) {
		// TODO 自動生成されたメソッド・スタブ
		
		return null;
	}
}
