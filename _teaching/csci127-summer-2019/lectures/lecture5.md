---
collection: teaching
title: "Lists"
venue: "June 17"
type: "Lecture"
date: 2019-06-17
---

## Reading
Chapter [10](https://runestone.academy/runestone/static/thinkcspy/Lists/toctree.html).

## Key ideas

### From chapter 10:
* A `list` is an ordered collection of items that can be of any type,
e.g., `["Joy and Beauty of Data", 2017]`.
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

## Active learning
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
* [This page](https://www.enchantedlearning.com/usa/states/population.shtml)
contains 2013 census information when the total population
of the U.S. was 316,128,839.
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
Time permitting, make other interesting enhancements.
