package JavaPrograms;

import org.testng.annotations.Test;

public class EvenAndOddFromArray {
    static int [] arr= {22, 165, 12, 0, 1};

    @Test
    void logic1(){
        int sumOdd = 0, sumEven = 0;
        for (int a:arr){
            if(a%2==0){
                sumOdd=sumOdd+a;
            }
            else {
                sumEven=sumEven+a;
            }
        }
        System.out.println("Odd: "+sumOdd);
        System.out.println("Even: "+sumEven);
    }
}
