package JavaPrograms;

import org.testng.annotations.Test;

public class LastFourCharacters {
    static String str = "www.youtube.com";

    @Test
    void logic1(){
        char[] ch = str.toLowerCase().toCharArray();
        for (int i = str.length()-4; i < str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
    }

    @Test
    void logic2(){
        System.out.println(str.substring(str.length()-4));
    }
}
