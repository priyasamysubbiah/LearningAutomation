package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class SortWithoutCollections {
    static int[] arr = {1, 2, 80, 65, 11};

    @Test //sort
    void logic() {
        System.out.println("Arrays before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Arrays after: " + Arrays.toString(arr));
    }

    @Test
    void logic2(){
        System.out.println("Arrays before: " + Arrays.toString(arr));
        //Arrays.parallelSort(arr);
        Arrays.sort(arr);
        System.out.println("Arrays after: " + Arrays.toString(arr));
        Integer [] arr1 = {1, 2, 80, 65, 11};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("Reversed " + Arrays.toString(arr1));
    }
}

