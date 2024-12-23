package day11;

import java.util.Scanner;


/*
실습5 : 게시판 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) ,클래스/객체(매개변수/메소드/생성자),배열
	- 제목 , 내용 , 작성자 를 입력받아서 *저장함수*와*출력함수*구현하기
	- 게시물 클래스 설계 하기.
		+모든 멤버변수는 private 키워드를 적용한다
      		+멤버변수는 private 이므로 외부 클래스에서 호출시 getter/setter 함수를 활용한다.
      		+회원가입과 로그인시 사용되는 회원정보 객체는 생성자를 활용한다.
      	
	- 게시물 최대 100개 저장하기, 게시물 1개당 객체 1개 필요, 객체 1개당 3개의 멤버변수를 갖는다.
	*/

//main 함수 갖는 프로그램 실행 클래스
public class BoardProgram6 { //class s

	public static void main(String[] args) { //main start
		
		BoardDto[]  boards = new BoardDto[100];
		BoardService bs = new BoardService();
		Scanner scan = new Scanner(System.in); //Scanner쓰는 위치
		
		while(true) {//while s
			System.out.print("1.등록 2.출력");
			int choose = scan.nextInt();
			if(choose == 1) {
				bs.boardAdd(scan,boards);
				//등록함수 호출
			}else if(choose==2){
				bs.boardPrint(boards);
				//출력함수 호출
			}

			
			
		}//while e
		

	}//main e

}//class e
