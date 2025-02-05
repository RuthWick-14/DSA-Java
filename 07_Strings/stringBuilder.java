import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        // set chra at index 0
        
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert char at index 0

        sb.insert(2, 'n');
        System.out.println(sb);

        // delete extra n 

        sb.delete(2,3);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("hello");

        for(int i = 0; i < sb1.length()/2; i++){
            int front = i;
            int back = sb1.length()-1-i; // 5-1-0 = 4

            char frontChar = sb1.charAt(front);
            char backChar = sb1.charAt(back);

            sb1.setCharAt(front, backChar);
            sb1.setCharAt(back, frontChar);
        }

        System.out.println(sb1);
    }
}
