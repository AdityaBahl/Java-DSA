//un-comment example
//This program 

//function overloading
/*class Shape {
    String color;

    public void area() {
        System.out.println("display are");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Equilateral extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";// meaning shape is inherited by triangle class
    }
}*/
class Shape {
    public void area() {
        System.out.println("display are");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";// meaning shape is inherited by triangle class
    }
}