package day12.boardprogram7;

import java.util.Scanner;

public class MemberService {
	// 1.멤버변수 //2.생성자
	// 3.메소드
	public void singUp(Scanner scan, MemberDto[] members) {
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw : ");
		String pw = scan.next();
		System.out.println("name : ");
		String name = scan.next();
		MemberDto memberDto = new MemberDto(id, pw, name);

		// *객체화 , 생성자 이용한 빠른 객체 생성
		// *반복활용한 회원목록에서 빈공간 찾기
		for (int index = 0; index <= members.length - 1; index++) {
			if (members[index] == null) {
				members[index] = memberDto;
				System.out.println("회원가입 성공");
				return;
			}
		}

	}// f e

	public String login(Scanner scan, MemberDto[] members) {
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw : ");
		String pw = scan.next();
		// *기존 회원목록에서 방그므 입력받은 값과 비교하여 동일값 찾기
		for (int index = 0; index <= members.length - 1; index++) {
			MemberDto memberDto = members[index];
			System.out.println(memberDto);
			if (memberDto != null) {
				if (memberDto.getId().equals(id) && memberDto.getPw().equals(pw)) {
					System.out.println("로그인 성공");
					return memberDto.getId();
				} // if e
			} // if e
		} // for e
		System.out.println("로그인 실패");
		return null;

	}// f e

}// class e
