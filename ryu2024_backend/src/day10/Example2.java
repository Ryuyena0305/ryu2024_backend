package day10;

public class Example2 {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		//오류 발생 멤버변수가 private이므로 외부 클래스로 접근 불가능
//		date.month = 2;
//		date.setDay= 31;
//		date.year = 2018;
		date.setDay(31);
		date.setDay(25);
		
		//주로 : 1. 저장할 데이터의 유효성검사 할 때 주로 사용된다. 2. 모든 멤버변수는 private 사용
	}

}
