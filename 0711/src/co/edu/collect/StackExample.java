package co.edu.collect;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		String elem = stack.pop(); // 제일 마지막 요소를 빼내는 작업.
		System.out.println(elem);
		
		elem = stack.peek();
		System.out.println(elem); // 꺼내진 않고 그냥 맨위 확인. 
		
		elem = stack.pop();
		System.out.println(elem);
		
		if(stack.isEmpty()) {
			System.out.println("스택에 더 요소가 없음. ");
		}
	}
}
