public class array15 {

    int maxSubarraySum(int[] arr) {
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for (int ele : arr) {
            sum += ele;
            maxSum = Math.max(maxSum, sum);

            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        array15 obj = new array15();

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int result = obj.maxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}


    
