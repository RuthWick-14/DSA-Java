class Shape {
    String color;
    public void area(){
        System.out.println("displays area.");
    }
}
//Shape inherits triangle (single inheritance)
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println((l*h)/2);
    }
}

//multi-level inheritance
class EquilateralTriangle extends Triangle {
      public void area(int l, int h){
        System.out.println((l*h)/2);
      }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "blue";
    }
}
