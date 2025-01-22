package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Anagrams {
    static String str1= "Silent";
    static String str2 ="Listnn";

    @Test
    void logic1(){
        char [] ch1 = str1.toLowerCase().toCharArray();
        char [] ch2 = str2.toLowerCase().toCharArray();
        boolean flag = false;
        if (ch1.length == ch2.length){
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2)){
                flag = true;
            }
        }

        if(flag){
            System.out.println("Anagrams");
        }else
            System.out.println("Not Anagarams");
    }
}
