import java.io.*;
import java.util.*;

public class Filter {

	public static void main(String[] args) throws IOException{
    
    Scanner key = new Scanner(System.in);
		FileWriter writer;
		File output;
		char chara;
    String line, out, outname;

    System.out.print("Enter the name of your file (include the .html!): ");
    String filename = key.nextLine();
    
    try {
      Scanner file = new Scanner(new File(filename));
			outname = filename + "-output.txt";
			output = new File(outname);
			if(output.createNewFile()){
				System.out.println("File created.");
			}
			writer = new FileWriter(output);

 	    while(file.hasNextLine()){
        line = file.nextLine();
				out = "";
				System.out.println("ORIGIN: " + line); 
				for(int i = 0; i < line.length(); i++){
					chara = line.charAt(i);
					if(chara == '<') {
						while (chara != '>') {
							chara = line.charAt(++i);
						}//while
					}//if
					out += chara;
					if(out.contains(">")){
						out = out.substring(0, out.length() - 1);
					}
					if(chara == ' ') {
	 				  System.out.println("OUTPUT: "+out);
		        writer.write(out + "\n");
						out = "";
					}
				}//for
				System.out.println("OUTPUT: "+out);
				writer.write(out + "\n");
      }//while
			writer.close();
    } catch(FileNotFoundException e){
      System.out.println("File not found.");
      return;
    }//try-catch
  }//main
}//class
