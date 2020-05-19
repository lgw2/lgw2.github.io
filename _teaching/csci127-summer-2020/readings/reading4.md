---
collection: teaching
title: "Selection"
venue: "May 21"
type: "Reading"
date: 2020-05-21
---
## Logistics
* Due: Tuesday, May 21st no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 7. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
### From chapter 7:
* The `bool` type has values `True` and `False`
* Boolean operators: `==`, `!=`, `>`, `>=`, `<`, `<=`
* Logical operators: `and`, `or`, `not`
* Conditional statements: `if`, `if` `else`, `if` `elif` `else`
* Conditional statements can be nested
* Writing and calling Boolean functions


## Assignment
* Complete the required number of activities for each subsection in
[Selection](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37265).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Consider a simplified game of UNO that has forty different cards.
Each card has a color ("red", "yellow", "green" or "blue") and a value
(0, 1, 2, 3, 4, 5, 6, 7, 8 or 9). One card can be played on top of the the
other as long as either the numbers match, the colors match, or both.
Complete the boolean function below so
that it returns `True` if the second card can be played on the first card and `False` otherwise.
```
def legal_play(first_value, first_color, second_value, second_color):
	# your commands here
```
For example,
```
legal_play(3, "blue", 3, "green")
```
and
```
legal_play(5, "yellow", 7, "yellow")
```
should both return True, but
```
legal_play(9, "red", 6, "green")
```
should return False.

### Activity 2
Take [key-events.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/key-events.py)
 and modify it so that the turtle only moves if it
 will still be visible. Use one boolean function in your solution.

### Activity 3
Write a Python program that generates a random number between 1 and 10.
The program should repeatedly ask the user to guess what the number is until
the user guesses correctly. When the user guesses correctly, the program should
print a message that shows how many tries it took.
For example, the message might be *Congratulations! That took 6 guesses.*


### Activity 3
Write a Python program that asks the user to enter two integers: one for the
number of rows and one for the number of columns. The program should then produce
a text-based drawing where each position in the drawing is randomly determined with
equal probability to be either a "\*" or a "-".
For example, with 4 rows and 6 columns, the drawing might look like this:
```
\*\*-\*-\*
--\*\*--
-\*--\*-
---\*-\*
```

