package compound;

public class ClassExam {
	public static void main(String[] args) {
		String name ;
		int age = 0;
		int score = 0;
		
		
		
		String[] names = {"홍길동","박민수","김익수"};
		int[] scores = {80,90,85};
		int[] ages = {19,20,21};
		
		//class를 통해 새로운 데이터 타입을 선언해서 정보를 깔끔하게 정리
		
		Student s1 = new Student(); //s1이라는 참조변수.Student(참조유형의 데이터) 빈공간을 만들어서 주소값을 반환하여 s1에 담겠다.
		s1.name = "홍길동";                 //new 초기화
		s1.age= 20;
		s1.score=80;
		
		Student s2 = new Student();
		s2.name = "박민수";
		s2.score= 85;
		s2.age= 20;
		
		Student s3 = new Student();
		s3.name = "김익수";
		s3.age = 21;
		s3.score = 85;
		s3.height = 168.5;
		System.out.println(s3.name);
		
		Student[] students = {s1,s2,s3}; //students배열
		
		for(int i=0; i<students.length;i++) {
			if(students[i].name.equals("김익수")) { // ==연산자 사용하지 말고
				System.out.println("점수: "+students[i].score);
				System.out.println("나이: "+students[i].age);
			}
		}
		
		Car c1 = new Car("소나타",220); // 힙메모리에 인스턴스 생성
//		c1.model = "소나타";    //필드에 값 담기
		c1.price=2000000;
		c1.start();
		c1.run();
		c1.stop();
		c1.showSpeed();
		c1.speed = 30; 
		System.out.println("최고속도: "+ c1.maxSpeed);                                      //속성
		c1.setSpeed(50);   //메소드
		
		
//		Car c2 = new Car(); // 힙메모리에 인스턴스 생성
//		c2.model = "k5";    //필드에 값 담기
//		c2.price=22000000;
//		c2.start();
//		c2.run();
//		c2.stop();
//		c2.showSpeed();
		
//		System.out.println(c1); // 메모리 주소 리턴
	}
}

