package JavaPrograms;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesString {
    static String str = "Priya dharshini";

    @Test
    void logic1(){
        int c = str.length();
        int c1= str.replaceAll("a", "").length();
        int count = c-c1;
        System.out.println("A occurs "+ count);
    }

    @Test
    void logic2(){
        String str1 = str.replaceAll("\\s", "");
        Map<Character, Integer> map = new HashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getKey()=='a'){
                System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times ");
            }

        }
    }

}
