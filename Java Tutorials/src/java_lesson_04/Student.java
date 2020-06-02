package java_lesson_04;

public class Student extends Person {

	private double gpa;
	
	public Student() {
		super();
		this.gpa = 0;
	}
	
	public Student(String name, int age, String address, int phoneNumber, double gpa) {
		super(name, age, address, phoneNumber);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [getGpa()=" + getGpa() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}

	
	public static void main(String[] args) {
		Student s1 = new Student("Mohsin", 25, "2200 Arlington blv", 555222000, 3.4);
		System.out.println(s1);
	}
	
	
	
    
	
}
