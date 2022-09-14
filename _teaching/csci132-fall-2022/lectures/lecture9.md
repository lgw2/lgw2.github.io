---
collection: teaching
title: "Lecture 9: Object Oriented Design: Interfaces and Abstract Classes"
---

[lecture audio](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/day1.mp4) (thought I was recording video in higher quality...instead,
just didn't record video)

### Textbook section
2.3

### Interfaces
In general:
* We don't need to know what's going on underneath the hood! We just need the
	interface to be specified.

In Java:
* An interface is a collection of method declarations with no data and no
	bodies.
* Interfaces have no constructors and they cannot be directly instantiated.
* A class then implements an interface.

### Abstract classes
* In between an interface and a normal (concrete) class
* Example: we can implement `Animal` as an abstract class, while `Tortoise`, `Otter`, and
	`SlowLoris` inherit from and implement its abstract methods.

### Files used in class
* [Sellable.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Sellable.java)
* [Photograph.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Photograph.java)
* [Animal.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Animal.java)
* [Otter.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Otter.java)

### Additional exercises

