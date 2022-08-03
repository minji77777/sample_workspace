package java복습;

import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		int money = 0;
		int lottoNo[];
		while (flag) {
			System.out.println("1. 로또생성 | 2. 로또조회 | 99. 프로그램 종료");
			System.out.println("메뉴선택 >  ");
			int selectNum = Integer.parseInt(scn.nextLine());
			if (selectNum == 1) {
				System.out.println("금액을 투입해주세요.");
				money = Integer.parseInt(scn.nextLine());
				System.out.println("번호 출력 완료");
				int lotto[] = new int[6];
				
					int randomNo = (int) (Math.random() * 45) + 1;
					lottoNo[i] = randomNo;
					for (int i = 0; i < 6; i++) {
					for(int j=0; j<money /1000;j++) {
						System.out.println("j번> "+lottoNo[i]);
						}

					}
					
					break;
				
			} else if (selectNum == 2) {
				System.out.println("구매한 금액> " + money + "원");
				
				

			}

		}
	}

}
