---
collection: teaching
title: "Recursion"
venue: "June 13"
type: "Lecture"
date: 2019-06-13
---

## Reading
Chapter [15](https://runestone.academy/runestone/static/thinkcspy/IntroRecursion/toctree.html).

## Key ideas

### From chapter 15:
* A recursive algorithm must have one or more situations where the answer
can be immediately calculated. These are the base cases.
* A recursive algorithm must have one or more situations where the algorithm
calls itself, either directly or indirectly, with a problem that is easier to solve.
These are the general cases.

## Active learning
### Activity 1
* Experiment with [convert.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/convert.py)
until you fully understand it.
* What is the base case?
* What is the general case?
* Verify that the answers produced for the three test cases are correct.
* Explain why `print(convert(100, 1))` produces an error.
* Explain why `print(convert(100, 200))` produces an error.
* What is the largest base for which the convert function is correct?
* Uncomment the three statements and supply the missing `unconvert` function.
The function should be recursive and take two parameters.
The first parameter is a string representation of a number and the second
parameter is the base of the first parameter.
The function should calculate and return the base 10 integer equivalent of the first parameter.
