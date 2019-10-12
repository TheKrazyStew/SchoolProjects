# Maze and ASCIImation

## Purpose
The purpose of this lab is to practice reading a maze configuration from a text
file and play with [ASCIImation](http://asciimation.de/).

## Evaluation
Students will be awarded up to 10 points for successfully completing this lab as
outlined below.

## Step 1 Animate Count Down
Experiment with `Example1.java` to learn how to clear the screen in console and pause the `main` thread.
```
public class Example1{
  public static void main(String[] args) throws InterruptedException{
    System.out.print("\033\143"); // clear screen in console
    
    for (int i=10; i>=0; i--){
      System.out.println(i);
      Thread.sleep(1000); // pause 'this' thread for 1000 miliseconds (1 second)
      System.out.print("\033\143");
    }

  }
}
```
Can you make it count up?

## Step 2 Animate Anything from a File
Experiment with `Example2.java` to learn how to animate any ASCII art from a
text file.
```
import java.util.*;
import java.io.*;

public class Example2{
  public static void main(String[] args) throws InterruptedException, FileNotFoundException{
    Scanner scan = new Scanner(new File("digits.txt"));
    String input = "";
    while(scan.hasNext()){
      input += scan.nextLine()+"\n"; \\ preserve linebreaks
    }
    String[] frames = input.split("=====\n");

    System.out.print("\033\143"); // clear screen in console

    for (int i=0; i<frames.length; i++){
      System.out.println(frames[i]);
      Thread.sleep(1000);
      System.out.print("\033\143");
    }
  }
}
```

## Step 3 Build a maze
Let's read a maze configuration from a text file `maze1.txt` as follows:
```
12 10
############
# #        #
# # ###### #
# #    #   #
# ### *# # #
#   #### # #
# # #  # # #
# # # ## # #
#o#      # #
############
```
The first two numbers indicate the size of the maze (the number of columns and
the number of rows ).

Each location in the maze is marked by a `char`:
* `#`: wall
* `*`: starting point
* `o`: ending point
* space: pathway

We will store a maze in a two dimensional `char` array, which is instantiated
after reading the first two lines. 
```
Scanner scan = new Scanner(new File(fileName));
int cols = Integer.parseInt(scan.next());
int rows = Integer.parseInt(scan.next());
char[][] maze = new char[rows][cols];

scan.nextLine(); // remove linebreak (\n)

for(int row = 0; row < rows; row++){
 String line = scan.nextLine();
 for(int col = 0; col < cols; col++){
   maze[row][col] = line.charAt(col);
 }
}

for(int row = 0; row < rows; row++){
 for(int col = 0; col < cols; col++){
   System.out.print(maze[row][col]);
 }
 System.out.println();
}
```

Create a Java class to read `maze2.txt` into an array and print the array to
the console.
