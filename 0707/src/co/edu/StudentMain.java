package co.edu;

public class StudentMain {
	
	//메인 메소드
	public static void main(String[] args) {  
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Student kim= new Student();   //기본 생성자-초기값을 준다.
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);
		
		
		System.out.println("이름: "+kim.getName()); //반환값 있어
		kim.showInfo();
		
		Student park = new Student("22-002","박희수",85); 
		park.showInfo();
		//학생 추가.1-3반에 추가.
		Student minji = new Student("22-007", "김민지",90);
		minji.showInfo();
		
		
		Course course = new Course("김철수","1-3",25);
		System.out.println("선생님: "+course.getTname());
		System.out.println("반정보: "+course.getBname());
		//학생등록
		course.addStudent(kim);
		course.addStudent(park);
		
		//학생리스트 보기
		course.getStudents();
		
		//최고점 학생 정보보기
		System.out.println("최고점수 학생: ");
		Student maxStudent = course.getMaxStudent();
		maxStudent.showInfo();
		
		//반평균
		System.out.println("반 평균: "+course.getAvgScore() );
		
	}

}
