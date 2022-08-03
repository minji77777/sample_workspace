package java복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringAPI3 {
	public static void main(String[] args) {
		//1. 단어입력
		//2. 대, 소문자 변환
		//3. 단어의 총 길이
		//4. 단어 자르기
		//5. 단어 자르기2
		Scanner scn = new Scanner(System.in);
		List <String> list = new ArrayList<String>();    //switch 문 안에 들어가면 다른 케이스에서 못 읽음
		int MenuNo =0;
		
		while(MenuNo!=99) {
			
		System.out.println("기능을 선택해주세요.");
		System.out.println("1.단어 입력 | 2. 대,소문자 변환 | 3. 단어길이 | 4. 단어 자르기 | 5. 단어자르기" +" 99. 프로그램 종료");
		System.out.println("입력> ");
		//nextLine = String + Enter
		//-> Enter키 기준으로 인식
		//->nextInt() => 5 + Enter
		//int = nextInt() => 5+Enter
		//int = nextLine() => Enter
		MenuNo = Integer.parseInt(scn.nextLine());
		
		switch(MenuNo) {
		case 1:
			while(true) {
				System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
				String word = scn.nextLine();
				if(word.equals("q")){
					break;
				}
				list.add(word);
			}
			for(String str : list) {
				System.out.print(str+" ");
			}
			break;
		case 2:
			if(list == null || list.size()==0) {    //예외처리 : 1번 먼저 안 누르고 2번 먼저 누를 경우에 대비
				System.out.println("단어가 등록되지 않았습니다.");
				return;
			}
			System.out.println("1. 대문자 2. 소문자");
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1) {
				for(String str : list) {
					System.out.println(str.toUpperCase()+" " );
					
				}
			}else if(menu==2) {
				for(String str: list) {
					System.out.println(str.toLowerCase());
				}
			}
			break;
		case 3:
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<list.size(); i++) {
				sb.append(list.get(i)); // stringbuilder 에다가 하나씩 추가
			}
			System.out.println("입력한 문자의 총 길이: "+sb.length()+"입니다.");
			break;
		case 4:
			System.out.println("자르고 싶은 단어의 인덱스를 입력하세요.");
			int i=0;
			for(String str:list) {
				System.out.println(i+"번째 단어"+ str);
				i++;
			}
			System.out.println("입력> "); //인덱스 입력
			int idx = Integer.parseInt(scn.nextLine());
			
			String word = list.get(idx);
			//단어 가운데부터 끝까지 자르기
			//string.substring(숫자)
			
			System.out.println(word.substring(Math.round(word.length()/2)));
			
			break;
		case 5:
			System.out.println("단어입력>");
			String str = scn.nextLine();
			
			System.out.println("입력하신 단어: "+ str);
			System.out.println("구분자 입력> ");
			String splits = scn.nextLine();
			String[] token = str.split(splits);
			for(String str2 : token) {
				System.out.println(str2);
			}
			//aa/aaa/aa/a/aa
			//split() 메소드  ex) /, " ", * ...
			break;
		}
	}
}
}