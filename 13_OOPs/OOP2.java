class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor called.");    //the constructor had been called when we create Student object
    }
}


public class OOP2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ruthvik";
        s1.age = 22;
        s1.printInfo();
    }
}
