import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import supersql.codegenerator.CodeGenerator;
import supersql.common.GlobalEnv;
import supersql.dataconstructor.DataConstructor;
import supersql.extendclass.ExtList;
import supersql.parser.From;
import supersql.parser.Start_Parse;

import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class FrontEndTest {

    public ExtList execPrevSSQL(StringBuffer query){
        Start_Parse parser = new Start_Parse(query);
        ExtList result_true = new ExtList();
        if (GlobalEnv.getErrFlag() == 0) {
            CodeGenerator codegenerator = parser.getcodegenerator();
            if (GlobalEnv.getErrFlag() == 0) {
                codegenerator.CodeGenerator(parser);
                GlobalEnv.beforedc = System.currentTimeMillis();
                DataConstructor dc = new DataConstructor(parser);
                GlobalEnv.afterdc2 = System.currentTimeMillis();
                result_true = dc.getData();
            }
        }
        From.clear();
        return result_true;
    }

    public  ExtList execMultiSSQL(StringBuffer query){
        GlobalEnv.setMultiQuery();
        ExtList result_compare = new ExtList();
        Start_Parse parser2 = new Start_Parse(query);
        if (GlobalEnv.getErrFlag() == 0) {
            CodeGenerator codegenerator2 = parser2.getcodegenerator();
            if (GlobalEnv.getErrFlag() == 0) {
                codegenerator2.CodeGenerator(parser2);
                DataConstructor dc2 = new DataConstructor(parser2);
                result_compare= dc2.getData();
            }
        }
        From.clear();
        GlobalEnv.unSetMultiQuery();
        return result_compare;
    }

    @Test
    @DisplayName("一番基礎的なテスト")
    public void Test1() throws Exception{
        GlobalEnv.setEnv(new Hashtable<>());
        GlobalEnv.getConfig();
        StringBuffer query = new StringBuffer();
        query.append("GENERATE HTML\n" +
                "[(asc)c.gender, [count[c.id], [(asc)g.name, count[i.id],[(asc)i.name, sum[b.num]]!]!,(asc)c.byear]!]!\n" +
                "FROM customers c, boughts b, items i, genres g\n" +
                "WHERE c.id = b.cus_id AND g.id = i.gen_id AND i.id = b.item_id AND b.id < 500");
        ExtList result_true = execPrevSSQL(query);
        ExtList result_compare = execMultiSSQL(query);
        assertEquals(result_true, result_compare);
    }

}