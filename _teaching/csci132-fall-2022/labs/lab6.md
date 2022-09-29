---
collection: teaching
title: "Lab 6"
---

## Logistics
* Due: on Thursday, October 6th anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your Java file(s) to the  Lab 6
	assignment on D2L.

## Learning outcomes
* Practice using Generics
* Practice handling exceptions

## Assignment

Download [IntegerSwapper.java]() and make the following changes.

### Part 1

Write a `Movie` class with the following members:
* String `title`
* Integer `year`
* a constructor setting both the title and year
* `getTitle()` returning the title
* `getYear)` returning an int
* `toString()` returning a String

You can implement `Movie` in its own file or in the same file as
`IntegerSwapper`.

### Part 2

Change `IntegerSwapper` to `GenericSwapper` so that it can swap elements of any
sort of array. To do this, you will need to change the static `swap` method to
be generic. In class, we learned about how to make classes generic; making
methods generic is very similar. The book provides the following sample code for a generic method
to reverse an array:

```java
public class GenericDemo {
  public static <T> void reverse(T[] data) {
    int low = 0, high = data.length - 1;
	while (low < high) {
	  T temp = data[low];
	  data[low++] = data[high];		// post-increment of low
	  data[--] = temp;			// post-decrement of high
	}
  }
}
```

You'll notice that the code uses the static method `toString()` from the
`Arrays` class from java.util. You can read more about the Arrays class [here](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html).

Also, update `swap` so that it handles `ArrayIndexOutOfBoundsException`s. If
`a` or `b` passed to `swap` are out of bounds, don't perform the swap but
instead print out an error message.

### Part 3

Demonstrate that your GenericSwapper works on arrays of Integers, Strings, and
Movies. Also demonstrate that GenericSwapper handles out of bounds indices.
The sample code gives an outline of this demo.

## Sample run
You don't need to match the output format, but here is an example.
```
Trying swap on an array of Integers:
[5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
[50, 10, 15, 20, 25, 30, 35, 40, 45, 5]

Trying swap on an array of Strings:
[Alpha, Beta, Gamma, Delta]
[Alpha, Gamma, Beta, Delta]

Trying swap on an array of Movies:
[The Fellowship of the Ring (2001), Harry Potter and the Sorcerer's Stone
(2001)]
[Harry Potter and the Sorcerer's Stone (2001), The Fellowship of the Ring
(2001)]

Trying swap with an out of bounds array index
No swap happened because a requested index does not exist.
```

## Grading - 10 points
* 3 points - the `Movie` class is implemented as described
* 4 points - you change `IntegerSwapper` to `GenericSwapper` and the `swap`
	method to be generic and thus work on any type of array
* 1 points - the exception handling works properly
* 2 points - your demo properly tests swapping elements of Integer (already
	done in the code), String, and Movie, and tests the exception handling

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, October 11th.
