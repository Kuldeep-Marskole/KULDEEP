
- one good commit
- one commit with a bad message
- one tiny fix commitgit


### Interactive rebase 
To use this we write 
```js
git rebash i HEAD~1,2,3...
e.g.
git rebsh i HEAD~4 
// it will give us last 4 logs of commit 
```
It will give us given logs of the commits in the [[VIM]] editor format where all the heads are in ``pick`` by default and we keep it like this the head in which we don't want to do any changes. 
And for changes there are various ways like 
#### ``pick`` 
simply means <html> &rarr; </html> ==Keep this commit exactly as it is==.
#### ``reword`` 
It is use for to ==change the commit message== of the given head in front of which we write down ``reword`` in place of ``pick`` in the [[VIM]] editor. 
#### ``squash`` 
==To combine two or more commit in one==.
All the squash heads are combined to the above head. 