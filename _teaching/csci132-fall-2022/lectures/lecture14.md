---
collection: teaching
title: "Lecture 14: Generics; finishing up classes"
---

[lecture video]()

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

### Multiple classes in one file

Allowed, as long as only one is public.


### Files used in class
* [Pair.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Pair.java)
* [PairDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/PairDemo.java)

### Additional exercises
