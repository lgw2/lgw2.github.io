---
collection: teaching
title: "Lecture 10: Polymorphism; command line args"
---

[lecture video]()

### Textbook section
2.2

### Polymorphism
* literally means "many forms"
* In object oriented design, refers to the ability of a reference variable to
	take different forms

### Command line arguments
* get stored in `String[] args`
* to run a Java program with command line arguments in Eclipse, go to Run ->
	Run Configurations... and then edit in the Arguments tab
![args](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/args.png)
* to run a Java program from terminal, use `java` and then the binary file
* you may need to add java to your path (google "add java to path" + your
	operating system)

### Files used in class
* [PolymorphismDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/PolymorphismDemo.java)
* [Echo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Echo.java)

### Additional exercises
* R-2.11 from book: Consider the following code fragment, taken from some
	package:
```java
class State extends Region {
	State() {}
	public void printMe() { System.out.println("Ship it."); }
}

class Region extends Place {
	Region() {}
	public void printMe() { System.out.println("Box it."); }
}

class Place extends Object {
	Place() {}
	public void printMe() { System.out.println("Buy it."); }
}

public class Maryland extends State {
	Maryland() { /* null constructor */ }
	public void printMe() { System.out.println("Read it."); }
	public static void main (String[] args) {
		Region east = new State();
		State md = new Maryland();
		Object obj = new Place();
		Place usa = new Region();
		md.printMe();
		east.printMe();
		((Place) obj).printMe();
		obj = md;
		((Maryland) obj).printMe();
		usa = md;
		((Place) usa).printMe();
	}
}
```
What is the output from calling the `main()` method of the `Maryland` class?
