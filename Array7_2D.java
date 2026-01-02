import java.util.Scanner;

public class Array7_2D {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m;
        System.out.print("Enter rows and columns: ");
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
    
}
