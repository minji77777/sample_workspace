package co.edu.interfaces.database;

public class Oracle implements Dao {             //implements 구현  extends 상속

	@Override
	public void insert() {
		System.out.println("Oracle 입력합니다.");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle 수정합니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle 삭제합니다.");
	}

}
