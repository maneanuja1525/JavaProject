package oopsConcepts;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1=new Employee();
		emp1.EmployeeName="Anuja Patil";
		emp1.EmployeeId=335599;s
		emp1.Salary=40000;
		emp1.PrintName();
		*/
		
		//Employee emp1=new Employee("Anuja",23232,32000);
		//Employee emp2=new Employee("Tushar",25242,40000);
		//Employee emp3=new Employee("Anuja",234454);
		//emp1.PrintName();
		//emp2.PrintName();
		/*emp3.PrintName();
		Employee.PrintSalaryCompany();*/
		
		/*Person p1=new Person();
		ChildClass c1= new ChildClass("Anuja",25,"IT");
		c1.display();
		c1.print();*/
		
		/*MethodOverloadingExample obj= new MethodOverloadingExample();
		obj.sum(4, 5);
		obj.sum(5, 5, 3);*/
		//Interface
		//HDFCBank obj=new HDFCBank();
		//obj.Welcome();
	
		
		//Encapsulation
		EncapsulationExample obj=new EncapsulationExample();
		obj.setName("Anuja");
		System.out.println("Name : "+obj.getName());
		obj.setSalary(45000);
		System.out.println("Salary : "+obj.getSalary());
		obj.setCompany("FIS Global");
		System.out.println("Company Name : "+obj.getCompany());
		
		
		
	}

}
