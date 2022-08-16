import java.util.*;
//this sta

public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'1' for fries,'2' for pizza, '3' for burger");
        int a = sc.nextInt();
        sc.close();
        switch (a) {
            case 1:
                System.out.println("You got some fries!");
                break;
            case 2:
                System.out.println("You got a pizza!");
                break;
            case 3:
                System.out.println("You got a burger!");
                break;
        }
    }
}
