public class Array3_2D {
 //   public static void main(String[] a) {
//        int[][] arr = {{2,8,3,4},{7,2,1,6},{3,1,8,2},{3,1,8,2}};
//        print(arr);
//        // transpose
//        int row = a.length;
//        int col = a[0].length();
//        int [] [] b = new int [col][row];
//        for(int i = 0;i<b.length;i++){
//            for(int j=0;j<b[0].length;j++){
//                arr[j][i]= b[i][j];
//            }
//        }
//        print(b);
//    }
//    private static void print(int[][] arr ) {
//        for (int[] a : arr) {
//            for (int ele : a) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4},
                {7, 2, 1, 6},
                {3, 1, 8, 2},
                {3, 1, 8, 2}
        };

        print(arr);

        // transpose
        int row = arr.length;        //  you wrote a.length
        int col = arr[0].length;     //  you wrote a[0].length()

        int[][] b = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[j][i] = arr[i][j]; //  your assignment was reversed
            }
        }

        print(b);
    }

    private static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


    

