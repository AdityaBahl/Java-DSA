//this program is for advanced pattern
public class advancedpattern3 {
    public static void main(String[] args) {
        int a = 1, n = 5, k = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        System.out.println(k);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(" ");
            }
            k--;
            for (int j = 0; j < a; j++)
                System.out.print(a + " ");
            a++;
            System.out.println();
        }
    }
}
