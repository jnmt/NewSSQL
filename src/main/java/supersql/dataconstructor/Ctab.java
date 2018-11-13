package supersql.dataconstructor;

import supersql.common.Log;
import supersql.extendclass.ExtList;
import supersql.parser.Start_Parse;

public class Ctab {
	public ExtList makeCtab(ExtList tfe){
		System.out.println("start_tfe:::"+tfe);
		ExtList finalForm = new ExtList();
		//get the number of arguments and set top, side and value
		int args_num = (tfe.size() - 2) / 2;
		ExtList top = new ExtList(tfe.getExtList(2));
		ExtList side = new ExtList(tfe.getExtList(4));
		ExtList value = new ExtList();
		for (int i = 3; i < args_num + 1; i++) {
			value.add(tfe.getExtList(i * 2));
		}
		System.out.println("top:::"+top);
		System.out.println("side:::"+side);
		System.out.println("value:::"+value);

		//check the number of each part
		int top_num = 1, side_num = 1, value_num = 1;
		//if top structure is forest
		if(((ExtList)top.get(1)).get(0) instanceof String && top.getExtListString(1, 0).toString().equals("{")){
			//the number of trees is equal to the number of childs of h_exp
			top_num = (top.getExtList(1, 1, 1, 0, 1, 0, 1, 0, 1).size() + 1) / 2;
		}
		if(((ExtList)side.get(1)).get(0) instanceof String && side.getExtListString(1, 0).toString().equals("{")){
			side_num = (side.getExtList(1, 1, 1, 0, 1, 0, 1).size() + 1) / 2;
		}
		value_num = value.size();
		if(value_num != 1 && side_num * top_num != value_num){
			System.err.println("Incorrect number of cross_tab arguments");
			System.exit(1);
		}
		System.out.println("top_num:::"+top_num);
		System.out.println("side_num:::"+side_num);
		System.out.println("value_num:::"+value_num);

		//make top attribute structure
		ExtList topAttribute = new ExtList(top);

		//make side and value structure
		//sideの個数分for文回す
		int value_count = 0;
		ExtList sideValueAttribute = new ExtList();
		for (int i = 0; i < side_num; i++) {
			ExtList side_child = new ExtList();
			if(side_num == 1){
				side_child = side;
			}else {
				side_child = new ExtList(side.getExtList(1, 1, 1, 0, 1, 0, 1, i * 2, 1, 0));
			}
			System.out.println("side_child:::"+side_child);
			ExtList valueTops = new ExtList();
			//topの個数分for文回す
			for (int j = 0; j < top_num; j++) {
				//topに含まれる属性を抜き出す
				ExtList top_child = new ExtList();
				if(top_num == 1){
					top_child = top;
				}else {
					top_child = new ExtList(top.getExtList(1, 1, 1, 0, 1, 0, 1, 0, 1, j * 2));
				}
				System.out.println("top_child:::"+top_child);
				Attributes.clear();
				getAttribute(top_child, "attribute");
				System.out.println("top_attributes:::"+Attributes);
				ExtList top_child_atts = (ExtList)Attributes.clone();
				Attributes.clear();
				//null関数に入れる
				ExtList nulls = new ExtList();
				for (int k = 0; k < top_child_atts.size(); k++) {
					ExtList top_child_child = top_child_atts.getExtList(k);
					ExtList tmp1 = new ExtList();
					ExtList tmp2 = new ExtList();
					tmp1.add("operand");
					tmp2.add(top_child_child);
					tmp1.add(tmp2);
					//make function name
					ExtList tmp3 = new ExtList();
					ExtList tmp4 = new ExtList();
					ExtList tmp5 = new ExtList();
					ExtList tmp6 = new ExtList();
					ExtList tmp7 = new ExtList();
					ExtList tmp8 = new ExtList();

					tmp7.add("null");
					tmp6.add("keyword");
					tmp6.add(tmp7);
					tmp5.add(tmp6);
					tmp4.add("any_name");
					tmp4.add(tmp5);
					tmp3.add(tmp4);
					tmp8.add("function_name");
					tmp8.add(tmp3);

					ExtList tmp9 = new ExtList();

					tmp9.add(tmp8);
					tmp9.add("(");
					tmp9.add(tmp1);
					tmp9.add(")");

					ExtList tmp10 = new ExtList();
					ExtList tmp11 = new ExtList();
					ExtList tmp12 = new ExtList();

					tmp10.add("function");
					tmp10.add(tmp9);
					tmp11.add(tmp10);
					tmp12.add("operand");
					tmp12.add(tmp11);

					nulls.add(tmp12);
				}
				System.out.println("nulls:::"+ nulls);

				//nullとvalueを合体させる
				//使うvalueを決定
				ExtList value_child = new ExtList();
				if(value_num == 1){
					value_child = value.getExtList(0);
				}else{
					value_child = value.getExtList(value_count);
				}

				//h_expでnullsとvalueを並べてgrouperまで作成する
				ExtList tmp1 = new ExtList();
				ExtList tmp2 = new ExtList();
				ExtList tmp3 = new ExtList();
				ExtList tmp4 = new ExtList();
				ExtList tmp5 = new ExtList();
				ExtList tmp6 = new ExtList();
				ExtList tmp7 = new ExtList();
				ExtList tmp8 = new ExtList();
				ExtList tmp9 = new ExtList();
				ExtList tmp10 = new ExtList();
				ExtList tmp11 = new ExtList();
				ExtList tmp12 = new ExtList();

				for (int k = 0; k < nulls.size(); k++) {
					tmp1.add(nulls.getExtList(k));
					tmp1.add(",");
				}
				tmp1.add(value_child);
				tmp2.add("h_exp");
				tmp2.add(tmp1);
				tmp3.add(tmp2);
				tmp4.add("v_exp");
				tmp4.add(tmp3);
				tmp5.add(tmp4);
				tmp6.add("d_exp");
				tmp6.add(tmp5);
				tmp7.add(tmp6);
				tmp8.add("exp");
				tmp8.add(tmp7);
				tmp9.add("[");
				tmp9.add(tmp8);
				tmp9.add("]");
				tmp9.add(",");
				tmp10.add("grouper");
				tmp10.add(tmp9);
				tmp11.add(tmp10);
				tmp12.add("operand");
				tmp12.add(tmp11);
				ExtList valueTop = new ExtList(tmp12);
				valueTops.add(valueTop);
				value_count++;
			}
			System.out.println("valueTops:::"+valueTops);
			//sideの一番奥の属性の下にvalueTopをブッコム
			//sideだからh_expで繋がっている。h_expの子要素が全て属性(not grouper)だったら一番右にvalueTopを入れる。
			//まだgrouperがあったら其奴を探索する
			addValues(side_child, valueTops);
			sideValueAttribute.add(side_child);
			System.out.println("side_child_added:::"+side_child);
		}
		ExtList tmp1 = new ExtList();
		ExtList tmp2 = new ExtList();
		ExtList tmp3 = new ExtList();
		ExtList tmp4 = new ExtList();
		ExtList tmp5 = new ExtList();
		ExtList tmp6 = new ExtList();

		tmp1.add(topAttribute);
		for (int i = 0; i < sideValueAttribute.size(); i++) {
			tmp1.add("!");
			tmp1.add(sideValueAttribute.getExtList(i));
		}
		tmp2.add("v_exp");
		tmp2.add(tmp1);
		tmp3.add(tmp2);
		tmp4.add("d_exp");
		tmp4.add(tmp3);
		tmp5.add(tmp4);
		tmp6.add("exp");
		tmp6.add(tmp5);
		finalForm = tmp6;
		System.out.println("finished:::"+finalForm);
		return finalForm;
		/*

		//separate tfe arg
		ExtList tfe1 = (ExtList)tfe.get(2);
		ExtList tfe2 = (ExtList)tfe.get(4);
		ExtList tfe3 = (ExtList)tfe.get(6);
		Log.info("tfe1:"+tfe1);
		Log.info("tfe2:"+tfe2);
		Log.info("tfe3:"+tfe3);
		
		//check whether forest or not
		//forest->{tfe, tfe, ...} tree->tfe
		//checkForest is return -1 if attribute is tree and return num if attribute is forest(the num is the number of tree)
		//if tfe3 is forest, tfe1 or tfe2 must be tree. so when tfe1 and tfe2 doesn't correspond to tfe3 return error
		int tfe1_forest = checkForest(tfe1);
		int tfe2_forest = checkForest(tfe2);
		int tfe3_forest = checkForest(tfe3);
//		if(tfe3_forest != -1){
//			if(tfe1_forest != tfe3_forest && tfe2_forest != tfe3_forest){
//				System.err.println("the number of attributes is not corresponding");
//				System.exit(1);
//			}
//		}
		Log.info("tfe1_num:"+tfe1_forest);
		Log.info("tfe2_num:"+tfe2_forest);
		Log.info("tfe3_num:"+tfe3_forest);
		
		//add sorting information. add ascend sort.
		//if there exists, than we do nothing.
		ExtList tfe1_sorted = addSort(tfe1, 0);
		ExtList tfe2_sorted = addSort(tfe2, 0);
		Log.info("tfe1_sorted:"+tfe1_sorted);
		Log.info("tfe2_sorted:"+tfe2_sorted);
		
		//add null to tfe2
		ExtList tfe2_addnull = addNull(tfe2, 0);
		Log.info("tfe2_null:"+tfe2_addnull);
		
		//if tfe is forest divide tfe
		ExtList tfe1_divided = tfe1_sorted;
		ExtList tfe2_divided = tfe2_addnull;
		ExtList tfe3_divided = tfe3;
		if(tfe1_forest != -1){
			tfe1_divided = divideTfe(tfe1_divided, tfe1_forest);
		}
		Log.info("tfe1_divided:"+tfe1_divided);
		if(tfe2_forest != -1){
			tfe2_divided = divideTfe(tfe2_divided, tfe2_forest);
		}
		Log.info("tfe2_divided:"+tfe2_divided);
		if(tfe3_forest != -1){
			tfe3_divided = divideTfe(tfe3_divided, tfe3_forest);
		}
		Log.info("tfe3_divided:"+tfe3_divided);
		
		//merge tfe3 and tfe1 or tfe2
		//if tfe1 is forest merge tfe1 and tfe3
		//if tfe2 is forest or no one is forest merge tfe2 and tfe3
		//if both tfe2 and tfe3 are forest
		if(tfe1_forest == -1 && tfe2_forest == -1 && tfe3_forest == -1){
			
		}else if(tfe1_forest != -1 && tfe3_forest != -1){
			
		}else if(tfe2_forest != -1 && tfe3_forest != -1){
			
		}else if(tfe1_forest != -1 && tfe2_forest != -1 && tfe3_forest != -1){
			
		}
		
		
		return tfe;
		*/
	}

