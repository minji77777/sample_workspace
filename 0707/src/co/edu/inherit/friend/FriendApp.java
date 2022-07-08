package co.edu.inherit.friend;

import java.util.Scanner;

public class FriendApp {
	//생성자 기본생성자사용
	
	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);
	
	public void start() {
		while(true) {
//		System.out.println("1.등록 2.조회 3.목록 9.종료");
		timerShow("1.등록 2.조회 3.목록 9.종료");
		System.out.println("선택>>> ");
		int selectNo=0; //try 구문 끝나면 selectNo 없어질수도 있으니 뺏음
		try {
			 selectNo=Integer.parseInt(scn.nextLine());                             //"가"=>12 error
		}catch(Exception e) {
//			System.out.println("자연수를 입력하세요");
			timerShow("자연수를 입력하세요");
		}
		
		
		
		
		
		if(selectNo ==1) {
			add();
		} else if(selectNo==2) {
			search();
		} else if(selectNo==3) {
			list();
		} else if(selectNo==9) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
//		System.out.println("프로그램을 종료");
		timerShow("프로그램을 종료.");
//end of start()
}

		private void add() {
			
			System.out.println("1.학교 2.회사 3.친구");
			System.out.println("선택>>> ");
			
			int choice =0;
			
		while(true) {
			try {
				choice = Integer.parseInt(scn.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("1, 2, 3 중에 선택하세요.");
			}
			}
			
			System.out.println("이름>>> ");
			String name = scn.nextLine();
			System.out.println("연락처>>> ");
			String phone = scn.nextLine();
			
			if(choice == 1) {
				System.out.println("학교이름>>> ");
				String univ = scn.nextLine();
				System.out.println("전공>>> ");
				String major = scn.nextLine();
				
				friends[friendNum++] =new UnivFriend(name,phone,univ,major);
				
			}else if (choice ==2) {
				System.out.println("회사이름>>> ");
				String company = scn.nextLine();
				System.out.println("부서>>> ");
				String department =scn.nextLine();
				
				friends[friendNum++] =new ComFriend(name,phone,company,department);
				
			}else if (choice ==3) {
				
				friends[friendNum++]=new Friend(name,phone);
			}
			
			
		}

		private void search() {
			// 친구이름 입력 => 친구상세정보: showInfo()
			while(true) {
				System.out.println("이름을 입력하시오>>> ");
				String fName = scn.nextLine();
				
				for(int i =0; i<friendNum;i++) {
					if(friends[i].getName().equals(fName)) {
						friends[i].showInfo();
					}
				}
				
			}
			
		}
		
		private void list() {
			for(int i=0; i<friendNum; i++) {
				System.out.println(friends[i].toString());
			}
		}
		
		
			private void timerShow(String msg) {
				String[] message = msg.split("");
				for(int i =0 ;i<message.length;i++) {
					System.out.print(message[i]);
					try {
						Thread.sleep(100);                  //스레드 생성.0.1초 찍으세요.
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
					
				
			}
		}
