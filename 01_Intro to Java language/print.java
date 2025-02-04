public class print {
    public static void main(String[] args) {
        System.out.print("Hello World");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

