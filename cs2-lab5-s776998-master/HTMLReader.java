import java.io.*;
import java.util.*;

public class HTMLReader {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner file = new Scanner (new File ("simple.html"));
			
			String line = "";
			while(file.hasNext()){
				line = file.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		
	}
	
}
