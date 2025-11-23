import java.util.Scanner;

public class array2 {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array:");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter array elements:");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Reverse logic
//        int start = 0, end = n - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//        System.out.println("Reversed Array:");
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
        // normal condition me

        int[] arr = {1, 5, 8, 6, 98, 78, 45};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reverse logic
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            System.out.println("\nReversed Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

