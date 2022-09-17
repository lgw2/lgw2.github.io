---
collection: teaching
title: "Project 2"
---

## Logistics
* Due: Friday, September 30th AoE.
* Submission instructions: upload seven Java files (`Circle.java`,
    `EquilateralTriangle.java`, `Rectangle.java`, `RegularPolygon.java`,
    `Shape.java`, `ShapeDemo.java`, and `Square.java`) to the D2L dropbox for
    Project 2.
* You may do this project with a partner. If you do this, one partner should
	turn in the seven Java files on D2L and the other should just submit a
	comment on D2L saying who their partner is. The TA for the partner who
	turned it in will enter the same grade for both partners. If you choose
	this option, you should do the project *together*, not just have one
	partner do all the work.


## Assignment

In this project, you will continue working with the code you wrote for Lab 4.
You will need the `RegularPolygon` interface and the `Square` and
`EquilateralTriangle` classes. You will also write an abstract `Shape` class
and two new concrete classes, `Circle` and `Rectangle`. You will also write
your own `ShapeDemo.java` to demonstrate polymorphism using your classes.

###  Add an abstract `Shape` class

Create an abstract `Shape` class with the following fields and methoods:
* field `color` (type `String`)
* methods: `setColor()`, `getColor()`, and abstract methods `area()`,
    `perimeter()`, and `toString()`. (What parameters and return types should
    these methods have? Ask if you are unsure.)

### Bring in `RegularPolygon`, `EquilateralTriangle` and `Square` from lab 4.

Edit `EquilateralTriangle` and `Square` to extend `Shape` as well as implement
`RegularPolygon` (as they already should). For example, the
`EquilateralTriangle` class header should be:

```java

public class EquilateralTriangle extends Shape implements RegularPolygon  {...}
```

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

* 5 points - `*`:  multiply the current answer by the user number
* 5 points - `/`: divide the current answer by the user number
* 5 points - `c`: clear the current answer (that is, set it to 0)
* 5 points - `neg`: negate the current answer (for
	example, 4.5 would turn into -4.5)
* 5 points - `%`: convert the current answer to a percentage (i.e., divide by 100)
* 5 points - `log`: take the natural logarithm of the current value
* 10 points - `^`: raise current answer to the user number
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
