package JavaPrograms;

public class ShiftString {

    static String shift(String value, int count){
        value = value.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
           char ch = value.charAt(i);
           char shifted= (char)((ch - 'A'+count)%26+'A');
           sb=sb.append(shifted);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(shift("Simply", 2));
    }
}
