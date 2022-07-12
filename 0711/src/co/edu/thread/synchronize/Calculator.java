package co.edu.thread.synchronize;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	public synchronized void setMemory(int memory) {  //처리가 끝나는 동안엔 다른 스레드 처리 못하도록 되어있음. (synchronized)
		this.memory=memory;
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " +this.memory);
	}	
}
