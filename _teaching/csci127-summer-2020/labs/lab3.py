# --------------------------------------
# CSCI 127, Lab 3                      |
# May 28, 2020                         |
# --------------------------------------
# Calculate the length of a string     |
# using three techniques.              |
# --------------------------------------

def length_built_in(sentence):
    pass

def length_iterative(sentence):
    pass

def length_recursive(sentence):
    pass

# --------------------------------------

def main():
    answer = "yes"
    while (answer == "yes") or (answer == "y"):
        sentence = input("Please enter a sentence: ")
        sentence = sentence.lower()
        print()
        print("Calculating length of the sentence using ...")
        print("---------------------------------------")
        print("Built-in function =", length_built_in(sentence))
        print("Iteration =", length_iterative(sentence))
        print("Recursion =", length_recursive(sentence))
        print()
        answer = input("Would you like to continue: ").lower()
        print()

# --------------------------------------

main()
