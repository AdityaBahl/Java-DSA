import java.util.Scanner;
//this program showcases functio

public class function {
    public static int solve(int a) {
        return a + a + a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(solve(a));
        sc.close();
    }
}