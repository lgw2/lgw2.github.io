---
collection: teaching
title: "Program 2"
---

## Logistics
* Due: Sunday, May 30th no later than 11:59pm.
* Submission instructions: push a commit with the tag `program2` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Manipulate strings
* Create and use `structs`
* Practice using arrays
* Read from a file
* Create a header file
* Use a makefile to compile multiple sources

## Assignment

Create a program that reads in a list of CSCI classes from a file.  Store the
list in an array of data structures. Then, allow the user to have a number of
options to query the list of classes and get information about them. You must
include the following options:
* Quit
* Print all classes
* Print all classes by course id (e.g., `CSCI 112`)
* Print all classes under a certain number of seats

You should also add at least one more option that is different from all the
options listed above.

### Sample output

```
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
a
Joy and Beauty of Computing             CSCI 107    Paxton John T
62    MWF   1000-1050   
Programming with C I                    CSCI 112    Cummings Mary A
175   MWF   0900-0950   
Joy and Beauty of Data                  CSCI 127    DeFrance Daniel Louis
155   MWF   0900-0950   
Bsc Data Structures/Algorithms          CSCI 132    DeFrance Daniel Louis
156   MWF   1510-1600   
Social & Ethical Issues in CS           CSCI 215    Cummings Mary A
60    TR    1505-1555   
Data Structures and Algorithms          CSCI 232    Lloyd Hunter S
128   TR    1050-1205   
Discrete Structures                     CSCI 246    Zhu Binhai
84    MWF   0800-0850   
Concepts/Programming Languages          CSCI 305    Lloyd Hunter S
144   MWF   0800-0850   
Computer Science Theory                 CSCI 338    Zhu Binhai
140   MWF   1100-1150   
Data Mining                             CSCI 347    Neeley Veronika
75    MWF   1310-1400   
Computer Systems                        CSCI 366    Wittie Mike
60    MWF   0900-0950   
Computer Graphics                       CSCI 441    Millman David
65    TR    1630-1745   
Artificial Intelligence                 CSCI 446    Sheppard John W
63    TR    0925-1040   
Embedded Systems: Robotics              CSCI 455    Lloyd Hunter S
84    MWF   1200-1250   
Compilers                               CSCI 468    Kahanda Indika M
80    MWF   1510-1600   
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
n
Enter class id: CSCI 112
Programming with C I                    CSCI 112    Cummings Mary A
175   MWF   0900-0950   
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
n
Enter class id: CSCI 456
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
d
Enter day of week combo: MWF
Joy and Beauty of Computing             CSCI 107    Paxton John T
62    MWF   1000-1050   
Programming with C I                    CSCI 112    Cummings Mary A
175   MWF   0900-0950   
Joy and Beauty of Data                  CSCI 127    DeFrance Daniel Louis
155   MWF   0900-0950   
Bsc Data Structures/Algorithms          CSCI 132    DeFrance Daniel Louis
156   MWF   1510-1600   
Discrete Structures                     CSCI 246    Zhu Binhai
84    MWF   0800-0850   
Concepts/Programming Languages          CSCI 305    Lloyd Hunter S
144   MWF   0800-0850   
Computer Science Theory                 CSCI 338    Zhu Binhai
140   MWF   1100-1150   
Data Mining                             CSCI 347    Neeley Veronika
75    MWF   1310-1400   
Computer Systems                        CSCI 366    Wittie Mike
60    MWF   0900-0950   
Embedded Systems: Robotics              CSCI 455    Lloyd Hunter S
84    MWF   1200-1250   
Compilers                               CSCI 468    Kahanda Indika M
80    MWF   1510-1600   
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
s
Enter maximum number of seats: 200
Joy and Beauty of Computing             CSCI 107    Paxton John T
62    MWF   1000-1050   
Programming with C I                    CSCI 112    Cummings Mary A
175   MWF   0900-0950   
Joy and Beauty of Data                  CSCI 127    DeFrance Daniel Louis
155   MWF   0900-0950   
Bsc Data Structures/Algorithms          CSCI 132    DeFrance Daniel Louis
156   MWF   1510-1600   
Social & Ethical Issues in CS           CSCI 215    Cummings Mary A
60    TR    1505-1555   
Data Structures and Algorithms          CSCI 232    Lloyd Hunter S
128   TR    1050-1205   
Discrete Structures                     CSCI 246    Zhu Binhai
84    MWF   0800-0850   
Concepts/Programming Languages          CSCI 305    Lloyd Hunter S
144   MWF   0800-0850   
Computer Science Theory                 CSCI 338    Zhu Binhai
140   MWF   1100-1150   
Data Mining                             CSCI 347    Neeley Veronika
75    MWF   1310-1400   
Computer Systems                        CSCI 366    Wittie Mike
60    MWF   0900-0950   
Computer Graphics                       CSCI 441    Millman David
65    TR    1630-1745   
Artificial Intelligence                 CSCI 446    Sheppard John W
63    TR    0925-1040   
Embedded Systems: Robotics              CSCI 455    Lloyd Hunter S
84    MWF   1200-1250   
Compilers                               CSCI 468    Kahanda Indika M
80    MWF   1510-1600   
Please enter a valid choice.
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
s
Enter maximum number of seats: 62
Joy and Beauty of Computing             CSCI 107    Paxton John T
62    MWF   1000-1050   
Social & Ethical Issues in CS           CSCI 215    Cummings Mary A
60    TR    1505-1555   
Computer Systems                        CSCI 366    Wittie Mike
60    MWF   0900-0950   
Please enter a valid choice.
Choices:
a - print all available classes
n - print class given course id
d - print all classes given day of week combo
s - print all classes under certain # seats
q - quit
q
Bye!
```

### Hints
* You can use `gets` to read in input with spaces without a newline character.
	`fgets` also reads input with spaces, but it keeps the newline. `gets` is
	deprecated in newer C compilers, but you can use it for this assignment.
* If `gets` (or `fgets`) is not allowing you to enter input, it may be
	consuming a previous newline left behind from a `scanf`. To fix this, you
	can add a `getchar()` before your `gets`.
* Remember that string assignment must be done with `strcpy` (unless it's in a
	variable declaration/initialization).
* Start early!

### Requirements

## Grading - 100 points
* 5 points – comments explaining what your program does
* 5 points - code is indented so that it is readable
* 5 points - there are no global variables
* 10 points – compiles successfully with -Wall – no warnings except for about
	`get`
* 5 points – successfully reads in and uses a command line parameter
* 5 points - has error msg if no command line parameter
* 10 points – reads all input into a 2 dimensional array of size command line number x 4
* 5 points - the array is of `unsigned char` data type
* 5 points – compiles and links  with makefile
* 5 points - four functions are stored in different files
* 10 points – computes the number of networks for class A, B, C correctly.
* 15 points – identifies the largest networks for class A, B, C correctly,
	prints the largest network, and prints the correct largest count
* 5 points – sorts addresses in order to count them
* 10 points - correctly implements a sorting algorithm
* BONUS 5 points - uses a different sorting algorithm other than selection sort
	(which was shown in the lecture video)

## Grading turnaround
This program will be graded with scores in Brightspace by 5pm on May 25th.
