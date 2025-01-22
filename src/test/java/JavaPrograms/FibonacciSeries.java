package JavaPrograms;

public class FibonacciSeries {

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
       return fibonacci(n-1)+fibonacci(n-2);
    }

    static void fibo(int n){
        int a= 0, b = 1, sum=0;
        System.out.println();
        System.out.print(a+" "+b+" ");
        for(int i = 2; i<n; i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args){
        int n =10;
        for (int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
        fibo(10);
    }
}
