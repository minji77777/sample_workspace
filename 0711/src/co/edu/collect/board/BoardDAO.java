package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	// 싱글톤.
	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList<>();
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	// 1.목록
	public List<Board> boardList() {
		return list;
	}

	// 2.등록
	public void add(Board board) {
		list.add(board);
	}

	// 3.조회(작성자)
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>(); // 찾고자 하는 이름 => 리스트.

		for (Board board : this.list) {
			if (board.getWriter().equals(writer)) {
				list.add(board);
			}

		}

		return list;
	}

	// 4.삭제(제목)
	public void remove(String tilte) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;
			}
		}
	}
}
