public class IfElse {
    public static void main(String[] args) {
        String name  = "Ruthvik";
        int age = 21;

        if (age>=18) {
            System.out.println(String.format("%s, whose age is %d or above is eligible for car license.", name,age));
        }
        else{
            System.out.println(String.format("Sorry %s, you are not eligible for car license.",name));
        }
        // else if also works like python and JS
    }
}

/*String Interpolation  :-  1.) String.format
 *                          2.) printf("%s,%d,%f")
 *                          3.) String Concatenation
 */
