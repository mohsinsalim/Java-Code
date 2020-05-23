package java_lesson_02;

import java.util.Scanner;

public class StringArrayUserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] array = new String[5];
		
		System.out.println("Enter Five Strings: ");
		
		for(int i = 0; i < 5; i++) {
			
			array[i] = input.nextLine();
			
		}
		
		//Displaying Output
		
		for (int k = 0; k < 5; k++) {
			
			System.out.println("array[" + k + "] = " + array[k]);
			
		}
		
		//Close Scanner
		input.close();
		

	}

}
