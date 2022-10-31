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

In this assignment, you will implement a stack (two ways) and a queue.
Then, you will apply one of your stack implementaions in a
call stack validator, and your queue in a capital gains calculator.

### Starter code

The starter
code has six files. You will change `CallStackValidator.java` and
`CallStackValidator.java`. You will also add your three stack/queue
implementations, so turn in a total of nine Java files, five of which you
create or change.


[project4_starter.zip](https://lgw2.github.io/teaching/csci132-fall-2022/projects/project4_starter.java)

### Stack implementations

In two separate files called `ArrayStack.java` and `DLLStack.java`, write two
different classes that implement the `Stack` interface, provided in the
`Stack.java` file in the starter code. You can reference the
two implementations from the book in the PDF below. They give a full
implementation for the array-based stack, which you can copy (but type it out
and think about how it works) and an implementation for a stack based on a
singly linked list, which can be a model for your `DLLStack`.

* [`ArrayStack` info from book](https://lgw2.github.io/teaching/csci132-fall-2022/projects/SLLStack.jpeg)
* [Linked list stack info from book](https://lgw2.github.io/teaching/csci132-fall-2022/projects/SLLStack.jpeg)

### Queue implementation

In a file called `DLLQueue.java`, write a class that implements the
`Queue` interface using a doubly linked list. You can reference the book's
queue implementation based on a sinly linked list in the PDF below.

* [Linked list stack info from book](https://lgw2.github.io/teaching/csci132-fall-2022/projects/SLLQueue.jpeg)

### Call stack validator

Check out how the call stack works by watching [this video](https://www.youtube.com/watch?v=aCPkszeKRa4). (It focuses on a
recursive function calls in C but demonstrates the main idea well: when we call
functions (or methods), from inside other functions, they wait until
the original function finishes to procede, which is modeled perfectly by a
stack.)

Complete the `CallStackValidator` class by adding one of your stack implementations as a field and
implementing the `validate()` method so that it returns true if the string
represents a correct sequence of function calls. You may include additional
fields, constructors, and methods if you would like.

A sequence of function calls is correct if the following two things are true:
1. Only the most recently called function can do any work (call another
   function or halt)
2. At the end of the sequence of function calls, all functions should have
   halted.

You can represent the call stack using a stack, pushing functions onto the
stack as they are called and popping them as they are halted.

You can assume that your input string to `validate()` will be a sequence of
either function calls (e.g. `"func1 calls func2"`) or function terminations
(e.g. `"func1 halts"`). For example, one input string is

```
"A calls B B calls C C halts B halts A halts"
```

This input is correct.

The provided `Demo.java` file gives seven tests. The provided
`CallStackValidator.java` file shows you how to tokenize the string (break it
into separate words) using the `Scanner`.

### Capital gains calculator

This is adapted from the book, problem P-6.36.

When a share of common stock of some company is sold, the *capital gain* (or,
sometimes, loss) is the difference between the share's selling price and the
price originally paid for it. This rule is easy to understand for a single
share, but if we sell multiple shares of stock bought over a long period of
time, then we must identify the shares actually being sold. A standard
accounting principle for identifying which shares of a stock were sold in such
case is to use a FIFO protocol --- the shares sold are the ones that have been
held the longest (indeed, this is the default method built into several
personal finance software packages). For example, suppose we buy 100 shares at
\$20 each on day 1, 20 shares at \$24 on day 2, 200 shares at \$36 on day 3, and
then sell 15 shares on day 4 at \$30 each. Then applying the FIFO protocol means
that of the 150 shares sold, 100 were bought on day 1, 20 ere bought on day 2,
and 30 were bought on day 3. The capital gain in this case would therefore be
$100*20+20*6+30*(-6)$, or \$940.

Complete the `CapitalGainsCalculator` class by completing the
`getCapitalGains()` method and adding an instance of your queue as a field. You
may add other fields, constructors, and methods if you like.


## Grading - 100 points

### Correct implementation
* 10 points - `ArrayStack` implements all methods correctly (2 points each)
* 10 points -`DLLStack` implements all methods correctly (2 points each)
* 10 points -`DLLQueue` implements all methods correctly (2 points each)

#### `CallStackValidator`
* 10 points - Uses one of your stack implementations as a field
* 10 points - Correctly uses the stack as an internal data structure
* 10 points - Passes all tests

#### `CapitalGainCalculator`
* 10 points - Uses your queue implementations as a field
* 10 points - Passes all tests
* 10 points - Correctly uses the queue as an internal data structure

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
