import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] marks = new int[3]; // also int marks[] = new int[3]; -----> this is valid
        // marks[0] = 97; //physics
        // marks[1] = 98; //chem
        // marks[2] = 95; //maths

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
        //---------------------------------------
        // int marks[] = {97,98,95};
        
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
        //-----------------------------------------
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            System.out.print(numbers[i]);
        }
    }
}
