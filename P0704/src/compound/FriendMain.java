package compound;

public class FriendMain {
	public static void main(String[] args) {
		
		//f1
		Friend f1 = new Friend();
//		f1.name = "김민수";
//		f1.tel="010-0000-0000";
//		f1.birth = "97-05-01";
//		f1.height=172.4;
//		f1.weight=80.5;
//		f1.email="hot@email.com"
		f1.setName("김민수");
		f1.setTel("010-0000-0000");
		f1.setHeight(-170.3);
		System.out.println("키는 : "+f1.getHeight());
		f1.setWeight(-85.4);
		System.out.println("몸무게는: "+f1.getWeight());
		f1.setBirth("97-05-01");
		f1.setEmail("ho@email.com");
		System.out.println("이메일은: "+f1.getEmail());
		f1.showInfo();
		//캡슐화: 필드 잘못된 사용하지 않도록 ex. 키는 음수가 되면 안돼.
		
		

	}
}
