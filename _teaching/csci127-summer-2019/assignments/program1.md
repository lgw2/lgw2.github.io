---
collection: teaching
title: "Program 1"
venue: "Due June 12"
type: "Programming Assignment"
date: 2019-06-12
---

## Logistics
* Due date: Wednesday, June 12th no later than 11:59 p.m.
* Submission instructions: upload your solution, entitled YourFirstName-YourLastName-Program1.py to the BrightSpace Program 1 Dropbox.
Deadline Reminder: Once the submission deadline passes, BrightSpace will no longer accept your
Python submission and you will no longer be able to earn credit.
Thus, if you are not able to fully complete the assignment, submit whatever you have before
the deadline so that partial credit can be earned.

## Learning Outcomes
* To solve this problem, you need to understand the following Python concepts:
data types, functions, selection statements, and iteration.

## Background Information
* At MSU, the follow grades have the following values:
 A (4.0), A- (3.7), B+ (3.3), B (3.0), B- (2.7), C+ (2.3), C (2.0), C- (1.7), D+ (1.3), D (1.0) and F (0.0).
* Example GPA calculation: if a student earns an A in a 3-credit course and a B- in a
2-credit course, that student's GPA can be calculated as (4.0 * 3 + 2.8 * 2) / (3 + 2).

## Assignment
* Write a Python program that prompts the user for the number of classes taken
and then, for each class, the letter grade received (e.g., B+) and the number
of credits (e.g., 3). Once this information is known, the program should calculate
and display the GPA.
* Here is a [sample transcript](https://lgw2.github.io/teaching/csci127-summer-2019/assignments/transcript.txt).
Your solution should match the output format exactly.

## Assumptions
* The user will take at least one and no more than seven courses.
* Each course is either 1, 2, 3, 4, or 5 credits.
* A grade can be entered in uppercase or lowercase. For example, either A- or a-.
* All user inputs will be valid.

## Grading - 100 points
* 35 points - the GPA calculation is correct.
* 15 points - The user is prompted to enter the number of courses (5 points),
the letter grade for each course (5 points)
and the credits for each course (5 points).
* 10 points - With the exception of the GPA, the output format matches
the output format of the transcript exactly (2 points for each type of
difference up to 10 points).
* 5 points - The GPA is displayed with two digits to the right of the decimal.
* 10 points - A function named `translate` is defined that takes a letter
grade (e.g. b- or B-) and correctly returns its value (e.g. 2.7).
* 10 points - A function named `main` is defined (5 points).
The only python statement that does not appear in this function
or the `translate` function is the call to the main function, e.g. `main()` (5 points).
* 10 points - The Python solution is easy to understand and does not contain
unnecessary code (2 points for each type of improvement up to 10 points).
* 5 points - An appropriate Python comment appears at the top of
the submission. See below for the type of information that should appear.

## Sample Header Comment
```python
# ---------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 1: GPA Calculator
# Your Name(, Your Partner's Name)
# Last Modified: January ??, 2019
# ---------------------------------------
# A brief overview of the program.
# ---------------------------------------
```

## Helpful Hint
To learn more about formatted output, take a look at [this page](https://pyformat.info/).
Use the new format (.format()), not the old (%).
https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/madlib.py)
