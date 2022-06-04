import java.util.Scanner;
import java.util.Collections;

public class Print_rev_str {
    public static void rev_str(String s, int iter) {
        System.out.print(s.charAt(iter));
        if (iter > 0)
            rev_str(s, iter - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int siz = s.length();
        // System.out.println(s + "\n" + size);
        rev_str(s, siz - 1);
        System.out.println("\n" + s);
        sc.close();
    }
}