package thread;

public class SynchronizedTest implements Runnable{

	public static void main(String[] args) {
		SynchronizedTest t1 = new SynchronizedTest();  
        Thread ta = new Thread(t1, "A");  
        Thread tb = new Thread(t1, "B");  
        ta.start();  
        tb.start(); 
	}
	
	public void run() {  
        synchronized(this) {  
             for (int i = 0; i < 10; i++) {  
                  System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);  
             }  
        }  
   }  
}
