// abstract is a concept in which the class is created is just a blueprint, we cannot edit, it is like that they exist
abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("You are creating an animal.");
    }
    public void eat(){
        System.out.println("animal can eat.");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("created a horse.");
    }
    public void walk(){
        System.out.println("they walk on 4 legs.");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("they walked on 2 legs.");
    }
}

public class animal {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // Animal animal = new Animal();           //this will throw an error due abstract concept.
        // animal.walk();   
    }
}
