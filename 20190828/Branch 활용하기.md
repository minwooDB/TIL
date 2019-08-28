1. master
2. ;;;

## Branch 활용하기

git init 을 하였을 때 (master) 는 사실 master 브랜치에 있다라는 사실을 보여주고 있는 것이다. 

1. branch 생성 

   ```bash
   (master)$git branch {branch 이름}
   (master)$git branch
   *master
   {branch이름}
   ```

   2. branch 이름

   ```bash
   $git checkout {branch 이름}
   
   ```

   - 위 두 명령어를 동시에 실행하려면 아래와 같이 한다.

     ```bash
     $git checout -b {branch 이름}
     ```

     branch 삭제

     ```bash
     $git branch -d {branch 이름}
     
     ```

     4. branch 병합

     ```bash
     (master) $git merge feature/main
     ```

     master 브랜치에 feature/amin 을 병합합ㄴ다.

   - 항상 병합을 하고 싶은 대상의 브랜치로 옮겨서 진행해야 한다. 

   ## git merge

   1. Fast -forwarding

      실제로 브랜치를 나눈 이후에 master 브랜치에 커밋이 발생하지 않았고, 단순히 커밋만 옮기면 되는 경우, merge 커밋이 발생하지는 않음.

   2. Auto Merge 

      브랜치를 난눈 이후에 master 브랜치에 커밋이 발생하였으니ㅏ, 도일한 파일이 수정되지 않아서 자동으로 병합이 되는 경우, merge 커밋이 발생함.

      ```bash
      $ git log --graph --oneline
      *   a8fdca2 (HEAD -> master) Merge branch 'feature/footer'
      |\
      | * c136468 (feature/footer) Complete footer
      * | 5fc0ed7 README 추가
      |/
      *   e5a161d Merge branch 'feature/main'
      |\
      | * cc9208e Complete main feature
      * | 501f0c2 README
      |/
      * 9f80dea Add index.html
      ```

   3. Merge Conflict 발생

     브랜치를 나눈 이후에 master 브랜치에 커밋이 발생하였고, 동일한 파일이 각자 다른 브랜치에서 수정된 경우 자동으로 merge가 되지 않는다. 따라서 merge conflict가 발생하고, 직접 수정 후 커밋을 해야한다.

   ```bash
   $git merge feature/main
   Auto-merging 실패
   ```

   Git은 충돌이 발생한 파일에 아래와 같이 표기를 해준다. 해당 부분을 찾아서 수동으로 해결 해야한다. 

   ```bash
   $git add .
   $git commit
   ```

   커밋을 하게 되면 merge 커밋이 발생한다.(2번결과)

