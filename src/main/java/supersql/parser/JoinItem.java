package supersql.parser;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.jsqlparser.statement.select.Join;

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
            for (int i = 0; i < constraint.split(" ").length; i = i + 2) {
                String alias = new String();
                String against = new String();
                if (constraint.split(" ")[i].indexOf(".") != -1) {
                    alias = constraint.split(" ")[i].substring(0, constraint.split(" ")[i].indexOf("."));
                }else{
                    alias = constraint.split(" ")[i];
                }
                if (i % 4 == 0) {
                    if (constraint.split(" ")[i + 2].indexOf(".") != -1) {
                        against = constraint.split(" ")[i + 2].substring(0, constraint.split(" ")[i + 2].indexOf("."));
                    } else {
                        against = constraint.split(" ")[i + 2];
                    }
                }else{
                    if (constraint.split(" ")[i - 2].indexOf(".") != -1) {
                        against = constraint.split(" ")[i - 2].substring(0, constraint.split(" ")[i - 2].indexOf("."));
                    } else {
                        against = constraint.split(" ")[i - 2];
                    }
                }
                if(alias.charAt(0) == '('){
                    alias = alias.substring(1);
                }
                if(against.charAt(0) == '('){
                    against = against.substring(1);
                }
                if(alias.charAt(alias.length() - 1) == ')'){
                    alias = alias.substring(0, alias.length() - 1);
                }
                if(against.charAt(against.length() - 1) == ')'){
                    against = against.substring(0, against.length() - 1);
                }
                boolean isCond = false;
                try{
                    Integer.parseInt(alias);
                    isCond = true;
                }catch(NumberFormatException e){

                }
                if(alias.charAt(0) == '\''){
                    isCond = true;
                }
                if (!useTables.contains(alias) && !isCond) {
                    useTables.add(alias);
                }else if(isCond){
//                    System.out.println("alias:::"+this.table.getAlias());
//                    System.out.println("against:::"+against);
                    if(against.equals(this.table.getAlias())){
                        useTables.add("contains_one_side_constraint");
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
