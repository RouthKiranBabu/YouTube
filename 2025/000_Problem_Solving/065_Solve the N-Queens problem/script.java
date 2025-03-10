/*N-Queens Problem Explanation
The N-Queens problem is a classic combinatorial problem where we need to place N queens on an N×N chessboard so that no two queens threaten each other. This means:

No two queens can be in the same row.
No two queens can be in the same column.
No two queens can be on the same diagonal.
We use Backtracking to explore different configurations recursively and backtrack when a conflict occurs.*/
/*
 * Java solution for the N-Queens problem using Backtracking.
 * This program places N queens on an N×N chessboard so that no two queens attack each other.
 * The board is represented as a 2D array where 'Q' indicates a queen and '.' indicates an empty space.
 * The solution is displayed in a readable format.
 */

 import java.util.ArrayList;
 import java.util.List;
 
 public class script {
     private int size;
     private List<List<String>> solutions;
 
     public script(int n) {
         this.size = n;
         this.solutions = new ArrayList<>();
         char[][] board = new char[n][n];
 
         // Initialize board with '.'
         for (int i = 0; i < n; i++)
             for (int j = 0; j < n; j++)
                 board[i][j] = '.';
 
         solve(board, 0);
         printSolutions();
     }
 
     private void solve(char[][] board, int row) {
         if (row == size) {
             addSolution(board);
             return;
         }
 
         for (int col = 0; col < size; col++) {
             if (isValid(board, row, col)) {
                 board[row][col] = 'Q';
                 solve(board, row + 1);
                 board[row][col] = '.'; // Backtrack
             }
         }
     }
 
     private boolean isValid(char[][] board, int row, int col) {
         // Check column
         for (int i = 0; i < row; i++)
             if (board[i][col] == 'Q') return false;
 
         // Check diagonal left
         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
             if (board[i][j] == 'Q') return false;
 
         // Check diagonal right
         for (int i = row, j = col; i >= 0 && j < size; i--, j++)
             if (board[i][j] == 'Q') return false;
 
         return true;
     }
 
     private void addSolution(char[][] board) {
         List<String> solution = new ArrayList<>();
         for (char[] row : board)
             solution.add(new String(row));
         solutions.add(solution);
     }
 
     private void printSolutions() {
         for (List<String> solution : solutions) {
             for (String row : solution)
                 System.out.println(row);
             System.out.println();
         }
     }
 
     public static void main(String[] args) {
         int n = 4; // Change N as needed
         new script(n);
     }
 }
 
 /*
  * OUTPUT (for N=4):
  * .Q..
  * ...Q
  * Q...
  * ..Q.
  *
  * ..Q.
  * Q...
  * ...Q
  * .Q..
  *
  * Explanation:
  * - The program successfully places N queens in different ways.
  * - It uses backtracking to explore valid placements recursively.
  */
 