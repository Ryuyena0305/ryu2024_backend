package day07;

import java.util.Scanner;

/*
자바 과제5 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 3개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

public class Example1 {

	public static void main(String[] args) {
		WaitList waitList1 = new WaitList();
		WaitList waitList2 = new WaitList();
		WaitList waitList3 = new WaitList();
		while (true) {
		System.out.println("1. 대기 등록 2. 대기출력");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if(choose ==1) {
			System.out.println("1대기 등록을 선택했습니다.");
			System.out.println(">전화번호 : "); String phoneNum =scan.next();
			System.out.println(">인원수 : "); int people =scan.nextInt();
			if(waitList1.phoneNum==null) {
				waitList1.phoneNum = phoneNum; waitList1.people = people;
			}else if(waitList2.phoneNum==null) {
				waitList2.phoneNum = phoneNum; waitList2.people = people;
			}else if(waitList3.phoneNum==null) {
				waitList3.phoneNum = phoneNum; waitList3.people = people;
			}else {
				System.out.println("**대기명단이 꽉 찼습니다. **");
			}
		}else if (choose == 2) {
				System.out.println(">>출력선택했습니다.");
				if (waitList1.phoneNum != null) {
					System.out.println( "전화번호 : " + waitList1.phoneNum + " 대기인원 : " + waitList1.people );
				}
				if (waitList2.phoneNum != null) {
					System.out.println("전화번호 : " +  waitList2.phoneNum + " 대기인원 : "  + waitList1.people );
				}
				if (waitList3.phoneNum != null) {
					System.out.println("전화번호 : " +  waitList3.phoneNum + " 대기인원 : "  +waitList1.people );
				}
		}
		}
	}

}
