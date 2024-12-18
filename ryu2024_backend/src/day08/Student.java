package day08;

public class Student {//객체를 만들기위한 설계 클래스, 클래스는 설계 기반으로 실질적이니 메모리는 존재하지 않는다.
	//*클래스의 구성멤버 : 멤버변수 , 멤버함수(메소드), 생성자

	//1.멤버변수 // 객체가 가질수 있는 고유한 성질/특성/값 *상태
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	//2. 메소드(멤버함수) // 객체가 행위할 수 있는 명령어 집합/묶음 *행위
		// - 메소드 정의/만들기 : String : 반환타입, getStudentName : 함수명 , () : 매개변수생략, {}:실행코드, return : 함수 종료및 반환값
	public String getStudentName() {

		return studentName;
	}
	
	//메소드 정의/만들기 : void : 반환값이 없다 / 매개변수 1개
	public void setStudentName(String name) {
		studentName = name;
	}
}
