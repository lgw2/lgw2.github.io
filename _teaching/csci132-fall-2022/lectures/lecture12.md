---
collection: teaching
title: "Lecture 12: Exceptions"
---

[lecture video]()

### Textbook section
2.4

### Exceptions

Exceptions are unexpected events that occur during the execution of a program.

We say that an exception is *thrown* by code that encounters the unexpected
situation. We say that the exception is *caught* by a surrounding block of code
that handles the problem in an appropriate fashion.

### Catching exceptions in Java

We use try-catch statements to catch exceptions in Java.

```java
try {
    // guarded body
} catch (exceptionType1 variable1) {
    // remedy body 1
} catch (exceptionType2 variable2) {
	// remedy body 2
}

```

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
