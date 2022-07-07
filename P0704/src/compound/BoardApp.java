package compound;

import java.util.Date;
/*
 * id :user1, passwd:1212 => 로그인되었습니다!!
 * 						  => 아이디, 비번을 확인하세요!!
 */
import java.util.Scanner;

public class BoardApp { // 메인메서드 구현

	// 등록/조회/수정/삭제/리스트

	public static void main(String[] args) {
		Board[] boards = new Board[100];   //board 클래스 담을 수 있는 공간
		Scanner scn = new Scanner(System.in);
		String id;
		String passwd;
		
		boolean login =true;
		//로그인 처리 기능.
		while(login) {
			System.out.println("id: ");
			id=scn.nextLine();
			System.out.println("passwd: ");
			passwd =scn.nextLine();
			
			
			if(id.equals("user1")&& passwd.equals("1212"))
				System.out.println("로그인에 성공했습니다.!!");
			     break;
			} else {
				System.out.println("아이디, 비번을 확인하세요!!");
			
				
				
			
				
			}
	



		boolean run =true;
		
		while(run) {
			System.out.println("1.등록  2.조회  3.수정  4.삭제  5.리스트  6.종료");
			System.out.print("선택> ");
			
			int selectNo=Integer.parseInt(scn.nextLine());
			Scanner scn1 = new Scanner(System.in);
			
			if(selectNo==1) {
				//게시글 등록(제목,내용,작성자,작성일시,조회수(0));
				System.out.println("글제목을 입력하세요.");
				String title = scn.nextLine();
				
				
				System.out.println("글내용을 입력하세요.");
				String content = scn1.nextLine();
				
				System.out.println("글작성자를 입력하세요.");
				String writer = scn1.nextLine();
				
				
				Board board = new Board(); //board클래스의 인스턴스
				board.setTitle(title); 
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);  //조회수 0으로 초기화
				
				// 배열의 비어있는 위치에 글 등록/저장
				for(int i=0; i<boards.length;i++) {  //100번 반복.
					if(boards[i] == null) {
						boards[i] =board; // 비어있는 위치에 한 건 저장.
						break;
					}
				}
				
				System.out.println("정상적으로 입력했습니다.");
				
				
			}else if (selectNo==2) {
				//게시글 조회 : 제목 기준 조회.
				System.out.println("조회할 제목을 입력하세요> ");
				String findTitle = scn.nextLine();
				for(int i=0;i<boards.length;i++) {
					if(boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목: %s, 내용: %s, 작성자: %s, 작성일시: %s, 조회수: %d \n",boards[i].getTitle(), boards[i].getContent(), //
								boards[i].getWriter(),boards[i].getCreateDate(),boards[i].getHitCount());
				
					//카운트 증가.
					int cnt = boards[i].getHitCount();
					boards[i].setHitCount(++cnt); // 1증가 시키고 조회수 조회
					}
				}
				
			}else if (selectNo==3) {
				//제목, 내용 수정
				System.out.println("수정할 제목을 입력하시오.");
				String findTitle =scn.nextLine();
				
				for(int i=0;i<boards.length;i++) {
					if(findTitle.equals(boards[i].getTitle())){
						System.out.print("변경할 이름을 작성하세요.");
						String s = scn.nextLine();
						boards[i]=s;
						
						
					}
				}
				
			}else if(selectNo==4) {
				//게시글 삭제 . 같은 제목 있으면 null값 넣어주면 돼
			 System.out.println("삭제할 제목 입력하시오.");	
			 String findTitle = scn.nextLine();
				for(int i=0;i<=boards.length;i++) {
					if(boards[i]!=null && boards[i].getTitle().equals(findTitle)) {
						boards[i]=null;
					}
				} System.out.println("성공적으로 삭제되었습니다.");
			
				
				
			}else if(selectNo==5) {
				//전체 리스트(글목록)보기
				System.out.println("==============글목록================");
				for(int i =0; i<boards.length;i++) {   // 값이 있는 거 보여주기
					if(boards[i] != null) {
						System.out.printf("제목: %s, 내용: %s, 작성자: %s, 작성일시: %s, 조회수: %d \n",boards[i].getTitle(), boards[i].getContent(), //
								boards[i].getWriter(),boards[i].getCreateDate(),boards[i].getHitCount());
					}
				}
				
			}else {
				System.out.println("프로그램을 종료합니다...");
				run=false;
			}
			
			
			
		
		System.out.println("프로그램 종료.");
		}
}
}
