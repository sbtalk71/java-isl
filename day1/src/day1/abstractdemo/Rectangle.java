package day1.abstractdemo;

public class Rectangle extends Figure {

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
	}
	
	@Override
	public void printArea() {
		System.out.println("The Area of Rectangle : "+(dim1*dim2));

	}

}
