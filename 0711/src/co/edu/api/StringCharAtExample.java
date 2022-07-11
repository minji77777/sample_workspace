package co.edu.api;

public class StringCharAtExample {
	public static void main(String[] args) {
		String pNum = "000000-200000";
		char sex = pNum.charAt(7);
		switch(sex) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
			String ssn = "010624-123012";
			ssn = "010624123012";
			checkGender(ssn);
		} 
			
	
	
	public static void checkGender(String ssn) {   //메서드
		
		char sex = ssn.charAt(6);
				
		if(ssn.length()==13) {
			sex = ssn.charAt(7);
		
			
		
		
		
	
		 sex = ssn.charAt(7);
		switch(sex) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
	}

}
	}
}
