package co.edu.api;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		// 클래스의 정보 얻어오기. forName
		try {
				Class cls =Class.forName("java.lang.String");
				cls = String.class;
				
				System.out.println(cls.getName());
				
				Method[] methods =cls.getMethods();
				for(Method method : methods) {
					System.out.println(method.getName());
				}
						
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
