package compound;

import java.util.Date;

// 게시글 한 건의 정보
//게시글 제목/ 내용/작성자/작성일시/조회수 //필드에 저장

public class Board {
	// 필드들.
	private String title; 
	private String content;
	private String writer;
	private Date createDate;
	private int hitCount;
	
	//생성자.
	
	
	//getter, setter 메서드
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	//생성자.
	
	
	//getter, setter 메서드

}
