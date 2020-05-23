package java_lesson_01;

public class FunctionQuiz1 {

	public static void main(String[] args) {
		
		int x = 5;
		
		int result = 0;
		
		result = x + computeSum(3);
		
		System.out.println("The result is: " + result);

	}
	
	static int computeSum(int value) {
		
		int y = 4;
		
		value += y;
		
		return value;
	}

}
