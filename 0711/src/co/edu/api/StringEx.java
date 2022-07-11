package co.edu.api;

import java.io.UnsupportedEncodingException;

public class StringEx {
	public static void main(String[] args) {
		
		String name ="홍길동";
		name = new String("홍길동");
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		try {
			name = new String(bytes,0,5,"UTF-8");
		} catch (UnsupportedEncodingException e) {          //인코딩 방식(UTF-8) 지원 안 하면.
			e.printStackTrace();
		}
		System.out.println(name);
				
		char fName= name.charAt(0);
		System.out.println(fName);
		
		
	}

}
