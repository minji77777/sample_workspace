package co.edu.loop;

import java.util.Scanner;

public class BankAccount {
  public static void main(String[] args) {
	  //1. 입금, 2. 출금, 3.잔액조회 4. 종료.
	  Scanner scn =new Scanner(System.in);
	  int balance = 0;
	  
	  
	  while (true) {
		  System.out.println("1:입금, 2:출금, 3:잔액조회 4: 종료");
		  int menu = scn.nextInt();
		  if(menu == 1) {
			  System.out.println("입금액을 입력하세요 >>> ");
			  int amt = scn.nextInt();
			  if(balance + amt > 100000) {
				  System.out.println("입금액이 100000원을 초과하였습니다.");	
				  continue; //아래구문 실행 x,다음 순번  cf. break 블록 나감
			  }
			  if(amt< 0) {
				  System.out.println("입금액은 0보다 커야합니다.");
				  continue;
			  }
			  else {
				  balance += amt;
				  System.out.println("정상적으로 처리완료");
			  }
			  
		  } else if (menu ==2) {
			  System.out.println("출금액을 입력하세요 >>> ");
			  int amt = scn.nextInt();
			  
			  if(balance >= amt) {
				  balance -= amt;
				  System.out.println("정상적으로 처리완료.");
			  } else {
				  System.out.println("잔액이 부족합니다.");
			  }
			  
		  } else if (menu == 3) {
			  System.out.println("현재잔액은: "+balance);
			  
			  
		  } else if (menu ==4) {
			  System.out.println("프로그램을 종료합니다.");
			  break;
			  
		  } else {
			  System.out.println("잘못된 메뉴를 입력하였습니다.");
	  }
		  
	
}
}//end of while
}
