1. To know the version of the git in mac, go to terminal and type git --version.
2. To create a git repo, go to that folder in terminal and type git init (initialises empty 
repo/one time process).
3. To know the files in directory, type ls -lrt
4. To know hidden files as well in a directory, type ls -al
5. To add files in the staging area, we type git add fileName or git add .
6. To know the status of the changes, we type git status.
7. To commit the changes we type, git commit -m "Message"
8. To know commit history, we type git log
9. Now create a repository (public) in git (online) and give it a unique name.
10. Once the repository is created on GitHub, copy the following command and paste it 
in terminal.
    git remote add origin https://github.com/amprabhleenkaur/march-git.git
11. Then in the terminal, copy and paste another command as follows:
    git push --set-upstream origin main
12. From GitHub, copy the token, paste in terminal and push the code with git push.
13. Now go to 'terminal' of IntelliJ