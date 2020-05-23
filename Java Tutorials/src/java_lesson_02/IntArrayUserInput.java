package java_lesson_02;

import java.util.Scanner;

public class IntArrayUserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[5];
		
		
		System.out.println("Enter Five Numbers: ");
		
		for(int i = 0; i < 5; i++) {
			
			array[i] = input.nextInt();
			
		}
		
		
		//Displaying Output
		
		for (int k = 0; k < 5; k++) {
			
			System.out.println("array[" + k + "] = " + array[k]);
			
		}
		
		//Close Scanner
		input.close();

	}

}
