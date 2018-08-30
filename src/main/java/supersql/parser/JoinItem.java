package supersql.parser;

import net.sf.jsqlparser.statement.select.Join;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinItem {
    public String method;
    public String constraint;
    public FromTable table;
    private String statement;
    private boolean isSimple = true;

    public JoinItem(Join join){
        statement = join.toString();
        if(!join.isSimple()){
            List<String> joinList = Arrays.asList(join.toString().split(" "));
            int idx = joinList.indexOf("JOIN");
            method = new String();
            for (int i = 0; i <= idx; i++) {
                method += (joinList.get(i) + " ");
            }
            method.trim();

            constraint = join.getOnExpression().toString();
            isSimple = false;
        }
        table = new FromTable(join.getRightItem().toString());
    }

    public ArrayList<String> getUseTables(){
        ArrayList<String> useTables = new ArrayList<>();
        try {
            for (int i = 0; i < constraint.split(" ").length; i++) {
                if (constraint.split(" ")[i].indexOf(".") != -1) {
                    String alias = constraint.split(" ")[i].substring(0, constraint.split(" ")[i].indexOf("."));
                    if(alias.charAt(0) == '('){
                        alias = alias.substring(1);
                    }
                    if (!useTables.contains(alias)) {
                        useTables.add(alias);
                    }
                }
            }
        }catch(NullPointerException e){
            return new ArrayList<String>();
        }
        return useTables;
    }

    public boolean isSimple() {
        return isSimple;
    }

    public String getStatement(){
        return statement;
    }
}
