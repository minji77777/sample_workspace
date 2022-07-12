package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueExample {
	public static void main(String[] args) {
		
			Queue<String>que = new LinkedList<>();
			
			que.offer("홍길동");
			que.offer("김인수");
			que.offer("황순호");
			
			while(! que.isEmpty()){
			String result = que.poll();
			System.out.println(result);
			
	}
	}
}
