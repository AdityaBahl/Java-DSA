import java.util.*;
//this

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a % 2 == 0)
            System.out.printf("%d is even!", a);
        else
            System.out.printf("%d is odd!", a);
    }
}