package JavaPrograms;

public class ArraysValidation {

    public static int squareOfSumOfDigits(int n){
        int sum=0, r;
        while(n!=0){
            r=n%10;
            n=n/10;
            sum=sum+(r*r);
        }
        return sum;
    }

    public static boolean isValid(int n){
        return squareOfSumOfDigits(n)==n;
    }

    public static void main(String[] args){
        int [] arr = {12, 24, 86, 23, 1};
        for(int num : arr){
            if(isValid(num)){
                System.out.println(num);
            }
        }
    }

}
