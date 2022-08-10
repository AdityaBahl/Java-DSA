import java.util.*;
//t

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a > 18)
            System.out.printf("Person With %d age is adult", a);
        else
            System.out.println(a + " is not an adult");
    }
}
