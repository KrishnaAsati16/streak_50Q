

    import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to count
        System.out.print("Enter element to count: ");
        int n = sc.nextInt();

        // Count occurrences
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == n) {
                count++;
            }
        }

        // Output result
        System.out.println("Element " + n + " occurs " + count + " times.");
    }
}
    
