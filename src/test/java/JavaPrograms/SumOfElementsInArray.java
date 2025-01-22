package JavaPrograms;

import org.testng.annotations.Test;

public class SumOfElementsInArray {
    static int [] arr= {22, 165, 12, 0, 1};

    @Test
    void logic1(){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }

    @Test
    void logic2(){
        int sum = 0;
        for (int a:arr){
            sum = sum+a;
        }
        System.out.println(sum);
    }
}
