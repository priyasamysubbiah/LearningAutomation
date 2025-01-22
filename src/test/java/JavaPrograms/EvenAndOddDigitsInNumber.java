package JavaPrograms;

import org.testng.annotations.Test;

public class EvenAndOddDigitsInNumber {
  int num = 123456;

  @Test
  void logic1(){
    int even=0, odd=0;
    while (num!=0){
      int rem = num%10;
      num = num/10;
      if (rem%2==0){
        even++;
      }
      else {
        odd++;
      }
    }
    System.out.println("Even: "+even);
    System.out.println("Odd: "+odd);
  }
}
