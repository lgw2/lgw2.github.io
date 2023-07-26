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
ready to create a new snapshot (commit).

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

You can tag a previous commit by referencing its commit hash. For example, if I
run `git log` and see something like this:
```
[p19t655@csci112 csci112_spring2023]$ git log
commit 71203455057227331ac8384f3f2c2a1910ef5094 (HEAD -> master)
Author: lgw2 <lgw2@uw.edu>
Date:   Fri Feb 10 09:08:12 2023 -0700

    Add a example file

commit aa08bd749ec35221abd90ce0908fa7279714e3c1 (origin/master)
Author: lgw2 <lgw2@uw.edu>
Date:   Wed Feb 8 16:38:34 2023 -0700

    Update

commit 3601b167efb9a1c6ed3f384c55a720c740f4ab07
Author: lgw2 <lgw2@uw.edu>
Date:   Thu Jan 26 20:19:37 2023 -0700

    lab1

commit 5170dff5f9795001a837407645ed55cae24e43d9
Author: lgw2 <lgw2@uw.edu>
Date:   Thu Jan 26 20:18:53 2023 -0700

    Update
```
and I want to tag the commit with the comment "lab1" with the tag `lab1` , I cound run
```
git tag lab1 3601b167efb9a1c6ed3f384c55a720c740f4ab07
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

## Common issues

### Nested repositories

In general, you do not want to have nested git respositories. This is what
happens if you run `git init` in one directory, and then run it again in one of
the subdirectories of that directory later. You'll know if you have nested
repositories if `git log` looks different in different directories of your
repository.

Let's get a better understanding of what this means with an example. Suppose that
you have one directory called `directory`, and inside it you had two
directories called `subdir1` and `subdir2`, and maybe those have a few files in
them. Visually, that looks like this:

```
├── directory
│   ├── subdir1
│   │   ├── file1.txt
│   └── subdir2
│       ├── file2.txt
│       └── file3.txt
```

If at some point you had run `git init` when you were in `directory`, then
`directory` (and everything in it, including the subdirectories) is now being
tracked as a git repository. This means that there is a `.git` directory inside
`directory`, so the file structure actually looks like this:

```
├── directory
|   ├── .git
│   ├── subdir1
│   │   ├── file1.txt
│   └── subdir2
│       ├── file2.txt
│       └── file3.txt
```

(Note that we don't see `.git` unless we look for hidden files, for example by
running `ls -a` when we're in the `directory` directory.)

Now suppose we navigate to `subdir1` and run `git init`. This creates another
(nested) repository inside `subdir1`, so there is another `.git` directory
under `subdir1`, and `subdir1` is a new git repository with its own commit
history.

```
├── directory
|   ├── .git
│   ├── subdir1
│   │   ├── .git
│   │   ├── file1.txt
│   └── subdir2
│       ├── file2.txt
│       └── file3.txt
```

But the whole idea of a repository is that it tracks everything inside of it.
So now the `directory` repository is tracking `file1.txt` and so is the
`subdir1` repository, but there's just the one file and so it really only makes
sense to track it once.

If you realize you have created a nested repository, make sure you understand
the level that you really want your repository to exist, and then delete the
unneeded one by deleting the associated `.git` repository. The command to do
this will be different depending on where you currently are. If you're in
`directory`, it would be `rm -rf subdir1/.git`. `-r` says delete all
subdirectories recursively, and `-f` says force the deletions without checking
whether you want to delete each file. (There are a lot of them in there.) Note
that this deletes the whole commit history and can't be undone, so make sure
you delete the correct `.git` directory.

## Optional: more advanced git

### Adding a remote to your repository

If you would like to connect your `csci112_spring2023` repository to GitHub,
do the following steps. You must choose whether to use HTTPS or SSH to
communicate with GitHub. Either is fine, but HTTPS is simpler, so I recommend
that.

1. [Create a new repository on GitHub.com](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-new-repository).
Do not initialize the new repository with README, license, or gitignore files.
**Please make this
repository private so that I can reuse assignments for this course without the
solutions being available online!** Copy the remote url with https in it.
2. On the server, navigate to your `csci112_spring2023` repository and run
```
git remote add origin <REMOTE_URL>
```
3. Now run
```
git push --set-upstream origin master
```

You may need to [generate and enter a personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token#creating-a-personal-access-token-classic) here.

Everything in your repository is now stored on the connected GitHub repository
as well! But updates are not automatic. After any new commits, if you would
like to send them to the GitHub repository, run
```
git push
```

### Cloning that repo to your local computer

To copy over the files in your `csci112_spring2023` directory (and now on
GitHub as well) to a local computer, clone the GitHub repository.

In a terminal window, enter
```
git clone <REMOTE_URL>
```

This will create a directory called `csci112_spring2023` that holds everything
that was in the GitHub repo. If you make an update there (by pushing from the
server) and want to get that update on your computer, navigate into the
`csci112_spring2023` directory and run `git pull`.

### Additional resources

You can watch the lecture and/or read the text from the MIT Missing Semester
[lecture on git](https://missing.csail.mit.edu/2020/version-control/).

You can look at the [git tutorial](https://swcarpentry.github.io/git-novice/) from the software carpentries program, which aims
to teach researchers basic computing skills.

