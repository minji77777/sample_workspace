package java복습;

import java.util.List;
import java.util.Scanner;

//클래스 타입 배열 - 2차원 배열과 비슷
//자료형 대신 클래스

//Product class=> 배열, 리스트...
//Product[] proArr;
// 각 인덱스 호출 최고가격 제품 골라내기 , 모든 제품 합 - 최고가격
public class Product {

	// 속성
	private int price;
	private int amount;
	private String name;
	// 생성자

	// 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 게터, 세터
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	// 상품수 = 배열의 사이즈이자 product 객체 숫자

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Product[] pro = null;
		//List로 변환가능
		//List<Product>list = new ArrayList <>();
		//List<Product>list = new ArrayList <Product>();  위와 같음
		

		System.out.println("1. 상품수 | 2. 상품 및 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료 ");
		System.out.println("입력> ");

		int menuNo = Integer.parseInt(scn.nextLine());
		// while 순환을 위해 선언
		boolean flag = true;
		while (flag) {
			switch (menuNo) {
			case 1:
				System.out.println("상품 수 입력> ");
				int count = Integer.parseInt(scn.nextLine());
				pro = new Product[count];
				break;

			case 2:
				for (int i = 0; i < pro.length; i++) {

					pro[i] = new Product();
					//list.add(new Product());
					// pro[i]번째의 객체를 가지고 옴.Product pro = new Product();
					System.out.println("상품 입력> ");
					String name = scn.nextLine();
					pro[i].setName(name);

					System.out.println("상품 가격 입력> ");
					int price = Integer.parseInt(scn.nextLine());
					pro[i].setPrice(i);

					System.out.print("상품 수량 입력>");
					int amount = Integer.parseInt(scn.nextLine());
					pro[i].setAmount(amount);
				}
				break;
			case 3:
				// 배열 타입(Product)으로 만들어진 변수
				//list.get(index);
				for (Product product : pro) {
					System.out.println("상품명: " + product.getName() + "상품가격: " + product.getPrice());

				}
				break;
			case 4:
				// 최고가격을 가진 상품
				// 최고가격을 제외한 상품 가격의 합
				int maxPro = 0;

				// 총합계 구하기 위한 변수
				int sum = 0;
				for (int i = 0; i < pro.length; i++) {
					// 최고가격 및 인덱스 구하기
					if (pro[i].getPrice() > maxPro) {
						maxPro = pro[i].getPrice();
					}
					sum += pro[i].getPrice();
				}
				sum -= maxPro;
				System.out.println("최고 가격을 뺀 상품 가격의 합은: " + sum);

				break;
			case 5:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			}
		}
	}

}
