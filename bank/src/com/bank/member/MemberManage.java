package com.bank.member;

import com.bank.common.DAO;

public class MemberManage extends DAO {
	
	//싱글톤
	private static MemberManage mm =new MemberManage();  //heap 영역 (static 붙여주기)
	
	private MemberManage() {
		
	}
	
	public static MemberManage getInstance() {  //static 영역 -
		return mm;
	}
	//id -> pk
	//1 row
	//id/pw/.../
	
	//로그인 메소드
	
	
	
	
	public Member loginInfo(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from bankmember where member_id =? ";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {  //단건조회
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setAccountId(rs.getString("account_id"));
				member.setRole(rs.getString("role"));
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
	//고객등록 메소드
	public int registCustomer(Member member) {
		int result= 0;
		try {
			conn();
			String sql ="insert into bankMember (member_id,member_pw,member_name,role) values (?,?,?,?)";
			pstmt =conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRole());
			
			result = pstmt.executeUpdate();
			
			
			
		}catch(Exception e) {
			
		}finally {
			disconnect();
		}
		return result;
	}

}
