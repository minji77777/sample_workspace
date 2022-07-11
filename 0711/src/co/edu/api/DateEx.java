package co.edu.api;
/*
 * Date,Calendar =>  시간, 날짜 정보
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date today = new Date();  //LocalDate, LocalDateTime
		today.getDate();
		today.getDay();
		
		System.out.println(today.toString());
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());
		
		// 2022년 07월 12일 14시53분12초.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초"); // 대문자 => 24시 기준.
		System.out.println(sdf.format(today));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(today));
		
		today = new Date("2022/07/15 13:23:12");
		System.out.println(sdf.format(today));
		
		// Calendar 클래스
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)+"년");
		int mon = now.get(Calendar.MONTH);
		
		now.set(2022, 10, 11);
		System.out.println(now.get(Calendar.DATE)+"일");
		
//		LocalDate
		
		LocalDate lDate =  LocalDate.now(); //정적 메서드
		System.out.println(lDate.toString());
		
		//값 지정
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(lDate.format(dtf));
		
		
		
	}
}
