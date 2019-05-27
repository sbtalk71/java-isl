package day1.inheritance;

public class TraineeEmp extends Employee {

	

	protected String performance;

	public TraineeEmp(int id, String name, double salary,String performance) {
		super(id, name, salary);
		this.performance=performance;
		System.out.println("constructor of Trainee..");
	}
	
	@Override
	public String showDetails() {
		
		return super.showDetails()+" "+performance;
	}
	
}
