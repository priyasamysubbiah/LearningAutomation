package JavaPrograms;

import org.testng.annotations.Test;


public class SumOfDigits {
  static int num = 1234;

  @Test
  void sum(){
    int sum = 0;
    while (num!=0){
      sum = sum+(num%10);
      num = num/10;
    }
    System.out.println(sum);
  }
}
