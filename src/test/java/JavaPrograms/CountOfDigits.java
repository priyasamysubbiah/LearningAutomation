package JavaPrograms;

import org.testng.annotations.Test;

public class CountOfDigits {
  static int num =12321;

  @Test
  public void logic1(){
    int count=0;
    while (num!=0){
      num = num/10;
      count++;
    }
    System.out.println(count);
  }
}
