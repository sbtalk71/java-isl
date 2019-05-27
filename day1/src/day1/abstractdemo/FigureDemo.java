package day1.abstractdemo;

public class FigureDemo {

	public static void main(String[] args) {
		Figure ref=null;
		
		Triangle t= new Triangle(20, 10);
		
		Rectangle r= new Rectangle(10, 20);
		
		ref=t;
		ref.printArea();
		
		ref=r;
		ref.printArea();
		

	}

}
