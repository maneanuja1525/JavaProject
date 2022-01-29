package oopsConcepts;

public class ChildClass extends Person{

	String Profession;
	public ChildClass(String Name, int Age, String Profession) {
		
		super(Name,Age);
		this.Profession=Profession;
	}
	public void  display() {
		super.display();
		System.out.println("Inside child class");
	}
	public void print() {
		super.print();
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Profession: "+this.Profession);
	}
	
}
