import java.util.*;

public class recursionOne {
    // print numbers from 1 to 5

    // public static void printNumbers (int n){
    //     if (n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n-1);
    // }

    //print sum of the natural number n

    // public static void printSum (int i, int n, int sum){
    //     if (n==i){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    // }

    //calculate factorial of n

    // public static int factorial (int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     else{
    //         return n*factorial(n-1);
    //     }
    // }

    //calculate fibbonacci sequence of n

    // public static void fibbonacci(int a, int b, int n){
    //     if (n == 0){
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     fibbonacci(b, c, n-1);
    // }

    //calculate x^n with stack height n

    // public static int calcPower (int x, int n){
    //     if (n==0) {
    //         return 1;
    //     }
    //     else if(x==0){
    //         return 0;
    //     }
    //     else{
    //         return x*calcPower(x, n-1);
    //     }
    // }

    //calculate x^n with stack height logn

    public static int calcPower (int x, int n){
        if (n==0) {
            return 1;
        }
        else if(x==0){
            return 0;
        }
        else if (n%2 == 0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else{
            return x*calcPower(x, n/2)*calcPower(x, n/2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(calcPower(2, 10));
    }
}
