---
collection: teaching
title: "Lecture 25: Algorithm correctness"
---

[lecture video](https://youtu.be/Rn6xUzGRFgs)

### Textbook chapters
4.4

### Loop invariants

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

