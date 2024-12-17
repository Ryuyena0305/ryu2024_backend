package day07;
/*
 	 자바 조별과제1 ,
    주제 : 회원 서비스 구현하기 
       - 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
       - 회원은 최대 3명 까지 저장할수 있다.
       - 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
       - 회원클래스를 정의하고 회원객체 활용하여 구현한다.
       - 프로그램 초기 메뉴 : 1.회원가입 2.로그인 : 
          1 선택시 : 아이디,비밀번호,닉네임 3개의 각 정보를 입력받아 저장하기.
          2 선택시 : 아이디,비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인성공' 아니면 '로그인실패' 출력한다.
   
   1. 코드 구현 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
   2. 구현 된 코드에서 문법찾기 : 아래 링크의 각 슬라이드에서 조별 작성 , 카톡방 링크 참고
https://docs.google.com/presentation/d/1k7xc6I3MwnBI57zr1WTGm0mVgzQ5CXkmrEro2PFc9UI/edit?usp=sharing
 */
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Info info1 = new Info();
		Info info2 = new Info();
		Info info3 = new Info();
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 : ");
			
			int choose = scan.nextInt();
			
			if(choose==1) {
				System.out.println(">>회원가입을 선택했습니다.");
				System.out.println(">아이디 : ");
				String id = scan.next(); 
				System.out.println(">비밀번호 : ");
				String pw = scan.next();
				System.out.println(">닉네임 : ");
				String nickname = scan.next();
				
				if (info1.id == null) {
					info1.id = id;info1.pw = pw;info1.nickname = nickname;
				} else if (info2.id == null) {
					info2.id = id;info2.pw = pw;info2.nickname = nickname;
				} else if (info1.id == null) {
					info3.id = id; info3.pw = pw;info3.nickname = nickname;
				}
			
			}else if(choose==2) {
				System.out.println(">>로그인을 선택했습니다.");
				System.out.println(">아이디 : ");
				String checkId = scan.next(); 
				System.out.println(">패스워드 : ");
				String checkPw = scan.next();
			
				
				if( info1.id!=null&&info1.id.equals(checkId) &&info1.pw!=null&&info1.pw.equals(checkPw)){
					System.out.println("로그인 성공");
			
				}else if(info2.id!=null&&info2.id.equals(checkId) &&info2.pw!=null&&info2.pw.equals(checkPw)){
					System.out.println("로그인 성공");
				
				}else if(info3.id!=null&&info3.id.equals(checkId) &&info3.pw!=null&&info3.pw.equals(checkPw)){
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			
			
				
			}
		}
		
		
	
	}

}
