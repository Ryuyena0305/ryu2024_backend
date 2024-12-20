package day10;

import java.util.Scanner;

public class LoginFun {
	Scanner scan = new Scanner(System.in);
	

	void logup(LogInfoDto[] lid,LogInfoDto LID) {
		System.out.println("회원가입 완료");
		for (int index = 0; index <= lid.length - 1; index++) {
			if (lid[index] == null) {
				lid[index] = LID;
				System.out.println(lid[index].getId());
				System.out.println(lid[index].getPw());
				System.out.println(lid[index].getNickname());
				break;
			}
		}

	}

	void login(LogInfoDto[] lid) {
		System.out.println("2. login > ");
		System.out.print("ID : ");
		String id=scan.next();
		System.out.print("PW : ");
		String pw =scan.next();
		for (int index = 0; index <= lid.length - 1; index++) {
			if(lid[index]!=null&&lid[index].getId().equals(id)&&lid[index].getPw().equals(pw)) {
				System.out.println("로그인성공");
				break;
			}else {
				System.out.println("로그인실패");
			
			}

		}

	}
}
