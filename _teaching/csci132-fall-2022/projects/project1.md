---
collection: teaching
title: "Project 1"
---

## Logistics
* Due: Friday, September 16th AoE.
* Submission instructions: upload `Calculator.java` and `CalculatorDemo.java`
	to the D2L Project 1 folder.
* You may do this project with a partner. More details coming soon!


## Assignment

First, download [Calculator.java](https://lgw2.github.io/teaching/csci132-fall-2022/project1/Calculator.java) and [CalculatorDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/project1/CalculatorDemo.java) and put them in
the same Java package. Then, edit the `Calculator.java` file so that your
program  simulatesa simple calculator. Use the Java console as the input and
output device.

To start, familiarize yourself with the existing code in the. Do some experiments to test your assumptions or knowledge. Use the Java documentation, textbook, Google,  etc. to look up existing library methods that could help you write the missing methods. Use your own calculator and compare answers to test your program and make sure it is working correctly.

Add functionality to check that the user enters valid operator or numbers. Implement a `.calculateAnswer()` method so after each operand and operator the user enters, the calculator updates the total with the correct answer.

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
>>> e
Enter operation
>>> =

        2.71828

Enter operation
>>> log
Enter operation
>>> =

0.999999327347282

Enter operation
>>> +
Enter number
>>> 10
Enter operation
>>> =

10.999999327347282

Enter operation
>>> ^
Enter number
>>> 2
Enter operation
>>> =

120.99998520164067

Enter operation
>>> inv
Enter operation
>>> =

0.008264463820665332

Enter operation
>>> +
Enter number
>>> 100
Enter operation
>>> =

100.00826446382067

Enter operation
>>> pert
Enter operation
>>> =

101.33828457850659

Enter operation
>>> q
<end>
```

## Grading - 100 points

### Readable code and good Javadoc comments
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
* 5 points - `printAnswer`: prints the answer right justified

### Additional functionality
* 5 points - the user can type `pi` instead of a number and the class varialbe
	`ROUGHLY_PI` is used for the number.
* 5 points - the user can type `e` instead of a number and the class variable
	`ROUGHLY_E` is used for the number.



## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday September
20th, AoE.
