class Solution {
    public boolean isValidSudoku(char[][] board) {
        // this is for rows in sudoku
        for (int row = 0; row < 9; row++) {
            HashSet<Character> set1 = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.')
                    continue;
                if (set1.contains(board[row][i]))
                    return false;
                set1.add(board[row][i]);
            }
        }
        // columns
        for (int col = 0; col < 9; col++) {
            HashSet<Character> set2 = new HashSet<>();
            for (int k = 0; k < 9; k++) {
                if (board[k][col] == '.')
                    continue;
                if (set2.contains(board[k][col]))
                    return false;
                set2.add(board[k][col]);
            }
        }
        // each 3x3 square

        for (int sq = 0; sq < 9; sq++) {
            HashSet<Character> set3 = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    int row = (sq / 3) * 3 + j;
                    int col = (sq % 3) * 3 + i;
                    if (board[row][col] == '.')
                        continue;
                    if (set3.contains(board[row][col]))
                        return false;
                    set3.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
