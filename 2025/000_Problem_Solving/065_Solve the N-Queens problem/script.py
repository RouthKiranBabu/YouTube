"""
Python solution for the N-Queens problem using Backtracking.
The function places N queens on an N×N chessboard ensuring no two queens attack each other.
The board is represented as a 2D list where 'Q' indicates a queen and '.' indicates an empty space.
"""

class script:
    def __init__(self, n):
        self.size = n
        self.solutions = []
        self.solve([], 0)
        self.print_solutions()

    def solve(self, board, row):
        if row == self.size:
            self.solutions.append(board[:])
            return

        for col in range(self.size):
            if self.is_valid(board, row, col):
                board.append(col)
                self.solve(board, row + 1)
                board.pop()  # Backtrack

    def is_valid(self, board, row, col):
        for i in range(row):
            if board[i] == col or abs(board[i] - col) == abs(i - row):
                return False
        return True

    def print_solutions(self):
        for solution in self.solutions:
            for col in solution:
                print("." * col + "Q" + "." * (self.size - col - 1))
            print("\n")

# Run the script for N=4
script(4)

"""
OUTPUT (for N=4):
.Q..
...Q
Q...
..Q.

..Q.
Q...
...Q
.Q..

Explanation:
- This Python solution uses backtracking to place queens safely.
- The board is stored as a list where the index represents the row and the value represents the column position of the queen.
"""
