/*
 * JavaScript solution for the N-Queens problem using Backtracking.
 * The function places N queens on an N×N chessboard ensuring no two queens attack each other.
 * The board is represented as a 2D array where 'Q' indicates a queen and '.' indicates an empty space.
 */

class script {
    constructor(n) {
        this.size = n;
        this.solutions = [];
        this.solve([], 0);
        this.printSolutions();
    }

    solve(board, row) {
        if (row === this.size) {
            this.solutions.push([...board]);
            return;
        }

        for (let col = 0; col < this.size; col++) {
            if (this.isValid(board, row, col)) {
                board.push(col);
                this.solve(board, row + 1);
                board.pop(); // Backtrack
            }
        }
    }

    isValid(board, row, col) {
        for (let i = 0; i < row; i++) {
            if (board[i] === col || Math.abs(board[i] - col) === Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    printSolutions() {
        for (let solution of this.solutions) {
            let board = solution.map(col => ".".repeat(col) + "Q" + ".".repeat(this.size - col - 1));
            console.log(board.join("\n"));
            console.log("\n");
        }
    }
}

new script(4);

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
 * - This JavaScript solution finds all valid placements using backtracking.
 * - The board configuration is stored as an array where each index represents a row and the value at that index is the column position of the queen.
 */
