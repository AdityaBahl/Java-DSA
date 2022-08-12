import java.util.Scanner;
//this

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        System.out.println(sb.charAt(2));
        System.out.println(sb.charAt(3));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.setCharAt(0, 'T'); // to modify value
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(3, 'n'); // to insert in middle or starting
        System.out.println(sb);
        sb.delete(4, 5); // to delete
        System.out.println(sb);
        sb.append("yl"); // to insert at the end in string
        System.out.println(sb);
        sc.close();

    }
}