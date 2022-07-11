package co.edu.exception;

public class ThrowExceptionEx {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException, SQLException{    //methhod1 호출하는 main 메서드에 예외 떠넘기기 :throw
		Class.forName("java.lang.String"); 
		
		DriveManager.getConnection("","","");
	}
}
