package supersql.dataconstructor;

import java.util.ArrayList;
import java.util.List;

import org.rosuda.JRI.Rengine;

import supersql.common.Log;
import supersql.extendclass.ExtList;


public class GGplot {

	/* navigate the whole schema in this method */
	public ExtList ggplot(ExtList criteria_set, ExtList info, ExtList sch, ExtList tuples) {
		info = new ExtList();
		info.add("1 2 ggplot");



		boolean is_ggplot = false;
		boolean is_ggplot_1 = false;

		ExtList criteria_set_buffer = new ExtList();
		ExtList process_set = new ExtList();
		ExtList deep_set = new ExtList();

		Log.out(" * ggplot at the schema level " + sch + " *");

		//add tbt 180727
				//For forest
				//not to use attributes to other trees
				boolean is_forest = true;
				//tbt end

		/* current schema level */
		for (int i = 0; i < sch.size(); i++) {
			if (is_ggplot_1) {
				is_ggplot_1 = false;
				continue;
			}
			/* attribute found in this current level */
			if (!(sch.get(i) instanceof ExtList)) {
				//add tbt 180727, 180730
				is_forest = false;
				is_ggplot = false;

				//tbt end

				for (int j = 0; j < info.size(); j++) {

					/* "ggplot functions" found */
					if (info.get(j).toString().substring(0, 1).equals(sch.get(i).toString())) {

						Log.out("    ggplot found : " + sch.get(i) + " with " + info.get(j).toString().substring(2));

						is_ggplot = true;
						is_ggplot_1 = true;
						process_set.add(info.get(j));

					}
				}

				/* push it into criteria_set, if "ggplot functions" not found */
				if (!is_ggplot) {
					criteria_set.add(sch.get(i));
				}

			/* inner level found in this current level */
			} else {
				deep_set.add(sch.get(i));

			}

		}


		/* do "ggplot functions" in this current level, if there is any */
		while (process_set.size() > 0) {
			tuples = makeGraph(criteria_set, process_set.get(0), tuples);

			Log.out("    ggplot process : " + process_set.get(0).toString().substring(0, 1) + " with " + process_set.get(0).toString().substring(2));
//			System.out.println("tuples:::"+tuples);
			criteria_set_buffer.add(process_set.get(0).toString().substring(0, 1));
			process_set.remove(0);

		}

		/* update criteria_set */
		for (int i = 0; i < criteria_set_buffer.size(); i++) {
			criteria_set.add(criteria_set_buffer.get(i));
		}

		Log.out("    set : " + criteria_set);

		/* calculate each inner level of this current level by recursion */
		while (deep_set.size() > 0) {

			GGplot ggplot = new GGplot();
			//add tbt 180727
			//if forest, it should not use same criteria_set
			if(is_forest){
				criteria_set.clear();
			}
			//end tbt

			tuples = ggplot.ggplot(criteria_set, info, (ExtList)(deep_set.get(0)), tuples);

			deep_set.remove(0);

		}

		return tuples;

	}

