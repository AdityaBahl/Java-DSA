import java.util.Scanner;
import java.util.Collections;

//first and last occurence in a
public class First_last_occurence {
    public static int first = -1;
    public static int last = -1;

    public static void func(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        func(str, idx + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abaacdaefaah";
        // char find = sc.nextcharAt();
        func(s, 0, 'a');
        // System.out.println(f + " " + l);
        sc.close();
    }
}