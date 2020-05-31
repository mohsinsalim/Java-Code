package java_lesson_03;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MaxIntError {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two ints: ");
		
		try {
			
			int x = input.nextInt();
			int y = input.nextInt();
			
			System.out.println("Max: " + Math.max(x, y));
			
		} catch (NoSuchElementException e) {
			System.err.println("Error: need two ints");
		}
		
		
		input.close();

	}

}
