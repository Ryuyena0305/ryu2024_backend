package day07;

import java.util.Scanner;

/*
자바 과제6 : 키오스크 프로그램 
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
- 제품은 콜라,사이다,환타 인 3개가 존재한다는 가정 한다.
- 각 제품의 재고는 초기에 10개씩 존재한다.
- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원 가정 한다.
- 제품 클래스를 정의한다. 제품객체 활용하여 구현한다.
- 프로그램 초기 메뉴] 1.콜라 2.사이다 3.환타 4.결제
   1 선택시 : 콜라 선택시 콜라 재고 1 차감하고 장바구니에 담는다.
   2 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
   3 선택시 : 환타 선택시 환타 재고 1차감하고 장바구니에 담는다.
   4 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다. 
      ex] 콜라1개 , 사이다2개 , 환타0개 총금액 : 4000원
   * 추가 유효성검사 : 만일 재고가 부족하면 "재고가 부족합니다" 라고 출력하시오.
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product cola = new Product();
		cola.name = "콜라";
		cola.price = 1000;
		cola.stock = 10;
		Product cider = new Product();
		cider.name = "사이다";
		cider.price = 1500;
		cider.stock = 10;
		Product fanta = new Product();
		fanta.name = "환타";
		fanta.price = 2000;
		fanta.stock = 10;
		// +멤버변수는 객체 생성시 초기화를 생략하면 자동으로 기본값이 대입된다.(지역변수 x)
		// 정수 : 0, 실수 : 0.0,논리 : false, 클래스타입 : null
		// Product 객체 생성시 cart 멤버변수에는 자동으로 0이 대입된다.

		while (true) {
			System.out.println(" 장바구니에 담을 재고를 선택하거나 결제하세요 \n1.콜라 2.사이다 3.환타 4. 결제 : ");
			int selectNum = scan.nextInt();

			if (selectNum == 1) {
				System.out.println("콜라를 선택했습니다.");
				if (cola.stock == 0) {
					System.out.println("재고가 부족합니다.");
				} else {
					cola.stock--;
					cola.cart++;

				}
			}
			if (selectNum == 2) {
				System.out.println("사이다를 선택했습니다.");
				if (cider.stock == 0) {
					System.out.println("재고가 부족합니다.");
				} else {
					cider.stock--;
					cider.cart++;
				}
			}
			if (selectNum == 3) {
				System.out.println("환타를 선택했습니다.");

				if (fanta.stock == 0) {
					System.out.println("재고가 부족합니다.");
				} else {
					fanta.stock--;
					fanta.cart++;
				}
			}
			if (selectNum == 4) {
				System.out.println("결제를 선택했습니다.");
				System.out.printf("콜라%d개, 사이다%d개, 환타 %d개 총 금액 : %d원\n", cola.cart, cider.cart, fanta.cart,
						cola.cart * cola.price + cider.cart * cider.price + fanta.cart * fanta.price);
				cola.cart = 0;
				fanta.cart = 0;
				cider.cart = 0;

			}

		}
	}
}
