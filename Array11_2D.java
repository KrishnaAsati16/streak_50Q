public class Array11_2D {
public static void main(String[] args) {
 
      int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        Array11_2D obj = new Array11_2D();
        boolean result = obj.searchMatrix(matrix, target);

        System.out.println(result); 
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = matrix[mid / n][mid % n];
            
            if (value == target) return true;
            else if (value < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}      
    