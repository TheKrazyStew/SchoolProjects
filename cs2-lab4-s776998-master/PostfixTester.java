import java.util.Stack;
import java.util.Scanner;

/**
 * Demonstrates the use of a stack to evaluate postfix expressions.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class PostfixTester{
  /**
   * Reads and evaluates multiple postfix expressions.
   */
  public static void main(String[] args){
    String expression, again;
    int result;
  
    Scanner in = new Scanner(System.in);
    
    do
    {
      PostfixEvaluator evaluator = new PostfixEvaluator();
      System.out.println("Enter a valid in-fix expression one token " +
        "at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
      System.out.println("Each token must be an integer or an operator (+,-,*,)");
      expression = in.nextLine();
			
// Starting infix conversion

			String out = "";
			Stack convert = new Stack();
    	for(int i = 0; i < expression.length(); i+= 2) {
      char input = expression.charAt(i);

      if(Character.isLetterOrDigit(input)) { //Append
        out += input + " "; 
      } else if (input == ')') { //Trigger the Stackdump
        for(int j = i; convert.peek() != '('; j--) { 
          out += convert.pop() + " "; 
        }
        convert.pop(); //To get rid of the '(' without putting it in the stack
      } else { //Push to the stack
        convert.push(input);
      }
      //System.out.println("OUT: " + out);
      //System.out.println("STA: " + convert);
    }
    while(!convert.isEmpty()) {
      out += convert.pop() + " ";
    } System.out.println(out);

// Ending infix conversion

      result = evaluator.evaluate(out);
      System.out.println();
      System.out.println("That expression equals " + result);

      System.out.print("Evaluate another expression [Y/N]? ");
      again = in.nextLine();
      System.out.println();
    }
    while (again.equalsIgnoreCase("y"));
  }
}
