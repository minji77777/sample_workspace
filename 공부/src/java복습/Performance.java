package java복습;

public class Performance extends Culture {
	//필드
	String genre;
	//생성자
	public Performance(String title, int director, int actor) {
		super(title,director,actor);
	}
	//메소드
	@Override  //추상화 메소드
	public void getInformation() {
		System.out.println("영화제목: "+title);
		System.out.println("감독수: "+ director);
		System.out.println("배우 수: "+actor);
		System.out.println("영화 총점: "+totalScore);
		System.out.println("영화 평점: "+getGrade());

}
}
