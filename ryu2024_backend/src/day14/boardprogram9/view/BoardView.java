package day14.boardprogram9.view;

import java.util.Scanner;

public class BoardView {
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstance(){ return instance;} // 싱글톤
	
	//입력객체 (현재 클래스 내부의 모든 함수들에서 사용하기 위해 멤버변수에 선언)
	Scanner scan = new Scanner(System.in);
	
	//1. 메인페이지 표현 함수
	public void run() {
		while(true) {
			System.out.println("1.C 2.R 3.U 4.D : ");
			int choose = scan.nextInt();
			
			if(choose==1) {
				create();
			}else if(choose==2) {
				readAll();
			}else if(choose==3) {
				update();
			}else if(choose==4) {
				delete();
			}
		}//while e
	}//f e
	
	//2. 게시물 쓰기 페이지 함수
	public void create() {
		System.out.println("C");
	}
	
	//3. 게시물 출력 페이지 함수
	public void readAll() {
		System.out.println("R");
	}
	
	//4. 게시물 수정 페이지 함수
	public void update() {
		System.out.println("U");
	}
	
	//5. 게시물 삭제 페이지 함수
	public void delete() {
		System.out.println("D");
	}
	
}//class end
