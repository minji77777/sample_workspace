package co.edu.io.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		//MemoManager 기능 구현
		MemoManager memoApp = MemoManager.getInstance(); 
		
		Scanner scn = new Scanner(System.in);
		int selectNo;
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.검색 3.삭제 4.종료");
			System.out.println("메뉴선택>> ");
			selectNo=Integer.parseInt(scn.nextLine());
			
			switch(selectNo) {
			case 1: //등록
				memoApp.inputData(); break;
			case 2:
				memoApp.search(); break;
			case 3:
				memoApp.deleteData(); break;
			case 4:
				memoApp.storeToFile();
				run = false;
			}
			
		}
		System.out.println("프로그램 종료.");
		
	}

}
