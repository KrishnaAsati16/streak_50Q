import java.util.Scanner;

public class Array6_2D {
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

        int[] rows = new int[n];
        int[] cols = new int[m];

        // initialize rows and cols with 1
        for (int i = 0; i < n; i++) {
            rows[i] = 1;
        }
        for (int j = 0; j < m; j++) {
            cols[j] = 1;
        }

        // mark rows and columns having zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }

        // set rows to zero
        for (int i = 0; i < n; i++) {
             if (rows[i] == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // set columns to zero
        for (int j = 0; j < m; j++) {
            if (cols[j] == 0) {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = 0;
                }
            }
        }

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
