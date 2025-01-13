package day24;

public class StringExample {
	public static void main(String[] args) {
		//[1] 변수 : 2개 , 자료 : 1개, 
			//리터럴 : 키보드로부터 입력받은 자료,상수(이미 저장된 값)
		int a = 3;
		int b = 3;
		System.out.println(a==b);
		//즉) 서로 다른 두 변수는 같은 자료를 참조한다.
		
		//[2] 변수 : 2개, 자료 : 1개
		int c = 5;
		int d = c;
		System.out.println(c==d);
		//즉) c가 참조하는 5를 d에 대입했다. 그러므로 c 와 d는 같은 자료를 참조한다.
		
		//[3] 변수 : 2개, 자료 : 2개 (3, new Integer(3)->인스턴스)
		Integer value1 =3;
		Integer value2 = new Integer(3);//취소선 : 권장하지 않음 //순수한 자료의 리터럴이 저장된 타입
		System.out.println(value1==value2); //false 리터럴비교
		System.out.println(value1.equals(value2));//true 인스턴스안에 값 비교
		
		
	}// m e
}// c e
