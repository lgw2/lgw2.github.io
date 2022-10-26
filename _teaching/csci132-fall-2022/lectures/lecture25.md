---
collection: teaching
title: "Lecture 25: Algorithm correctness"
---

[lecture video](https://youtu.be/Rn6xUzGRFgs)

### Textbook chapters
4.4

## Algorithm correctness

We've been studying the runtimes of algorithms. But we can correctly write down
the runtime without showing anything about its correctness.

### What does it mean for an algorithm to be correct?

An algorithm is correct if it returns the correct value for every allowable
input.

## How do we prove correctness?

### Counterexample
What if an algorithm is not correct? We can prove that by giving a
counterexample.

Suppose I claim this algorithm returns the max value of an array:
```java
public static double arrayMax(double[] x) {
    double curMmax = x[0];
    for (int i = 1; i < x.length - 1; i ++) {
        if (x[i] > curMax) {
            curMax = x[i];
        }
    }
    return curMax;
}
```
But for the input `[10, 100]` it returns 10.

### Loop invariants
The purpose of loop invariants is to give us a way to formalize our arguments
about why an algorithm is correct.

To prove some statement $\mathcal{L}$ is correct, we define $\mathcal{L}$ in
terms of a series of smaller statements $\mathcal{L}_0, \mathcal{L}_1, \mathcal{L}_k$, where:
1. The initial claim, $\mathcal{L}_0$, is true before the loop begins.
2. If $\mathcal{L}_{j-1}$ is true before iteration $j$, then $\mathcal{L}_j$ will be true after
   iteration $j$.
3. The final statement, $\mathcal{L}_k$, implies the desired statement $\mathcal{L}L$ to be true.

### Files used in class
[LoopInvariants.pdf](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/LoopInvariants.pdf)

### Additional problems
* Use a loop invariant to argue that the algorithm for array max from the
    previous lecture is correct. To do so, make sure that you are explicit
    about what the overall claim that we need to show is, what sub-claim your
    loop invariant is, and then why 1, 2, and 3 above are true.

