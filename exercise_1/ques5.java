import java.util.Scanner;

public class ques5 {
    public static void vote(int age) {
        if (age > 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Ineligible to vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        vote(a);
        sc.close();
    }
}