package day06;
/*
 	자바 과제3 : 식당 대기번호 발행
 	 - 문법 : 변수,입출력함수,연산자 제어문(조건문/반복문)
 	 - 전화번호, 인원수 를 입력받아서 저장.출력 구현
 	 - 총 대기명단은 3개까지 가능하다. 대기명단 1개당 전화번호.인원수 저장수(변수) 2개필요, 대기명단3 -> 변수 6개 필요
*/

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String 전화번호1 =null; int 인원수1=0;
		String 전화번호2 =null; int 인원수2=0;
		String 전화번호3 =null; int 인원수3=0;
		
		while (true) {
			System.out.println("==대기번호 발행 프로그램==");
			System.out.println("1.저장 2.출력 : ");

			Scanner scan = new Scanner(System.in);

			int 선택메뉴 = scan.nextInt();
			if (선택메뉴 == 1) {
				System.out.println(">전화번호 : ");
				String phoneNum = scan.next();

				System.out.println(">인원수 : ");
				int totalPeople = scan.nextInt();
				if (전화번호1 == null) {
					전화번호1 = phoneNum;
					인원수1 = totalPeople;
				} // - while 밖 변수에 입력받은 3개의 문자열를 각각 저장.
				else if (전화번호2 == null) {
					전화번호2 = phoneNum;
					인원수2 = totalPeople;
				} else if (전화번호3 == null) {
					전화번호3 = phoneNum;
					인원수3 = totalPeople;
				} // 두번째 게시물이 비어 있으면
				else {
					System.out.println("**대기명단이 꽉 찼습니다. **");
				}
			} else if (선택메뉴 == 2) {
					System.out.println("==대기명단 현황==");
					if( 전화번호1 != null ) { System.out.println("> 전화번호 : " +전화번호1 +" > 인원수 : " + 인원수1  ); }
					if( 전화번호2 != null ) { System.out.println("> 전화번호 : " + 전화번호2 +" > 인원수 : " + 인원수2 ); }
					if( 전화번호3 != null ) { System.out.println("> 전화번호 : " + 전화번호3 +" > 인원수 : " + 인원수3  ); }

			}
		}
	}
}
