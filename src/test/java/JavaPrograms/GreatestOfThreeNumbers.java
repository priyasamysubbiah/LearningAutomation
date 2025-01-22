package JavaPrograms;

import org.testng.annotations.Test;

public class GreatestOfThreeNumbers {
    int a=20, b=40, c=30;

    @Test
    void logic1(){
        if(a>b && a>c){
            System.out.println("A is greater");
        }
        else if (b>a && b>c) {
            System.out.println("B is greater");
        }
        else {
            System.out.println("C is greater");
        }
    }

    @Test  //Ternary operator
    void logic2(){
        //int l = a>b? a:b;
        //l = c>l? c:l;
        int largest = c>(a>b? a:b)? c:(a>b? a:b) ;
        System.out.println(largest +": Largest number");
    }
}
