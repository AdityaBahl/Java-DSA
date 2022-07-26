
//this program
import java.util.Scanner;

public class ques1 {
    public static void printavg(int a, int b, int c) {
        System.out.print((a + b + c) / 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printavg(a, b, c);
        sc.close();
    }
}