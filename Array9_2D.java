public class Array9_2D {
    static void printBoundary(int[][] mat, int rows, int cols) {
        // Step 1: Top row
        for (int i = 0; i < cols; i++) {
            System.out.print(mat[0][i] + " ");
        }

        // Step 2: Right column
        for (int i = 1; i < rows; i++) {
            System.out.print(mat[i][cols - 1] + " ");
        }

        // Step 3: Bottom row (only if more than 1 row)
        if (rows > 1) {
            for (int i = cols - 2; i >= 0; i--) {
                System.out.print(mat[rows - 1][i] + " ");
            }
        }

        // Step 4: Left column (only if more than 1 column)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printBoundary(mat, 4, 4);
    }
}
    
