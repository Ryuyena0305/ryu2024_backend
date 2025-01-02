package day17.step2;

//키보드를 인터페이스로 사용하는 이유? 여러 게임(클래스) 들을 조작하기 위해서.
public interface Keyboard {
	//1. 상수 : 수정 불가능한 함수
	public static final String 제조사 = "HP";
	String 제조일 = "2025-01-02";
	
	//2. 추상메소드 : 메소드(함수)를 구현부{} 작성하지 않고 선언만 한다.
	public abstract void fkey();

	void dkey(); //public abstract 생략이 가능하다.
}
