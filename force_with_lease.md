## Force with Lease Lab 

To push the code by normal way will not gonna work here so we need to do it in a force way and for that we have two types of methods 
```
git push --force origin 
			or 
git push -f 
```
But here is one catch when we do this we are saying to our git that ==**just push this code at any cost** it can be dangerous when our teammate also made some changed and we haven't seen then==. 
It will change them also 
So for the safer side we use 
```
git push --force-with-lease
```
It will also push in forced way but it also check for that if someone else had changed the code or ==done new commit since last time. 
If yes then it will give us a rejection. So that we can review the code in remote repo==.