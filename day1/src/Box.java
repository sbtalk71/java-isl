
public class Box {

	private int length;
	private int breadth;
	private int height;
	private String color="none";
	
	
	public String getColor() {
		return color;
	}

	public Box(int length,int breadth, int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	public Box(int length,int breadth, int height,String color) {
		this(length,breadth,height);
		this.color=color;
	}
	
	public void printVolume() {
		int vol=length*breadth*height;
		System.out.println("Volume = "+vol);
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	
	
}
