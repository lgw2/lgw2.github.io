import numpy as np

# ---------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 5: Eight Puzzle
# Your Name
# ---------------------------------------
# A brief overview of the program.
# ---------------------------------------

class EightPuzzle:

    def __init__(self):
        self.solution = np.array([1,2,3,4,5,6,7,8," "])
        self.solution = self.solution.reshape(3,3)

    def __str__(self):
        separator = "+-+-+-+\n"
        answer = separator
        for row in range(3):
            for col in range(3):
                answer += "|" + str(self.puzzle[row][col])
            answer += "|\n"
            answer += separator
        return answer

    def puzzle_1(self):
        self.puzzle = np.array([1,2,3,4,5,6,7,8," "])
        self.puzzle = self.puzzle.reshape(3,3)
        self.blank_x = 2
        self.blank_y = 2

    def puzzle_2(self):
        self.puzzle = np.array([4,1,3,7,2,5,8," ", 6])
        self.puzzle = self.puzzle.reshape(3,3)
        self.blank_x = 2
        self.blank_y = 1

    def swap_positions(self, x1, y1, x2, y2):
        self.puzzle[x1][y1], self.puzzle[x2][y2] = \
                             self.puzzle[x2][y2], self.puzzle[x1][y1]

# ---------------------------------------
# Do not change anything above this line
# ---------------------------------------

# Your solution goes here ...

# ---------------------------------------
# Do not change anything below this line
# ---------------------------------------

def solve(puzzle):
    steps = 0
    print("Puzzle:\n")
    print(puzzle)
    while not puzzle.is_puzzle_solved():
        puzzle.move_blank()
        print(puzzle)
        steps += 1
    print("Congratulations - you solved the puzzle in", steps, "steps!\n")


def main():
    puzzle = EightPuzzle()
    puzzle.puzzle_1()
    solve(puzzle)
    puzzle.puzzle_2()
    solve(puzzle)

# ---------------------------------------

main()
