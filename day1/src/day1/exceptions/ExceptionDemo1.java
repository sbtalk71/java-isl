package day1.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int i = 10;
			int j = 10;
			double d = i / j;
			int[] ar= {1,2,3,4};
			int x=ar[3];
			//String[] str=new String[6];
			//str[2].length();
			throw new RuntimeException("I dont know...");
			//System.out.println("No Exception.....");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally executes...");
		}
		System.out.println("Execution resumed to normal...");
	}

}
