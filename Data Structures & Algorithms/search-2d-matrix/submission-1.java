class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[c].length; r++) {
                if (matrix[c][r] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}