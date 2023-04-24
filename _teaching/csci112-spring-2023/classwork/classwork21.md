---
collection: teaching
title: "Classwork 21"
---

## Logistics
* Due: Monday, April 24th AoE.
* Submission instructions: make sure that the required file (`llist.c`) is in your
	`/classwork/week14/mon/` directory.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment.

## Learning outcomes
* Practice writing a linked list function
* Practice allocating memory on the heap

## Assignment

If on campus and connected to a MSU network:
* Log in to the server.
* From your home directory, navigate to `classwork/week14/mon/`, creating directories `week14`
and `mon` if necessary.
* Copy the `llist.c` file from `/public/classwork/week14/mon` and fill in
	`create_new_digit` function. You should call `malloc` to put the new node on
	the heap.

If off campus:
* Copy the code below. Using a C compiler of your choice (if you don't have
	one, use https://www.jdoodle.com/c-online-compiler/), fill in the
	`create_new_digit` function so that the program prints `1->2->3->`.
	You should call `malloc` to put the new node on
	the heap.
* In a DM to Lucy on Discord, copy your code.

```
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct digit {
    int d;
    struct digit* next;
} digit;

void print_list(digit* head) {
    digit* temp = head;

    while (temp != NULL) {
        printf("%d->", temp->d);
        temp = temp->next;
    }
    printf("\n");
}

digit* create_new_digit(int d) {
    // TODO
}

int main(void) {
    digit* head;

    head = create_new_digit(1);
    head->next = create_new_digit(2);
    head->next->next = create_new_digit(3);

    print_list(head);

}
```

## Autograder

You can run the autograder yourself by running
```
/public/classwork/week14/mon/autograder.sh
```
The `autograder.txt` file will be created or
replaced. You may get a few lines of output about not being able to remove
files, etc. This is okay.

For those who DM their code, if your program has the output
```
1->2->3->
```
you will get full credit.

## Grading turnaround

The autograder will be run at 6am to calculate final scores. Scores will be
uploaded to D2L by the next class period.
