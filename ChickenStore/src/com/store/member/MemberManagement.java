package com.store.member;

import com.store.common.DAO;

public class MemberManagement extends DAO {
	

	// 싱글톤
	private static MemberManagement mm = new MemberManagement();

	private MemberManagement() {

	}

	public static MemberManagement getInstance() {
		return mm;
	}

	// 전체조회
	public Member customerAll(Member member) {
		Member member1 = null;
		try {
			conn();
			String sql = "select * from member; ";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				member1 = new Member();
				member1.setMemberId(rs.getString("member_id"));
				member1.setMemberPw(rs.getString("member_pw"));
				member1.setMemberAddr(rs.getString("member_addr"));
				member1.setMemberTel(rs.getString("member_tel"));
				member1.setRole(rs.getString("role"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member1;
	}

	// 단건조회
	public Member oneCustomer(String memberId) {
		Member member1 = null;
		try {
			conn();
			String sql = "select * from member where member_id =? ; ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				member1 = new Member();
				member1.setMemberId(rs.getString("member_id"));
				member1.setMemberPw(rs.getString("member_pw"));
				member1.setMemberAddr(rs.getString("member_addr"));
				member1.setMemberTel(rs.getString("member_tel"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member1;
	}

	// 로그인 메소드(권한부여)
	public Member login(String memberId) {
		Member member = null;
		try {
			conn();
			String sql = "select * from member where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberTel(rs.getString("member_tel"));
				member.setRole(rs.getString("role"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;
	}

	// 회원가입 메소드
	public int registerMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberAddr());
			pstmt.setString(4, member.getMemberTel());
			pstmt.setString(5, member.getRole());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;



	}
	//회원삭제
	public int deleteMember(String id) {
		int result= 0;
		try {
			conn();
			String sql  ="delete from member where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	//회원정보 변경
	public int updateMember(String memberId,String memberPw) {
		
		MemberService ms = new MemberService();
		
		int result= 0;
		try {
			conn();
			String sql  ="update member set member_pw=? where member_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ms.update(memberPw));
			pstmt.setString(2, rs.getString("member_id"));
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}


	
	//로그인
	public Member loginInfo(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from member where member_id =? ";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {  //단건조회
				member= new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberTel(rs.getString("member_tel"));
				member.setRole(rs.getString("role"));
				
}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
}

