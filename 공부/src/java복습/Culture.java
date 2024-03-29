package java복습;

public abstract class Culture {
	
	//필드
	protected String title;
	protected int director;
	protected int actor;
	protected int audience;
	protected int totalScore;
	//생성자
	public Culture(String title, int director, int actor) {
		this.title=title;
		this.director=director;
		this.actor=actor;
	}
	
	//메소드
	public void setTotalScore(int score) { //관객수와 총점을 누적시키는 기능
		// 평점 인원 한명 추가
		audience ++;
		//총점에 평점 추가
		totalScore += score;
	}
	public String getGrade() {
		int avg = totalScore/audience; //소수점 버림 int로
		String grade = null;
		switch(avg) {
		case 1:
			grade = "★☆☆☆☆";
			break;
		case 2:
			grade = "★★☆☆☆";
			break;
		case 3:
			grade ="★★★☆☆";
			break;
		case 4:
			grade="★★★★☆";
			break;
		case 5:
			grade="★★★★★";
			break;
		}
		return grade;
	}
	//추상화 메소드
	public abstract void getInformation(); //추상화는 부모에선 초기화하지 않아도 돼. 자식클래스에서 정의하면 된다. 

}
