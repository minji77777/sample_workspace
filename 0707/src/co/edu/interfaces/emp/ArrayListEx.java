package co.edu.interfaces.emp;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		
		//배열
		Employee[] empAry=new Employee[10];
		empAry[0] = new Employee(); //추가
		empAry[0]=null; //삭제
		empAry[0] = new Employee();  //변경
		System.out.println(empAry[0]);
		
		for(int i =0; i <empAry.length;i++) {
			System.out.println("empAry[" + i + "]");
		}
		//컬렉션
		ArrayList<Employee> empList = new ArrayList<Employee>();  //<Employee>값으로 호출하겠다.
		empList.add(new Employee()); //추가
//		empList.remove(0); //삭제
		
		empList.set(0, new Employee()); //변경   0번째 위치에 new employee로 변경
		empList.add(new Employee()); // 추가
		System.out.println(empList.get(0)); // 값 가져올때
		
		
		for(int i = 0; i<empList.size();i++) {
			System.out.println("empList["+i+"]");
			
		}
		
	}

}
