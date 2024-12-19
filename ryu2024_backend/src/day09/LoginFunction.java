package day09;

import java.util.Scanner;

public class LoginFunction {
	Scanner scan = new Scanner(System.in);

	void userInfoAdd(UserInfo[] userInfoArray){
		System.out.println(">>회원가입을 선택했습니다.");
		System.out.println(">아이디 : ");
		String id = scan.next(); 
		System.out.println(">비밀번호 : ");
		String pw = scan.next();
		System.out.println(">닉네임 : ");
		String nickname = scan.next();
		
		UserInfo userInfo = new UserInfo();
		userInfo.id = id;
		userInfo.pw = pw;
		userInfo.nickname= nickname;}

		boolean saveState= false;
		for(int index=0;index<userInfoArray.length-1;index++) {
			if(userInfoArray[index]==null) {
				userInfoArray[index]=userInfo;
				saveState = true;
				break;
			}
		}
		if(saveState) {System.out.println("등록 성공하였습니다.");}	
		else {
			System.out.println("등록 실패하였습니다.");
		}
	}
	void userInfoLogin(UserInfo[] userInfos) {
		System.out.println(">>로그인을 선택했습니다.");
		System.out.println(">아이디 : ");
		String checkId = scan.next(); 
		System.out.println(">패스워드 : ");
		String checkPw = scan.next();
		
		for(int index=0; index<=userInfos.length-1;index++) {
			if( userInfos[index].id!=null&& userInfos[index].id.equals(checkId) && userInfos[index].pw!=null&&userInfos[index].pw.equals(checkPw)){
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}
	
	
	
	}
	
}
