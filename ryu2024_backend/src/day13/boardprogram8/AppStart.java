package day13.boardprogram8;

import day13.boardprogram8.view.BoardView;

public class AppStart { //c s
	public static void main(String[] args) {// main s
		
		//+ 싱글톤의 메소드 호출
		BoardView.getInstance().index();
		//new BoardView().index();
	}//main e

}//c e
