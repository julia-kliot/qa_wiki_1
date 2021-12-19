package congigWiki;

import models.Auth;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderMy {

    @DataProvider
    public Iterator<Object[]> loginData() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{Auth.builder().username("juliakliot.jk").password("Misha240613").build()});
        // list.add(new Object[]{Auth.builder().username("juliakliot.jk").password("Misha240613").build()});
        list.add(new Object[]{Auth.builder().username("julia357").password("Misha*$240613").build()});

        return list.iterator();
    }

   @DataProvider
    public Iterator <Object[]> logindatacvs() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("C:/Users/julia/Documents/QA/QA_Automation/QA/qa_wiki_1/src/test/resources/logindata.csv")));
        String line = reader.readLine();
        while (line!=null){
            String[] split = line.split(",");
            list.add(new Object[]{Auth.builder().username(split[0]).password(split[1]).build()});
            line = reader.readLine();
        }

        return list.iterator();
    }



}
