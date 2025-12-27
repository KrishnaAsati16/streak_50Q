public class Array1_2D {
    public static void main(String[] args) {
         int[][] arr = {{2,8,3,4},{7,2,1,6},{3,1,8,2},{3,1,8,2}};
         print(arr);
         // transpose
       for(int i = 1;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               int temp = arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       }
       print(arr);
    }
    private static void print(int[][] arr ) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
