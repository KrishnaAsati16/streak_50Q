public class Array2_2D {
     public static void main(String[] args) {

            int[][] arr = {
                    {2, 8, 3, 4},
                    {7, 2, 1, 6},
                    {3, 1, 8, 2},
                    {3, 1, 8, 2}
            };

            print(arr);

            int[][] rotated = rotate90(arr);

            print(rotated);
        }

        public static int[][] rotate90(int[][] arr) {
            int n = arr.length;

            int[][] b = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    b[j][n - 1 - i] = arr[i][j];
                }
            }
            return b;
        }

        private static void print(int[][] arr) {
            for (int[] row : arr) {
                for (int ele : row) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
}
