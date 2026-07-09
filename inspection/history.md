
1. git status: Which branch am I on, and is the working tree clean?

    On branch inspection-extra
    Untracked files:
    (use "git add <file>..." to include in what will be committed)
            inspection/history.md
    nothing added to commit but untracked files present (use "git add" to track)

- My Answer -> We are on inspection-extra branch and working tree is not clean.


2. git branch: Which local branches exist?

     develop
    * inspection-extra
     inspection-practice
     main

- My Answer -> These are local branches on machine 

3. git branch -r: Which remote branches exist?

    origin/HEAD -> origin/main
  origin/develop
  origin/inspection-extra
  origin/inspection-practice
  origin/main

- My Answer -> main, develop, inspection-practice, inspection-extra are the branches in remote repo and main is the default branch

4. git branch -a: What is the difference between local and remote branch listings?

  develop
* inspection-extra
  inspection-practice
  main
  remotes/origin/HEAD -> origin/main
  remotes/origin/develop
  remotes/origin/inspection-extra
  remotes/origin/inspection-practice
  remotes/origin/main

- My Answer -> Local branches are stored in local machine and remote one are in the remote repo (github). 

5. git log --oneline: What commits happened recently?

f2cd034 (HEAD -> inspection-extra, origin/inspection-extra) add extra inspection notes
6b49b47 add extra inspection notes
18d2910 (origin/main, origin/HEAD, main, develop) Merge pull request #1 from Kuldeep-Marskole/develop
b97f32f (origin/develop) README with Introduction
837e19a Initial commit

- My Answer -> Recently extra.md file is commited. 

6. git log --oneline --decorate --graph --all: How are branches related?

* f2cd034 (HEAD -> inspection-extra, origin/inspection-extra) add extra inspection notes
* 6b49b47 add extra inspection notes
| * a3ff812 (origin/inspection-practice, inspection-practice) add inspection practice notes
|/  
*   18d2910 (origin/main, origin/HEAD, main, develop) Merge pull request #1 from Kuldeep-Marskole/develop
|\  
| * b97f32f (origin/develop) README with Introduction
|/  
* 837e19a Initial commit

- My Answer -> Initially the main branch. Later the develop branch was created, and its changes were merged into main. After that, two separate branches, inspection-practice and inspection-extr were created from the same commit and then developed independently. 

7. git diff develop..inspection-extra: What changed compared to develop?

diff --git a/inspection/extra.md b/inspection/extra.md
new file mode 100644
index 0000000..9c826e0
--- /dev/null
+++ b/inspection/extra.md
@@ -0,0 +1,6 @@
+
+## Extra Inspection Notes
+
+-
+-
+-
\ No newline at end of file

- My Answer -> inspection-extra contain inspection/extra.md 

8. git diff develop..inspection-practice: How is this branch different from inspection-extra?

diff --git a/inspection/note.md b/inspection/note.md
new file mode 100644
index 0000000..70bb38c
--- /dev/null
+++ b/inspection/note.md
@@ -0,0 +1,5 @@
+
+## Inspection Notes
+-
+-
+-
\ No newline at end of file

- My Answer -> This branch contain inspection inspection/note.md where as that contain inspection/extra.md

9. git show <commit-hash>: What exactly did one commit change?

deep@Deep-MacBook-Air KULDEEP % git show f2cd034 
commit f2cd0346521abd20f391c5565c8b8771e1c986d2 (HEAD -> inspection-extra, origin/inspection-extra)
Author: Kuldeep <kuldeepmarskole77@gmail.com>
Date:   Tue Jul 7 16:17:32 2026 +0530

    add extra inspection notes

diff --git a/inspection/extra.md b/inspection/extra.md
index e69de29..9c826e0 100644
--- a/inspection/extra.md
+++ b/inspection/extra.md
@@ -0,0 +1,6 @@
+
+## Extra Inspection Notes
+
+- 
+- 
+- 
\ No newline at end of file

- My Answer -> Hash (f2cd034) commit extra.md with text. 
