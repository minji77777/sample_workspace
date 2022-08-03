package 학원과제;

public class CollegeStudent extends Student {
	
	
//	CollegeStudent cs = new CollegeStudent();
	
//	대학생정보 : 담당교수, 전공과목 정보 추가.
	String prof;
	String major;

	// 생성자.
	CollegeStudent(String studNo,String studName,int score,String prof,String major ){
		super(studNo,studName,score);
		this.prof = prof;
		this.major = major;
		
	}
	
	//기본생성자
	public CollegeStudent() {
		
	}


	// toString() //객체 정보를 문자열로 반환
	public String toString() {
		return " 대학생 [studNo=" + getStudNo() + ", studName=" + getStudName() + ", score=" + getScore() + ", prof=" + prof+", major"+ major+"]";
	}
	
}
