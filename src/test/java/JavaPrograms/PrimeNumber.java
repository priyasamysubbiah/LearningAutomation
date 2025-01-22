package JavaPrograms;

import org.testng.annotations.Test;

public class PrimeNumber {
    static int num=20;
    @Test
    void primeNumber(){
        boolean flag = false;
        for (int i = 2; i<=num/2; i++){
            int r = num%i;
            if(r==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }
}
