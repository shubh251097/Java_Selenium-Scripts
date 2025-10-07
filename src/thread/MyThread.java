package thread;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		// thread.run();
		thread.start();
		thread.start(); // <-- This will throw IllegalThreadStateException
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread running: " + i);
		}
	}
}
