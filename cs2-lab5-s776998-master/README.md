# Lab 5
## Purpose
The purpose of this lab is to explore some helpful approaches and tools usable to complete the second programming assignment (HTML filter).  This lab should be completed during the second session if all activities are completed for the first session.

## Reading from the HTML file

You learned how to read from a text file in CS1, but the basics are as follows:

1. Be sure to import ```java.util.*``` and ```java.io.*``` in your program. These two libraries give you access to ```Scanner```, ```File```, ```BufferedWriter```, ```FileWriter```, ```FileNotFoundException```,  ```IOException```, and etc. classes.
```
import java.io.*;
import java.util.*;
```
2. To open a file stored in the same directory as your program you’ll need to create a Scanner and give it a File object initialized with your file name as in
```
Scanner scan = new Scanner (new File ("simple.html"));
```
Note: ```new File(filename)``` will throw an exception if the file doesn't exist. You will need to catch the exception and print a meaningful message to the console.

3. Once you have a Scanner associated with your file as shown above, you can read from the file line by line, word by word, or character by character. Reading from the file and echoing it to the screen line by line can be accomplished as shown below (this algorithm is basically the same as shown on pg 290 of your CS1 text—handy thing to keep around):
```
String line = "";
while (scan.hasNext())	//while there are more lines to read
{
  line = scan.nextLine();	//read one in
  System.out.println(line);	//and print it back out
}
```

Note: once you’ve read in a line of text, you could break it up into tokens (strings delimited by some character like a space or an angle bracket) and put the tokens somewhere if you wish. You can also let the Scanner "pre-tokenize" your input by using the ```next()``` method of the Scanner class instead of the ```nextLine()``` method.

5. Get your instructor's initials on your lab sheet.
