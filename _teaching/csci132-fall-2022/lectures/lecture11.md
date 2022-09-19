---
collection: teaching
title: "Lecture 11: Some more OOP practice"
---

[lecture video](https://youtu.be/8svoVnwqqIQ)

### Textbook section
2.2-2.3

### `Progression` class

The book uses a class called `Progression` (and its subclasses) to demonstrate
inheritance. This hierarchy of classes represents numeric progressions: for
example, `0, 1, 2, 3, 4, 5,...` or `1, 1, 2, 3, 5, 8,..`. An *arithmetic
progression* determines the next number by adding a fixed constant to the
previous value (e.g., `1` in the first example), and a *geometric progression*
determines the next number by multiplying the previous value by a fixed
constant. In general, a progression requires a first value and a way of
identifying a new value based on one or more previous values. You can check out the
[On-Line Encyclopedia of Integer Sequences](https://oeis.org/) for more
inspiration, though many of those integer sequences are not progressions. (How
might we extend our hierarchy to account for these?)

![Progression](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/prog.png)

### Files used in class
* [Progression.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Progression.java)
* [ArithmeticProgression.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ArithmeticProgression.java)
* [GeometricProgression.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/GeometricProgression.java)
* [FibonacciProgression.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/FibonacciProgression.java)
* [ProgressionDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ProgressionDemo.java)

### Additional exercises
* Implement another progression subclass. (You can look at the [On-Line Encyclopedia of Integer Sequences](https://oeis.org/)
for inspiration or try to think of one yourself. What other operations can
	you do with numbers? How about storing more than one previous?)
* Think about how you would add another class above `Progression` to so hold
	generalized integer sequences. What changes to the `Progression` class
	would you make?
