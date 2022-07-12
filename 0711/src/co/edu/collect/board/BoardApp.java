package co.edu.collect.board;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class BoardApp {
	public static void main(String[] args) {
		
		System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
		
		//메뉴선택 =>  선택값 => 구현
		Scanner scn = new Scanner(System.in);
		List<Board> list = new Vector<Board>();
		
		while(true) {
			System.out.println("번호 > ");
			int selectNum = scn.nextInt();
			
			if(selectNum == 1) {
				//목록
			} else if(selectNum==2) {
				//등록
				System.out.println("제목> ");
				String title = scn.nextLine();
				System.out.println("작가> ");
				String writer = scn.nextLine();
				System.out.println("내용> ");
				String content = scn.nextLine();
				BoardDAO app = BoardDAO.getInstance();
				Board board = new Board(title,writer,content);
				app.add(board);
				
				
				
				
				
			} else if(selectNum ==3) {
				// 조회(작성자)
			} else if(selectNum == 4) {
				// 삭제
			} else if (selectNum == 5) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("범위 안의 숫자만 입력하시오.");
			}
		}
		
	}
	
}

