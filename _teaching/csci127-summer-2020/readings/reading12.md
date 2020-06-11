---
collection: teaching
title: "Object Oriented Programming"
venue: "June 11"
type: "Reading"
date: 2020-06-11
---
## Logistics
* Due: Thursday, June 11th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 17. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
* An instance of a class is mutable.
* A mutator method is a method of a class that changes the values of one or more instance variables.
* Shallow equality occurs when two variables refer to the
same object in the computer's memory. The Python keyword `is` tests for
shallow equality.
* Deep equality occurs when either there is shallow equality OR
two variables refer to objects that contain the same underlying
(significant) values.
* The method `__add__(self, other)` can be defined so that the operator
`+` can be used.


## Assignment
* Complete the required number of activities for each subsection in
[Object Oriented Programming](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37765).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Create a `Card` class that holds a rank (e.g., `"seven"`), a suit
(e.g., `"hearts"`), and a value (e.g., `7`). Then,

1. Use a magic method so cards
are comparable using the less than opeartor, `<`. For example,
```
card1 = Card("Seven", "Hearts")
card2 = Card("Queen", "Spades")
card3 = Card("Queen", "Diamonds")
print(card1 < card2)
print(card2 < card3)
print(card3 < card3)
```
should output
```
True
False
False
```
Assume that aces have value 1 (are the lowest card) and kings
have value 13 (are the highest card). If two cards have the same rank,
ties are broken by suit alphabetically.

2. Use another magic method to test two cards for deep equality
(do the cards have the same rank and suit?) instead of shallow
equality (are the cards pointing to the same object?).
If `card2` and `card3` are defined above,
```
card4 = Card("Queen", "Diamonds")
print(card2 == card3)
print(card3 == card4)
```
should output
```
False
True
```

