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
    @Test
    @DisplayName("一番基礎的なテスト")
    public void Test1() throws Exception{
        GlobalEnv.setEnv(new Hashtable<>());
        GlobalEnv.getConfig();
        StringBuffer query = new StringBuffer();
        query.append("GENERATE HTML [c.name, [s.dept, [ps.score, (asc)s.name]!]!, [t.dept, [t.name, pt.score]!]!]! FROM class c, performance_s ps, performance_t pt, teacher t, student2 s WHERE ps.c_id = c.id AND ps.s_id = s.id AND pt.c_id = c.id AND pt.t_id = t.id");
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
        System.out.println("true:::"+result_true);
        System.out.println("comp:::"+result_compare);
        assertEquals(result_true, result_compare);
    }

}
