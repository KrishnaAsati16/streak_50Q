public class Array5_2D 
{
    public static void main(String[] args) 
    {
        // First matrix (2x3)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix (3x2)
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Dimensions
        int rowsA = A.length;       // 2
        int colsA = A[0].length;    // 3
        int rowsB = B.length;       // 3
        int colsB = B[0].length;    // 2

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        // Result matrix (2x2)
        int[][] C = new int[rowsA][colsB];

        // Triple nested loop
        for (int i = 0; i < rowsA; i++) {          // row of A
            for (int j = 0; j < colsB; j++) {      // col of B
                for (int k = 0; k < colsA; k++) {  // iterate over row/col
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    
}
}