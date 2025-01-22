package JavaPrograms;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

    static String str = "Enter the words words dance";

    @Test
    void logic1(){
        int count = 1;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("Count of words: "+count);
    }

    @Test
    void logic2(){
        String str1 [] = str.split(" ");
        int count = 0;
        for (String value: str1){
            System.out.println(value);
            count++;
        }
        System.out.println("Count of words: "+count);
        System.out.println(str1.length);

    }

    //Count of each words
    @Test
    void logic3(){
        String [] arr = str.split(" ");
        Map<String, Integer> map =new HashMap<>();
        int count = 1;
        for (String value: arr){
            if(!map.containsKey(value)){
                map.put(value, count);
            }
            else
                map.put(value, map.get(value)+1);
        }
        for (String x: map.keySet()){
            System.out.println("Count of "+x+ " is "+map.get(x));
        }
    }

    @Test
    void logic4() {
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word : words ){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Count of "+entry.getKey()+" is "+entry.getValue());
        }
    }

}
