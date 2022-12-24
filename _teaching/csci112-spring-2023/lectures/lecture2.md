---
collection: teaching
title: "Lecture 2: Java vs. Python"
---

Today, we'll learn more about Java by comparing it to what we already know
about Python.

[lecture video](https://youtu.be/KGI9kZirTqI)


### What we need for a Java program
* Every Java program must define a class, and all code is inside a class
* Everything in Java must have a type
* Every Java program must have a function called 'public static void main(String[] args)'
* [a dissected java program](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/prog.pdf)
* Semicolons and curly braces (`{}`) are needed to end statements and define
	code blocks

### Eclipse hints & Java conventions
* Check the "public static void main(String[] args)" box to automatically
	create a main method
* Java classes should start with capital letter

### Data types in Java
* Primitive data types (`int`, `char`, etc)
* Classes & objects
* `String` class

### Comparing a Python program and a Java program
The following Python program gets a temperature in Fahrenheit from the user and prints
it in Celcius.
```
def main():
    fahr = int(input("Enter the temperature in F: "))
    cel = (fahr - 32) * 5.0/9.0
    print("the temperature in C is: ", cel)

main()
```

### What's going on behind the IDE?
* You can run Python in the interpreter...but not Java programs
* Java is compiled

### Files used in class
* [DataTypes.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/DataTypes.java)
* [TempConv.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/TempConv.java)
