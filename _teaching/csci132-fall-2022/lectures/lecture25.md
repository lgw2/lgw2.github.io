---
collection: teaching
title: "Lecture 25: Algorithm correctness"
---

[lecture video]()

### Textbook chapters
4.4

### Loop invariants

To prove some statement $\mathcal{L}$ is correct, we define $\mathcal{L}$ in
terms of a series of smaller statements $L_0, L_1, L_k$, where:
1. The initial claim, $L_0$, is true before the loop begins.
2. If $L_{j-1}$ is true before iteration $j$, then $L_j$ will be true after
   iteration $j$.
3. The final statement, $L_k$, implies the desired statement $L$ to be true.

### Files used in class

### Additional problems

