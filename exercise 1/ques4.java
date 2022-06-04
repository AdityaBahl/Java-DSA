import java.util.Scanner;

public class ques4 {
    public static double radtocircum(int rad) {
        return 2 * rad * 3.142;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(radtocircum(a));
        sc.close();
    }
}