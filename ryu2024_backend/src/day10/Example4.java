package day10;

import java.util.Scanner;

/*    
자바 과제9 : 회원 서비스 구현하기 
      - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수/메소드/생성자)/객체 , 배열
      - 회원은 최대 100명 까지 저장할수 있다.
      - 회원클래스 와 회원서비스 클래스 정의하시오.
      - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
      		+모든 멤버변수는 private 키워드를 적용한다
      		+멤버변수는 private 이므로 외부 클래스에서 호출시 getter/setter 함수를 활용한다.
      		+회원가입과 로그인시 사용되는 회원정보 객체는 생성자를 활용한다.
      	
      - 회원가입함수 와 로그인함수를 구현하시오.
         회원가입함수 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 객체 생성후 배열에 저장하기.
         로그인함수 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
      - 프로그램 초기 메뉴 : 1.회원가입 2.로그인
         
  제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 */


public class Example4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LoginFun LIF = new LoginFun();
		LogInfoDto[] lid = new LogInfoDto[100];
		
		while (true) {
			System.out.println("1.회원가입 2.로그인 : ");

			int choose = scan.nextInt();

			if (choose == 1) {
				System.out.println("1. 회원가입 > ");
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("PW : ");
				String pw = scan.next();
				System.out.print("NICKNAME : ");
				String nickname = scan.next();
				LogInfoDto LID = new LogInfoDto(id,pw,nickname);
				LIF.logup(lid,LID);
				
				

			} else if (choose == 2) {
				
				LIF.login(lid);

			}
		}
		
	}

}
