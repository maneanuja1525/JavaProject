package oopsConcepts;

public class Person {

	String Name;
	int Age;
	
	public Person() {
		
	}
	public Person(String Name, int Age) {
		this.Name=Name;
		this.Age=Age;
	}
	public void display() {
		System.out.println("Inside display of Parent class");
		
	}
	public void print() {
		System.out.println("Inside print of parent class");
	}
	
}
