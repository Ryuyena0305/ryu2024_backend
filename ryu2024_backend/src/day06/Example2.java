package day06;

import java.util.Scanner;

/*자바 과제4 : 키오스크 프로그램
 	- 문법 : 변수,입출력함수,연산자 제어문(조건문/반복문)
 	- 제품은 콜라,사이다,환타 인 3개가 존재한다는 가정
 	- 각 제품의 재고는 초기에 10개씩 존재한다.
 	- 각 제품의 가격은 콜라 1000원, 사이다1500원, 환타 2000원 가정한다.
 	- 제품을 선택시 제품 재고 1 차감하고 장바구니에 담는다.
 	- 메뉴 ] 1.콜라 2.사이다 3.환타 4. 결제
 	 	1. 선택시 : 콜라 재고 1 차감하고 장바구니에 담는다.
 	 	2. 선택시 : 사이다 재고 1차감하고 장바구니에 담는다.
 	 	3. 선택시 : 환타 재고 1차감하고 장바구니에 담는다.
 	 	4. 선택시 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다.
 	 		ex) 콜라1개, 사이다2개, 환타 0개 총 금액 : 4000원
 	 	*추가 유효성 검사 : 만일 재고가 부족하면 "재고가 부족합니다."라고 출력하시오.
 */
public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int colaNum = 10;
		int ciderNum = 10;
		int fantaNum = 10;
		int colaCount =0;
		int ciderCount =0;
		int fantaCount =0;
		int colaPrice = 1000;
		int ciderPrice = 1500;
		int fantaPrice = 2000;
		String cart = null;

		while (true) {
			System.out.println(" 장바구니에 담을 재고를 선택하거나 결제하세요 1.콜라 2.사이다 3.환타 4. 결제.");
			int selectNum = scan.nextInt();
		
			if (selectNum == 1) {
				System.out.println("콜라를 선택했습니다.");
				if (colaNum == 0) {
					System.out.println("재고가 부족합니다.");
				} else {
					colaNum = colaNum-1;
					colaCount++;
				}
			} else if (selectNum == 2) {
				System.out.println("사이다를 선택했습니다.");
				if (ciderNum == 0) {
					System.out.println("재고가 부족합니다.");
				} else {
					ciderNum = ciderNum-1;
					ciderCount++;
				}

			} else if (selectNum == 3) {
				System.out.println("환타를 선택했습니다.");
				if (fantaNum == 0) {
					System.out.println("재고가 부족합니다.");
				} else {
					fantaNum = fantaNum-1;
					fantaCount++;

				}

			} else if (selectNum == 4) {
				System.out.println("결제를 선택했습니다.");
				System.out.printf("콜라%d개, 사이다%d개, 환타 %d개 총 금액 : %d원\n", colaCount, ciderCount,fantaCount,colaCount * colaPrice +ciderCount * ciderPrice + fantaCount * fantaPrice);
				colaCount=0;fantaCount=0;ciderCount=0;
				
	
			}

		}
	}

}
