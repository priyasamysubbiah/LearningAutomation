package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxAndMinInArray {
    static int[] a = {10, 600, 234, 610, 0, 222, -90};

    @Test
    void logic1(){
        int max = a[0];
        int min = a[0];
        for (int value:a){
            if(value>max){
                max=value;
            }
            else if (value<min){
                min = value;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    @Test
    void logic2(){
        Integer arr[] = {10, 600, 234, 610, 0};
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int min = list.getFirst();
        int max = list.get(list.size()-1);
        System.out.println(max);
        System.out.println(min);
    }



}
