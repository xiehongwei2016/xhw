package thread;

public class ThreadTest implements Runnable{

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		Thread ta = new Thread(t1, "A");
		Thread tb = new Thread(t1, "B");
		ta.start();
		tb.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " loop " + i);

		}
	}

}
