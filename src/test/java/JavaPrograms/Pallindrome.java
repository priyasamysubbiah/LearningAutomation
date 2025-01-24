package JavaPrograms;

public class Pallindrome {
    static String str ="Madams";

    public static void main(String [] args){
        boolean check = isPallindrome(str);
        System.out.println(str+" is Pallindrome: "+check);
    }

    static boolean isPallindrome(String value){
        value.toLowerCase();
        if(value==null){
            return false;
        }

        if (value.length()<=1){
            return true;
        }

        String first = value.substring(0,1);
        String last = value.substring(value.length()-1, value.length());
        if (!first.equalsIgnoreCase(last)){
            return false;
        }
        else {
            return isPallindrome(value.substring(1, value.length()-1));
        }
    }
}
