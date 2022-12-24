---
collection: teaching
title: "Lab 4"
---

## Logistics
* Due: on Thursday, September 22nd anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit all six of your java files (demo, interface,
	and four classes implementing the interface) to the  Lab 4
	assignment on D2L.

## Learning outcomes
* Practice using interfaces
* Practice using inheritance

## Assignment

Create an interface called `RegularPolygon` with method signatures for `area()`
(returns a `double`) and `perimeter()` (also returns a `double`).

Create the following classes to implement `RegularPolygon`:

* `EquilateralTriangle`
* `Square`
* `RegularPentagon`
* `RegularHexagon`

All of those classes will have different ways to calculate the area and perimeter given the length on one side. Google "area of an equilateral triangle" to see a nice formula -- all of the other polygons have similar Google entries.

Use the downloadable [`RegularPolygonDemo.java`](https://lgw2.github.io/teaching/csci132-fall-2022/labs/RegularPolygonDemo.java) file to test your program.
Add code to test the pentagon and hexagon. Notice that you can copy/past the
square code and just change a couple of words to test the pentagon and again to
test the hexagon. The RegularPolygon interface gives us a consistent way to
treat all the different types of regular polygons there could be, even though
they're all a bit different under the hood. A `RegularPolygon` can take many
forms; that's polymorphism!

## Sample run
After you implement the four classes and update `RegularPolygonDemo.java` to
test the two additional polygons, your sample output might look something like
this:
```
Enter value: 5
----------------------------------------------------
     REGULAR POLYGON            AREA       PERIMETER
Equilateral Triangle           10.83           15.00
              Square           25.00           20.00
    Regular Pentagon           43.01           25.00
     Regular Hexagon           64.95           30.00
----------------------------------------------------
<end>
```

## Grading - 10 points
* 2 points - Create the `RegularPolygon` interface.
* 2 points - `EquilateralTriangle` demos successfully on user input
* 2 points - `Square` demos successfully on user input (that's an easy one -- start with that)
* 2 points - `RegularPentagon` demos successfully on user input (save that one for last)
* 2 points - `RegularHexagon` demos successfully on user input

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, September
27th.
