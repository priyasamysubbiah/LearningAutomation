package JavaPrograms;

import org.testng.annotations.Test;

public class RemoveJunkOrSpace {
    static String str = "!@%#$ Pr#@#iya##% 11";
    static String str1 = "Priy a dharsh ini";

    @Test
    void removeJunk(){
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }

    @Test
    void removeSpace(){
        str1=str1.replaceAll("\\s", "");
        System.out.println(str1);
    }
}