```bash
##merge 작업 과정 및 결과
student@M130414 MINGW64 ~/Desktop/git
$ git init
Initialized empty Git repository in C:/Users/student/Desktop/git/.git/

student@M130414 MINGW64 ~/Desktop/git (master)
$ touch index.html

student@M130414 MINGW64 ~/Desktop/git (master)
$ git add .

student@M130414 MINGW64 ~/Desktop/git (master)
$ git commit -m 'Add index.html'
[master (root-commit) 9f80dea] Add index.html
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 index.html

student@M130414 MINGW64 ~/Desktop/git (master)
$ git branch
* master

student@M130414 MINGW64 ~/Desktop/git (master)
$ git branch dev

student@M130414 MINGW64 ~/Desktop/git (master)
$ git branch
  dev
* master

student@M130414 MINGW64 ~/Desktop/git (master)
$ git checkout dev
Switched to branch 'dev'

student@M130414 MINGW64 ~/Desktop/git (dev)
$ touch style.css

student@M130414 MINGW64 ~/Desktop/git (dev)
$ touch app.js

student@M130414 MINGW64 ~/Desktop/git (dev)
$ git status
On branch dev
Untracked files:
  (use "git add <file>..." to include in what will be committed)

        app.js
        style.css

nothing added to commit but untracked files present (use "git add" to track)

student@M130414 MINGW64 ~/Desktop/git (dev)
$ git add .

student@M130414 MINGW64 ~/Desktop/git (dev)
$ git commit 'Init css/js'
error: pathspec 'Init css/js' did not match any file(s) known to git

student@M130414 MINGW64 ~/Desktop/git (dev)
$ git log
commit 9f80deaa57f3eac367046c5f8a2efeac69acb50f (HEAD -> dev, master)
Author: minwooDB <alsdn114560@gmail.com>
Date:   Wed Aug 28 09:19:07 2019 +0900

    Add index.html

student@M130414 MINGW64 ~/Desktop/git (dev)
$ git checkout master
Switched to branch 'master'
A       app.js
A       style.css

student@M130414 MINGW64 ~/Desktop/git (master)
$ git merge dev
Already up to date.

student@M130414 MINGW64 ~/Desktop/git (master)
$ git branch -d dev
Deleted branch dev (was 9f80dea).

student@M130414 MINGW64 ~/Desktop/git (master)
$ git checkout -b feature/main
Switched to a new branch 'feature/main'
A       app.js
A       style.css

student@M130414 MINGW64 ~/Desktop/git (feature/main)
$ touch main.html

student@M130414 MINGW64 ~/Desktop/git (feature/main)
$ touch main.css

student@M130414 MINGW64 ~/Desktop/git (feature/main)
$ git commit -m 'Complete main feature'
[feature/main cc9208e] Complete main feature
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 app.js
 create mode 100644 style.css

student@M130414 MINGW64 ~/Desktop/git (feature/main)
$ git checkout master
Switched to branch 'master'

student@M130414 MINGW64 ~/Desktop/git (master)
$ touch README.md

student@M130414 MINGW64 ~/Desktop/git (master)
$ git add .

student@M130414 MINGW64 ~/Desktop/git (master)
$ git commit -m 'README'
[master 501f0c2] README
 3 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.md
 create mode 100644 main.css
 create mode 100644 main.html

student@M130414 MINGW64 ~/Desktop/git (master)
$ git merge feature/main
Merge made by the 'recursive' strategy.
 app.js    | 0
 style.css | 0
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 app.js
 create mode 100644 style.css

student@M130414 MINGW64 ~/Desktop/git (master)
$ git log --oneline
e5a161d (HEAD -> master) Merge branch 'feature/main'
501f0c2 README
cc9208e (feature/main) Complete main feature
9f80dea Add index.html

student@M130414 MINGW64 ~/Desktop/git (master)
$ git branch -d feature/main
Deleted branch feature/main (was cc9208e).

student@M130414 MINGW64 ~/Desktop/git (master)
$ git checkout -b feature/footer
Switched to a new branch 'feature/footer'

student@M130414 MINGW64 ~/Desktop/git (feature/footer)
$ touch footer.html

student@M130414 MINGW64 ~/Desktop/git (feature/footer)
$ git add .

student@M130414 MINGW64 ~/Desktop/git (feature/footer)
$ git commit -m 'Complete footer'
[feature/footer c136468] Complete footer
 2 files changed, 3 insertions(+)
 create mode 100644 footer.html

student@M130414 MINGW64 ~/Desktop/git (feature/footer)
$ git checkout master
Switched to branch 'master'

student@M130414 MINGW64 ~/Desktop/git (master)
$ git add .

student@M130414 MINGW64 ~/Desktop/git (master)
$ git commit -m 'README 추가'
[master 5fc0ed7] README 추가
 1 file changed, 1 insertion(+)

student@M130414 MINGW64 ~/Desktop/git (master)
$ git merge feature/footer
Auto-merging README.md
CONFLICT (content): Merge conflict in README.md
Automatic merge failed; fix conflicts and then commit the result.

student@M130414 MINGW64 ~/Desktop/git (master|MERGING)
$ git commit
error: Committing is not possible because you have unmerged files.
hint: Fix them up in the work tree, and then use 'git add/rm <file>'
hint: as appropriate to mark resolution and make a commit.
fatal: Exiting because of an unresolved conflict.
U       README.md

student@M130414 MINGW64 ~/Desktop/git (master|MERGING)
$ git add .

student@M130414 MINGW64 ~/Desktop/git (master|MERGING)
$ git commit
[master a8fdca2] Merge branch 'feature/footer'

student@M130414 MINGW64 ~/Desktop/git (master)
$ git log --graph --oneline
*   a8fdca2 (HEAD -> master) Merge branch 'feature/footer'
|\
| * c136468 (feature/footer) Complete footer
* | 5fc0ed7 README 추가
|/
*   e5a161d Merge branch 'feature/main'
|\
| * cc9208e Complete main feature
* | 501f0c2 README
|/
* 9f80dea Add index.html

student@M130414 MINGW64 ~/Desktop/git (master)
$
```

## Git stash

 현재 변경 사항을 담아 둘 수 있는 임시 공간이 존재한다.

1. 현재 변경사항에 담기

```ba
$git stash pop

```

위의 명령어는 apply +drop 과 동일하다. 

# Heroku에 배포하기

flask 서버가 24시간 동작하게끔 하기위해서 배포 작업을 반드시 해야 한다. 헤로쿠를 통해서 간단하게 git 을 이용하 배포를 다음과 같이 진행한다. 

## 1. 설정

1. procfile 생성

   web: python app.py

   - Procfile은 확장자가 없음을 유의하자.

2. runtime.txt 생성

   python-3.7.3



## 2. 헤로쿠 서버 배포

```bash
$heroku login
$heroku create {프로젝트 명}
```

- 중복된 프로젝트 명이나, 대문자 혹은 특수문자 사용시 프로젝트가 생성되지 않으므로 샐행 결과를 반드시 확인

- 배포를 위해서는 현재까지 작성된 내용을 커밋하여야 한다.

  ```bash
  $git push heroku master
  ```

  

- 배포가 완료된 이후에는 코드 수정 사항이 있으면 항상 커밋 하고 push 한다.
- 이후에 웹훅 설정을 heroku 주소로 변경하면, 24시간 동작하는 챗봇이 된다. 
- 만약, 코드 수정사항이 있으면 개발을 위해 ngrok 주소로 웹훅 설정을 변경하고, 개발이 완료되면 heroku에 재배포 이후 heroku 주소로 웹훅 설정을 변경하자.