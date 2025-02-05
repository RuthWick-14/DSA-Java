import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Your name is "+name);

        //Concatenation

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + "@" + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        // //charAt
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }       

        //compare
        String name1 = "Tony";
        String name2 = "Tony";

        //1 s1 > s2 : +ve value
        //1 s1 = s2 : 0
        //1 s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("strings are equal.");
        // }
        // else {
        //     System.out.println("strings are not equal.");
        // }

        //substring(beg index, end index)

        String name3 = "My name is Tony.";

        String name4 = name3.substring(9,name3.length());

        System.out.println(name4);

    }
}
