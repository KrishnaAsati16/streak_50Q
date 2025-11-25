public class array5 {

    // Rearrange array: negatives at beginning, positives at end
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7, 8};

        rearrange(arr);

        // Print result
        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to rearrange array
    static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // If left is negative, it's fine → move forward
            if (arr[left] < 0) {
                left++;
            }
            // If right is positive, it's fine → move backward
            else if (arr[right] > 0) {
                right--;
            }
            // Swap positive on left with negative on right
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
    


