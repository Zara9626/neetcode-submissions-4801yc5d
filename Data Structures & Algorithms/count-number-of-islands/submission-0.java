class Solution {
    
    private final static int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void bfs(char[][] grid, int r, int c) {
        // Create a queue to store coordinates of cells to visit
        Queue<int[]> q = new LinkedList<>();
        // Mark the starting cell as visited by setting it to '0'
        grid[r][c] = '0';
        // Add the starting cell's coordinates to the queue
        q.add(new int[] { r, c });

        // Continue processing while there are cells in the queue
        while (!q.isEmpty()) {
            // Remove and get the first cell from the queue
            int[] node = q.poll();
            // Extract row and column from the node
            int row = node[0], col = node[1];

            // Check all four possible directions (up, right, down, left)
            // 'directions' is assumed to be defined as: 
            // int[][] directions = {{-1,0}, {0,1}, {1,0}, {0,-1}};
            for (int[] dir : directions) {
                // Calculate new coordinates based on current direction
                int nr = row + dir[0]; // new row
                int nc = col + dir[1]; // new column

                // Check if the new coordinates are within grid bounds
                // and if the cell contains '1' (unvisited land)
                if (nr >= 0 && nc >= 0 &&
                        nr < grid.length &&
                        nc < grid[0].length &&
                        grid[nr][nc] == '1') {

                    // Add the new cell to the queue for future processing
                    q.add(new int[] { nr, nc });
                    // Mark the cell as visited immediately to prevent revisiting
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}

        
