package supersql.dataconstructor;

import java.util.ArrayList;

import supersql.common.GlobalEnv;
import supersql.common.Log;
import supersql.extendclass.ExtList;

public class Limiter{
  private int att;
  private int value;
  private int maxDepth = 0;
  private int limitDepth;
  private int grouperNum;
  private boolean limitFlag = false;

  public Limiter(){

  }

  public Limiter(int a, int v){
    att = a - 1;
    value = v;

    Log.out("Create Limiter Object.");
    Log.out("Attribute Number is " + att);
    Log.out("Limit value is " + value);
  }

  public void initMaxDepth(){
    maxDepth = 0;
  }

  public int getLimitDepth(){
    return limitDepth;
  }

  public boolean getLimitFrag(){
    if (limitFlag == false){
      return limitFlag;
    }
    GlobalEnv.limit.get(0).selfDestory();
    return limitFlag;
  }

  public void findGrouper(String tfe_tree){
    String grouper = "grouper";
    grouperNum = (tfe_tree.length() - tfe_tree.replaceAll(grouper, "").length()) / grouper.length();
    Log.out("Grouper which @{limit} has " + grouperNum);
  }

  public /*boolean*/void haveLimitAttribute(ExtList sch){
    Log.out("Search Attribute : " + att + " at " + sch);
    maxDepth++;
    int c;
    Object obj;
    for (int idx = 0; idx < sch.size(); idx++) {
      obj = sch.get(idx);

      if (obj instanceof ExtList) {
        haveLimitAttribute((ExtList) obj);
        // maxDepth--;
      }
      else if(((Integer) obj) == att){
        Log.out("This sch has limit attribute! Attribute is " + att);
        Log.out("The maxDepth of this sch is " + maxDepth);
        Log.out("The grouperNum is " + grouperNum);
        limitDepth = maxDepth - grouperNum;
        Log.out("The limitDepth is " + limitDepth);
        GlobalEnv.realLimit.addElement(value, limitDepth);
        // GlobalEnv.limit.get(0).selfDestory();
        limitFlag = true;
        // return true;
      }
    }
    // maxDepth = 0;
    // return false;
  }

  public void selfDestory(){
    Log.out("Destory");
    GlobalEnv.limit.remove(0);
    GlobalEnv.limit.remove(0);
  }

  public class RealLimiter {
    private ArrayList<Integer> realValue = new ArrayList<Integer>();
    private ArrayList<Integer> realLimitDepth = new ArrayList<Integer>();

    private class LimitTuples {
      public ExtList[] tuple;
    }
    private ArrayList<LimitTuples> limitTuples = new ArrayList<LimitTuples>();

    public RealLimiter() {

    }

    public void addElement(int value, int depth){
      realValue.add(value);
      realLimitDepth.add(depth);
    }

    public void logStatus(){
      for (int i = 0; i < realValue.size(); i++){
        Log.out("realValue is " + realValue.get(i));
      }
      for (int i = 0; i < realLimitDepth.size(); i++){
        Log.out("realLimitDepth is " + realLimitDepth.get(i));
      }
    }

    public ArrayList<Integer> getRealDepth(){
      return realLimitDepth;
    }

    // public void logLimitHeadTuple (ExtList t) {
    //   LimitTuples list = new LimitTuples();
    //   list.tuple = t;
    //   list.value = v;
    //   list.depth = d;
    //   limitTuples.add(list);
    // }
  }
}
