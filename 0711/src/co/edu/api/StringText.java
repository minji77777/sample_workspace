package co.edu.api;

public class StringText{

	public static void main(String[] args) {
		String[] str = {"자바","자바다","이것이자바다","자바스크립트","자 바"};
		// "자바" 문자열 포함.(개수)
		
		int cnt=0;
		for(int i=0; i< str.length ;i++) {
			if(str[i].indexOf("자바")!= -1) {
				cnt++;
			}
		}
		
		
		
		String path = "c:/images/hello.png";
		//파일의 확장자, 파일명
		String ext = path.substring(16);
		String nFile=path.substring(10, 5);
		
		
		String tel ="";
		String[]tels = {" 031"," 210 3","34 78 "};
		//tel에 031-2103-3478
		String tels1 =" 031";
		String tels2 = " 210 3";
		String tels3 = "34 78 ";
		
		 tel = tels1.trim()+"-"+tels2.trim()+"-"+tels3.trim();
		 System.out.println(tel);
		
		
		String[]ssn = {"970403-1234123", "010503 3456123","980123/2412345", "0202023217891"};
		for(int i =0 ; i<ssn.length;i++) {
			checkGender(ssn[i]);
				
		}
	}
	public static void checkGender(String ssn) {
		int length = ssn.length();
		char str = ssn.charAt(7);
		if(length == 14) {
			if(str==1 | str==3) {
				System.out.println("남자");
			}else if(str==2|str==4) {
				System.out.println("여자");
			}
		} else {
			System.out.println("자리수를 맞추시오.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
		


