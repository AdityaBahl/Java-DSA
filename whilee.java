import java.util.Scanner;
//this progr

public class whilee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while (i <= a) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}