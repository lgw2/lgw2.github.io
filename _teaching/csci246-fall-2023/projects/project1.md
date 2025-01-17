---
collection: teaching
title: "Project 1"
---

## Logistics
* Due: Friday, September 16th AoE.
* Submission instructions: upload `Calculator.java` and `CalculatorDemo.java`
	to the D2L Project 1 folder.
* You may do this project with a partner. If you do this, one partner should
	turn in the two Java files on D2L and the other should just submit a
	comment on D2L saying who their partner is. The TA for the partner who
	turned it in will enter the same grade for both partners. If you choose
	this option, you should do the project *together*, not just have one
	partner do all the work.


## Assignment

First, download [Calculator.java](https://lgw2.github.io/teaching/csci132-fall-2022/projects/Calculator.java) and [CalculatorDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/projects/CalculatorDemo.java) and put them in
the same Java package. Then, edit the `Calculator.java` file so that your
program  simulates a simple calculator. Use the Java console as the input and
output device.

To start, familiarize yourself with the existing code in the. Do some experiments to test your assumptions or knowledge. Use the Java documentation, textbook, Google,  etc. to look up existing library methods that could help you write the missing methods. Use your own calculator and compare answers to test your program and make sure it is working correctly.

Add functionality to check that the user enters valid operator or numbers. Implement a `.calculateAnswer()` method so after each operand and operator the user enters, the calculator updates the total with the correct answer.

### Important note

You can use the built-in `Math` class to compute exponential, logs, random
numbers, etc. You
can find the documentation [here](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html). The point of this assignment
is to practice writing a class, not implement algorithms for computing
mathematical functions. If you're stuck on that, ask for help early.

### Sample output
You are not required to match the output formatting. However, you are required
to match the output functionality shown in the sample. For example,

```
*** Welcome to Calculator ***
Enter number
>>> 100
Enter operation
>>> +
Enter number
>>> 1.2
Enter operation
>>> =

          101.2

Enter operation
>>> -
Enter number
>>> 50
Enter operation
>>> =

           51.2

Enter operation
>>> *
Enter number
>>> 0.01
Enter operation
>>> =

          0.512

Enter operation
>>> /
Enter number
>>> 3
Enter operation
>>> =

0.17066666666666666

Enter operation
>>> c
Enter operation
>>> =

            0.0

Enter operation
>>> pi
Invalid Entry. Enter '?' for help.
Enter a valid operation
>>> =

            0.0

Enter operation
>>> +
Enter number
>>> pi
Enter operation
>>> =

        3.14159

Enter operation
>>> neg
Enter operation
>>> =

       -3.14159

Enter operation
>>> %
Enter operation
>>> =

     -0.0314159

Enter operation
>>> c
Enter operation
>>> +
Enter number
>>> 100
Enter operation
>>> +
Enter number
>>> e
Enter operation
>>> =

      102.71828

Enter operation
>>> log
Enter operation
>>> =

4.6319900952531725

Enter operation
>>> +
Enter number
>>> 10
Enter operation
>>> =

14.631990095253173

Enter operation
>>> ^
Enter number
>>> 2
Enter operation
>>> =

214.09513414758695

Enter operation
>>> inv
Enter operation
>>> =

0.0046708207731178415

Enter operation
>>> +
Enter number
>>> 100
Enter operation
>>> =

100.00467082077311

Enter operation
>>> pert
Enter operation
>>> =

99.98516409186084

Enter operation
>>> q
<end>
```

## Grading - 100 points

### Readable code and good comments
* 20 points -  What are "readable" code
and  "good" comments? They are code and comments that make it easy for your
colleagues to understand your program. Creating readable code and writing good
comments is a subjective but very important task for you, and judging them is also subjective
for your TA. Please respect that your TA has the final word on this. Think about
looking at someone else's code. As you are no doubt aware, even a textbook
example with carefully chosen variable names and concise, well-formatted
code meant to be easily understood -- plus professionally edited comments that
explain every step of the way -- can still be very difficult for a reader to
follow. Beyond understanding the problem well enough to get your Java to kick
out the correct output, consider other humans who will be reading your code.
Could you come back to it a year later, and understand what is going on? (You
might be surprised how difficult that can be!) There are innumerable ways of
coding a solution to any problem. Always be asking yourself, "could there be a
cleaner, simpler, or more elegant way of doing that?" Starting here, and from
this project on, all assignments will have a portion of the grade designated to
readability.

Some things you can think about for writing readable code:
* using meaningful identifiers (variable names, method names)
* indent statement blocks
* organize your class as follows:
  * constants (`final` variables)
  * instance variables (also known as fields)
  * constructors
  * methods
* use comments to explain ambigiuous or confusing constructs
* come back to your code a day or two after writing it and see if the way you
	solved the problem could be improved, or if you need to add comments

### Fields
* 5 points - the constant `ROUGHLY_PI` belongs to the `Calculator` class as a
	whole (rather than each individual instance of that class), is
publicly visible, and holds the double `3.14159`. Even though it is public, it
should not be possible to overwrite it with another value.
* 5 points - the constant `ROUGHLY_E` belongs to the `Calculator` class as a
	whole (rather than each individual instance of that class), is
publicly visible, and holds the double `2.71828`. Even though it is public, it
should not be possible to overwrite it with another value.
* 5 points - the existing field `usageInstructions` should also be given that
same treatment: change the modifiers to make the field belong to the class a
whole, and a constant so it can't be reassigned.

### Methods

* 5 points - `*`:  multiply the current answer by the operand
* 5 points - `/`: divide the current answer by the operand
* 5 points - `c`: clear the current answer (that is, set it to 0)
* 5 points - `neg`: negate the current answer (for
	example, 4.5 would turn into -4.5)
* 5 points - `%`: convert the current answer to a percentage (i.e., divide by 100)
* 5 points - `log`: take the natural logarithm of the current value
* 10 points - `^`: raise current answer to the operand
* 5 points - `inv`: invert the current answer
* 10 points - `pert`: perturb the current value by multiplying by a random double within the range `[0.95, 1.05]`
* 5 points - `printAnswer`: prints the answer right justified

### Additional functionality
* 5 points - the user can type `pi` instead of a number and the class varialbe
	`ROUGHLY_PI` is used for the number.
* 5 points - the user can type `e` instead of a number and the class variable
	`ROUGHLY_E` is used for the number.



## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday September
20th, AoE.
