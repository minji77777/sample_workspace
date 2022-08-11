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
			try {
				conn();
				String sql = "select b.no,m.member_id, b.content, b.write_date"
						+" where b.member_id=m.member_id ";
				stmt = conn.createStatement();

				rs = stmt.executeQuery(sql);

				while (rs.next()) {
					board = new Board();
					board.setNo(rs.getInt("no"));
					board.setContent(rs.getString("content"));
					board.setMemberId(rs.getString("member_id"));
					board.setWriteDate(rs.getString("write_date"));
					
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
