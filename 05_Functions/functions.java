import java.util.*;

public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static void factorial(int a){
        int factor = 1;
        if(a<0){
            System.out.println("Invalid Number : Factorial cannot have negative values");
            return;
        }
        for (int i = a; i > 0; i--) {
            factor = factor*i;
        }
        System.out.println(factor);
        return;
        // in void, only return will work but not in int function, else in int we have to return with integer value.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(name);

        int sum = sum(a, b);
        System.out.println(sum);

    }
}
