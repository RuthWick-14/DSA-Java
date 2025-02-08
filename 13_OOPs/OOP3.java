class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;      //the "name" on RHS comes from "String name" inside Student(...........) while the "name" comes from class.
        this.age = age;
    }
}

public class OOP3 {
    public static void main(String[] args) {
        Student s1 = new Student("Ruthvik", 22);
        s1.printInfo();
    }
}
