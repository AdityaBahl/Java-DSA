import java.util.Scanner;

public class ques7 {
    static int zero = 0, pos = 0, neg = 0;

    public static void nums(int a) {
        if (a == 0)
            zero += 1;
        else if (a > 0)
            pos += 1;
        else
            neg += 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            nums(b);
        }
        sc.close();
        System.out.println("Number of zeroes:    " + zero);
        System.out.println("Number of positives: " + pos);
        System.out.println("Number of negatives: " + neg);
    }
}
