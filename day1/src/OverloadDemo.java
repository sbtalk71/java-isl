
public class OverloadDemo {

	public static void main(String[] args) {
		Overload o= new Overload();
		o.add();
		o.add(2, 3);
		o.add(20.0f, 30);
		o.add(30.0, 30);
		o.add(20.0, 40.0);

	}

}
