class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bot = rows - 1;

        while (top <= bot) {
            int middle = (top + bot) / 2;

            if (target > matrix[middle][col - 1]) {
                top = middle + 1;
            } else if (target < matrix[middle][0]) {
                bot = middle - 1;
            } else {
                break;
            }
        }
        if (!(top <= bot)) {
            return false;
        }
        int row = (top + bot) / 2;
        int left = 0;
        int right = col - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > matrix[row][mid]) {
                left = mid + 1;

            } else if (target < matrix[row][mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}