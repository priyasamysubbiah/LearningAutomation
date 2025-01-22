package JavaPrograms;

import org.testng.annotations.Test;

public class CountVowelsAndConsonants {
    static String str = "Madam";

    @Test
    void logic1() {
        char[] ch = str.toLowerCase().toCharArray();
        int count = 0;
        for (char c : ch) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println("Vowels count: "+ count);
        int count1= str.length()-count;
        System.out.println("Consonants count: "+count1);
    }

}
