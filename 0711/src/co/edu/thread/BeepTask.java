package co.edu.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable { //runnable 구현하는 클래스

	@Override
	public void run() {
		
		//스피커 소리.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
		toolkit.beep();
		try {
		Thread.sleep(800); //0.8초 동안 멈춰있다가 다시 작동. 
		}catch(InterruptedException e) {
			e.printStackTrace();
		
	} 

}
	}
}
