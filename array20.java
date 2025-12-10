import java.util.Arrays;

public class array20 { 
     public static void mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = n - 1; // last index of arr1
        int j = 0;     // first index of arr2

        // Step 1: Swap elements if arr1[i] > arr2[j]
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        // Step 2: Sort both arrays again
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        mergeArrays(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));

    
}
}
