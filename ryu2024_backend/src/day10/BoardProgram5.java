package day10;

import java.util.Scanner;

/*
실습5 : 게시판 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) ,클래스/객체(매개변수/메소드/생성자),배열
	- 제목 , 내용 , 작성자 를 입력받아서 *저장함수*와*출력함수*구현하기
	- 게시물 클래스 설계 하기.
	- 게시물 최대 100개 저장하기, 게시물 1개당 객체 1개 필요, 객체 1개당 3개의 멤버변수를 갖는다.
	*/
public class BoardProgram5 {
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		BoardService bs = new BoardService();
		while(true) {
			System.out.print("1.등록 2. 출력 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose ==1) {
				bs.boardAdd(scan, boards);
				
			}else if(choose ==2) {
				bs.boardPrint(boards);
				
			}
		}
	}

}
