package supersql.codegenerator;
import java.util.ArrayList;
import java.util.HashMap;

import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;


public class CSS {
	private ArrayList<String> selector = new ArrayList<String>();
	private ArrayList<ArrayList<String>> element = new ArrayList<ArrayList<String>>();
	
	public CSS() {
		/* コンストラクタ */
	}
	
	public CSS(ArrayList<String> selector, ArrayList<ArrayList<String>> element) {
		this.selector = selector;
		this.element = element;
	}
	
	public int selectorSize() {
		return selector.size();
	}
	
	public String getSelector(int i) {
		return selector.get(i);
	}
	
	public int elementSize() {
		return element.size();
	}
	
	public String getProperty(int i) {
		return element.get(i).get(0);
	}
	
	public String getValue(int i) {
		return element.get(i).get(1);
	}
	
	public String addCentering() {
		// TODO 自動生成されたメソッド・スタブ
		String s = new String();
		if(GlobalEnv.getPos().indexOf("center") != -1){
			s = "body {\n"+
					"\t text-align: center;\n"+
					"}\n"+
					"#ssql_body_contents{\n"+
					"\t display: inline-block;\n"+
					"}\n\n";
		}else if(GlobalEnv.getPos().indexOf("left") != -1){
			s = "body {\n"+
					"\t text-align: left;\n"+
					"}\n"+
					"#ssql_body_contents{\n"+
					"\t display: inline-block;\n"+
					"}\n\n";
		}else if(GlobalEnv.getPos().indexOf("right") != -1){
			s = "body {\n"+
					"\t text-align: right;\n"+
					"}\n"+
					"#ssql_body_contents{\n"+
					"\t display: inline-block;\n"+
					"}\n\n";
		}
		return s;
	}

	public void detectCentering(ExtList tfe_tree) {
		// TODO 自動生成されたメソッド・スタブ
		ExtList tree_unnest = tfe_tree.unnest();
		if(tree_unnest.get(1).equals("{") && tree_unnest.get(tree_unnest.contain_itemnum() - 2).equals("}") && tree_unnest.get(tree_unnest.contain_itemnum() - 1).toString().indexOf("align") != -1){
			GlobalEnv.setCenteringflag();
			String rem_wspace = String.join("", tree_unnest.get(tree_unnest.contain_itemnum() - 1).toString().split(" "));
			String alig_state = rem_wspace.substring(rem_wspace.indexOf("align"));
			String pos1 = new String();
			String pos2 = new String();
			if(alig_state.indexOf("=") != -1){
				pos1 = alig_state.split("=")[1].substring(alig_state.split("=")[1].indexOf("'") + 1);
				pos2 = pos1.substring(0, pos1.indexOf("'"));
			}
			Log.info("pos2:"+pos2);
			GlobalEnv.setPos(pos2);
		}
	}
}
