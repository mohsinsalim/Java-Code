package java_lesson_01;

import java.util.Scanner;

public class StringLinesRead {
	
	public static void main(String[] args) {
		
		String str = "Hello this a string line \nThis is second line \nFinal line.";
		
		Scanner scn = new Scanner(str);
		
		while(scn.hasNextLine()) {
			
			String line = scn.nextLine();
			System.out.println(line);	
			}
		
		scn.close();
		
		}
		
		

	
	
	
	
	
}