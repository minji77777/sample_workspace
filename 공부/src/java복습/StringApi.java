package java복습;

public class StringApi {
	public static void main(String[] args) {
		String a ="aaa";
		String b = "bbb";
		
		//값이 같으면 참조변수의 주소값 같음. 
		
		String c = new String ("aaa");
		
		// a==b;
				
		// a!=c;
		
		//if(a==b)         -> false
			// ==은 주소값 비교 
		//if(a.equals(c))  -> true
			// .equals() 는 문자열 데이터를 비교 
		
		
		String d = "aaa";
		
		a = a+ "bbb";
		
		StringBuilder sb = new StringBuilder();
		
		//100번지
		sb.append("aaa");
		//100번지
		sb.append("bb");
		
		
	}
}
