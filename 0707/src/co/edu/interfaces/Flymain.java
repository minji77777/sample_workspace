package co.edu.interfaces;

public class Flymain {
	public static void main(String[] args) {
		
		
		Flyer flier = new Helicopter();      //인터페이스  구현페이스      Flyer <= Helicopter
		flier = new Airplane();  //Flyer <= Airplane
		
		
		flier.takeoff();
		flier.fly();
		flier.land();
	}
}
