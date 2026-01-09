 import java.util.Scanner;
public class Array14_2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] row = new int[n];
        int[] column = new int[m];

        // Initialize row and column arrays with 0
        for (int i = 0; i < n; i++) {
            row[i] = 0;
        }

        for (int j = 0; j < m; j++) {
            column[j] = 0;
        }

        // Mark rows and columns that contain 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        // Set entire row to 1
        for (int i = 0; i < n; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        // Set entire column to 1
        for (int j = 0; j < m; j++) {
            if (column[j] == 1) {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = 1;
                }
            }
        }

        // Print output matrix
        System.out.println("Output matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
   

