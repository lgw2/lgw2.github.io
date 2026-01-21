---
title: "CSCI 432/532: Advanced Algorithm Topics"
collection: teaching
type: "Undergraduate course"
venue: "University of Montana, Computer Science"
date: 2025-01-16
location: "Missoula, Montana"
---

## Course schedule

Schedule subject to change. Lecture videos in this [Panopto folder](https://umontana.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx?folderID=2e137ce4-9c01-4486-8d81-b3d0012fa1c6). You can find LaTeX source files for all homework assignments in this [GitHub repository](https://github.com/lgw2/csx32-spring2026-public).

| Week Number| Dates| Due this week| Monday (lecture) | Problem Session | Wednesday (lecture) | Friday (psession/lecture) |
|:---|:---|:---|:---|:---|:---|:---|
| 1 | 1/12-1/16 |   |   |   |   | Course intro  |
| 2 |1/19-1/23 |Optional: [PL 0](https://us.prairielearn.com/pl/course_instance/206368/assessment/2634588) |MLK Day: no class  | no problem session | [Recursively-defined structures](https://lgw2.github.io/teaching/cscix32-spring-2026/lectures/01-strings.pdf) |[Problem session](https://lgw2.github.io/teaching/cscix32-spring-2026/problem_sessions/ps_wk1_1.pdf) |
| 3 |1/26-1/30 |[HW 1](https://lgw2.github.io/teaching/cscix32-spring-2026/homework/hw1.pdf) & [PL 1](https://us.prairielearn.com/pl/course_instance/206368/assessment/2634589) (Monday) <br> HW 1 rewrite (optional) (Wednesday)|Languages and regular expressions| |DFAs| |
| 4 |2/2-2/6   |HW 2 & PL 2 |More DFAs|   |Proving non-regularity | |
| 5 |2/9-2/13 |HW 3 & PL 3   |NFAs, proving automatic=regular, and language transformations   |   | CFGs  |   |
| 6 |2/16-2/20 |   |Pres Day: no class   |no problem session   |TMs   |   |
| 7 |2/23-2/27 |   | Undecidability  |   |More on decidability   |   |
| 8 |3/2-3/6   |   |NP-hardness|   |NP-hardness reductions|   |
| 9 |3/9-3/13 |   |NP-hardness reductions|   | | |
| |3/16-3/20 |🌴| 🌞 |🏖️  | 🍹 | ✈️ |
| 10| 3/23-3/27 |   |FFT   |   |   |   |
| 11| 3/30-4/3  |   |FFT   |   |   |   |
| 12| 4/6-4/10  |   |Encryption   |   |   |   |
| 13| 4/13-4/17 |   |Lucy out: no class |   |project check-in   |Quantum computing |
| 14| 4/20-4/24 |   |Quantum computing |   |   |   |
| 15| 4/27-5/1  |   |Quantum computing   |    |project presentations   |project presentations |
| | (5/4-5/8)  |   |final period 10:10-12:10 (project presentations)   |   |   |   |



## Course info

This course meets in Social Sciences 344 on Mondays, Wednesdays, and Fridays from 9:00-9:50am.

This course will have two parts: in the first half, we will work to understand
what is computable and how fast using computer science theory developed in
the 20th century. This will give us a baseline to understand the
contemporary algorithms field and familiarity with the concepts, notation, and
proof styles necessary.
In the second half, we will cover a number of advanced algorithm
topics, see how they relate to the previous part of the course, and understand
how they are used in the real world.

### Course outcomes

Building on the CSCI 332 (Advanced Algorithms and Data Structures)
[course outcomes](https://lgw2.github.io/teaching/csci332-fall-2025/syllabus/#course-outcomes), students in
CSCI 432/532 can expect to do the following:

* Appreciate the history and development of the field of computer science, from
    ancient times, the 20th century, and today.
* Understand a variety of models of computation and how to show that a problem
    is computable (or not) within that model.
* Be able to prove problems are in various complexity classes (P, NP,
    NP-hard, NP-complete, etc.).
* Understand a variety of modern advanced algorithm topics (e.g., linear
    programming, streaming algorithms, text indexing, encryption, quantum
    computing algorithms, etc.).
* Communicate effectively about the computability and complexity
    of problems and advanced algorithms topics
    in writing, discussion, and presentation.

### Catalog description

3 Credits.
PREREQUISITE: CSCI 332.
Advanced algorithm and data structure concepts, including theory, approximation algorithms, randomized algorithms, parallel algorithms, streaming algorithms, linear programming.

## Course resources

### Canvas

We will use Canvas for course announcements and grade calculations.
Otherwise, all course information will be on this webpage, and any questions
about course logistics or content should be asked via Discord. You can find the
invite to join the Discord on Canvas.

### Group problem solving sessions

In the first half of the course, we will be working through concepts in
computer science theory. The best way to understand these concepts is through
practice and discussion. In order to provide you as much support as possible,
I will schedule and lead two weekly problem sessions where we will work through
problems that are similar to the homework that you turn in every Monday. The outside-of-class
problem session is
not strictly required, but you earn some participation points by attending, and
if you attend these problem sessions the homework should be much easier to
complete. Solutions will be shared after the problem sessions
are completed. The problem session for Monday's lecture will be scheduled
outside of class, and the problem session for Wednesday's lecture will be held
during the Friday lecture time.

Please fill out this poll during the first week of class to help schedule
the problem session for Monday lecture: <https://whenisgood.net/dgn38kf>. 
We will have time for this during the first day.

### Textbook and other notes

There is no required textbook for this course; notes from various sources will be on the schedule above for each lecture as needed.
However, if you would like to consult additional resources, I can recommend a number of popular textbooks in this field, many
of which are available for free online. If you find a new resource that should be added to this list, please let me know!

* [Jeff Erickson's Algorithms Notes](http://jeffe.cs.illinois.edu/teaching/algorithms/). We follow the
*Models of Computation* notes in the first half of this class and
some of the *More Algorithms Lecture Notes* in the second half.
* [Avi Wigderson's *Mathematics and Computation*](https://www.math.ias.edu/avi/book). Avi is one of the most
prolific computer science theorists of the modern age. He won the ACM Turing
award in 2023. His book offers a broad perspective on computer science theory
and has inspired some changes to our course for 2025.
* [Sipser's *Introduction to the Theory of Computation*](https://www.cengage.com/c/student/9781133187790/?filterBy=Student). *The* textbook on
    computer science theory, used in many computer science courses. Not
    officially available for free, but I bet you can figure out how to find a
    pdf online.
* [Mike Rosulek's *The Joy of Cryptography*](https://joyofcryptography.com/). A free undergraduate-level cryptography textbook. Our discussion of public-key encryption follows his presentation (at a very high level).
* [Ryan O'Donnell's Quantum Computing in 100 Easy Lessons](https://www.youtube.com/playlist?list=PLm3J0oaFux3bF48kurxGR6jrmPaQf6lkN). Recordings of
    lectures from a quantum computing course from Carnegie Mellon, coming from
    a computer science theory perspective (as in this course).
* [Ryan Dougherty's EasyTheory youtube channel](https://www.youtube.com/c/EasyTheory). Previous students have found these videos helpful for the theory portion of the course.

### Lecture videos

Lectures will be recorded and available to watch after class. However, if there are
technical difficulties recording a lecture, it will not be re-recorded, so come
to class when you can to make sure that you do not miss course content or
announcements. Videos can be found in the [Panopto folder](https://umontana.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx?folderID=2e137ce4-9c01-4486-8d81-b3d0012fa1c6).

### PrairieLearn

Part of your homework grade will
come from auto-graded "guided" problem sets on a platform called PrairieLearn.
You can try these problems as many times as you would like until you get the
right answer, because they automatically generate new variations of the problem
each time. For some assignments, you will need to complete multiple variations
of the same problem to get full credit. Make sure you look at the "Total
points" value on the right-hand side of the screen.
By completing these assignments
*before* attempting the written homework, you can get feedback about whether
you are understanding what we are looking for in the homework. You can access
the guided problem sets [here](https://us.prairielearn.com/pl/course_instance/206368/join/EX39LVTN26) 
and by entering code `EX3-9LV-TN26`. You
should select either the "Sign in with Google" or the "Sign in with Microsoft"
option. You can log in
with any Google or Microsoft email account; your UM email will work as a
Microsoft account.

### Office hours

Office hours for Spring 2026 are TBD.

## Grading

You will be graded on the following:
* 20% prairie learn homework problems
* 40% written homework problems 
* 30% project
* 10% class participation

Note that there are *no tests!*

Your grade will be determined by your total score as follows:
93+: A; 90+: A-; 87+: B+; 83+: B; 80+: B-; 77+: C+; 73+: C; 70+: C-; 67+: D+; 63: D; 60: D-.

### Bonus

There are two ways to earn bonus points in this class.

#### Catch errors in course materials

If you find an error in any of the course materials (typo, incorrect statement, etc.), make a post in Piazza with the `errors-in-course-material` tag.
If it is really an error, you get a
quarter of a point. Only the first person to post about an error gets the points. You can earn a max of 1 total point toward your 100 for the course (for four errors).

#### Course survey and evaluation

Completing the mid-semester survey and the course evaluation earn you one bonus point each.

## Accessibility statement

The University of Montana is committed to providing equal access for all
students. If you anticipate or encounter barriers to learning due to a
disability, please contact the Office for Disability Equity (ODE) at
406-243-2243 or visit umt.edu/disability to request accommodations.

Once approved, ODE will send your accommodation letter directly to your faculty
through the ODE portal. When I receive notification of your letter, I ask that
you follow up with me so we can discuss how to best implement your
accommodations in this course. Please note that accommodations are not
retroactive, so do not delay in making your request.