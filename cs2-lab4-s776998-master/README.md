# Lab 4 Postfix Evaluation
##
The purpose of this lab is to practice using a stack to evaluate postfix expressions. We will use the `Stack` class from the Java standard library `java.util.Stack`.

## Step 1: Obtain Starter Code
Create a clone of this repository in your workspace. You will see two Java
source files in the repository.
* PostfixEvaluator.java
* PostfixTester.java

Compile the code and study it by testing it with different example postfix expressions. For example:
```
4 10 +
4 5 2 * +
3 4 * 2 5 + - 4 * 2 /
```
The postfix evaluation algorithm is discussed in section 4 of chapter 3 or can be found [online](https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/).

## Step 2: Improve It
This program is not very user friendly because a user has to convert a common infix expression to a postfix expression first, which is very tedious. Modify this program to do the conversion. Remember, you have implemented the infix to postfix conversion algorithm before. 

In the end, a user should be able to enter an infix expression and your program should output the value of the expression.

## Step 2. Turn It In
Test your solution thoroughly using at least the following test cases:
```
infix              | output
---------------------------
1 + 2 * 3          | 7
1 + ( 2 - 3 )      | 0
( ( 1 + 2 ) * 3 )  | 9
```

Copy the console output that shows your test result into a `result` file and add it to your local repository.

Commit all changes and use `git push origin master` to copy the changes to github.

