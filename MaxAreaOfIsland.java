public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxSqr = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    maxSqr = Math.max(maxSqr, dfs(i, j, grid));
                }
            }
        }
        return maxSqr;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        int sqr = 0;
        grid[i][j] = 0;
        sqr = 1 + (dfs(i - 1, j, grid) + dfs(i + 1, j, grid) + dfs(i, j - 1, grid) + dfs(i, j + 1, grid));
        return sqr;
    }
}
