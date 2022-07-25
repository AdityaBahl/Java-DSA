//
public class pattern8 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++, k++)
                System.out.print(k + " ");
            System.out.print("\n");
        }
    }
}