	private void addValues(ExtList side_child, ExtList valueTops) {
		int num = side_child.size();
		for (int i = 0; i < num; i++) {
			if (side_child.get(i) instanceof String){
				if(side_child.get(i).toString().equals("h_exp")){
					boolean containGrouper = false;
					int num2 = (side_child.getExtList(1).size() + 1) / 2;
					for (int j = 0; j < num2; j++) {
//						System.out.println("num2:::"+num2);
//						System.out.println("side_child_get:::"+side_child.getExtList(1));
						if(side_child.getExtListString(1, j * 2, 1, 0, 0).equals("grouper")){
							containGrouper = true;
							addValues(side_child.getExtList(1, j * 2), valueTops);
						}
					}
					if(!containGrouper){
						for (int j = 0; j < valueTops.size(); j++) {
							side_child.getExtList(1).add(",");
							side_child.getExtList(1).add(valueTops.getExtList(j));
						}
					}
					break;
				}
			}else{
				addValues(side_child.getExtList(i), valueTops);
			}
		}
	}

	private ExtList Attributes = new ExtList();
	private void getAttribute(ExtList top_child, String target) {
		int num = top_child.size();
		for (int i = 0; i < num; i++) {
			if(top_child.get(i) instanceof String){
				if(top_child.get(i).toString().equals(target)){
					Attributes.add(top_child);
				}
			}else{
				getAttribute(top_child.getExtList(i), target);
			}
		}
	}

