package co.edu.inherit.friend;

public class Friend {
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
//get, set
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//to string
		@Override
		public String toString() {
			return "Friend [name=" + name + ", phone=" + phone + "]";
		}
		
		public void showInfo() {
			System.out.println("이름: "+name);
			System.out.println("연락처: "+phone);
			//친구이름, 연락처
		}
	
	
}
