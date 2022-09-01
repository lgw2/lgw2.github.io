---
collection: teaching
title: "Lab 2"
---

## Logistics
* Due: on Thursday, September 8th  anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your two `.java` files to the Lab 2
	assignment on D2L.


## Learning outcomes
* Practice writing and using a class
* Practice using modifiers
* Practice overriding the built-in `toString`

## Assignment

Create two java files:

* `Animal.java`
* `AnimalDemo.java`

### Animal Class.java
Your Animal class should contain 3 `private` data members and 6 `public` methods as follows.

#### Fields:

* `name`
* `age`
* `species`

#### Methods:

* `getName()`
* `setName()`
* `getAge()`
* `setAge()`
* `getSpecies()`
* `setSpecies()`
* `toString()`

The getters and setters should respectively return or update the name, and the `toString()` method should override Java's built in `toString` method (which every Java object has), and should display something like this:

`Name: Jimmy. Age: 3. Species: Squirrel.`

You should also have two constructors for the Animal so that it is possible to initialize a new Animal with default data values of `"Unnamed"`, `-1`, and `"Unknown"`. The other constructor should take the three values needed to initialize a new Animal object with all three fields.

#### AnimalDemo.java
The `AnimalDemo.java` will be a driver class that you will use to demo the `Animal` class. The driver should initialize two `Animal` objects. One animal should be constructed with its name, age, and species. (You decide those.) The other animal should be constructed with the default values, and subsequently use the setter methods to give the animal a name, age, and species. After displaying the list, the program should prompt the user for another animal, and let the user enter its three attributes.

## Sample run
```
Name: Jimmy. Age: 3. Species: Squirrel.
Create your own animal!
Enter a name:
Johnathan
Enter an age:
40
Enter a species:
Walrus
Name: Johnathan. Age: 40. Species: Walrus.
```

## Grading - 10 points
* 4 points - Your `AnimalDemo` program displays 2 animals (name, age, and species) when run
* 2 points - Your `AnimalDemo` program constructs the 2 animals with two different constructors as explained above
* 3 points - After displaying the list, the program prompts the user for another animal, and lets the user enter its three attributes
* 1 point - After the user enters a another animal, the program displays the 3 animals

## Grading turnaround
This lab will be graded with scores in Brightspace before Tuesday, September
13th.
