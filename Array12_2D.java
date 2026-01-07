public class Array12_2D {
      static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}}; 

    private static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;
        grid[i][j] = 0; 
        for (int[] d : dirs) dfs(grid, i + d[0], j + d[1]);
    }

    public static int countIslands(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) {
                    count++;
                    dfs(grid, i, j);
                }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1,1,0,0,0},
            {1,1,0,0,0},
            {0,0,1,0,0},
            {0,0,0,1,1}
        };
        System.out.println("Number of islands: " + countIslands(grid));
    }

    
}
