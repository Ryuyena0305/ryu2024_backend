package day03;

public class Example1 { //클래스 시작
	//자바는 번역(컴파일)단위를 클래스 단위로 함으로써 모든 코드는 클래스안에 존재해야한다.

	public static void main(String[] args) { //main start
		//번역된(.class)코드가 실행하기 위해서는  main함수 안에 있어야 실행된다.
		
		//연산자
		//[1]대입연산자, 왼쪽 변수 = 오른쪽 (또는 식), 오른쪽 항 먼저 확인/계산
		int age =24; //나이를 의미하는 age변수에 값 24를 대입함.
		
		int mathScore = 10;
		int engScore = 20;
		//수학점수와 영어점수 값을 더해서 총점을 의미하는 변수에 대입한다. 
		int totalScore = mathScore + engScore;
		
		//[2]부호연산자, +양수, -음수
		int num = 10;
		System.out.println(+num); // +10 --> 10
		System.out.println(-num); // -10 --> -10 // 부호붙여서 출력했지만 수정은 아니다.
		System.out.println(num);//10 --> 10
		
		num = -num;
		//변수선언 : 타입 변수명=값; 
		//변수호출 : 변수명
		//변수값 수정 : 변수명 = 새로운값
		System.out.println(num);
		
		//[3]산술연산자, +덧셈 -뺄셈 *곱셈 /나누기 %나머지
		System.out.println(5/3);//1.xxxx->1(몫) 							*int/int ->int
		System.out.println(5.0/3.0);//1.666666667 -> 나누기 결과			*double/double -> doduble
		System.out.println((int)(5.0/3.0));//1.66666667 ->강제타입 ->정수
		
		int math = 90; int eng = 70; 
		int total = math + eng;//총점구하기
		System.out.println(total);//총점변수의 값 출력한다.
		
		double avg = total /2.0;//평균구하기
		System.out.println(avg);//평균변수의 값 출력한다.
		
		//[1분복습]
		int mathScore2 = 10;
		int engScore2 = 20;
		int korScore2 = 30;
		//수학점수와 영어점수 값을 더해서 총점을 의미하는 변수에 대입한다. 
		int totalScore2 = korScore2+mathScore2 + engScore2;
		double avgScore2 = totalScore2 /3.0;
		System.out.println(avgScore2);
	}

}