	private ExtList divideTfe(ExtList tfe, int tfe_forest) {
		// TODO 自動生成されたメソッド・スタブ
		ExtList set = new ExtList();
		int vertical_num = ((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(1)).get(1)).get(0)).get(1)).get(0)).get(1)).size();
		for(int i = 0; i < vertical_num; i += 2){
			for(int j = 0; j < ((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(1)).get(1)).get(0)).get(1)).get(0)).get(1)).get(i)).get(1)).size(); j += 2){
				set.add(((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(1)).get(1)).get(0)).get(1)).get(0)).get(1)).get(i)).get(1)).get(j));
			}
		}
		return set;
	}
	//if a tfe is forest, it must have a {}.
	//if tfe has many {}, ignore inner {}
	private int checkForest(ExtList tfe) {
		// TODO 自動生成されたメソッド・スタブ
		if(((ExtList)tfe.get(1)).get(0).equals("{")){
			//count contents
			//contents are combined horizontally or vertically
			//1110101.size -> v_exp
			//111010i01.size -> h_exp
			int vertical_num = ((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(1)).get(1)).get(0)).get(1)).get(0)).get(1)).size();
			int tree_num = 0;
			for(int i = 0; i < (vertical_num / 2 + 1); i++){
				tree_num += ((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(1)).get(1)).get(0)).get(1)).get(0)).get(1)).get(2 * i)).get(1)).size() / 2 + 1;
			}
			if(tree_num != 1){
				return tree_num;
			}else{
				return -1;
			}
		}else{
			return -1;
		}
	}

	private ExtList addNull(ExtList tfe, int flag) {
		// TODO 自動生成されたメソッド・スタブ
		if(tfe.get(0).equals("operand")){
			if(((ExtList)tfe.get(1)).get(0).equals("{")){
				ExtList tmp = new ExtList();
				ExtList tmp2 = new ExtList();
				ExtList tmp3 = new ExtList();
				tmp = addNull((ExtList)((ExtList)tfe.get(1)).get(1), 1);
				tmp2.add("operand");
				tmp3.add("{");
				tmp3.add(tmp);
				tmp3.add("}");
				tmp2.add(tmp3);
				return tmp2;
			}else if(((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("sorting") || ((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("sl")){
				ExtList tmp = new ExtList();				
				ExtList tmp2 = new ExtList();
				ExtList tmp3 = new ExtList();
				ExtList tmp4 = new ExtList();
				ExtList tmp5 = new ExtList();
				ExtList tmp6 = new ExtList();
				ExtList tmp7 = new ExtList();
				ExtList tmp8 = new ExtList();
				ExtList tmp9 = new ExtList();
				ExtList tmp10 = new ExtList();
				tmp.add("null");
				tmp9.add("any_name");
				tmp2.add("keyword");
				tmp2.add(tmp);
				tmp3.add(tmp2);
				tmp9.add(tmp3);
				tmp10.add(tmp9);
				tmp4.add("function_name");
				tmp4.add(tmp10);
				tmp5.add(tmp4);
				tmp5.add("(");
				tmp5.add(tfe);
				tmp5.add(")");
				tmp6.add("function");
				tmp6.add(tmp5);
				tmp7.add("operand");
				tmp8.add(tmp6);
				tmp7.add(tmp8);
				return tmp7;
			}else if(((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("function")){
				ExtList tmp = new ExtList();
				tmp = addNull(((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(0)).get(1)).get(2)), 0);
				ExtList tmp2 = new ExtList();
				ExtList tmp3 = new ExtList();
				ExtList tmp4 = new ExtList();
				ExtList tmp5 = new ExtList();
				tmp2.add("operand");
				tmp3.add(((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(0)).get(1)).get(0)));
				tmp3.add("(");
				tmp3.add(tmp);
				tmp3.add(")");
				tmp4.add("function");
				tmp4.add(tmp3);
				tmp5.add(tmp4);
				tmp2.add(tmp5);
				return tmp2;
			}else{
				ExtList tmp = new ExtList();
				tmp.add("operand");
				tmp.add(addNull((ExtList)tfe.get(1), 1));
				return tmp;
			}
		}else if(tfe.get(0).equals("{")){
			ExtList tmp = new ExtList();
			ExtList tmp2 = new ExtList();
			tmp.add(tfe.get(0));
			tmp.add(addNull((ExtList)tfe.get(1), 1));
			tmp.add("}");
			return tmp;
		}else if(tfe.get(0).equals("grouper")){
			ExtList tmp = new ExtList();
			ExtList tmp2 = new ExtList();
			tmp.add("[");
			tmp.add(addNull((ExtList)((ExtList)tfe.get(1)).get(1), 0));
			tmp.add("]");
			tmp.add(",");
			tmp2.add("grouper");
			tmp2.add(tmp);
			return tmp2;
		}else if(tfe.get(0).equals("exp")){
			ExtList tmp = new ExtList();
			tmp.add("exp");
			tmp.add(addNull((ExtList)tfe.get(1), 1));
			return tmp;
		}else if(tfe.get(0).equals("d_exp") || tfe.get(0).equals("v_exp") || tfe.get(0).equals("h_exp")){
			ExtList tmp = new ExtList();
			ExtList tmp2 = new ExtList();
			int child_num = 0;
			child_num = ((ExtList)tfe.get(1)).size() / 2 + 1;
			for(int i = 0; i < child_num; i++){
				if(i != 0){
					tmp.add(((ExtList)tfe.get(1)).get(2 * i - 1));
				}
				tmp.add(addNull((ExtList)((ExtList)tfe.get(1)).get(2 * i), 0));
			}
			tmp2.add(tfe.get(0));
			tmp2.add(tmp);
			return tmp2;
		}else{
			ExtList tmp = new ExtList();
			if(flag == 0){
				tmp.add(tfe.get(0));
				tmp.add(addNull((ExtList)tfe.get(1), 1));
			}else if(flag == 1){
				tmp.add(addNull((ExtList)tfe.get(0), 0));
			}
			return tmp;
		}
	}

	private ExtList addSort(ExtList tfe, int flag) {
		// TODO 自動生成されたメソッド・スタブ
		if(tfe.get(0).equals("operand")){
			if(((ExtList)tfe.get(1)).get(0).equals("{")){
				ExtList tmp = new ExtList();
				ExtList tmp2 = new ExtList();
				ExtList tmp3 = new ExtList();
				tmp = addSort((ExtList)((ExtList)tfe.get(1)).get(1), 1);
				tmp2.add("operand");
				tmp3.add("{");
				tmp3.add(tmp);
				tmp3.add("}");
				tmp2.add(tmp3);
				return tmp2;
			}else if(((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("sorting") || ((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("sl")){
				return tfe;
			}else if(((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("function")){
				ExtList tmp = new ExtList();
				tmp = addSort(((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(0)).get(1)).get(2)), 0);
				ExtList tmp2 = new ExtList();
				ExtList tmp3 = new ExtList();
				ExtList tmp4 = new ExtList();
				ExtList tmp5 = new ExtList();
				tmp2.add("operand");
				tmp3.add(((ExtList)((ExtList)((ExtList)((ExtList)tfe.get(1)).get(0)).get(1)).get(0)));
				tmp3.add("(");
				tmp3.add(tmp);
				tmp3.add(")");
				tmp4.add("function");
				tmp4.add(tmp3);
				tmp5.add(tmp4);
				tmp2.add(tmp5);
				return tmp2;
			}else if(((ExtList)((ExtList)tfe.get(1)).get(0)).get(0).equals("attribute")){
				ExtList tmp = new ExtList();
				ExtList tmp2 = new ExtList();
				tmp.add("(");
				tmp.add("asc");
				tmp.add(")");
				tmp2.add("sorting");
				tmp2.add(tmp);
				((ExtList)tfe.get(1)).add(0, tmp2);
				return tfe;
			}else{
				ExtList tmp = new ExtList();
				tmp.add("operand");
				tmp.add(addSort((ExtList)tfe.get(1), 1));
				return tmp;
			}
		}else if(tfe.get(0).equals("{")){
			ExtList tmp = new ExtList();
			ExtList tmp2 = new ExtList();
			tmp.add(tfe.get(0));
			tmp.add(addSort((ExtList)tfe.get(1), 1));
			tmp.add("}");
			return tmp;
		}else if(tfe.get(0).equals("grouper")){
			ExtList tmp = new ExtList();
			ExtList tmp2 = new ExtList();
			tmp.add("[");
			tmp.add(addSort((ExtList)((ExtList)tfe.get(1)).get(1), 0));
			tmp.add("]");
			tmp.add(((ExtList)tfe.get(1)).get(3));
			tmp2.add("grouper");
			tmp2.add(tmp);
			return tmp2;
		}else if(tfe.get(0).equals("exp")){
			ExtList tmp = new ExtList();
			tmp.add("exp");
			tmp.add(addSort((ExtList)tfe.get(1), 1));
			return tmp;
		}else if(tfe.get(0).equals("d_exp") || tfe.get(0).equals("v_exp") || tfe.get(0).equals("h_exp")){
			ExtList tmp = new ExtList();
			ExtList tmp2 = new ExtList();
			int child_num = 0;
			child_num = ((ExtList)tfe.get(1)).size() / 2 + 1;
			for(int i = 0; i < child_num; i++){
				if(i != 0){
					tmp.add(((ExtList)tfe.get(1)).get(2 * i - 1));
				}
				tmp.add(addSort((ExtList)((ExtList)tfe.get(1)).get(2 * i), 0));
			}
			tmp2.add(tfe.get(0));
			tmp2.add(tmp);
			return tmp2;
		}else{
			ExtList tmp = new ExtList();
			if(flag == 0){
				tmp.add(tfe.get(0));
				tmp.add(addSort((ExtList)tfe.get(1), 1));
			}else if(flag == 1){
				tmp.add(addSort((ExtList)tfe.get(0), 0));
			}
			return tmp;
		}
	}
}
