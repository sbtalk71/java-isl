
public class BoxMain1 {

	public static void main(String[] args) {
		int a=10;
		Box b1=new Box(10,20,30);
		b1.printVolume();
		
		
		Box b2=new Box(20,20,30);
		b2.printVolume();
		
		Box c1=b1;
		c1.printVolume();
		b1=new Box(30,20,30);
		
		b1.printVolume();
		
		c1.printVolume();
		
		Box b3= new Box(23,45,67,"Blue");
		System.out.println(b3.getColor());
		
		b3.setColor("Red");
		
		System.out.println(b3.getColor());
		
		
		

	}

}
