//this program show
abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new Animal");
    }

    public void eats() {
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eats();
    }
}
