package JavaPrograms;

import org.testng.annotations.Test;

public class ReverseString {
  static String str = "Priya";

  @Test
  public void logic1(){
    String rstr="";
    for (int i =0; i<str.length(); i++){
      rstr=str.charAt(i)+rstr;
    }
    System.out.println(rstr);
  }

  @Test
  public void logic2(){
    String rstr="";
    char [] ch = str.toCharArray();
    for (int i =0; i< ch.length; i++){
      rstr=str.charAt(i)+rstr;
    }
    System.out.println(rstr);
  }

  @Test
  public void logic3(){
    StringBuffer sb = new StringBuffer(str);
    sb.reverse();
    System.out.println(sb);
  }
}
