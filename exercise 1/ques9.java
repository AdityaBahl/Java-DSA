import java.util.Scanner;

public class ques9 {
    public static int gcd(int x, int n) {
        int temp = 1;
        int min = (x >= n) ? n : x;
        for (int i = min; i > 0; i--) {
            if (x % i == 0 && n % i == 0) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(gcd(x, n));
        sc.close();
    }
}
