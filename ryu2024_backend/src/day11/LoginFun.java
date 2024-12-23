package day11;

import java.util.Scanner;

public class LoginFun {

	public void logUp(Scanner scan, LogInfoDto[] logInfos) {
		System.out.println("1. 회원가입 > ");
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw : ");
		String pw = scan.next();
		System.out.println("nickname : ");
		String nickname = scan.next();
		// *생성자를 이용한 객체 생성
		LogInfoDto logInfoDto = new LogInfoDto(id, pw, nickname);
		// *배열에 저장
		boolean saveState = false;
		for (int index = 0; index <= logInfos.length - 1; index++) {
			if (logInfos[index] == null) {
				logInfos[index] = logInfoDto;
				saveState = true;
				break;
			}
		}
			if (saveState) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		

	}

	
	boolean loginState;
	String trans_id;

	public void logIn(Scanner scan, LogInfoDto[] logInfos) {
		System.out.println("2. 로그인 > ");
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		for (int index = 0; index <= logInfos.length - 1; index++) {
			if (logInfos[index] != null && logInfos[index].getId().equals(id) && logInfos[index].getPw().equals(pw)) {
				
				System.out.println("로그인성공");
				trans_id = logInfos[index].getId();
				loginState = true;
				
				break;
			} else {
				System.out.println("로그인실패");
				loginState = false;
				break;

			}

		}

	}
}
