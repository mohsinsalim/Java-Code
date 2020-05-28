package java_lesson_03;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> array = getArray();
		
		System.out.println("The output is: \n");
		for(int i = 0; i < array.size(); i++) {
			System.out.println("Array[" + i + "] = " + array.get(i));
		}
		

	}
	
	static ArrayList<String> getArray() {
		
		ArrayList<String> array = new ArrayList<String>();
		System.out.println("Enter string here,");
		System.out.println("Terminate with empty line");
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()) {
			
			String line = input.nextLine();
			
			if(line.equals("")) {
				System.out.println("Terminated...");
				break;
			}
			else {
				array.add(line);
			}
	
		}
		
		//Scanner close
		input.close();
		
		
		return array;
	}

}
