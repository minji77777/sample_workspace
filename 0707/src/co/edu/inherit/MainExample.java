package co.edu.inherit;

public class MainExample {
	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("anycall");
		phone.setColor("white");
		
		DmbCellPhone phone1 = new DmbCellPhone();
		phone1.powerOn();                     // 원래 부모클래스 메서드
		phone1.bell();
		phone1.sendVoice();
		phone1.receiveVoice();
		
		phone1.turnOn();
		phone1.turnOff();
		
		phone1.powerOff();
		
		
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");
				
		sphone.powerOn();		
		sphone.powerOff();
		
		System.out.println("자동형변환>>>>>>>>>> ");
		// 부모 > 자식. long <- int : 자동형변환, int <- long 강제형변환.
		CellPhone dphone =new DmbCellPhone("i-phone","Red",100);
		System.out.println(dphone.toString());
		
		
		
		CellPhone cphone = new CellPhone();
		cphone.setModel("LG PHONE");
		cphone.setColor("Gray");
		System.out.println(cphone.toString());
		
//		if(dphone instance of DmbCellPhone) {
		DmbCellPhone dcp = (DmbCellPhone) dphone; //컴파일 오류는 없지만 실행할때 오류발생가능
		dcp.powerOn();
		dcp.turnOn(); //자식의 기능은 사용 불가.
		dcp.powerOff();
		}
	}
//}
