interface Animal{
    int eyes = 2;
    void walk();
}

interface Herbivores {
    void eat();
}

class Horse implements Animal, Herbivores {
    public void walk(){
        System.out.println("walk on 4 legs.");
    }
    public void eat(){
        System.out.println("they eats plants");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
