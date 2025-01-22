package JavaPrograms;

import org.testng.annotations.Test;


public class ReverseWordsInString {

    static String str = "Enter the words dance";

    @Test
    void logic1(){
        String reverseString="";
        String [] arr = str.split(" ");
        for (String value:arr){
            String reverseWord="";
            for (int i = 0; i<value.length(); i++){
                reverseWord=value.charAt(i)+reverseWord;
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }

    @Test
    void logic2(){
        String [] arr = str.split(" ");
        for (String value:arr){
            StringBuilder sb = new StringBuilder(value);
            System.out.print(sb.reverse()+" ");
        }
    }

    @Test
    void logic3(){
        String [] arr = str.split(" ");
        String reversed= "";
        for (String value:arr){
            reversed = value + " " +reversed;
        }
        System.out.println(reversed);
    }
}
