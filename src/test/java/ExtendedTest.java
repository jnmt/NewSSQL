import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import supersql.common.GlobalEnv;
import supersql.extendclass.ExtList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class ExtendedTest {

    @RepeatedTest(5)
    @DisplayName("繰り返すテスト")
    public void repeatedTest() throws Exception{
        FrontEndTest fet = new FrontEndTest();
        fet.Test1();
    }


    @Test
    @DisplayName("resouceにあるファイルを全実行")
    public void runAllFilesTest() throws Exception{
        File file = new File("./src/test/resource/");
        File[] files = file.listFiles();
        System.out.println("実行されるファイルは");
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
        GlobalEnv.setEnv(new Hashtable<>());
        GlobalEnv.getConfig();
        FrontEndTest fet = new FrontEndTest();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isHidden() || !files[i].getName().split("\\.")[1].equals("ssql")){
                continue;
            }
            FileReader fr = new FileReader(files[i]);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer query = new StringBuffer();
            String line = new String();
            while((line = br.readLine()) != null){
                query.append(line);
                query.append(" ");
            }
            query.trimToSize();
            ExtList result_true = fet.execPrevSSQL(query);
            ExtList result_comp = fet.execMultiSSQL(query);
            assertEquals(result_true, result_comp);
            fr.close();
            br.close();
        }

    }

}
