package JavaPrograms;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    static String str = "Selenium is a testing tool";

    @Test
    void logic1(){
        str = str.replaceAll("\\s", "").toLowerCase();
        boolean isDuplicate = false;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    isDuplicate=true;
                    count++;
                }
            }
            if (isDuplicate){
                boolean isPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (str.charAt(k)==str.charAt(i)){
                        isPrinted = true;
                        break;
                    }
                }
                if (!isPrinted && count>1){
                    System.out.println(str.charAt(i) + " occurs "+ count + " times ");
                }
            }
        }
        if(!isDuplicate){
            System.out.println("No duplicates found");
        }
    }

    @Test
    void logic2(){
        str = str.replaceAll("\\s", "").toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }
            else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }
        for (Character ch : map.keySet()){
            if (map.get(ch)>1){
                System.out.println(ch+" occurs "+ map.get(ch)+" times ");
            }
        }
    }
}
