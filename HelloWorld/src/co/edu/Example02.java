package co.edu;

public class Example02 {
	// 변수 = 나의 키, 친구 키
	public static void main(String[] args) {
	
	double myHeight = 172.2;
	double friendHeight=162.0 ;
	
	double theDifference = 0;
	
	
	if (myHeight - friendHeight > 0) {
		theDifference = myHeight - friendHeight;
		System.out.println("나의 키가 " + Math.round(theDifference*100)/100.0 + "만큼 더 큽니다");
	} else { 
		theDifference = friendHeight - myHeight ;
		System.out.println("나의 키가" + Math.round(theDifference*100)/100.0 + "만큼 더 작습니다.");
		
	}
	} }