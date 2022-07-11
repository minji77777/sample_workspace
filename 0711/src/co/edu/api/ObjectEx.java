package co.edu.api;


	class Member extends Object{
		String id;
		int age;
		
	 @Override	
	 public boolean equals(Object obj) {
		 
		 if(obj instanceof String) {
			 boolean b1 = this.id.equals(((Member) obj).id);            // 자식 타입으로 변형.
			 boolean b2 = this.age == ((Member) obj).age;
			 return b1 && b2;
		 }
		
		 return false;
	}
	 public String toString() {
		 return "아이디: "+id+", 나이: "+age;
	 }
	
	public static void main(String[] args) {
		Object obj1 = new Object();                 //instance => 주소값.
		Object obj2 = new Object();	                //instance => 주소값.
		
		System.out.println(obj1.equals(obj2));          //두개의 주소값 비교.(서로 다른)
		System.out.println(obj1.toString());           // Object.toString // 주소값.
		
		String name1 = new String("홍길동");
		String name2 =  new String("김길동");
		
		System.out.println(name1.equals(name2));                 //값 비교. (오버라이딩 됨)
		System.out.println(name1.toString());
		
		Member member1 = new Member();
		member1.id ="user1";
		member1.age=10;
		
		Member member2 = new Member();
		member2.id ="user1";
		member2.age=10;
		
		System.out.println(member1.equals(member2));         //주소값 비교. 물리적 다른 개체. 논리적 동일한 값.
		System.out.println(member1.toString()); //Object.
		
	}

}
