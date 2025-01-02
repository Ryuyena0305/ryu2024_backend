package day14.example.view;

import java.util.Scanner;

import day14.example.controller.MemberController;
import day14.example.model.dto.MemberDto;

public class MemberView {
	private MemberView() { 
	}

	private static MemberView instance = new MemberView();

	public static MemberView getInstance() {
		return instance;
	}

	Scanner scan = new Scanner(System.in);

	public void run() {
		while (true) {
			System.out.println("1. 회원가입 2.로그인");
			int choose = scan.nextInt();
			if (choose == 1) {
				memberAdd();
			} else if (choose == 2) {
				memberLogin();
			}
		} // while e
	}// f e

	public void memberAdd() {
		System.out.println("회원추가");
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw : ");
		String pw = scan.next();
		System.out.println("name : ");
		String name = scan.next();

		MemberDto memberDto = new MemberDto(id, pw, name);

		boolean result = MemberController.getInstance().memberAdd(memberDto);
		if (result) {
			System.out.println("sign up success");
		} else {
			System.out.println("sign up fail");
		}
	}

	public void memberLogin() {
		System.out.println("회원로그인");
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw : ");
		String pw = scan.next();

		boolean result = MemberController.getInstance().memberLogin(id, pw);

		if (result) {
			while (true) {
				System.out.println("login success");
				System.out.println("1.회원정보 2.예약");
				int choose = scan.nextInt();
				if (choose == 1) {
					System.out.println("1.수정 2.삭제");
					int choose1 = scan.nextInt();
					if (choose1 == 1) {
						memberUpadate();
					} else if (choose1 == 2) {
						memberDelete();
						break;
					}
				} else if (choose == 2) {
					WaitingView.getInstance().index();
				}

			}
		} else {
			System.out.println("login fail");
		}

	}

	public void memberUpadate() {
		System.out.println("회원수정");
		System.out.println("name : ");
		String name = scan.next();
		MemberDto memberDto = new MemberDto(name);
		boolean result = MemberController.getInstance().memberUpdate(memberDto);

		if (result) {
			System.out.println("update success");
		} else {
			System.out.println("update fail");
		}

	}

	public void memberDelete() {
		System.out.println("회원삭제");
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw : ");
		String pw = scan.next();
		boolean result = MemberController.getInstance().memberDelete(id, pw);
		

		if (result) {
			System.out.println(" delete success");
		} else {
			System.out.println("delete fail");
		}

	}

}