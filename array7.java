
public class array7 {
    public static void main(String[] args) {
              // arr{1,2,3,4,5,6}; d=2
              //d=2-> matlab starting ke 2 element last me kar do      
               // ex={3,4,5,6,1,2}

         int[] arr = {1, 2, 3, 4, 5, 6};
                int d = 1;
                int n = arr.length;

                d = d % n; // important for safety // very imp line
                // d= no of rotation

                reverse(arr, 0, d - 1);   // reverse first part
                reverse(arr, d, n - 1);   // reverse second part
                reverse(arr, 0, n - 1);   // reverse whole array

                // print result
                for (int ele : arr) {
                    System.out.print(ele + " ");
                }
            }

            static void reverse(int[] arr, int i, int j) {
                while (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
    }
    
}
