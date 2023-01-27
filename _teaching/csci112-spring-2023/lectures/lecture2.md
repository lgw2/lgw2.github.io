---
collection: teaching
title: "Git"
---

We will use git to manage lab and program submissions in this course. At
minimum, this allows our TAs to quickly access your assignments that you
"submit" on the server, and allows you to get some basic practice with an
extremely
important tool in the software development world. You can also choose to use
git more extensively to manage your work in this class.

## Git basics

Git is a version control system, meaning that it is meant to keep track
of changes to code. It's especially useful for collaborating, but it can also
be used when working by yourself so that you can keep a history of your changes
and why you made them.

Git is *not* GitHub. GitHub is a service that hosts many git repositories.
Other similar services include GitLab and BitBucket. Other version control
systems (so, these are comparable to git) include Mercurial and Subversion.

## Minimum setup for assignment submission

For this course, we're going to create a git repository and use it to tag
the version of our programs that we would like to be graded.

### Creating a git repository

To start, create a directory. For this course, your directory should be called
`csci112_spring2023`, so we will use that as an example.

Create the directory using:
```
mkdir csci112_spring2023
```
Navigate into the directory:

```
cd csci112_spring2023
```
Initialize a git repository inside the directory:
```
git init
```
You will see the following message. Don't worry about it:
```
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint:
hint: 	git config --global init.defaultBranch <name>
hint:
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint:
hint: 	git branch -m <name>
```

Your `csci112_spring2023` directory is now a git repository!

Try running `git status` to see the status of your repository. You should see
this:
```
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)
```

Now create a file with some text in it. You could do this by opening a new file
with `vim`, putting some text in, and saving it. Or you can copy the following:
```
echo "Hello, world!" > example.txt
```
(The `echo` command prints whatever you specify to the screen; the `>`
redirects that output to a file instead of the screen.) You may want to check
that the file is there by running `ls`.

Now, run `git status` again. You should get this:
```
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	example.txt

nothing added to commit but untracked files present (use "git add" to track)
```

### Committing changes

In git, the basic idea for keeping track of changes to your respository is to
save snapshots of the respository, which are called commits. You choose when to
save the snapshots, and write a message (called a commit message) describing
the changes that were made from the previous commit to this one.

Git allows you to choose which of the changes that you have made
should be included in a commit. This is helpful when you are a more advanced
git user, but for our purposes, we can just include all changes whenever we are
ready to create a new snapshot (commmit).

To specify that all changes should be included, we can run
```
git add -A
```
The `-A` is for "all". Now, if you run `git status`, you should see:
```
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   example.txt
```
This means that the file `example.txt` has been added (or "staged", in the
terminology git uses). Multiple files may be staged, and they would all be
listed under "Changes to be committed" when you run `git status`.

Now, we are finally ready to commit. We also need to provide a description of
this commit, called a commit message, which we specify with the `-m` option
followed by our message in quotes. For example, we might do:
```
git commit -m "Add example.txt file"
```
And then we see a message like this:
```
[master (root-commit) 2c82f20] Add example.txt file
 1 file changed, 1 insertion(+)
 create mode 100644 example.txt
```
Running `git status` again shows that we have no unsaved changes:
```
On branch master
nothing to commit, working tree clean
```

We can run
```
git log
```
to see a history of all of  our commits. In this case, it looks something like
```
commit 2c82f20e9b41b4fe09b6c142d381dce32f95abe3 (HEAD -> master)
Author: lgw2 <lgw2@uw.edu>
Date:   Thu Jan 26 19:55:31 2023 -0700

    Add example.txt file
```

### Tagging a commit

If we want to label a commit because it is important or we want to be able to
access it easily, we can give it a tag. **In this class, you will use git tags
to indicate which version of your code we should grade.**

To create a tag, run `git tag <tagname>` after you have committed your changes.
You can run `git log` to check that your tag was associated with the right
commit. For example, we might run
```
git tag example_tag
```
and then
```
git log
```
and see
```
commit 2c82f20e9b41b4fe09b6c142d381dce32f95abe3 (HEAD -> master, tag: example_tag)
Author: lgw2 <lgw2@uw.edu>
Date:   Thu Jan 26 19:55:31 2023 -0700

    Add example.txt file
```
Note the tag at the end of the first line!

You'll notice that if you make a new commit and try to tag that commit with a
tag `tagname` that has already been used, you'll get this message:
```
fatal: tag '<tagname>' already exists
```

To solve this, first delete the tag
```
git tag -d <tagname>
```
and then tag as normal
```
git tag <tagname>
```

### tl;dr

Once you have a version of your lab or program that you would like to "submit",
(i.e., be the one we grade if you don't update it), do this:
```
git add -A
git commit -m "<description of your changes, or just name of assignment>"
git tag <specified tag for assignment>
```

If the tag already exists, do `git tag  -d <specified tag for assignment>`
before the third command above.


## Optional: more advanced git

You can watch the lecture and/or read the text from the MIT Missing Semester
[lecture on git](https://missing.csail.mit.edu/2020/version-control/).
