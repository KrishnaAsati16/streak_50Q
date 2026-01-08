//import java.util.*;
public class Array13_2D {
    public static int findMedian(int[][] matrix, int R, int C) {

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum elements
        for (int i = 0; i < R; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][C - 1]);
        }

        int required = (R * C) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            // Count elements <= mid
            for (int i = 0; i < R; i++) {
                count += upperBound(matrix[i], mid);
            }

            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    // Upper bound: first index with value > target
    private static int upperBound(int[] row, int target) {
        int l = 0, h = row.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (row[m] <= target)
                l = m + 1;
            else
                h = m;
        }
        return l;
    }
}
