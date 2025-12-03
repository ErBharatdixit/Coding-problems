import java.util.ArrayList;  
import java.util.List;  

public class NqueensProblem {  
    public List<List<String>> solveNQueens(int n) {  
        List<List<String>> result = new ArrayList<>();  
        char[][] board = new char[n][n];  
        
        // Initialize the board with '.'  
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {  
                board[i][j] = '.';  
            }  
        }  

        backtrack(result, board, 0);  
        return result;  
    }  

    private void backtrack(List<List<String>> result, char[][] board, int row) {  
        if (row == board.length) {  
            result.add(convertBoardToString(board));  
            return;  
        }  

        for (int col = 0; col < board.length; col++) {  
            if (isSafe(board, row, col)) {  
                board[row][col] = 'Q'; // Place the queen  
                backtrack(result, board, row + 1); // Recur to place the rest  
                board[row][col] = '.'; // Backtrack  
            }  
        }  
    }  

    private boolean isSafe(char[][] board, int row, int col) {  
        // Check this column on the upper side  
        for (int i = 0; i < row; i++) {  
            if (board[i][col] == 'Q') {  
                return false;  
            }  
        }  

        // Check upper diagonal on the left side  
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {  
            if (board[i][j] == 'Q') {  
                return false;  
            }  
        }  

        // Check upper diagonal on the right side  
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {  
            if (board[i][j] == 'Q') {  
                return false;  
            }  
        }  

        return true;  
    }  

    private List<String> convertBoardToString(char[][] board) {  
        List<String> result = new ArrayList<>();  
        for (char[] row : board) {  
            result.add(new String(row));  
        }  
        return result;  
    }  

    public static void main(String[] args) {  
        NqueensProblem nQueens = new NqueensProblem();  
        int n = 5; // Example: for 5 queens  
        List<List<String>> solutions = nQueens.solveNQueens(n);  
        
        System.out.println("Solutions for " + n + " queens:");  
        for (List<String> solution : solutions) {  
            for (String row : solution) {  
                System.out.println(row);  
            }  
            System.out.println();  
        }  
    }  
}