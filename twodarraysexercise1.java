import java.util.Scanner;
//this program showcases a 2-D array exercises

public class twodarraysexercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x)
                    System.out.print((i + 1) + " " + (j + 1));
            }
            System.out.println();
        }
        sc.close();
    }
}
