
public class Overload {

	public void add() {
		System.out.println("nothing to add..");
	}
	
	/*public int add(int a, int b) {
		System.out.println("Sum of (int,int)"+(a+b));
		return a+b;
	}
	
	public float add(float a, int b) {
		System.out.println("Sum of (float,int)"+(a+b));
		return a+b;
	}*/
	
	public double add(double a, int b) {
		System.out.println("Sum of (double,int)"+(a+b));
		return a+b;
	}
	
	public double add(double a, double b) {
		System.out.println("Sum of (double,double)"+(a+b));
		return a+b;
	}
}
