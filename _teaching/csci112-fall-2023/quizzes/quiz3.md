---
geometry: margin=3cm
---

On the bubble sheet, please write your full name (as it would appear in D2L). You do not need to fill out
any of the other fields (ID, section, etc.). Answer the following questions on the bubble sheet:

1\.  Suppose I declare an array like so:

```
double nums[99];
```

How many slots for doubles does `nums` have?

A.  0
B.  99
C.  100
D.  101
D.  we don't know

2\.  When the following C code is run, what is printed?

```
#include <stdio.h>
void func1(int x) {
    x++;
}
int main(void) {
    int x = 100;
    func1(x);
    printf("x is %d\n", x);
    return(0);
}
```

A.  `x is 100`
B.  `x is 101`
C.  this code doesn't compile
C.  there is a runtime error

3\.  When the following C code is run, what is printed?

```
#include <stdio.h>
void func1(int x[]) {
    x[0]++;
}
int main(void) {
    int x[] = {100};
    func1(x);
    printf("x[0] is %d\n", x[0]);
    return(0);
}
```

A.  `x[0] is 100`
B.  `x[0] is 101`
C.  this code doesn't compile
C.  there is a runtime error

4\.  Suppose a variable `x` is declared like so:

```
int x = 5;
```

What C command would produce a pointer to `x`?

A.  `ptr(x)`
B.  `*x`
C.  `&x`
D.  `x*`
E.  It's not possible to create a pointer to `x` because it was not declared as
a pointer

5\.  What is the value of the variable `vote` after the following code snippet
is run?

```
int vote, age;
age = 25;
vote = age >= 18 ? 1 : 0;
```

A.  -1
B.  0
C.  1
D.  2
E.  This code would not compile

6\.  Suppose I have written a "Hello, world!" C program that just prints
"Hello, world!" and I have compiled it into an executable called
`hello`. What Linux command could I run to run `hello` and redirect the output
to the file `out.txt`?

A.  `hello out.txt`
B.  `./hello`
C.  `./hello > out.txt`
D.  `hello < out.txt`
E.  `printf("Hello, world!", "out.txt")`

7\.  Consider the following code snippet:

```
int num = 5;
do {
    printf("Num is less than 4\n");
} while (num < 4);
```

How many times does `Num is less than 4` print when this code is run?

A.  0
B.  1
C.  2
D.  3
D.  This code would not compile

8\.  Can a function in C return more than one thing?

A.  Yes
B.  No

9\.  After the following code is run, what is the value of `n`?

```
int n;
```

A.  0
B.  -1
C.  `NULL`
D.  This code would not compile
E.  We don't know

10\.  After the following code is run, what is the value of `j`?

```
int i = 2;
int j;
j = i++;
```

A.  0
B.  1
C.  2
D.  3
E.  This code would not compile

