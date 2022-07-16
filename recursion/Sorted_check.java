import java.util.Scanner;

//this program checks whether the array
public class Sorted_check {
    public static int check(int a[], int i) {
        if (i == a.length - 1)
            return 0;
        if (a[i] < a[i + 1])
            return check(a, i + 1);
        else
            return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for (int i = 0; i < n; i++)
        // a[i] = sc.nextInt();
        // for (int i = 0; i < n; i++)
        // System.out.println(a[i] = sc.nextInt());
        int a[] = { 1, 2, 3, 4, 5, 6 };
        if (check(a, 0) == -1)
            System.out.println("Not Sorted");
        else
            System.out.println("Sorted");
        int b[] = { 6, 5, 4, 3, 2, 1 };
        if (check(b, 0) == -1)
            System.out.println("Not Sorted");
        else
            System.out.println("Sorted");
        sc.close();
    }
}
