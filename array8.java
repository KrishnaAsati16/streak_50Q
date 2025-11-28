public class array8 {
   public static boolean isSorted(int[] arr) {

                  // check sorting    
                 //Simple Loop Check (Ascending Order)
    
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {   // if previous > next → not sorted
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if (isSorted(arr))
            System.out.println("Array is sorted");
        else
            System.out.println("Array is NOT sorted");


           // ROTATE THE ARRAY

           int d = 2;
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
    

