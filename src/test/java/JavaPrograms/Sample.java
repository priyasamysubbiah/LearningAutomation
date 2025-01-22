package JavaPrograms;

public class Sample {

    static void nonRepeatingCharacter(String str){
        //String str = "Swiss";
        char [] arr = str.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(arr[i] +" is the first non repetitive character");
                break;
            }
        }
    }

    static void permutations(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String value= str.substring(0,i)+ str.substring(i+1);
            permutations(value,ans+ch);
        }
    }

    static void majorityElement(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            int count=1;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    flag=true;
                    count++;
                }
            }
            if(count> arr.length/2){
                System.out.println("Majority Element: "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        //nonRepeatingCharacter("Hello");
        //permutations("ABCD","");
        majorityElement(new int[]{2, 2, 3, 4, 2, 4, 4, 4, 4});
    }
}
