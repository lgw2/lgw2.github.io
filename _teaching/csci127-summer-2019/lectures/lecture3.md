---
collection: teaching
title: "Modules and Strings"
venue: "June 12"
type: "Lecture"
date: 2019-06-12
---

## Reading
Chatpers [5](https://runestone.academy/runestone/static/thinkcspy/PythonModules/toctree.html)
and [9](https://runestone.academy/runestone/static/thinkcspy/Strings/toctree.html).

## Key ideas

### From chapter 5:
* Be able to use the math module to solve problems.
* Be able to use the turtle module to solve problems.
* Be able to use the random module to solve problems.
* Be able to figure out how to use other modules when needed.

### From chapter 9:
* str type
* String concatenation operator: +
* Substring operators: in, not in
* String indexing, e.g. if mascot = "hawks", mascot[2]
* String comparison: <, <=, = =, >, >=, !=
* String slicing, e.g. mascot[1:3]
* Common methods:
	* Determining length: len
	* Related to case: upper, lower, capitalize
	* Related to whitespace: strip, lstrip, rstrip
	* Related to formatting: center, ljust, rjust
	* Related to finding substrings: find, rfind, index, rindex
	* Related to counting occurrences: count
* Useful constants:
	* string.ascii_lowercase
	* string.ascii_uppercase
	* string.digits
	* string.punctuation
* Python documentation for strings: [Online Documentation](https://docs.python.org/3/library/stdtypes.html?highlight=isdigit#string-methods)

## Active learning
### Activity 1
Review [key-events.py](
https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/key-events.py).
Then,
1. Add appropriate comments to key-events.py.
2. Modify the program so that pressing the f or F moves the turtle forward 50 pixels
in its current direction.
3. Modify the program so that pressing the r, the R, or PageDown turns the turtle 45
degrees to the right but does not move the turtle.

### Activity 2
Choose five of the string concepts from chapter 9 and write simple examples
in the Python shell to illustrate that you understand them. Then, find a partner
and show them your examples.

### Activity 3
Write a program that implements a Caesar cipher on lowercase letters.
For example, if they key is 2, each letter is replaces by the letter that
comes 2 positions later in the alphabet. for example, "a" becomes "c" and "z"
becomes "b".

### Activity 4
Download and experiment with [demo.py](
https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/demo.py)
until you understand it fully. Why can the `alternate_case` function be
 called with either one or two arguments?
How would you explain what the `alternate_case` function does to
someone who knows nothing about computer science?

### Activity 5
Write a function named `double_integer` that repeatedly asks the user
to enter an integer until a non-negative integer is entered.
The function should then return twice the integer's value.
For example, the user might enter "apple", then "3.14",
then "-34", then "34". In this example, the function should return 68.
