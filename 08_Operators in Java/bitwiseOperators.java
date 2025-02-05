import java.util.*;

public class bitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Get 

        // int n = 5; // 0101
        // int pos = 3;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("Bit was zero.");
        // }
        // else {
        //     System.out.println("Bit was one.");
        // }

        //Set

        // int n = 5; // 0101
        // int pos = 3;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;

        // System.out.println(newNumber);

        //Clear

        // int n = 5; // 0101
        // int pos = 2;
        // int bitMask = 1<<pos;

        // int notbitMask = ~(bitMask);

        // int newNumber = notbitMask & n;

        // System.out.println(newNumber);

        // Update 

        int n = 5; // 0101
        int pos = 3;
        int oper = 1;  //update bit to 1 else update bit to 0

        int bitMask = 1<<pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            int notbitMask = ~(bitMask);
            int newNumber = notbitMask & n;
            System.out.println(newNumber);
        }
    }
}
