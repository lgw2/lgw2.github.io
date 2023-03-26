---
collection: teaching
title: "Classwork 16"
---

## Logistics
* Due: Monday, March 27th AoE.
* Submission instructions: make sure that the required file (`locations.c`) is in your
	`/classwork/week10/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Write a nested struct

## Assignment

* Log in to the server.
* From your home directory, navigate to `classwork/week10/mon/`, creating directories `week10`
and `mon` if necessary.
* Copy the file `/public/classwork/week10/mon/locations.c` to your current directory.
* In `locations.c`, write the struct `Location` so that the program prints
```
Museum of the Rockies location is LAT: 45 6 N, LON: 111 4 W
```
Note the use of the `.` operator twice in setting the values of `mor`'s data
members. That's because `lat` and `lon` are themselves structs! So you'll need
to define a second struct in order to create `Location`.

## Autograder

You can run the autograder yourself by running
```
/public/classwork/week10/mon/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
