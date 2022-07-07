package co.edu;
/* 클래스 연습 StudentMain 사용.
 * 
 */

public class Student {
	//3개의 필드.(외부에선 안 보임.private)
	private String sno;
	private String name;
	private int score;
	
	//생성자 :기본 생성자.중복가능.생산자 초기값
	public Student() {}
	
	//생산자 오버로딩.
	public Student(String sno, String name, int score) {            //반환 타입 없고 클래스 이름과 같음.
		this.sno= sno;
		this.name =name;
		this.score=score;   
	}
	
	//메소드 getter, setter
	
	public void setSno(String sno) {
		this.sno = sno; //우변이 변수의sno , 좌변의 this는 필드의 sno에 대입하시오. //학번에 값을 대입..
	}
	public void setName(String name) {
		this.name=name; //name객체에 name 변수 대입
	}
	public void setScore(int score) {
		this.score =score;
	}
	public String getSno() { //학번을 반환. 매개변수 필요없음
		return this.sno;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	//전체 정보를 보여주는 showInfo() 
	public void showInfo() { //반환값 없음
		System.out.printf("학번: %s, 이름: %s, 점수:%d%n",sno,name,score);
		
	}
}
