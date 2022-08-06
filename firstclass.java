import java.util.*;
//this program showcase

class firstclass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();// only takes one word, eg only aditya from aditya bahl
        System.out.println(name);
        String name1 = sc.nextLine();// takes multiple words
        sc.close();
        System.out.println(name1);
    }
}