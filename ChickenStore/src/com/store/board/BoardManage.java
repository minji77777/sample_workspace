package com.store.board;



import java.util.ArrayList;
import java.util.List;

import com.store.common.DAO;



public class BoardManage extends DAO{

		// 싱글톤
		private static BoardManage bm = new BoardManage();

		private BoardManage() {

		}

		public static BoardManage getInstance() {
			return bm;
		}
		
		
		
		//공지사항 리스트
		public List<Board> getBoardList() {
			List<Board> list = new ArrayList<Board>();
			Board board = null;
			int result=0;
			try {
				conn();
				String sql = "insert into board values(?,?,?,?)";
				
				pstmt = conn.prepareStatement(sql);

				result = pstmt.executeUpdate();

				while (rs.next()) {
					board = new Board();
				
					pstmt.setInt(1, board.getNo());
					pstmt.setString(2, board.getMemberId());
					pstmt.setString(3, board.getContent());
					pstmt.setString(4, board.getWriteDate());
					
					result = pstmt.executeUpdate();
					
					list.add(board);
							
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}
		
		

}
