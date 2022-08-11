package com.store.order;

public class OrderFood {
	
	private String menuName; // 치킨이름
	private int price; // 치킨 가격
	private String order_date; // 주문 날짜, 시간
	private String member_id; // 주문 고객 id
	private String no;
	private int count; // 주문 건수
	
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	@Override
	public String toString() {
		return "주문내역 \n"+ "["+member_id+ menuName  + count + order_date+"]";
	}
	
	
	
	public OrderFood() {
		
	}
	
	
	
	
	
	
	

}
