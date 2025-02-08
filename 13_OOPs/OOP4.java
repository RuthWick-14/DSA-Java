class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s){
        this.name = s.name;      
        this.age = s.age;
    }
    Student(){

    }
}

public class OOP4 {
    public static void main(String[] args) {
        Student s1 = new Student(); //we have to define this function seperately 
        s1.name = "Ruthvik";
        s1.age = 22;

        s1.printInfo();
    }
}
