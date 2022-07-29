import java.util.Scanner;

//this program showcases right and left shift
public class bit_manipulation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a >> 1);
        System.out.println(a << 1);
        sc.close();
    }
}