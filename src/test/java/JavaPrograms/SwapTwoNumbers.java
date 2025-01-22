package JavaPrograms;

import org.testng.annotations.Test;

public class SwapTwoNumbers {

  static int a = 10, b=20;

  @Test //3rd variable
  public void logic1(){
    int c = a;
    a=b;
    b=c;
    System.out.println("After Swapping a= "+a+ " b= "+ b);
  }

  @Test //+ -
  public void logic2(){
    a = a+b;
    b=a-b;
    a=a-b;
    System.out.println("After Swapping a= "+a+ " b= "+ b);
  }

  @Test // * /
  public void logic4(){
    a = a*b;
    b=a/b;
    a=a/b;
    System.out.println("After Swapping a= "+a+ " b= "+ b);
  }

  @Test //XOR- Bitwise operator
  public void logic3(){
    a =a^b;
    b=a^b;
    a=a^b;
    System.out.println("After Swapping a= "+a+ " b= "+ b);
  }

  @Test //Single statement
  public void logic5(){
    b= a+b -(a=b);
    System.out.println("After Swapping a= "+a+ " b= "+ b);
  }

}
