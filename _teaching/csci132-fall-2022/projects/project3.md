---
collection: teaching
title: "Project 3"
---

## Logistics
* Due: Friday, October 21st AoE.
* Submission instructions: upload your java files to the D2L dropbox for
    Project 3. If you have more than one file, the preferred method is to put them all into one folder, zip
	that, and upload the zipped file. Ask if you need help with this.
* You may do this project with a partner. If you do this, one partner should
	turn in the Java files on D2L and the other should just submit a
	comment on D2L saying who their partner is. The TA for the partner who
	turned it in will enter the same grade for both partners. If you choose
	this option, you should do the project *together*, not just have one
	partner do all the work.


## Assignment

In this project, you will compare the runtimes of adding an element to the end,
adding an element to the beginning, and getting the *n*th element for arrays
vs. linked lists.

Creating the following three java files: `ArrayDS.java`, `LinkedListDS.java`,
and `ArrayVs.LinkedList.java`. `ArrayDS` and `LinkedListDS` will define the
same methods, but one will implement them using an array and the other will
implement them using a linked list. The methods they should have are:

* `addFirst(Integer)`: puts the `Integer` in the first position. Should
	correctly handle cases when the data structure has no elements.
* `addLast(Integer)`: puts the `Integer` in the last position. Should
	correctly handle cases when the data structure has no elements.
* `getN(int)`: returns the `Integer` stored in the *n*th position (index starting
	at 0). Should correctly handle cases when the data structure has no elements.
* `toString()`: returns a nice string representation of the data currently
	stored

(You may define additional methods if you need.)

### Notes for the `ArrayDS`
* you may work off of the code for the `Scoreboard`, but you should delete any
	methods you are not using, and you should change the method names to match
	those given above.
* the constructor should take one argument for the total size of the internal
	array. You may assume that you will not put more `Integer`s in than you initialize
	the array to hold.

### Notes for the `LinkedListDS`:
* you should have a private nested `Node` class in order to implement the
	linked list
* you may work off of the code from the book, class, or Lab 7, but you should delete any
	methods that you are not using, and you should change the method names to
	match those given above.
* your constructor should take in no arguments

### How to time

Create a random array of 5,000 integers using `java.util.Random`. See [this
tutorial](https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java).

Use the `java.lang.System.nanoTime()` to measure the following for each data
structure. See [the
documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#nanoTime())
for a description of how to use `nanoTime()` to measure how long some code
takes to execute. Convert your time in nanoseconds to time in milliseconds by
dividing by 100000.

* Adding the 5000 integers to the front (`addFirst()`)
* Adding the 5000 integers to the back (`addLast()`)
* Calling `getN()` 5000 times, passing in 1 through 4999

### Write up why you think some methods take longer

You should observe that one method for each data structure takes much longer
than the rest. Print out a sentence or two at the end of your output explaining
why.

### Sample output

You don't need to match the sample output, but consult the grading and the
description above to make sure you get full points.

```
Here's the ArrayDS adding first:
[5,4,3,2,1,0]
Here's the LinkedListDS adding first:
5->4->3->2->1->0
Here's the ArrayDS adding last:
[5,4,3,2,1,0,0,1,2,3,4,5]
Here's the LinkedListDS adding last:
5->4->3->2->1->0->0->1->2->3->4->5
Here's the ArrayDS getting the Integer at index 9:
3
Here's the LinkedListDS getting the Integer at index 9:
3

And now, for the test. Creating an array of 5,000 random ints...

ArrayDS
---------------
addFirst took 244 milliseconds
addLast took 3 milliseconds
getN took 1 milliseconds

LinkdedListDS
---------------
addFirst took 4 milliseconds
addLast took 4 milliseconds
getN took 201 milliseconds

(you should write your own explanation here)
The reason that ___ and ___ take longest is...
```


## Grading - 100 points

### Correct implementation
* 25 points - correct `addFirst()`, `addLast()`, `getN()`, `toString()`, and
	constructor for `ArrayDS` (5 points each).
* 25 points - correct `addFirst()`, `addLast()`, `getN()`, `toString()`, and
	constructor for `LinkedListDS` (5 points each).
* 10 points - correct `Node` class nested in `LinkedListDS`.
* 5 points - use the `System.nanoTime()` class to print out the correct time
	each run takes in milliseconds
* 15 points - test the three methods on arrays of random integers of length 5000 (5 points each). You should start with an empty data structure for both the `addFirst` and `addLast` tests.
* 5 points - nicely organized printing for results
* 5 points - you print out a sentence or two explaining why two of the methods
	(one from each data structure) take significantly longer than the others

### Readable code and good comments
* 10 points

Some things you can think about for writing readable code:
* using meaningful identifiers (variable names, method names)
* indent statement blocks
* don't rewrite the same code!
* use comments to explain ambigiuous or confusing constructs
* be thoughtful about which access modifiers you use for class members
* come back to your code a day or two after writing it and see if the way you
	solved the problem could be improved, or if you need to add comments

## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday, October 25th, AoE.

## Go beyond
* Implement both the array data structure and the linked list data structure to
be generic.
* Run your timing test with random Characters and random Strings.
* Change your ArrayDS so that it can handle the case when a new Integer is
added and there is no more space for it. One way you can do this is to create a
new array with double the capacity.
* Add a `DoublyLinkedList` to your test.
