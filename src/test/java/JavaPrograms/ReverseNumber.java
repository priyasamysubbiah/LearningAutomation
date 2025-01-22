package JavaPrograms;

import org.testng.annotations.Test;

public class ReverseNumber {
  static int num = 93845;

  @Test
  public void logic1(){
    int rev=0;
    while (num!=0){
      rev = rev*10+num%10;
      num = num/10;
    }
    System.out.println(rev);
  }

  @Test
  public void logic2(){
    StringBuffer sb = new StringBuffer(String.valueOf(num));
    StringBuffer rev = sb.reverse();
    System.out.println(rev);
  }

  @Test
  public void logic3(){
    StringBuilder sbl = new StringBuilder();
    sbl.append(num);
    sbl.reverse();
    System.out.println(sbl);
  }

}
