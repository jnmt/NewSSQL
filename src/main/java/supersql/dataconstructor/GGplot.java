package supersql.dataconstructor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.rosuda.JRI.Rengine;

import supersql.common.Log;
import supersql.extendclass.ExtList;
import supersql.parser.Preprocessor;

public class GGplot {

	/* navigate the whole schema in this method */
	public ExtList ggplot(ExtList criteria_set, ExtList info, ExtList sch, ExtList tuples) {

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
				is_forest = false;
				is_ggplot = false;


				for (int j = 0; j < info.size(); j++) {

					/* "ggplot functions" found */
					if (info.get(j).toString().split(" ")[0].equals(sch.get(i).toString())){

						Log.out("    ggplot found : " + sch.get(i) + " with " + info.get(j).toString().split(" ")[1]);

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


			Log.out("    ggplot process : " + process_set.get(0).toString().split(" ")[0] + " with " + process_set.get(0).toString().split(" ")[1]);
			criteria_set_buffer.add(process_set.get(0).toString().split(" ")[0]);
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


		ExtList buffer = new ExtList();
		ExtList tuples_buffer = new ExtList();
		ExtList tmp = new ExtList();

		ExtList x;
		ExtList y;
		boolean flag = true;

		String target_x;
		String target_y;
		String way;


		Rengine engine;

		if (!Preprocessor.isR()) {
			engine = new Rengine(new String[]{"--vanilla"}, false, null);
			new Preprocessor().setR();

		} else {
			engine = Rengine.getMainEngine();
		}
		 String path = new File(".").getAbsoluteFile().getParent();
//	     System.out.println(path);
		engine.eval("setwd(\"/Users/otawa/Documents/queries/output\")");
		engine.eval(".libPaths(\"" + path + "/lib/site-library\")");
		engine.eval("library(tidyverse)");
		engine.eval("library(plotly)");

		target_x = process.toString().split(" ")[0];
		target_y = process.toString().split(" ")[1];

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
//			System.out.println("buffer:"+buffer);
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

			String name = buffer.getExtListString(0, Integer.parseInt(criteria.getExtListString(0)));
			for (int i = 1; i < criteria.size(); i++) {
				name += "_" + buffer.getExtListString(0, Integer.parseInt(criteria.getExtListString(i)));
			}

			engine.eval("frame <- data.frame(X=result_x, Y=result_y)");
			engine.eval(" graph <- plot_ly(frame, x = ~X, y = ~Y)");

			int n = process.toString().split(" ").length;
			for (int i = 3; i < n; i++) {

				if (process.toString().split(" ")[i].equals("markers") ) {
					engine.eval(" graph <- graph %>% add_trace(mode = \"markers\")");
				}

				if (process.toString().split(" ")[i].equals("line") ) {
					engine.eval(" graph <- graph %>% add_trace(mode = \"line\")");
				}
			}
			engine.eval("htmlwidgets::saveWidget(as_widget(graph), \"" + name + ".html\")");
	        engine.end();

//	        tmp = buffer.getExtList(0);
//	        tmp.set(Integer.parseInt(target_x), "ggplot" + name + ".html");
//	        tmp.set(Integer.parseInt(target_y), name);
//	        tuples_buffer.add(tmp);

	        for (int i = 0; i < buffer.size(); i++) {
	        		buffer.getExtList(i).set(Integer.parseInt(target_x), "ggplot" + name + ".html");
	        		buffer.getExtList(i).set(Integer.parseInt(target_y), name);
	        }
//	        buffer.getExtList(0).set(Integer.parseInt(target_x), "ggplot" + name + ".html");
//	        buffer.getExtList(0).set(Integer.parseInt(target_y), name);
	        tuples_buffer.addAll(buffer);

			buffer.clear();

		}

		return tuples_buffer;

	}
}
