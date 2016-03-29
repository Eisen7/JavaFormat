git init //初始化仓库
git add README.txt //添加README.txt文件到git仓库 提交修改也要add一下
git status //查看仓库状态
git diff //difference 查看文件的改动内容
git commit //提交修改到仓库

git reset --hard HEAD^
回退到上一版本 HEAD^^倒数第二版本 HEAD~100倒数100版本
git reset --hard 版本号 回退到某个版本号的版本

git reflog //显示历史命令 关了命令窗口也显示
git log //查看提交历史

git checkout -- README.txt //可以丢弃工作区的修改
git rest HEAD README.txt //可以把暂存区的修改撤销

git rm README.txt //删除

//创建公钥私钥
ssh-keygen -t rsa -C "youremail@example.com"
//将本地仓库与GitHub仓库相关联
git remote add origin git@github.com:Eisen7/git.git
//首次push 要加 -u 参数 Git不但会把本地的master分支内容推送的远程新的master分支，还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令
git push -u origin master
git push origin master //之后用这个命令就可以push

//从远程仓库克隆文件到本地，也可以用https://github.com/Eisen7/Format.git
git clone git@github.com:Eisen7/Format.git

创建并切换到dev分支
git checkout -b dev

git branch dev //创建dev分支
git checkout dev //切换到dev分支

git branch //查看分支
git merge dev //合并dev分支到当前分支

git branch -d dev //删除dev分支

当有冲突时候git标记冲突地方，分支为 (master|dev) 再提交就是合并分支了

git merge --no-ff -m "不用fastforward合并 git会创建一个新commit再合并“

当工作到一半需要修复master上的bug时
git stash //储存当前工作现场
修完之后
git stash apply //恢复再删除stash git stash drop
也可以用 git stash pop 恢复的同时把stash内容删除

git bransh -D dev //强行删除没有合并的分支

git remote //查看远程仓库的信息
git remote -v //显示更详细的信息

推送分支
git push origin dev //推送dev分支到远程仓库

git checkout -b dev origin/dev //创建远程origin的dev分支、

当多人同时推送dev分支出现冲突时
先用 git pull 把最新的提交从 origin/dev 抓取到本地合并解决冲突再推送到origin

如果 git pull 失败 设置dev和origin/dev连接再pull
git branch --set-upstream dev origin/dev

git tag v1.0 //在当前分支当前commit打一个标签
git tag //查看所有标签
git tag v0.9 123456 //在commit id为123456 打一个v0.9标签
git show v1.0 //查看标签信息
git tag -d v1.0 //删除
git push origin v1.0 //推送标签到origin
git push origin --tags //一次性推送所有尚未推送的本地标签
删除远程标签先删除本地标签再 git push origin :refs/tags/v1.0

在Git工作区的根目录下创建一个特殊的.gitignore文件，然后把要忽略的文件名填进去，
把.gitignore提交Git就会自动忽略这些文件比如：
# Windows:
Thumbs.db
ehthumbs.db
Desktop.ini
# Python:
*.so
*.egg

git add -f abc.class //强制添加abc.class
git check-ignore //检查gitignore文件哪里写错


git config --global alias.st status //之后st就表示status global表示用户配置文件在用户主目录下 .gitconfig 去掉表示当前git项目配置文件 .git/config


创建git服务器
第一步，安装git：
$ sudo apt-get install git
第二步，创建一个git用户，用来运行git服务：
$ sudo adduser git
第三步，创建证书登录：
收集所有需要登录的用户的公钥，就是他们自己的id_rsa.pub文件，把所有公钥导入到/home/git/.ssh/authorized_keys文件里，一行一个。
第四步，初始化Git仓库：
先选定一个目录作为Git仓库，假定是/srv/sample.git，在/srv目录下输入命令：
$ sudo git init --bare sample.git
Git就会创建一个裸仓库，裸仓库没有工作区，因为服务器上的Git仓库纯粹是为了共享，所以不让用户直接登录到服务器上去改工作区，并且服务器上的Git仓库通常都以.git结尾。然后，把owner改为git：
$ sudo chown -R git:git sample.git
第五步，禁用shell登录：
出于安全考虑，第二步创建的git用户不允许登录shell，这可以通过编辑/etc/passwd文件完成。找到类似下面的一行：
git:x:1001:1001:,,,:/home/git:/bin/bash
改为：
git:x:1001:1001:,,,:/home/git:/usr/bin/git-shell
这样，git用户可以正常通过ssh使用git，但无法登录shell，因为我们为git用户指定的git-shell每次一登录就自动退出。
第六步，克隆远程仓库：
现在，可以通过git clone命令克隆远程仓库了，在各自的电脑上运行：
$ git clone git@server:/srv/sample.git
Cloning into 'sample'...
warning: You appear to have cloned an empty repository.
