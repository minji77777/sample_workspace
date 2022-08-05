package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.bank.common.DAO;

public class Management extends DAO {

	public Management() {
		// 전체조회
		showInfo();
		// 한건 조회
		getMember();
		// 한건 입력
		insertInfo();
		// 수정
		updateInfo();
		//삭제
		deleteInfo();
	}
	private void deleteInfo() {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, "A");
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		if(result ==1) {
			System.out.println(result+"건이 삭제되었습니다.");
		}else {
			System.out.println("삭제에 실패했습니다. ");
		}
	}
	
	private void updateInfo() {
		int result = 0;
		try {
			// 1. db연결
			conn();
			// 2. query 작성
			String sql = "update member set pw=? where id = ?";
			// 3. 창구 및 query 생성
			pstmt = conn.prepareStatement(sql);
			// 4. 데이터 입력
			pstmt.setString(1, "4231");
			pstmt.setString(2, "A");
			// 5. 실행
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		if (result == 1) {
			System.out.println(result + "건이 수정되었습니다.");
		} else {
			System.out.println("수정되지 않았습니다.");
		}
	}

	// 한건 입력
	private void insertInfo() {
		int result = 0;
		try {
			// 1.db연결
			conn();
			// 2. query 작성
			String sql = "insert into member values(?,?,?)"; // 차례대로 1번, 2번, 3번
			// 3. 창구생성
			pstmt = conn.prepareStatement(sql);
			// 4. query 데이터 입력
			pstmt.setString(1, "F"); // 첫번째 자리에 넣을 데이터 -> F
			pstmt.setString(2, "1234"); // 두번째 자리에 넣을 데이터 -> 1234
			pstmt.setString(3, "김씨");
			// DML(insert, update, delete) -> executeUpdate()

			// Select -> executeQuery()
			result = pstmt.executeUpdate(); // sql문에서 행이 정상적으로 입력되면 1이 되고 제대로 안되면 0이 반환된다. "1. 행이 삽입되었습니다"에서 1

		} catch (Exception e) {

		} finally {
			disconnect();
		}

		if (result == 1) { // sql문에서 행이 정상적으로 입력되면 1이 되고 제대로 안되면 0이 반환된다.
			System.out.println("정상입력되었습니다.");
		} else {
			System.out.println("입력에 실패하였습니다. ");
		}

	}

	public void getMember() {
		Member member =null;
		try {
			//1.db 연결
			conn();
			//2. query문 작성
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {  //잘 들어갔는지 확인
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		System.out.println("--------------------------------");
		System.out.println(member.toString());
	}

	// 전체조회
	// Member 여러 건
	private void showInfo() {
		List<Member> list = new ArrayList<>();
		Member mem = null;

		try {
			// 1. conn() 메소드로 DB연결
			conn();

			// 2. query 작성
			String sql = "select * from member";

			// 3. 연결된 db(java<->database)에 query문 보낼 수 있는 창구 생성
			stmt = conn.createStatement();

			// 4. 3번에서 만든 창구로 query문을 보냄
			// ResultSet(rs) select 조회할때만 사용
			rs = stmt.executeQuery(sql);
			while (rs.next()) {// sql 다음 문장 존재하는 지 물어봄
				mem = new Member();
				mem.setId(rs.getString("id")); // "id","name","pw"은 컬럼명.
				mem.setName(rs.getString("name"));
				mem.setPw(rs.getString("pw"));
				list.add(mem);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 연결 잘 되는 안되는 무조건 finally문 실행 시켜줌.
			disconnect();
		}

		for (Member member : list) {
			System.out.println(member.toString());
		}
	}

}
