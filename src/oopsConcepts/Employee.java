package oopsConcepts;

public class Employee {

	String EmployeeName;
	int EmployeeId;
	public static int Salary;
	public static String CompanyName;
	
	/*public Employee(String eName,int eID, int eSal)
	{
		this.EmployeeName=eName;
		this.EmployeeId=eID;
		this.Salary=eSal;
	}*/
	public Employee(String eName,int eID)
	{
		this.EmployeeName=eName;
		this.EmployeeId=eID;
		
	}
	
	public void PrintName()
	{
		System.out.println("\nEmployee Name: "+EmployeeName);
		System.out.println("ID: "+EmployeeId);
		//System.out.println("Salary: "+Employee.Salary);
	}
	public static void PrintSalaryCompany() {
		Employee.Salary=20000;
		Employee.CompanyName="FIS Global";
		System.out.println("Salary: "+Employee.Salary);
		System.out.println("Company Name: "+Employee.CompanyName);
	}

}
