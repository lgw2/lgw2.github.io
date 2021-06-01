---
collection: teaching
title: "Lecture 13: Dynamic memory allocation"
---

### Dynamic memory allocation
Review of type casting [video](https://youtu.be/KiGcCVYelyE)

Dynamic memory allocation [video](https://youtu.be/7C7Y5p0Eak8)

Optional reading: chapter 2.5 (for type casting); 13.1-13.2

Key ideas:
* Type casting: [https://www.tutorialspoint.com/cprogramming/c_type_casting.htm](https://www.tutorialspoint.com/cprogramming/c_type_casting.htm)
* Creating pointers and allocating memory using `calloc` or `malloc`
* Freeing memory using `free`

### Debugging dynamic memory with Valgrind
Take a look at this [video](https://www.youtube.com/watch?v=bb1bTJtgXrI).

Valgrind is already installed on the server. A file containing the `test1`
function from the video is located at `/public/examples/valgrind/val_test.c` on
the server. If you copy it and compile with `gcc -o val_test -Wall -g
val_test.c`, you can run valgrind on it with `valgrind ./val_test` and see the
same errors from the video. Then make the corrections from the video,
recompile, and rerun `valgrind ./val_test` to see that the errors have been
resolved.
