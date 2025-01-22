package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MissingNumbersInArray {
    int arr[]={1,5,7,10};

    @Test
    void logic1(){
        for (int i = 0; i<arr.length-1; i++){
            for (int j= arr[i]+1; j<arr[i+1];j++){
                System.out.print(j+" ");
            }
        }
    }

    @Test
    void logic2(){
        Integer arr1[]={1,5,7,10};
        List<Integer> list = Arrays.asList(arr1);
        for (int i =arr1[0];i<=arr1[arr.length-1]; i++){
            if (!list.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
