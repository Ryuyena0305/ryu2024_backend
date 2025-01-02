package day17.step2;

//키보드 인터페이스를 사냥게임 클래스가 구현한다.
//키보드의 구체적인 기능을 구현한다.
public class Lolgame implements Keyboard{
	//class 클래스명 implements 인터페이스명
	//추상메소드 구현 , 오버라이딩
	@Override
	public void fkey() {
		System.out.println("점멸");
	}
	@Override
	public void dkey() {
		System.out.println("총명");
	}
}