	/* make graph in units of groups having the same contents in criteria_set */
	private ExtList makeGraph(ExtList criteria, Object process, ExtList tuples) {

//		System.out.println("criteria:"+criteria);
//		System.out.println("process:"+process);

		ExtList buffer = new ExtList();
		ExtList tuples_buffer = new ExtList();

		ExtList x;
		ExtList y;
		boolean flag = true;

		String target_x;
		String target_y;
		String way;

		Rengine engine = new Rengine(new String[]{"--vanilla"}, false, null);
		engine.eval("setwd(\"/Users/otawa/Documents/queries/output\")");
		engine.eval(".libPaths(\"/usr/local/lib/R/3.5/site-library\")");
		engine.eval("library(tidyverse)");
		engine.eval("library(plotly)");

		target_x = process.toString().substring(0, 1);
		target_y = process.toString().substring(2, 3);
		way = process.toString().substring(4);

		while (tuples.size() > 0) {

			/* find tuples with the same criteria */

			x = (ExtList)(tuples.get(0));
			for (int i = 1; i < tuples.size(); i++) {
				y = (ExtList)(tuples.get(i));

				for (int k = 0; k < criteria.size(); k++) {
					if (!(x.get(Integer.parseInt(criteria.get(k).toString())).equals
					     (y.get(Integer.parseInt(criteria.get(k).toString()))))) {
						flag = false;
					}
				}
				if (flag) {
					buffer.add(y);
					tuples.remove(i--);
				} else {
					flag = true;
				}
			}
			buffer.add(x);
			System.out.println("buffer:"+buffer);
			tuples.remove(0);


			List<String> buffer_x = new ArrayList<String>();
			List<String> buffer_y = new ArrayList<String>();

			for (int i = 0; i < buffer.size(); i++) {
				buffer_x.add(buffer.getExtListString(i, Integer.parseInt(target_x)));
				buffer_y.add(buffer.getExtListString(i, Integer.parseInt(target_y)));
			}

			try {
				int result_x[] = new int[buffer_x.size()];
				for (int i = 0; i < buffer_x.size(); i++) {
					result_x[i] = Integer.parseInt(buffer_x.get(i));
				}
				engine.assign("result_x", result_x);
			} catch(NumberFormatException e) {
				try {
					double result_x[] = new double[buffer_x.size()];
					for (int i = 0; i < buffer_x.size(); i++) {
						result_x[i] = Double.parseDouble(buffer_x.get(i));
					}
					engine.assign("result_x", result_x);
				} catch (NumberFormatException e1) {
					String result_x[] = new String[buffer_x.size()];
					for (int i = 0; i < buffer_x.size(); i++) {
						result_x[i] = buffer_x.get(i);
					}
					engine.assign("result_x", result_x);
				}
			}

			try {
				int result_y[] = new int[buffer_y.size()];
				for (int i = 0; i < buffer_x.size(); i++) {
					result_y[i] = Integer.parseInt(buffer_y.get(i));
				}
				engine.assign("result_y", result_y);
			} catch(NumberFormatException e) {
				try {
					double result_y[] = new double[buffer_y.size()];
					for (int i = 0; i < buffer_x.size(); i++) {
						result_y[i] = Double.parseDouble(buffer_y.get(i));
					}
					engine.assign("result_y", result_y);
				} catch (NumberFormatException e1) {
					String result_y[] = new String[buffer_y.size()];
					for (int i = 0; i < buffer_x.size(); i++) {
						result_y[i] = buffer_y.get(i);
					}
					engine.assign("result_y", result_y);
				}
			}

			engine.eval("frame <- data.frame(X=result_x, Y=result_y)");
			engine.eval(" graph <- plot_ly(frame, x = ~X, y = ~Y)");
			engine.eval("htmlwidgets::saveWidget(as_widget(graph), \"fromjava" + buffer.getExtListString(0, 0) +  ".html\")");
	        engine.end();

			tuples_buffer.addAll(buffer);
			buffer.clear();

		}

		return tuples_buffer;

	}

	/* replace for "max", "min", "sum", "count" */
	private ExtList replace(ExtList tuple, int value, int position, String way) {

		ExtList target;
		StringBuffer tmp = new StringBuffer();
		ExtList result = new ExtList();

//		if (way.equals("count")) {
//			//chie commentout
//			//tmp.append("cnt");
//		} else {
//			tmp.append(way);
//		}

		tmp.append(value);
		target = new ExtList();

		tuple.set(position, tmp.toString());

		result.add(tuple);

		return result;

	}

	/* replace for "avg" */
	private ExtList replace(ExtList tuple, float value, int position, String way) {

		ExtList target;
		StringBuffer tmp = new StringBuffer();
		ExtList result = new ExtList();

		tmp.append(value);
		target = new ExtList();

		tuple.set(position, tmp.toString());

		result.add(tuple);

		return result;

	}

}
