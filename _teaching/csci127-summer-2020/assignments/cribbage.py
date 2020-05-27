# -----------------------------------------+
# Your name                                |
# CSCI 127, Program 2                      |
# Last Updated: ???, 2020                  |
# -----------------------------------------|
# A simplified Cribbage scoring system.    |
# -----------------------------------------+


# -----------------------------------------+
# Do not change anything below this line.  |
# -----------------------------------------+

def process_hands(cribbage_input, cards_in_hand):
    number = 1
    for hand in cribbage_input:
        hand = hand.split()
        hand_as_list = []
        for i in range(cards_in_hand):
            hand_as_list.append([hand[0].capitalize(), hand[1].capitalize()])
            hand = hand[2:]
        print_hand(hand_as_list, number)
        evaluate_hand(hand_as_list)
        number += 1

# -----------------------------------------+

def main():
    cribbage_file = open("cribbage.txt", "r")
    process_hands(cribbage_file, 5)
    cribbage_file.close()

# -----------------------------------------+

main()
