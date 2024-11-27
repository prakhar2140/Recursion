import java.util.ArrayList;
import java.util.List;

class NQueenProblem {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board, 0, ans);
        return ans;
    }

    static void queen(char[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(makeString(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                queen(board, row + 1, ans);
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // for checking vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // for checking left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false;
            }
        }
        // for checking right diagonal
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static List<String> makeString(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row)); // Convert char array to String
        }
        return result; // Return the list of strings
    }

    public static void main(String[] args) {
        NQueenProblem nQueen = new NQueenProblem();
        int n = 4; // Change this to any number of queens you want to solve for
        List<List<String>> solutions = nQueen.solveNQueens(n);

        // Print all the solutions
        System.out.println("All solutions for " + n + " queens:");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
