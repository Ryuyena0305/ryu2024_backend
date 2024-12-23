package day11;

import java.util.Scanner;

import day11.LogInfoDto;

/*
	자바과제 11 : 회원제 게시판
		- 초기메뉴는 로그인과 회원가입을 제공한다.
		- 로그인 성공하면 게시물등록과 게시물 출력을 제공한다.
			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
	
*/
public class Example1 { //class s
	
	public static void main(String[] args) { //main s
		
		LogInfoDto []loginfos = new LogInfoDto[100];
		LoginFun lf = new LoginFun();
		BoardDto2[]  boards = new BoardDto2[100];
		BoardService2 bs = new BoardService2();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 : ");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				lf.logUp(scan, loginfos);
				
			}else if(choose==2) {
				lf.logIn(scan, loginfos);
				if(lf.loginState==true) {
					while(true) {//while s
						System.out.print("1.등록 2.출력");
						int choose2 = scan.nextInt();
						if(choose2 == 1) {
							bs.boardAdd(scan,boards,lf);
							//등록함수 호출
						}else if(choose2==2){
							bs.boardPrint(boards);
							//출력함수 호출
						}
						

					}//while e
					
				}
				else {break;}
				
			}

			
			
			
		}
		
	}

}
