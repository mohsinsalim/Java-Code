package java_lesson_02;

import java.util.Scanner;

public class ExpandArraySizeString {

	public static void main(String[] args) {
		
		//Array getting reference variable from getArray method.
		String[] array = getStrings();
		
		//Displaying Output
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
			System.out.println("Array Length is = " + array.length);
		}
		

	}

	
	static String[] getStrings() {

		Scanner input = new Scanner(System.in);
		int linesCount = 0;
		
		String[] array = new String[5];
		
		System.out.println("Enter Strings here;");
		System.out.println("Terminate with empty line: ");
		
		while(input.hasNextLine()) {
		
			String line = input.nextLine();
			
			if(line.equals("")) {
				System.out.println("Program Terminated...");
				break;
			}
			
			if(linesCount == array.length) {
				array = resize(array, array.length * 2);
				array[linesCount++] = line;
			}
			else {
			array[linesCount++] = line;
			}
		}
		
		//Close Scanner
		input.close();
		
		return resize(array, linesCount);
	}
	
	
	static String[] resize(String[] array, int newSize) {
		
		String[] original = array;
		int arrayLengthNumber = Math.min(original.length, newSize);
		
		
		array = new String[newSize];
		
		for(int i = 0; i < arrayLengthNumber; i++) {
			
			array[i] = original[i];
			
		}
		
		original = null;
		
		
		return array;
	}
	
	
	
}
