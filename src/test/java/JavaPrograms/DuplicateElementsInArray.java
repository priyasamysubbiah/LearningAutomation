package JavaPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class DuplicateElementsInArray {
    static String [] arr = {"Java", "Python", "C#", "C", "Java", "React", "Java", "Python"};

    @Test
    void logic(){
        for (int i=0; i<arr.length; i++){
            boolean isDuplicate = false;
            for (int j =i+1; j<arr.length; j++){
                if (arr[i].equalsIgnoreCase(arr[j])){
                    isDuplicate=true;
                    break;
                }
            }
            if (isDuplicate){
                boolean isPrinted = false;
                for (int k = 0; k<i; k++){
                    if (arr[k].equalsIgnoreCase(arr[i])){
                        isPrinted = true;
                        break;
                    }
                }
                if (!isPrinted){
                    System.out.println("Duplicates found: "+arr[i]);
                }
            }
        }

    }

    @Test
    void logic2(){
        Set <String >set = new LinkedHashSet<>();
        Set <String> duplicates = new LinkedHashSet<>();
        for (String value:arr){
            if(!set.add(value)){
                duplicates.add(value);
            }
        }
        for (String v: duplicates){
            System.out.println("Duplicates: "+ v);
        }

    }

    @Test
    void logic3(){
        int [] arr = {1,2,3,5,2,7,2,7};
        Map<Integer, Integer> map = new HashMap<>();
        for (int x: arr){
            if(!map.containsKey(x)){
                map.put(x, 1);
            }
            else {
                map.put(x, map.get(x)+1);
            }
        }
        for (Integer value: map.keySet()){
            if (map.get(value)>1){
                System.out.println("Duplicates: "+value+" is "+map.get(value));
            }
        }
    }

    @Test
    void logic4(){
        String str = "I am Priya Priya";
        String[] arr = str.split(" ");
        Set<String> set =new LinkedHashSet<>();
        for (String x: arr){
            set.add(x);
        }
//        Iterator itr = set.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
        for(String value: set){
            System.out.print(value+" ");
        }
    }
}
