import java.util.Scanner;
//this program showcas

public class factorialrecur {
    public static void printfact(int n) {
        if (n < 1) {
            System.out.println("Invalid, no less than 1");
            return;
        }
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        System.out.print(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        printfact(a);
    }
}
