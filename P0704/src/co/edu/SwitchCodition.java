package co.edu;

public class SwitchCodition {
	public static void main(String[] args) {
		
		int result =(int)( Math.random() *10) +1; // 1<=(int)(temp *10) +1 <11  , 임의의 실수 만들어줌
		System.out.println(result);
		
		if(result == 1) {
			System.out.println("1번 출력.");
		}else if(result ==2) {
			System.out.println("2번 출력.");
		}else if(result ==3) {
			System.out.println("3번 출력.");
		}else if(result ==4) {
			System.out.println("4번 출력.");
		}else if(result ==5) {
			System.out.println("5번 출력.");
		}else if(result ==6) {
			System.out.println("6번 출력.");
		}
		//switch문

		switch(result) {
		case 1:
			System.out.println("1번 출력."); break; //break없으면 result값이 1이면 1부터 6까지 다 실행.
		case 2:
			System.out.println("2번 출력."); break;
		case 3:
			System.out.println("3번 출력."); break;
		case 4:
			System.out.println("4번 출력."); break;
		case 5:
			System.out.println("5번 출력."); break;
		case 6:
			System.out.println("6번 출력.");                 //case마지막은 break 필요 없음.
		}
	} 

}
