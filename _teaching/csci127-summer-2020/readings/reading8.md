---
collection: teaching
title: "Lists"
venue: "May 29"
type: "Reading"
date: 2020-05-29
---
## Logistics
* Due: Friday, May 29th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 10. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
### From chapter 10:
* A `list` is an ordered collection of items that can be of any type,
e.g., `["Joy and Beauty of Data", 2020]`.
* List creation, e.g., `row = ["black", "blue", "orange"]`
* Determining list length: `len`
* Accessing list elements
* List memebership: `in` and `not in`
* List concatenation: `+`
* List repetition: `*`
* List slices
* Lists are *mutable* (unlike strings)
	* Replacement: `row[0] = "yellow"`
	* Deletion: `row[1:3] = []`
	* Deletion: `del(row[0])`
	* Insertion: `row[2:2] = ["red", "magenta"]`
* List aliasing: row_2 = row
* List cloning: row_2 = row[:]
* List methods:
	* `append(item)`
	* `insert(position, item)`
	* `pop()` or `pop(position)`
	* `sort()`
	* `reverse()`
	* `index(item)`
	* `count(item)`
	* `remove(item)`
* List append vs. list concatenation
* For loop list traversal
	* by element
	* by position
* Function parameters as lists
* *Pure* functions
* Functions returning lists
* List comprehensions
* Nested lists
* Creating lists from strings using `split()`
* Creating strings from lists using `join()`
* Tuples

## Assignment
* Complete the required number of activities for each subsection in
[Lists](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37508).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Work the following exercises:
* Create a list called `myList` with the following six items:
76, 92.3, “hello”, True, 4, 76. Do it with both append and with
concatenation, one item at a time.
* Starting with the list of the previous exercise, write Python
statements to do the following:
1. Append “apple” and 76 to the list.
2. Insert the value “cat” at position 3.
3. Insert the value 99 at the start of the list.
4. Find the index of “hello”.
5. Count the number of 76s in the list.
6. Remove the first occurrence of 76 from the list.
7. Remove True from the list using `pop` and `index`.

### Activity 2
* The file [nested-lists.py](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/nested-lists.py)
contains information about the 10 most populous states.
* Add a function to nested-lists.py that calculates and returns the
total population of the information passed into it. Print this value after the function returns it.
* Modify the program to also print the percentage of the U.S.
population that lives in the 10 most populated states.
* Modify the `populations` variable to include information about whether
each state is landlocked. Consider a landlocked state to be one
that does not touch the Atlantic Ocean, the Pacific Ocean or the
Gulf of Mexico.
* Modify the program to also calculate and print the percentage
of the population in the 10 most populated states that live
in a landlocked state.
