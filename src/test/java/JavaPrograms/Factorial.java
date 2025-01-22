package JavaPrograms;

import org.testng.annotations.Test;

public class Factorial {
    static int num = 6;

    @Test
    void logic1(){
        long f=1;
        for(int i =1; i<=num; i++){
            f = f*i;
        }
        System.out.println(f);
        long f1=1;
        for (int i =num; i>=1; i--){
            f1=f1*i;
        }
        System.out.println(f1);
    }

    static int factorial(int n){
        if(n<=1){
            return n;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args){
       System.out.println(factorial(5));

    }
}
