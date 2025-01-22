package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CheckTwoArraysAreEqual {
    static int [] arr1= {1,2,3,4,7};
    static int [] arr2= {1,2,3,4,5};

    @Test
    void logic1(){
        if(Arrays.equals(arr1,arr2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    @Test
    void logic2(){
        boolean flag = true;
       if(arr1.length==arr2.length){
           for (int i = 0; i<arr1.length; i++){
               if (arr1[i]!=arr2[i]){
                   flag=false;
                   break;
               }
           }
       }
       else
           flag=false;
       if (flag)
           System.out.println("Equal");
       else
           System.out.println("Not Equal");
    }
}
