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

### Add `Circle` and `Rectangle`

Create and add the classes `Circle` and `Rectangle` to the package as well. These
two will not have an interface to implement like the `Square` and
`EquilateralTriangle`, but they will still need to have constructors so that we
can create objects of their types. The shape subclasses should each have three
constructors:

* `Circle(radius)`
* `Circle(color)`
* `Circle(radius, color)`

* `Square(side)`
* `Square(color)`
* `Square(side, color)`

* `EquilateralTriangle(side)`
* `EquilateralTriangle(color)`
* `EquilateralTriangle(side, color)`

* `Rectangle(width, height)`
* `Rectangle(color)`
* `Rectangle(width, height, color)`

If unspecified, the `color` should be white, and `size` (`radius`, `side`, `width`, `height`) should be 1.

### Demonstrate your understanding of polymorphism in `ShapeDemo.java`

Notice that we can use the same syntax on different shapes because we have a sensible system of inheritance and abstraction.

Showcase your program by testing shapes of all types. You have a shape that can
take many forms (`Circle`, `Square`, etc.). In the file `ShapeDemo.java`, create some shapes,
and call the methods to get their colors, areas, and perimeters. Create a shape
and assign it a square. Create a circle and assign it a circle. Can you create
a rectangle and assign it a square? Why or why not? Can you create a square and
assign it a rectangle? Why or why not?  Think about the "is a" relationship.
Comment your demo with explanations of what is happening in these experiments.
If some assignments doesn't work, comment them out and explain why in comments
preceding them. Example:

```java
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
