import java.util.Arrays;

public class array14 {
    // Approach 1
    // public static void main(String[] args) {
    //     int arr[] = {4,8,10,2,5,7,5,2,6,6,12,0};
    //     int target = 12;
    //     System.out.println("Pairs = " + target + ":");
          
    //     for(int i=0;i<arr.length;i++){
    //       for(int j=0;j<arr.length;j++){
    //         if(arr[i]+arr[j]==target) 
    //             System.out.println(arr[i] + ", " + arr[j]);
                
    //         }

    //       }
              // Approach 2

           //   TWO POINTER 
              public static void main(String[] args) {
        int[] arr = {4,8,10,2,5,7,5,2,6,6,12,0};
        int target = 12;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        System.out.println("Pairs = " + target + ":");

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + ", " + arr[right]);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
              }
            }
    
    
