import java.util.Arrays;


public class array11 { 
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int posIndex = 0, negIndex = 0;

        // Count positives and negatives
        for (int x : arr) {
            if (x >= 0) posIndex++;
            else negIndex++;
        }

        // Separate positives and negatives
        int[] pos = new int[posIndex];
        int[] neg = new int[negIndex];
        posIndex = 0; negIndex = 0;
        for (int x : arr) {
            if (x >= 0) pos[posIndex++] = x;
            else neg[negIndex++] = x;
        }

        // Merge alternately
        int i = 0, p = 0, q = 0;
        while (p < pos.length && q < neg.length) {
            result[i++] = pos[p++];
            result[i++] = neg[q++];
        }
        while (p < pos.length) result[i++] = pos[p++];
        while (q < neg.length) result[i++] = neg[q++];

        // Copy back to original array
        for (i = 0; i < n; i++) arr[i] = result[i];
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -9, -4,59, -5,89, 6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
    
