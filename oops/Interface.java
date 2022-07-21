//
interface Animal {// there can be no constructor in interface
    public void walk();// nor a non abstract function
}

interface Herbivore {
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Interface {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.walk();
    }
}
