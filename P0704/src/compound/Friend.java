package compound;
/*
 *  이름, 연락처, 이메일, 생일, 키, 몸무게:
 */

    public class Friend {    //<설계도>

	//필드. 명명규칙(소문자, 두번째단어는 대문자, 영문먼저,특수문자x)
	
	private String name;                       //private 외부에서 이 속성에 접근 제한. 
	private String tel;
	private String email;
	private String birth;
	private double height;
	private double weight;
	
	//생성자: 기본생성자를 생성.
	public Friend() {
		name ="홍길동";
	}
	public Friend(String name,String tel) {                    //public 접근제한자
		this.name = name;
		this.tel = tel;
	}
	
	
	//메소드
	
	public void showInfo() {
		System.out.printf("이름은  %s 이고 전화번호는 %s이다.",name,tel);
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setHeight(double height) {
		if(height<0) {
			System.out.println("잘못된 값이 입력되었습니다.");
			this.height =165.0;
		} else {
			this.height = height;
		}
	}
	public double getHeight() {   //void :값을 반환하지 않는다.
		return height;
	}
	
	//이름, 연락처를 보여주는 showInfo()
	
	public void setTel(String tel) {
		this.tel=tel;
	}
	
	public void showInfo(String name,String tel) {
		this.name = name;
		this.tel=tel;
	}
//	public void setWeight(double weight) {
//		if(weight<0) {
//			System.out.println("잘못된 값이 입력되었습니다.");
//			this.weight=80.5;
//		} else {
//			this.weight=weight;
//		}
		
		public void setWeight(double weight) {
			if(weight>0) {
				this.weight=weight;
			} else {
				this.weight=70; //기본값70
			}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setBirth(String birth) {
		this.birth =birth;
	}
	public void setEmail(String email) {
		if (email != "hot@email.com") {
			System.out.println("잘못된 값이 입력되었습니다.");
			this.email="hot@email.com";
		}else {
			this.email=email;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getBirth() {
		return birth;
	}
	
	
	
	
	
	
	
	}
	

