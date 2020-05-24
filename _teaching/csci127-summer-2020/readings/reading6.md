---
collection: teaching
title: "Modules, Strings"
venue: "May 27"
type: "Reading"
date: 2020-05-27
---
## Logistics
* Due: Wednesday, May 27th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapters 5 and 9. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
### From chapter 5:
* Be able to use the `math` module to solve problems.
* Be able to use the `turtle` module to solve problems.
* Be able to use the `random` module to solve problems.
* Be able to figure out how to use other modules when needed.

### From chapter 9:
* `str` type
* String concatenation operator: `+`
* Substring operators: `in`, `not in`
* String indexing, e.g. if `mascot = "hawks"`, `mascot[2]`
* String comparison: `<`, `<=`, `==`, `>`, `>=`, `!=`
* String slicing, e.g. `mascot[1:3]`
* Common methods:
	* Determining length: `len`
	* Related to case: `upper`, `lower`, `capitalize`
	* Related to whitespace: `strip`, `lstrip`, `rstrip`
	* Related to formatting: `center`, `ljust`, `rjust`
	* Related to finding substrings: `find`, `rfind`, `index`, `rindex`
	* Related to counting occurrences: `count`
* Useful constants:
	* `string.ascii_lowercase`
	* `string.ascii_uppercase`
	* `string.digits`
	* `string.punctuation`
* Python documentation for strings: [Online Documentation](https://docs.python.org/3/library/stdtypes.html?highlight=isdigit#string-methods)


## Assignment
* Complete the required number of activities for each subsection in
[Modules, Strings](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37219).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Review [key-events.py](
https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/key-events.py).
Then,
1. Add appropriate comments to `key-events.py`.
2. Modify the program so that pressing the `f` or `F` moves
the turtle forward 50 pixels
in its current direction.
3. Modify the program so that pressing the `r`,
the `R`, or `PageDown` turns the turtle 45
degrees to the right but does not move the turtle.

### Activity 2
Write a program that implements a Caesar cipher on lowercase letters.
For example, if they key is 2, each letter is replaces by the letter that
comes 2 positions later in the alphabet. for example, `"a"` becomes `"c"` and `"z"`
becomes `"b"`.

### Activity 3
Download and experiment with [demo.py](
https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/demo.py)
until you understand it fully. Why can the `alternate_case` function be
 called with either one or two arguments?
How would you explain what the `alternate_case` function does to
someone who knows nothing about computer science?

### Activity 4
Write a function named `double_integer` that repeatedly asks the user
to enter an integer until a non-negative integer is entered.
The function should then return twice the integer's value.
For example, the user might enter `"apple"`, then `"3.14"`,
then `"-34"`, then `"34"`. In this example, the function should return `68`.
