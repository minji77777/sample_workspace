package co.edu.emp;

import java.util.Calendar;


public class CalendarExample {
	
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();  // 현재시점
//		System.out.println(cal.get(Calendar.YEAR)+"년");
//		System.out.println(cal.get(Calendar.MONTH)+1+"월"); //0~11
//		System.out.println(cal.get(Calendar.DATE)+"일"); 
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");   //오늘 날짜 기준
//		System.out.println(cal.getActualMaximum(Calendar.DATE)+"일");   //말일날짜
//		
//		cal.set(2022,5,1); //2022년 6월 1일 지정
//		
//		System.out.println(cal.get(Calendar.YEAR)+"년");
//		System.out.println(cal.get(Calendar.MONTH)+1+"월"); //0~11
//		System.out.println(cal.get(Calendar.DATE)+"일"); 
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");   //오늘 날짜 기준
//		System.out.println(cal.getActualMaximum(Calendar.DATE)+"일");   //말일날짜
		
			
	}
	// 년, 월 정보 => 해당 년, 월의 말일정보(메소드) 2022.9 => 30일
	
		int year=0;
		int month=0;
	
		public static int getLastDate (int year, int month) {
			Calendar cal = Calendar.getInstance(); //new는 다른 클래스에서 호출할때
			
		
			
			
			
			cal.get(Calendar.YEAR);
			cal.get(Calendar.MONTH);
			
			
			
			
	
			return cal.getActualMaximum(Calendar.DATE);
			
		
			
			
			
			
			
			System.out.printf("%d년 %d월의 마지막 날짜는 %d\n",year,month,getLastDate(year,month));
			
			
//			System.out.printf("%d년 %d월 1일의 요일정보는 %d",year,month,getDayInfo(year,month));
			
			
		}
		
		
	
	
	
	// 년, 월 정보 => 해당 년, 월의 요일정보(메소드) 2022.9 => 9월1일 요일정보 =>5요일
		public int getDayInfo() {
	
		}
}





