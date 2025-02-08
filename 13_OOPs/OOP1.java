class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something.");
    }

    public void printColorAndType(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class OOP1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.write();
        pen2.write();

        pen1.printColorAndType();
        pen2.printColorAndType();
    }
}
