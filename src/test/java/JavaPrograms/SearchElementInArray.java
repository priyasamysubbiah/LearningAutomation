package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SearchElementInArray {
    static int[] arr = {1, 2, 80, 65, 11};

    @Test //linear search
    void logic() {
        int search = 65;
        boolean flag = false;
        for (int value : arr) {
            if (value == search) {
                System.out.println("True");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("False");
        }
    }

    @Test //binary search - faster
    void logic2(){
        int [] a = {1,2,3,4,5,6,7,8,9};
        int l = a[0];
        int h = a[a.length-1];
        int search = 3;
        boolean flag= false;
        while(h>l){
            int m = (l+h) /2;
            if(a[m]==search){
                System.out.println("Element found");
                flag = true;
                break;
            }
            if (a[m]<search){
                l=m+1;
            }
            if (a[m]>search){
                h=m-1;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
    }

    @Test //binary search - Built in
    void logic3(){
        int [] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(a, 10));
        if(Arrays.binarySearch(a, 10)>0){
            System.out.println("Found");
        }
        else
            System.out.println("Not found");
    }
}
