---
collection: teaching
title: "Lab 9: Numpy Arrays"
venue: "June 26"
type: "Lab"
date: 2019-06-26
---

## Logistics
* Due: Wednesday, June 26th no later than 5pm.
* Submission instructions: upload solution,
entitled FirstName-LastNameLab9.py
to the BrightSpace Lab 9 Dropbox.
* Deadline reminder: once this deadline passes, BrightSpace will no longer accept your Python
submission and you will no longer be able to earn credit. Thus, if you are not able to fully
complete the assignment, submit whatever you have before the deadline so that partial credit can be earned.

## Learning outcomes
Gain experience with numpy arrays and contine to practice
object oriented programming.

## Backgroun
In a modified game of Yahtzee, five eight-sided dice are rolled once.

For this assignment, you will simulate this modified game of Yahtzee to
determine how likely certain outcomes are.

In this modified version of Yahtzee, a High Roll occurs when each of
the five dice is either a 7 or an 8. For example, 7-7-7-7-7 or 8-8-7-8-7
are High Rolls.

In this modified version of Yahtzee, a Three of a Kind occurs when
three of the dice show the same number. The other two dice must not
show this number and must also be different from one another.
For example, 4-7-4-4-2 but not 4-7-4-4-7.

In this modified version of Yahtzee, a large straight occurs when
the five numbers can be arranged consecutively (for example,
1-3-4-2-5 or 5-7-4-6-3). Hint: the numpy library contains a
sort function.

## Assignment
* Download [lab9.py](https://lgw2.github.io/teaching/csci127-summer-2019/labs/lab9.py),
rename it according to the instructions above, and make sure you
understand it.
* Take the program above and modify it by adding the missing methods
such that when the program is run, it produces this [output](https://lgw2.github.io/teaching/csci127-summer-2019/labs/lab9_output.txt).

## Grading - 10 points
1 points - The constructor of the Queue class is correct.

1 points - The `enqueue` method of the Queue class is correct. The method adds an item to the queue.

1 points - The `dequeue` method of the Queue class is correct. The method removes and returns the item that has been in the queue the longest.

1 points - The `is_empty` method of the Queue class is correct. A queue is considered to be empty when it contains no items.

2 points - The `__str__` method of the Queue class is correct.

3 points - In the main function, the statement number += 15 is implemented correctly using the appropriate magic method in the Queue class.

## Grading turnaround
All labs graded with scores recorded in BrightSpace no later than lab time (2pm) the following day.
