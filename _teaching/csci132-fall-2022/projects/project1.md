---
collection: teaching
title: "Project 1"
---

## Logistics
* Due: Friday, September 16th AoE.
* Submission instructions: upload `Calculator.java` and `CalculatorDemo.java`
	to the D2L Project 1 folder.


## Assignment

First, download [Calculator.java]() and [CalculatorDemo.java]() and put them in
the same Java package. Then, edit the `Calculator.java` file so that your
program  simulatesa simple calculator. Use the Java console as the input and
output device. Each input to the calculator, be it a number like `12.34` or
`1234` or an operator like `+` or `/`, should be input on a separate line.

To start, familiarize yourself with the existing code in the. Do some experiments to test your assumptions or knowledge. Use the Java API (https://docs.oracle.com/en/java/javase/11/docs/api/index.html), as well as textbook, zybook, google, etc. to look up existing library methods that could help you write the missing methods. Use your own calculator and compare answers to test your program and make sure it is working correctly.

Add functionality to check that the user enters valid operator or numbers. Implement a .calculateAnswer() method so after each operand and operator the user enters, the calculator updates the total with the correct answer.

### Sample output
You don't have to perfectly match

```
*** Welcome to Calculator ***
Enter number
>>> 12
Enter operation
>>> +
Enter number
>>> 3
Enter operation
>>> =

┌──────────────────────────┐
│                     15.0 │
└──────────────────────────┘
Enter operation
>>> / pi =
Enter number
>>> Enter operation
>>>
┌──────────────────────────┐
│        4.774652325733148 │
└──────────────────────────┘
Enter operation
>>> round 4 =
Enter number
>>> Enter operation
>>>
┌──────────────────────────┐
│                   4.7747 │
└──────────────────────────┘
Enter operation
>>> rand =
Enter operation
>>>
┌──────────────────────────┐
│        4.480915763963003 │
└──────────────────────────┘
Enter operation
>>> c
Enter operation
>>> 524 =
Invalid Entry. Enter '?' for help.
Enter a valid operation
>>>
┌──────────────────────────┐
│                      0.0 │
└──────────────────────────┘
Enter operation
>>> + 524 =
Enter number
>>> Enter operation
>>>
┌──────────────────────────┐
│                    524.0 │
└──────────────────────────┘
Enter operation
>>> neg
Enter operation
>>> %
Enter operation
>>> =

┌──────────────────────────┐
│                    -5.24 │
└──────────────────────────┘
Enter operation
>>> neg round 1 =
Enter operation
>>> Enter number
>>> Enter operation
>>>
┌──────────────────────────┐
│                      5.2 │
└──────────────────────────┘
Enter operation
>>> ^ 3 =
Enter number
>>> Enter operation
>>>
┌──────────────────────────┐
│                  140.608 │
└──────────────────────────┘
Enter operation
>>> round 0 =
Enter number
>>> Enter operation
>>>
┌──────────────────────────┐
│                    141.0 │
└──────────────────────────┘
Enter operation
>>> Q
<end>
```

## Grading - 100 points

### Readable code and good Javadoc comments
* 15 points -  What are "readable" code
and  "good" comments? They are code and comments that make it easy for your
colleagues to understand your program. Creating readable code and writing good
comments is a subjective but very important task for you, and judging them is also subjective
for your TA. Please respect that your TA has the final word on this. Think about
looking at someone else's code. As you are no doubt aware, even a text book
example with really carefully chosen variable names and concise, well formatted
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

### Fields
* 5 points - the constant `ROUGHLY_PI` belongs to the `Calculator` class, is
publicly visible, and holds the double `3.14159`. Even though it is public, it
should not be possible to overwrite it with another value.
* 5 points - the constant `ROUGHLY_E` belongs to the `Calculator` class, is
publicly visible, and holds the double `2.71828`. Even though it is public, it
should not be possible to overwrite it with another value.
* 5 points - the existing field `usageInstructions` should also be given that
same treatment: change the modifiers to make the field belong to the class a
whole, accessible from `main()`, and a constant so it can't be reassigned.

### Methods

* 5 points - `*`:  multiply the current answer by the user number and return the result
* 5 points - `/`: divide the current answer by the user number and return the result
* 5 points - `c`: clear the current answer and return the result (0)
* 5 points - `neg`: negate the current answer and return the result
* 5 points - `%`: convert the current answer to a percentage and return the result
* 5 points - `log`: take the natural logarithm of the current value and return the result
* 10 points - `^`: raise current answer to the user number and return the result
* 5 points - `inv`: invert the current answer and return the result
* 10 points - `pert`: perturb the current value by multiplying by a random double within the range `[0.95, 10.05]` and return the result
* 10 points - `printAnswer`: prints the answer right justified inside a unicode box

### Additional functionality
* 5 points - the user can type `pi` instead of a number and the class varialbe
	`ROUGHLY_PI` is used for the number.
* 5 points - the user can type `e` instead of a number and the class variable
	`ROUGHLY_E` is used for the number.



## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday September
20th, AoE.
