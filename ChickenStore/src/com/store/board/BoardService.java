package com.store.board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.store.common.DAO;

public class BoardService extends DAO {

	Scanner scn = new Scanner(System.in);
	// 시간,날짜 write_date칼럼
	LocalDateTime now = LocalDateTime.now(); // 현재 날짜/시간
	String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss"));

	BoardService bs = new BoardService();
	Board board = new Board();

	public void seeBoard() {

		
		List<Board> list = new ArrayList<Board>();
		
		System.out.println("회원 ID>>");
		

		System.out.println("내용입력>>");
		String content = scn.nextLine();
		
		System.out.println();//가독성
		System.out.println("─────────────────────────────────");
		System.out.println("<공지사항> 총 " + list.size() + "건");
		System.out.println("─────────────────────────────────");
		for (Board b : list) {
			System.out.printf("d. %s / %s / %s", b.getNo(), b.getContent(), b.getMemberId(), b.getWriteDate());
		}
		System.out.println("─────────────────────────────────");

	}

	
	

}
