class Card:
    """Card class for representing and manipulating one playing card"""

    def __init__(self, rank, suit):
        """A constructor method that sets the suit and rank"""
        self.suit = suit
        self.rank = rank
        self.value = self.assign_value(rank)

    def get_suit(self):
        """A reader method that returns the suit of the card"""
        return self.suit

    def get_rank(self):
        """A reader method that returns the rank of the card"""
        return self.rank

    def get_value(self):
        """ A reader method that returns the blackjack value of the card"""
        return self.value

    def assign_value(self, rank):
        """A helper function to determine the blackjack value of a rank"""
        print("The assignValue method needs to be completed")
        return -1

# -----------------------

def evaluate(hand):
    result = 0
    for one_card in hand:
        result += one_card.get_value()
    return result

# -----------------------

def process_hand(hand):
    print("The processHand function needs to be completed")

# -----------------------

def main():

    ace = Card("ace", "spades")
    king = Card("king", "diamonds")
    queen = Card("queen", "hearts")
    jack = Card("jack", "clubs")
    ten = Card("ten", "spades")
    nine = Card("nine", "hearts")
    eight = Card("eight", "diamonds")
    seven = Card("seven", "clubs")
    six = Card("six", "spades")
    five = Card("five", "hearts")
    four = Card("four", "diamonds")
    three = Card("three", "clubs")
    two = Card("two", "spades")

    process_hand([ace, king])
    process_hand([queen, ace])
    process_hand([ace, jack])
    process_hand([ten, ace])
    process_hand([two, three, four, five, six, seven])
    process_hand([eight, nine, two])

# -----------------------

main()
