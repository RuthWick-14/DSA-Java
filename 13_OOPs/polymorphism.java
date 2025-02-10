class Person {
    String name;
    int age;
    boolean type;

    //polymorphism

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+ "-"+ age);
    }

    public void printInfo(boolean type){
        System.out.println(type);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printInfo("Ruthvik", 22);
        p1.printInfo(true);
        
    }
}
