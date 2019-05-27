package day1.inheritance;

public class Person {

	protected int id;
	protected String name;
	
	public Person(int id, String name) {
		System.out.println("constructor of Person..");
		this.id = id;
		this.name = name;
	}
	
	
	public String showDetails() {
		return id+" "+name;
	}
	
	
}
