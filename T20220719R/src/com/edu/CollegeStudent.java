package com.edu;

public class CollegeStudent extends Student {
	
	
	
	
//	대학생정보 : 담당교수, 전공과목 정보 추가.
	String prof;
	String major;

	// 생성자.
	CollegeStudent(String studNo,String studName,int score,String prof,String major ){
		super(studNo,studName,score);
		this.prof = prof;
		this.major = major;
		
	}
	

	// toString()
	public String toString() {
		return " 대학생 [studNo=" + getStudNo() + ", studName=" + getStudName() + ", score=" + getScore() + ", prof=" + prof+", major"+ major+"]";
	}
	
	

}

