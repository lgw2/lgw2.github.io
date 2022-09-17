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

### Sample output

```
// Circle myCircle = new Rectangle(2, 3); // Fail: not true that a rectangle "is a" circle.
Shape myRectangle = new Rectangle(3.5, 4, "periwinkle");
System.out.println(myRectangle);
Circle myCircle = new Circle(1);
System.out.println(myCircle);

// do more tests! Test each of the 4 shapes in at least 3 ways (minimum 12 tests)
```

## Grading - 100 points

### Readable code and good comments
* 15 points

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

### Correct implementation
* 10 points - `Circle` class extending `Shape`
* 10 points - `EquilateralTriangle` class implementing `RegularPolygon`
* 10 points - `Rectangle` class extending `Shape`
* 10 points - `RegularPolygon` interface
* 10 points - abstract `Shape` class
* 10 points - driver `ShapeDemo` class
* 10 points - `Square` class extending `Rectangle` and implementing `RegularPolygon`

### Demo
* 15 points - prove that the methods work properly (including constructors). It doesn't have to be completely exhaustive, but should contain several shape instantiations of different varieties, and print statements proving out the area and perimeter of each shape; show that the getters/setters for color works, the different constructors for each shape work, and printString is working. Comment the demo for yourself and your TA: show that you understand polymorphism. You should have at least 12 tests (1 point each). The remaining 3 points are for nice commenting and printing along with your demonstration.

## Grading turnaround
This program will be graded with scores in Brightspace by Tuesday September
20th, AoE.
