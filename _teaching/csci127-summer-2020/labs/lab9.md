---
collection: teaching
title: "Lab 9: Numpy Arrays"
venue: "June 18"
type: "Lab"
date: 2019-06-18
---

## Logistics
* Due: Thursday, June 18th no later than 11:59pm.
* Submission instructions: upload solution,
entitled FirstName-LastNameLab9.py
to the BrightSpace Lab 9 Dropbox.
* Deadline reminder: once this deadline passes, BrightSpace will no longer accept your Python
submission and you will no longer be able to earn credit. Thus, if you are not able to fully
complete the assignment, submit whatever you have before the deadline so that partial credit can be earned.

## Learning outcomes
Gain experience with numpy arrays and contine to practice
object oriented programming.

## Background
In a modified game of Yahtzee, five six-sided dice are rolled once.

For this assignment, you will simulate this modified game of Yahtzee to
determine how likely certain outcomes are.

In this modified version of Yahtzee, a High Roll occurs when each of
the five dice is either a 5 or an 6. For example, 5-5-5-5-5 or 5-6-6-5-5
are High Rolls.

In this modified version of Yahtzee, a Three of a Kind occurs when
three of the dice show the same number. The other two dice must not
show this number. For example, 4-5-4-1-4 is a three of a kind, but
4-5-4-4-4 is not.

In this modified version of Yahtzee, a large straight occurs when
the five numbers can be arranged consecutively (for example,
1-3-4-2-5 or 2-5-4-6-3).

## Hints
Numpy arrays have a lot of methods and the Numpy library contains a lot of
functions that can take in arrays. You might want to look up the `max`, `min`,
and `sort` methods, and the `bincounts` function. Or you might find even more
useful functionality! Check out the documentation
[here](https://numpy.org/doc/stable/). You may want to search the
documentation.

## Assignment
* Download [lab9.py](https://lgw2.github.io/teaching/csci127-summer-2020/labs/lab9.py),
rename it according to the instructions above, and make sure you
understand it.
* Take the program above and modify it by adding the missing methods
such that when the program is run, it produces this [output](https://lgw2.github.io/teaching/csci127-summer-2020/labs/lab9_output.txt).

## Grading - 10 points
3 points - High Rolls are identified correctly.

3 points - Three of a Kinds are identified correctly.

4 points - Large straights are identified correctly.

## Grading turnaround
All labs graded with scores recorded in BrightSpace no later than office hours the following day.
