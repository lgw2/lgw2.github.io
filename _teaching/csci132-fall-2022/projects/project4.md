---
collection: teaching
title: "Project 4"
---

## Logistics
* Due: Friday, November 18th AoE.
* Submission instructions: upload your Java files to the D2L dropbox. If you have more than one file, the preferred method is to put them all into one folder, zip
	that, and upload the zipped file. Ask if you need help with this.
* You may do this project with a partner. If you do this, one partner should
	turn in the Java files on D2L and the other should just submit a
	comment on D2L saying who their partner is. The TA for the partner who
	turned it in will enter the same grade for both partners. If you choose
	this option, you should do the project *together*, not just have one
	partner do all the work.


## Assignment

In this assignment, you will implement both a stack and a queue using both an
array and a doubly linked list. Then, you will apply the stack in a
call stack validator, and the queue in a

### Stack implementations

Download the provided [Stack.java]() stack interface and the
[DoublyLinkedList.java]() doubly linked list class.

In two separate files called `ArrayStack.java` and `DLLStack.java`, write two
different classes that implement the `Stack` interface. You can reference the
two implementations from the book in the PDF below. They give a full
implementation for the array-based stack, which you can copy (but type it out
and think about how it works) and an implementation for a stack based on a
singly linked list, which can be a model for your `DLLStack`.

* [`ArrayStack` info from book]()
* [Linked list stack info from book]()

### Queue implementations

Download the provided [Queue.java]() `Queue` interface.

In two separate file called `DLLQueue.java`, write a class that implements the
`Queue` interface using a doubly linked list. You can reference the book's
queue implementation based on a sinly linked list in the PDF below.

* [Linked list stack info from book]()

### Call stack validator

Check out how the call stack works by watching [this video](). (It focuses on a
recursive function calls in C but demonstrates the main idea well: when we call
functions (or methods), from inside other functions, they wait until
the original function finishes to procede, which is modeled perfectly by a
stack.)

### Sample output

## Grading - 100 points

### Correct implementation
All bullet points 10 points.
* `ArrayStack` implements all methods correctly (2 points each)
* `DLLStack` implements all methods correctly (2 points each)
* `DLLQueue` implements all methods correctly (2 points each)

#### `CallStackValidator` (30 points)
* Uses one of your stack implementations as a field
* Passes all six tests
* Correctly uses the stack as an internal data structure

#### `CapitalGainCalculator (30 points)
* Uses your queue implementations as a field
* Passes all six tests
* Correctly uses the queue as an internal data structure

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
This program will be graded with scores in Brightspace by Tuesday, November 25th, AoE.

## Go beyond
* Implement `equals()` methods and `clone()` methods for your data structures.
* What is the runtime of the `validate()` method of your `CallStackValidator`?
