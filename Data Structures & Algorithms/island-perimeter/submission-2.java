class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int peri = 0;

        for (int i = 0; i < row; i++) {
            for (int t = 0; t < grid[i].length; t++) {
                if (grid[i][t] == 1) {
                    peri += 4;
                    if (i > 0 && grid[i - 1][t] == 1) {
                        peri -= 2;
                    }
                    if (t > 0 && grid[i][t - 1] == 1) {
                        peri -= 2;
                    }
                }
            }
        }
        return peri;
    }
}
