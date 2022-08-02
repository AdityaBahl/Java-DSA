import java.util.*;
//this program showcases com

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a == b)
            System.out.printf("%d and %d are Equal", a, b);
        else if (a > b)
            System.out.println(a + " is greater");
        else
            System.out.println(b + " is greater");
    }
}
