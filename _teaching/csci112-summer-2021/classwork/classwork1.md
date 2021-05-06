---
collection: teaching
title: "Classwork 1: Getting started with Linux, vim, and git"
---

## Logistics
* Due: Monday, May 10th no later than 1:35pm.
* Submission instructions: push a commit with the tag `classwork1` to your git
	repository.
* Deadline reminder: after the deadline passes, you cannot earn any points for
	this assignment. If the deadline is approaching, submit what you have in
	order to earn partial credit.

## Learning outcomes
* Be able to use the course Slack workspace to communicate with the instructor
	and your classmates.
* Understand the course format and the resources that are available for you to
	succeed.
* Be able to `ssh` into the course server and use basic Linux commands to
	navigate and perform basic tasks.
* Be able to use `git` to version control your work.
* Be able to read and edit files using vim.
* Understand the general course structure and the resources available to help
	you succeed.

## Assignment

### Part 1: Introduce yourself and explore the syllabus
* Post in the `#random` channel on Slack introducing yourself to the class. At
minimum, tell us your preferred name, your major (or intended major), and one
thing you are looking forward to during the course This can be course-related or
just something fun you've got going on during May or June.
* In a direct message to Lucy on Slack, send answers to the following
	questions:
	1. What time is classwork due?
	2. What time are labs and programs due?
	3. What is your github username? (If you don't already have one, just do Part 2 of
	   the assignment first, where you will create one.)
	4. What part of the course makes up the most of your grade?
	5. Someone asks you for help with a lab because they are getting an error they don't understand.
	Is either of the following is okay?
	   (a) For them to send you a copy of their code for you to debug, or (b)
	   To get on a video call with them, have them share their screen, and show
	   their code to you while you talk them through debugging it?

### Part 2: Create a file, edit it with vim, and push to GitHub
* Create a `.vimrc` file in your home directory and customize it however you
	like. See the Lecture 1 videos for more details.
* Create a git repository for the class and push a file to it, as shown in the
	Lecture 1 video. You can follow the video to accomplish all of these steps.
	If you are still having trouble, we will also go through them together
	during class.
1. If you do not have a GitHub account, create one.
2. Create a **private** git repository named `csci112-2021-firstname-lastname` and clone it
	in your `/home/netid/` directory using
```
git clone
https://github.com/your-github-username/csci112-2021-firstname-lastname.git
```
	*Note:
	if you prefer, you can use a SSH key rather than HTTPS to communicate with
	GitHub. It's a litle more complicated to set up but I'm happy to help if
	you are interested.*
3. Inside the `csci112-2021-firstname-lastname` directory, create
	following directories: `classwork`, `labs`, and `programs`.
4. Inside the `classwork` directory, create another directory called
	`classwork1`. Inside that directory, create a file called `first_file.txt`.
	In that file, put whatever you want. For example:
```
This is my first classwork assignment!
```
5. Add lgw2 as a collaborator (so that I can pull your work to grade it).
6. Commit `first_file.txt` and add a tag of `classwork1`.
7. Push your changes to GitHub. (The first time you do this, you will need to
   enter your credentials, but if you store them as above you will not need to
   after this)
8. To save your credentials so that you don't need to reenter them every time
   you push, you can run
```
git config credential.helper store
```
*Note: this is not a very secure way to store your credentials, because
this command will cause them to be stored in plaintext in a file called
`.git-credentials` in your home directory, so if someone gained access to your
computer, they could see your GitHub login information. Other students cannot
see any of the files in your home directory, but I can -- though I won't look
at your stored password. If you would like a more secure way to store your
credentials so that you don't need to reenter them every time, go back and
clone using SSH instead.*

## Grading - 10 points
* 2 points - there is a post in the `#random` channel on Slack including the
	information described above.
* 3 points - there is a direct message to Lucy in Slack answering all five
	questions listed above.
* 1 point - there is a directory called `csci112-2021-firstname-lastname` in
	your `/home/netid/` directory on the course server, containing the three
	directories listed above.
* 1 point - there is a `.vimrc` file in your home directory.
* 1 point - you have a GitHub repository called
	`csci112-2021-firstname-lastname` and lgw2 (Lucy) is added as a
	collaborator.
* 3 points - there is a file called `first_file.txt` in your
	`classwork/classwork1` directory.

## Grading turnaround
This classwork will be graded with scores in Brightspace by 5pm the day it is
due (May 10th).
