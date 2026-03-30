class Solution {
    private static final int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int area = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    area = Math.max(area, dfs(i, j, grid));

                }
            }
        }
        return area;
    }

    private int dfs(int row, int col, int[][] grid) {
        if (row < 0 || col < 0 || col >= grid[0].length || row >= grid.length || grid[row][col] == 0) {
            return 0;
        }
        grid[row][col] = 0;
        int res = 1;
        for (int[] dir : directions) {
            res += dfs(row + dir[0], col + dir[1], grid);
        }
        return res;
    }
}
