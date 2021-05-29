---
collection: teaching
title: "Classwork 11"
---

## Logistics
* Due: Tuesday, June 1st no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork11` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Practice dynamically allocating memory and freeing it.

## Assignment

Write a program called `classwork11.c` containing a struct that representing a
two-dimensional point. Use `malloc` to dynamically allocate a point struct. Set
the x and y coordinates of your point using the indirect component selection
operator `->`. Print info about your point, again using `->`. 
Finally, at the end of your program, free the memory using
`free`. A skeleton for your code may look something like this:

```
#include <stdio.h>
#include <stdlib.h>

# user-defined types
typedef struct {
	# components for point
} point;

int main(void) {
	# declare pointer to a point struct

	# dynamically allocate memory for the point struct that your pointer points
	to

	# set x and y coordinates to values of your choice

	# print info about the point

	# free the memory for the point

	return(0);
}
```


## Grading - 10 points
* 1 point - there is a file called `classwork11.c` in your
	`classwork/classwork11/` directory.
* The file compiles and runs.
* Note: you will not earn any points if your work is not committed and pushed to
Github with the tag `classwork11`.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (June 1st).
