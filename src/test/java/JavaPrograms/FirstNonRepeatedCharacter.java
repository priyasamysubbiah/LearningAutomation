package JavaPrograms;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    String str = "Swiss";

    @Test
    void logic1() {
        char[] ch = str.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(ch[i] + " is first non repetitive character");
                break;
            }
        }

    }

    @Test
    void logic2(){
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase();
        int count = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), count);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c+" is first non repetitive character");
                break;
            }
        }
    }
}

