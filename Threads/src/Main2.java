
public class Main2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new TargetJob());
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(" Thread 2");

			}
		});
		t2.start();
		
		
		Thread t3 = new Thread(()->System.out.println(" Thread 2"));
		t3.start();
	}

}

class TargetJob implements Runnable {
	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}