package com.store.order;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.store.common.DAO;

public class OrderFoodManage extends DAO {
	
	private static OrderFoodManage OFM = null; 
	private OrderFoodManage() {  //다른데서 생성 못하도록 생성자 막아둠
		
	}
	
	public static OrderFoodManage getInstance() {
		if(OFM == null) {
			OFM = new OrderFoodManage();
		}
		return OFM;
	}
	
	//치킨 메뉴 조회
	public List<OrderFood> seeMenu() {
		
		List<OrderFood> list = new ArrayList<>();
		OrderFood of = null;
		
		try {
			conn();
			String sql = "select NO,MENU_NAME,PRICE from ORDERFOOD";
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
					
			
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				of = new OrderFood();
				of.setNo(rs.getString("no"));
				of.setMenuName(rs.getString("menu_name"));
				of.setPrice(rs.getInt("price"));
		
				list.add(of);
			}
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
				
		return list;
}

	//치킨 주문하기
	public List<OrderFood> orderMenu() {
		
		List<OrderFood> list = new ArrayList<>();
		OrderFood of = null;
		
		try {
			conn();
			String sql = "select NO,MENU_NAME,PRICE,PRICE*COUNT SUM_PRICE FROM ORDERFOOD";
			
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				of = new OrderFood();
				of.setNo(rs.getString("no"));
				of.setMenuName(rs.getString("menu_name"));
				of.setPrice(rs.getInt("price"));
				of.setCount(rs.getInt("count"));
		
				list.add(of);
			}
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
				
		return list;
	
	}
	
	//주문조회
	public List<OrderFood> seeAll() {
		
		List<OrderFood> list1 = new ArrayList<>();
		OrderFood of = null;
		
		try {
			conn();
			String sql = "select o.no, m.member_id, o.menu_name, o.count, o.order_date "
					+ "from member m, orderfood o "
					+ "where m.member_id = o.member_id;";
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				of = new OrderFood();
				of.setNo(rs.getString("no"));
				of.setMember_id(rs.getString("member_id"));
				of.setMenuName(rs.getString("menu_name"));
				of.setPrice(rs.getInt("price"));
				of.setCount(rs.getInt("count"));
				of.setOrder_date(rs.getString("order_date"));
		
				list1.add(of);
			}
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
				
		return list1;
	
	}
	
	
	
	
	
	
	
	
	
}

