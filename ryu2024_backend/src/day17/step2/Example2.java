package day17.step2;

public class Example2 {

	public static void main(String[] args) {
		//(1) 인터페이스 타입의 변수 생성, 키보드 변수 선언
		Keyboard myKeyBoard;
		
		//(2) 구현체 : 인터페이스의 추상메소드를 구현한 객체
			// 1. 롤게임 해야지
			// 2. 키보드에 롤게임 연결
		myKeyBoard = new Lolgame();
		myKeyBoard.fkey(); //점멸
		myKeyBoard.dkey(); //총명
			//1. 게임 바꿔야지 (타입변환)
		myKeyBoard = new Lolchessgame();
		myKeyBoard.fkey();//리롤
		myKeyBoard.dkey();//레벨업
		
		//(3) 생각해보기 : 키보드 타입이 없어도 게임타입으로 실행이 가능하다.
		Lolgame 게임1 = new Lolgame();
		게임1.fkey();//점멸
		게임1.dkey();//총명
		//게임1 = new Lolchessgame();//오류 : 롤 인스턴스는 롤체게임의 타입을 모른다.

	}

}
