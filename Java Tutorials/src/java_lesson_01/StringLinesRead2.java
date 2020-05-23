package java_lesson_01;

import java.util.Scanner;

public class StringLinesRead2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter strings, one per line;");
		System.out.println("To terminate use empty line: ");
		
		while(input.hasNextLine()) {
			
			String output = input.nextLine();
			
			if(output.equals("")) {
				System.out.println("No more lines found. Program terminated.");
				
			} else {
				System.out.println(output);
			}
			
		}
		
		input.close();
		
	}
	
}
