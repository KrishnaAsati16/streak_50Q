import java.util.ArrayList;

public class Array4_2d {
     static void main(String[] args) {
    }
        public ArrayList< Integer> sprialtransverse(int[][] arr) {
            ArrayList<Integer> ans = new ArrayList<>();
            int m = arr.length, n = arr[0].length;
            int firstRow = 0, lastRow = m - 1, firstCol = 0, lastCol = n - 1;
            while (firstRow <= lastRow && firstCol <= lastCol) {
                // Right
                for (int j = firstCol; j <= lastCol; j++)
                    ans.add(arr[firstRow][j]);
                firstRow++;

                // down

                for (int i = firstRow; i <= lastRow; i++)
                    ans.add(arr[i][lastCol]);
                lastCol--;

                //left

                for (int j = lastCol; j >= firstCol; j++)
                    ans.add(arr[lastRow][j]);
                lastRow--;

                // Up

                for (int i = lastRow; i >= firstRow; i++)
                    ans.add(arr[i][firstCol]);
                firstCol++;

            }
            return ans;
        }
    
}
