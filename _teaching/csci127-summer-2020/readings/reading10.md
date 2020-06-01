---
collection: teaching
title: "Files"
venue: "June 4"
type: "Reading"
date: 2020-06-04
---
## Logistics
* Due: Thursday, June 4th no later than 5pm.
* Submission instructions: complete the assigned number of activities in each
	of the assigned subsections of Chapter 11. You do not need to submit
	anything to Brightspace.
* Deadline reminder: once this deadline passes, Runestone Interactive will no
	longer allow you to collect points for completing the activities.

## Key ideas
* Opening a file. Example: [qbdata.txt](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activites/qbdata.txt).
* Reading from a file: `open(filename, "r")`
* Writing to a file: `open(filename, "w")`
* Closing a file: `filevariable.close()`
* File reading methods
	* `filevar.readline()` - in conjunction with a while loop to read an entire file
	* `filevar.readlines()`
* File writing methods
	* `filevar.write(some_string)`
* Absolute File Paths vs. Relative File Paths

## Assignment
* Complete the required number of activities for each subsection in
[Files](https://runestone.academy/runestone/assignments/doAssignment?assignment_id=37656).

## Grading - 10 points
* 10 points - the required number of activities were completed for each
	subsection before the deadline.

## Grading turnaround
This reading assignment  will be graded with scores in Brightspace by office
hours the following class day.

## Optional activities
### Activity 1
Download [census.txt](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/census.txt).
1. Using a for loop, write a program that reports the average
population across all states.
2. Edit your existing program to use a while loop and the readline() function.

### Activity 2
Edit your program from Activity 1 to write a file called census_percentages.txt that reports the percentage of the total population for each state, in the same order as census.txt. The file you write should look like [this](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/activities/census_percentages.txt).
