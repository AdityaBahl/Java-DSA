import java.util.Scanner;

public class ques8 {
    static int zero = 0, pos = 0, neg = 0;

    public static int power(int x, int n) {
        return (int) Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
}
