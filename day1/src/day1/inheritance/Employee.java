package day1.inheritance;

public class Employee extends Person{
	
	protected double salary;

	public Employee(int id, String name,double salary) {
		super(id,name);
		this.salary=salary;
		System.out.println("constructor of Employee..");
		
	}
	
	@Override
	public String showDetails() {
		return super.showDetails()+" "+salary;
		
	}
	
}
