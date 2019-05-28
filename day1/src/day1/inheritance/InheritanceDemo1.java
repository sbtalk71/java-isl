package day1.inheritance;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		//Person p= new Person(100,"Tarun");
		//Employee e= new Employee(101, "Chetan", 89000);
		
		//System.out.println(p.showDetails());
		
		//System.out.println(e.showDetails());
		
		//TraineeEmp te= new TraineeEmp(102, "Charan", 78000, "good");
		//System.out.println(te.showDetails());
		
		Person p= new Employee(103, "Scott", 45000);
		Person p1=new TraineeEmp(102, "Charan", 78000, "good");
		
		System.out.println(p.showDetails());
		System.out.println(p1.showDetails());
		
		System.out.println(p1.getClass().getName());
		
		System.out.println(p1);

	}

}
