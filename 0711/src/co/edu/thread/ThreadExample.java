package co.edu.thread;

import java.awt.Toolkit;

public class ThreadExample {
	public static void main(String[] args) { // 단일 스레드라서 동시에 실행시킬 수 없음. 
		
		//스피커 소리
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0; i<5;i++) {
//		toolkit.beep();
//		try {
//		Thread.sleep(800); //0.8초 동안 멈춰있다가 다시 작동. 
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
		
		//Thread의 생성자 매개값(Runnable 구현객체)
		Thread beep = new Thread(new BeepTask());
		beep.start();
		
		//Thread 클래스 상속 받은 하위클래스 생성자.
		beep = new BeepWorkerThread();
		beep.start();
		
		//콘솔 출력
		for(int i=0; i<5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800); //0.8초 동안 멈춰있다가 다시 작동. 
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
