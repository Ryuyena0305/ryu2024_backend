package day12.boardprogram7;

import java.util.Scanner;

/*
자바과제 11 : 회원제 게시판
	- 초기메뉴는 로그인과 회원가입을 제공한다.
	- 로그인 성공하면 게시물등록과 게시물 출력을 제공한다.
		- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
		
		
	1. 시각화 요소 구성 , console 표현하고 싶은 내용물 vs html/css
	2. 메모리(저장)구성 , 클래스 vs 엑셀 표
	3. 함수/기능 구성 , 메소드 vs 함수 구성

*/

public class BoardProgram7 {// class s
	public static void main(String[] args) {// main s
		MemberDto[] members = new MemberDto[100];
		MemberService ms = new MemberService();
		String loginId = null; // 로그인 안했을 때 null저장, 로그인 했으면 아이디 저장, 목적으로 운영할 변수
		BoardDto[] boards =  new BoardDto[100];
		BoardService bs = new BoardService();

		while (true) {
			System.out.println("1. 회원가입 2. 로그인");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if (choose == 1) {
				// 회원가입 함수 호출
				ms.singUp(scan, members);

			} else if (choose == 2) {
				// 로그인 함수 호출
				ms.login(scan, members);
				if (loginId != null) {
					while(true) {
						System.out.println("1. 등록 2. 출력 3. 로그아웃");
						int choose2 = scan.nextInt();
						if (choose2 == 1) {
							bs.boardAdd(scan, boards, loginId);
						}
						if (choose2 == 2) {
							bs.boardPrint(boards);
						}
						if (choose2 == 3) {
							loginId =null;
							break;

						}
					}
				}
				
				

			}
		} // while e
	}// main e

}// class e
