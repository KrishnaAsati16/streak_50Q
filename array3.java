import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        
        // find the kth max and min element of an array
    
        int[] arr = {12, 3, 5, 7, 19, 4};
        int k = 2;  // change k value as needed
        
        Arrays.sort(arr); // sort array in ascending order
        
        int kthMin = arr[k - 1];                // Kth minimum = index (k-1)
        int kthMax = arr[arr.length - k];       // Kth maximum = index (n-k)
        
        System.out.println("Kth Minimum element = " + kthMin);
        System.out.println("Kth Maximum element = " + kthMax);
    }
}



    
