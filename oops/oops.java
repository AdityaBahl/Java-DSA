//this program exhibit
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something about " + color + " " + type + " Pen.");
    }
}

class Student {
    String name;
    int age;

    public void printname() {
        System.out.println(this.name + " " + this.age);
    }

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this.name = name;// this.name => object of the class, name=>parameter passed
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;// this.name => object of the class, name=>parameter passed
        this.age = s2.age;
    }
}

public class oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 20;
        s1.printname();
        Student s2 = new Student(s1);
        s2.printname();
    }
}