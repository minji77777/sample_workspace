package co.edu.collect.board;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class BoardApp {
	package co.edu.collect.board;

	import java.util.List;
	import java.util.Scanner;

	public class BoardApp {
		
		public static void main(String[] args) {
			// 메뉴선택 => 선택값 => 구현
			Board[] boards = new Board[100];
			Scanner scn = new Scanner(System.in);

			while (true) {
				System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
				System.out.println("메뉴 선택 >> ");

				int selectNo = Integer.parseInt(scn.nextLine());
				String title = "";
				
				if (selectNo == 1) {
					System.out.println("목록보기 >> ");
					BoardDAO j = BoardDAO.getInstance();
					List<Board> list = j.boardList();
					for (Board brd : list) {
						System.out.println(brd.toString());
					}

				} else if (selectNo == 2) {
					System.out.println("제목을 입력하세요 >> ");
					String title = scn.nextLine();
					System.out.println("글을 입력하세요 >> ");
					String content = scn.nextLine();
					System.out.println("작성자를 입력하세요 >> ");
					String writer = scn.nextLine();
					Board board = new Board(title1, title3, title2);
					BoardDAO h = BoardDAO.getInstance();
					h.add(board);

				} else if (selectNo == 3) {
					System.out.println("조회할 작성자 이름을 입력하세요 >> ");
					String writer=scn.nextline();
					if(writer= )
					
					
				} else if (selectNo == 4) {
					System.out.println("삭제할 글을 선택하세요 >> ");
					
					
				} else if (selectNo == 5) {
					System.out.println("프로그램 종료합니다.");
					break;
				}
			}
			System.out.println("프로그램 종료합니다.");
		}
	
		}
		
	
	


