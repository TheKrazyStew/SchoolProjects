import java.util.*;
import java.io.*;

public class Example3{
	public static void main(String[] args) throws InterruptedException, FileNotFoundException{
		Scanner key = new Scanner(System.in);
		System.out.print("\nPlease enter a maze file to print: ");
		String filename = key.next();

		Scanner scan = new Scanner(new File(filename));
		int cols = Integer.parseInt(scan.next());
		int rows = Integer.parseInt(scan.next());
		char[][] maze = new char[rows][cols];

		scan.nextLine();

		for(int r = 0; r < rows; r++) {
			String line = scan.nextLine();
			for(int c = 0; c < cols; c++) {
				maze[r][c] = line.charAt(c);
			}
		}
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				System.out.print(maze[r][c]);
			}
			System.out.print("\n");
		}
	}
}
