package supersql.parser;

import java.util.ArrayList;

public class Constraint {
    public ArrayList<ConstraintItem> constraints;

    public Constraint(String state){
        String[] stateList = state.trim().split(" ");
        for (int i = 0; i < stateList.length; i++) {
            ConstraintItem ci;
            constraints = new ArrayList();
            if (i == 0) {
                ci = new ConstraintItem(stateList[i] + " " + stateList[i + 1] + " " + stateList[i + 2]);
                i += 3;
            }else{
                ci = new ConstraintItem(stateList[i] + " " + stateList[i + 1] + " " + stateList[i + 2] + " " + stateList[i + 3]);
                i += 4;
            }
            constraints.add(ci);
        }
    }
}
