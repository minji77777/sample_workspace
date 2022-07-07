package co.edu;

public class Course {
	// 필드.
	private String tname;
	private String bname;
	private Student[] students; //학생에 관한 여러정보 담을 것=>배열
	
	//생성자.
	public Course() {}  //반환타입 없어
	
	public Course(String tname) {
		this.tname=tname;
	}
	public Course(String tname,String bname,int studentNum) {
		this.tname = tname;
		this.bname= bname;
		this.students= new Student[studentNum];
	}
	//메소드.
	public String getTname() {
		return tname;
		
	}
	public String getBname() {
		return bname;
	}
	public void getStudents() {   //배열 안에 있는 학생정보 보여줌
		for(int i=0; i<students.length; i++) {
			if(students[i]!=null) {
				students[i].showInfo();
			}
		}
	}
	// 학생정보등록.
	public void addStudent(Student student) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i] = student;
				break;
			}
		}
	}
	// 점수가 제일 높은 학생의 정보를 반환.
	public Student getMaxStudent() { //Student 타입으로 반환// score로 비교
		int max =0;
		Student student =null; //student 타입의 기본값 null
		
		
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getScore()>max) {
				max = students[i].getScore();
				student = students[i];
			}
		}
		return student;
	}
	//반평균 반환.getAvgScore()
	
	public double getAvgScore() {
		int sum =0;
		int cnt =0; // 점수 합산한 사람이 몇명인지 카운트.
		double avg =0;
		
		for(int i=0; i<students.length; i++) {
			if(students[i]!=null) {
				sum += students[i].getScore() ;
				cnt ++;
				}
			}
				
			
		
			avg=(double)sum/cnt;
			return avg;
	}
}
