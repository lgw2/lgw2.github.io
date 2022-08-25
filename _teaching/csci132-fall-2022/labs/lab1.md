---
collection: teaching
title: "Lab 1"
---

## Logistics
* Due: on Thursday, September 1st  anywhere on earth (6am Friday). (Penalties from [the
	syllabus](https://lgw2.github.io/teaching/csci132-fall-2022/syllabus/)
	apply if you turn it in any later.)
* Submission instructions: you have two options. The first option is to
	demonstrate the execution of your lab to your TA during your assigned lab
	section on Thursday.
	The second option is to submit your `.java` file to the Lab 1
	assignment on D2L.


## Learning outcomes
* Make sure that you can compile and run Java programs.
* Practice basic Java syntax.
* Use `Scanner` to interact with a user.
* Use arrays.

## Assignment

1. Open [Lab1Example.java](https://lgw2.github.io/teaching/csci132-fall-2022/labs/Lab1Example.java) in your IDE of choice. You can either move the file into an existing package directory
in your working environment, or you can create a new Java class and paste the
text in.
2. Follow the instructions in comments in the file.
3. As you're reading through, try making small changes to test your
   understanding of the program.
4. Once you're comfortable with how the program works, create a new Java class
   (for example, you might call the file `Lab1.java` and thus your class
   `Lab1`). Using the code from the example file, write a program that does the
   following:
   * creates an array of length 5 and populates the array with Strings. The strings can be of your own choosing (top 5 favorite albums, top 5 Super Bowls of all time, top 5 cat names, top 5 things to do on the weekend, etc...)
   * prints the contents of the array
   * prompts the user for a new #1 item in the list and replaces the first item
	   with the user's choice (you can choose what text you use to ask for a
	   new choice)
	* prints the new list

## Example run
```
*** Top 5 Movies ***
Citizen Kane
Sharknado
Star Wars
The Godfather
The Godfather II
What movie should replace Citizen Kane? The Joker
*** New Top 5 ***
The Joker
Sharknado
Star Wars
The Godfather
The Godfather II
```

## Grading - 10 points
* 5 points - Your program displays a list of 5 strings when it is run
* 2 points - Your program uses a for loop to iterate through the strings and print them
* 2 points - After displaying the list, the program prompts the user for a different #1 string
* 1 point - After the user enters a different #1 string, the program displays the modified list

## Grading turnaround
This lab will be graded with scores in Brightspace by 5pm on Friday, August
26th.
