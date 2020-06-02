/**
 * 
 */
package java_lesson_04;

/**
 * @author Mohsin Salim
 *
 */
public class Person {

	private String name;
	private int age;
	private String address;
	private int phoneNumber;
	
	public Person() {
		this.name = null;
		this.age = 0;
		this.address = null;
		this.phoneNumber = 0;
	}
	
	public Person(String name, int age, String address, int phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	/*
	public static void main(String[] args) {
		Person p1 = new Person("Mohsin", 25, "2200 Arlington blvd", 55599900);
		System.out.println(p1);
	}
	*/
}
