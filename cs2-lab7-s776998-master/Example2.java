import java.util.*;
import java.io.*;

public class Example2{
  public static void main(String[] args) throws InterruptedException, FileNotFoundException{
    Scanner scan = new Scanner(new File("digits.txt"));
    String input = "";
    while(scan.hasNext()){
      input += scan.nextLine()+"\n"; // preserve linebreaks
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
