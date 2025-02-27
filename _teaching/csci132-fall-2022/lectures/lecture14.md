---
collection: teaching
title: "Lecture 14: Generics; finishing up classes"
---

[lecture video](https://youtu.be/ybz1BJe_NzI)

### Textbook chapters
2.5-2.6

### Warmup: the `getClass()` method

Returns the class of an object. For example,
```java
Progression prog = new ArithmeticProgression(0, 2);
System.out.println(prog.getClass());
```

### Generics

Syntax:
* class header uses `<TypeParam1, TypeParam2, ...>`
* specify the type parameters to instantiate, e.g., `Pair<String, Integer> p1 =
    new Pair<String, Integer>("Even", 8);`

### Nested classes

* allowed!
* useful for creating small classes that are used as part of a larger data
    structure
* see the [official Java tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html) for more details

### Multiple classes in one file

Allowed, as long as only one is public.

### Access control

We've learned about `public`, `private`, and `protected`. But when should you
use each one?
* Use the most restrictive access level that makes sense for a particular member. Use `private` unless you have a good reason not to.
* Avoid `public` fields except for constants. (You may see examples in tutorials and in this class using `public` fields. This sometimes helps to illustrate some ideas concisely, but is not recommended for production code.) `public` fields tend to link you to a particular implementation and limit your flexibility in changing your code.

See the official [Java tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) for more information.

### Files used in class
* [Pair.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Pair.java)
* [PairDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/PairDemo.java)
* [OuterClass.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/OuterClass.java)
* [TopLevelClass.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/TopLevelClass.java)

### Additional exercises
* Go back and check your previous labs and programs for this course. Did you
    use appropriate access control modifiers for your fields and methods? (Note
    that the starter code may not!)
* Write a generic `Singleton` class with at least one field, at least one constructor, methods `setElement()`, `getElement()` and `toString()`, and
write a `SingletonDemo` class to test it out with a few different type
parameters.
