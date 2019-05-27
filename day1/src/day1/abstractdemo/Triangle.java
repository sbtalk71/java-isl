package day1.abstractdemo;

public class Triangle extends Figure {

	public Triangle(int dim1, int dim2) {
		super(dim1,dim2);
	}
	@Override
	public void printArea() {
		System.out.println("Areao of Triangle : "+(dim1*dim2)/2);

	}

}
