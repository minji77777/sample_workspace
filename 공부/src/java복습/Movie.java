package java복습;

public class Movie extends Culture {
	//필드
	String genre;
	//생성자
	public Movie(String title, int director, int actor) {
		super(title,director,actor);
	}
	@Override  //추상화 메소드
	public void getInformation() {
		System.out.println("영화제목: "+title);
		System.out.println("감독수: "+ director);
		System.out.println("배우 수: "+actor);
		System.out.println("영화 총점: "+totalScore);
		System.out.println("영화 평점: "+getGrade());
		
		
	}
	
	//메소드
	

}
