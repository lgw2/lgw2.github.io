---
collection: teaching
title: "Lecture 5: The keyword `this`; modifiers"
---

[lecture video](https://youtu.be/Y0auTc444vs)


### The keyword `this`
* Within the body of a (nonstatic) method, `this` always refers to the instance
	upon which the method was invoked.
* Use to differentiate between local and instance variables
* Use to reference the instance
* Use to call constructors

### Modifiers

#### Access control modifiers
* For classes, methods, and variables
* Controls visibility in the context of a larger program
* `public`, `protected` (subclasses and classes in same package), `private`. Default is called package-private.

#### The `static` modifier
* For variables and methods
* Value is associated with class as whole, not with an instance

#### The `abstract` modifier
* For methods
* We will learn about later

#### The `final` modifier
* For variables
* Makes it so the variable can never be changed after it is initialized
* If primitive, constant. If reference, a memory address.

### Files used in class
* [Counter.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Counter.java)
* [CounterDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/CounterDemo.java)
* [MoreWithDataTypes.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/MoreWithDataTypes.java)

### Additional exercises

1. Write a method `averageTwo` for the `Counter` class that takes in two instances
   of `Counter` and returns a new `Counter` whose count is the average (rounded
   down) of the two. Test it with the `CounterDemo` program.
2. If you didn't already, make the `averageTwo` method a `static` method.
Change your code in `CounterDemo` so that `averageTwo` is accessed in a static
way. (That is, call the method from the class name, not from an instance of the
class.)
