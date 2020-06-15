---
collection: teaching
title: "Object Oriented Programming Basics"
venue: "June 10"
type: "Reading"
date: 2020-06-10
---
## Logistics
* Due: Wednesday, June 10th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 17. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
* Thus far, we have used the *procedural paradigm* to solve problems.
With the procedural paradigm, the focus on solving a problem is on the actions.
In Python, these actions are implemented with functions.
* Python also supports the *object-oriented programming paradigm*.
With the OOP paradigm, the focus on solving a problem is on the objects.
An object contains both data (called the state) and functionality (called methods).
* Example: Consider the [turtle](https://docs.python.org/3/library/turtle.html#module-turtle) module.
This module is implemented using object-oriented programming.
* Example: [date.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/date.py)
* Functions can take objects as parameters.
* Functions can return objects.
* Method `__str__` can be used to override how objects are printed,
e.g. `print(object)`.
* It is common to split classes into their own files and import them.


## Assignment
* Complete the required number of activities for each subsection in
[Object Oriented Programming Basics](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37762).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Create a class named `Pokemon` that has the following instance variables:
`number`, `name`, and `combat_points`. Add a constructor method that enables
a new Pokémon to be created. Add methods named `get_name`,
`get_number`, `get_combat_points` and `set_combat_points`. Then, write a
program that utilizes the functionality of the `Pokemon` class in its entirety.

### Activity 2
In the game of Black Jack, an ace is worth 11 points, a king is worth
10 points, a queen is worth 10 points, a jack is worth 10 points,
and all other cards are worth face value.
Download [card.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/card.py) and
[blackjack.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/blackjack.py)
onto your local machine. Complete method `assign_value` and
function `process_hand` such that the following output is produced when
the program is run. Note: if you prefer, you can use the file
[card_blackjack.py](https://lgw2.github.io/teaching/csci127-summer-2020/readings/activities/card_blackjack.py),
which includes the `Card` class and the Black Jack functionality in one file.
```
ace of spades, king of diamonds evaluates to 21

queen of hearts, ace of spades evaluates to 21

ace of spades, jack of clubs evaluates to 21

ten of spades, ace of spades evaluates to 21

two of spades, three of clubs, four of diamonds, five of hearts, six of spades, seven of clubs evaluates to 27

eight of diamonds, nine of hearts, two of spades evaluates to 19
```

### Activity 3
Download [carddeck.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/carddeck.py).
* Answer the following questions:
	1. What is `cards` in the program?
	2. What does the `Deck` constructor do?
* Uncomment the two commented statements at the bottom
and supply the missing `shuffle` method.
* Split the solution into three files: Card.py, Deck.py and carddeck.py.
