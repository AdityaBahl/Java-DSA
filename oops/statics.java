//this
class Student {
    String name;
    static String school;

    void show() {
        System.out.println(name + " in " + school);
    }
}

public class statics {
    public static void main(String args[]) {
        Student.school = "Graphic Era";
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.show();
    }
}
