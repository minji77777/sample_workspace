package com.edu;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.
	String teacher ;
	String grade;

	// 생성자.
	HighStudent(String studNo,String studName,int score,String teacher,String grade){
		super(studNo,studName,score);
		this. teacher = teacher;
		this.grade = grade;
	}

	// toString()
	public String toString() {
		return " 고등학생 [studNo=" + getStudNo() + ", studName=" + getStudName() + ", score=" + getScore() + ", teacher=" + teacher+", grade"+ grade+"]";

}
}
