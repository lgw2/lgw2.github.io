---
collection: teaching
title: "Program 2"
---

## Logistics
* Due: Friday, May 5th AoE.
* Submission instructions: ensure that you have the source code you want us to
	grade in a file called `program2.c` in your `~/csci112_spring2023/programs/program2`
	directory, and that the snapshot (commit) of your repository containing the version of that file you want us to grade has been committed and
	tagged as `program2`. See the [git lecture](https://lgw2.github.io/teaching/csci112-spring-2023/lectures/lecture2) and [classwork 4](https://lgw2.github.io/teaching/csci112-spring-2023/classwork/classwork4) for more
	details.
* Note that grading will be done on D2L, so you can see comments and a
	 detailed breakdown of your score there, but you do not need to submit
	anything there.

## Learning outcomes

## Assignment

As the CTO for the (soon-to-be-announced) Bozeman Zoo, you need
to write a program that keeps track of the exhibits and the animals that live
in them. Luckily, you recall that way back in your student days (or was it just
last week?), you wrote a
linked list of zoo exhibits, so you decide to build on that. However, you will
need a nice menu for your employees to interact with, and you also need to keep
track of the animals that are living in each exhibit.

### Program specification

You should start by copying your Lab 7 files over to your `program2`
directory, or copying the solution code
from the `/public/lab7` directory (available after the late due date for Lab 7, so on Monday May 1st).
Add to your `Exhibit` struct and add the additional functions as described
below.

Your program must include the following structs and functions with exactly the specified
inputs and return types.
* struct `Exhibit` with data members the name of the exhibit, the capacity, and the next
	exhibit (edit from Lab 7)
* struct `Animal` with data members the name, age, and species of the animal and a pointer to the next
	animal
* function `print_exhibits` (edit from Lab 7)
* function `create_new_exhibit` (edit from Lab 7)
* function `insert_exhibit_at_front` (from Lab 7)
* function `delete_exhibit` (from Lab 7)
* function `print_animal`
* function `create_new_animal`
* function `insert_animal_at_front` that takes in adds an animal to the front of a given exhibit's animal list,
but only if the number of animals is not at capacity
* function `delete_animal` that takes in a pointer to the start of the exhibit
    list, an exhibit name, and an animal name, and deletes the animal from the

### Menu details

You should offer the user the following choices:
1. Create a brand new zoo. Ask for the number of exhibits, and then prompt the
   user for the name of each exhibit. Put all of the exhibits in a linked list.
2. Add an exhibit to the zoo. Ask the user for the name of the exhibit, and
   then add the exhibit at the end of the linked list.
3. Add an animal to an exhibit. Ask the user for the name of the exhibit, check
   that the exhibit has capacity, and if it does,
   and then prompt the user for the information about
   each animal, and then add the animal to the animals linked list field for the exhibit.
   If there is no capacity in the exhibit, print a message saying so, and do
   not prompt the user for additional information about the animal.
4. Remove an animal from an exhibit. Ask the user for the exhibit name and the
   animal name. Find the animal in the exhibit's animal linked list and remove
   it.
5. Remove an exhibit. This action should only be allowed if all of the animals
   have already been removed from the exhibit.
6. Exit the program.

After the user makes a choice, the program should print the current state of
the zoo (i.e., all of the exhibits and the animals they contain), and prompt
the user to make another choice.

### Hints

## Grading - 100 points
**If your code does not compile, has a runtime error on the sample input,
or uses global variables (variables declared outside of main), you get an
automatic 0.**
* 5 points: uses at least one header file and at least two C source code files
* 5 points: provides a Makefile that correctly encodes the dependencies between
    the files and can successfully compile it
* 5 points: source code is in a commit with tag `program2`
* 5 points: source code is in `csci112_spring2023/programs/program2` directory

## Grading turnaround
This program will be graded within one week of its due date.

## Go beyond
* Be able to handle the case when the user enters an exhibit that doesn't exist
    or an animal that doesn't exist when trying to add.
* Add menu items to add multiple animals at once and delete multiple animals at
once.
* Add (and test!) a function to add exhibits in the middle of list (for
    example, after another exhibit with a given name).
* Add (and test!) a function to add animals in the middle of list (for
    example, after another animal with a given name).
