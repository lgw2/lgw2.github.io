---
collection: teaching
title: "Files"
venue: "June 19"
type: "Lecture"
date: 2019-06-19
---

## Reading
Chapter [11](https://runestone.academy/runestone/static/thinkcspy/Files/toctree.html).

## Key ideas

### From chapter 11
* Opening a file
* Reading from a file: `open(filename, "r")`
* Writing to a file: `open(filename, "w")`
* Closing a file: `filevariable.close()`
* File reading methods
	* `filevar.readline()` - in conjunction with a while loop to read an entire file
	* `filevar.readlines()`
* File writing methods
	* `filevar.write(some_string)`
* Absolute File Paths vs. Relative File Paths

## Active learning
### Activity 1
Download [census.txt](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/census.txt).
1. Using a for loop, write a program that reports the average
population across all states.
2. Edit your existing program to use a while loop and the readline() function.

### Activity 2
Edit your program from Activity 1 to write a file called census_percentages.txt that reports the percentage of the total population for each state, in the same order as census.txt. The file you write should look like [this](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/census_percentages.txt).
