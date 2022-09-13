---
collection: teaching
title: "Lecture 8: Object Oriented Design: Inheritance"
---

[lecture video](https://youtu.be/hqHAL9ml3EM)

### Textbook section
2.1-2.2

### Object oriented design principles
1. Abstraction
* give an interface of an abstract data type (ADT)
* a class implements the interface
2. Encapsulation
* do not reveal the implementation details; just maintain the interface
3. Modularity
* organize different components of a system into separate functional units

### Inheritance
* hierarchical; uses "is-a" relationships
* we say that a subclass or child class extends a base class, parent class, or super class
* child class can augment by adding new fields and methods
* can also override an existing method
* use `super` keyword to refer to parent class
* constructors are *not* inherited
![is-a relationship](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/isa.jpeg)

![PredatoryCreditCard](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/PredatoryCreditCard.jpeg)

### Files used in class
* [CreditCard.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/CreditCard.java)
* [CreditCardDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/CreditCardDemo.java)
* [PredatoryCreditCard.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/PredatoryCreditCard.java)

### Additional exercises
* Create another class, `AirlineCreditCard`, that inherits from the
	`CreditCard` class. It should have the additional private fields `airline`
	(`String` type) and `miles` (`double` type). It should have a constructor that
	calls the `CreditCard` constructor using the `super` keyword and sets the
	values of the two new fields. It should override the `charge` method to
	also add one mile per dollar spent to the `miles` total. (Try to use the
	`super` keyword again to call the `charge` method from the parent class.)
	Add a `getMiles()` method and write some code in `CreditCardDemo.java` to
	test that your new class is working.
