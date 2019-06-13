---
collection: teaching
title: "Recursion"
venue: "June 13"
type: "Lecture"
date: 2019-06-13
---

## Reading
Chapters [15](https://runestone.academy/runestone/static/thinkcspy/IntroRecursion/toctree.html)
and [10](https://runestone.academy/runestone/static/thinkcspy/Lists/toctree.html).

## Key ideas

### From chapter 15:
A recursive algorithm must obey 3 laws:
1. A recursive algorithm must have a base case.
2. A recursive algorithm must change its state and move toward the base case.
3. A recursive algorithm must call itself, recursively.

### From chapter 10:
todo

## Active learning
### Activity 1
* Download [draw_tree.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/draw_tree.py)
. Run it. Then:
* Add descriptive comments to the commands inside `main()`.
* Try to understand `tree(branchLen, t)`. What is the base case?
If a call to `tree` is not at the base case, how does it change
its state to move toward the base case?


### Activity 2
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
