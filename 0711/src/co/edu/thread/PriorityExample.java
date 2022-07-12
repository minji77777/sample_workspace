package co.edu.thread;

class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {
			if (i % 50000000 == 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thread: " + getName());
	}
}

public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread-" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // 1 //우선순위 . 숫자 커질수록 우선순위 높아.
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // 10
			}
			thread.start();
		}
	}
}
