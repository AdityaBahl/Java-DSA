//this program is for
public class advancedpattern2 {
    public static void main(String[] args) {
        int n = 5, k = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(" ");
            k--;
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}