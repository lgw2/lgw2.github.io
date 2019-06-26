---
collection: teaching
title: "Program 5"
venue: "Due July 1"
type: "Programming Assignment"
date: 2019-07-01
---

## Logistics
* Due date: Monday, July 1st no later than 11:59 p.m.
* Submission instructions: upload your solution, entitled YourFirstName-YourLastName-Program5.py to the BrightSpace Program 5 Dropbox.
* Deadline Reminder: Once the submission deadline passes, BrightSpace will no longer accept your
Python submission and you will no longer be able to earn credit.
Thus, if you are not able to fully complete the assignment, submit whatever you have before
the deadline so that partial credit can be earned.

## Learning Outcomes
You will practice object oriented programming and using Numpy arrays to solve a problem.

## Background Information
The [8-puzzle problem](https://en.wikipedia.org/wiki/15_puzzle) is a puzzle invented and popularized
by Noyes Palmer Chapman in the 1870s. It is played on a 3-by-3 grid with 8 square blocks labeled
1 through 8 and a blank square. Your goal is to rearrange the blocks so that they are in order.
You are permitted to slide the blank square horizontally or vertically. The following shows
a sequence of legal moves from an initial board position (left) to the goal position (right):
```
1  3        1     3        1  2  3        1  2  3        1  2  3
4  2  5   =>   4  2  5   =>   4     5   =>   4  5      =>   4  5  6
7  8  6        7  8  6        7  8  6        7  8  6        7  8

initial                                                      goal

```
## Assignment
* Using [program5.py](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/program5.py)
as a starting point, supply the missing functions such that interaction with a user could produce
[this transcript](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/program5_transcript.txt).
When the user is asked for input, the legal responses are left, right, up and down (using any combination of uppercase and lowercase letters).
The user commands indicate how the blank space such be moved. For example, if the user enters left, the blank space should be exchanged with the number that is located to its left. Note: if the blank space is on the far left of the board, it can not be moved to the left.

## Grading - 100 points
25 points. The method `is_puzzle_solved` works correctly (all or nothing).

10 points. The method `move_blank` works correctly when the user enters a legal left move (all or nothing).

10 points. The method `move_blank` works correctly when the user enters a legal right move (all or nothing).

10 points. The method `move_blank` works correctly when the user enters a legal up move (all or nothing).

10 points. The method `move_blank` works correctly when the user enters a legal down move (all or nothing).

10 points. The method `move_blank` works correctly when the user enters an illegal command (all or nothing).

10 points. The output format shown in the sample transcript is matched exactly. (5 points for each type of difference up to 10 points.)

15 points - The methods you write are properly commented, easy to understand and do not contain unnecessary code. (3 points for each type of improvement up to 15 points.)
