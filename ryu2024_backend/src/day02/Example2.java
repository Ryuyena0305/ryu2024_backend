package day02; //패키지/폴더명

public class Example2 {//클래스 시작

	public static void main(String[] args) { //main시작
		
		//1. 자동 (자료/타입)형 변환, 묵시적(자료/타입)형 변환
			//- 1. 메모리 크기가 작은 것부터 큰 순으로 변환
			//- 2. 데이터의 손실이 없다.
			//- 3. 연산(계산) 중에 큰 값으로 변환된다.
			//byte -> short, char -> int -> long -> float -> double
		
		byte byteValue = 10;			//byte타입 'byteValue'변수에 10대입
		short shortValue=byteValue;		//short타입 'shortValue'변수에 byte 10을 대입
		int intValue = shortValue;		//int타입 'intValue'변수에 short 10을 대입
		long longValue = intValue;		//long타입 'longValue'변수에 int 10을 대입
		float floatValue = longValue;	//float타입 'floatValue'변수에 long 10을 대입
		double doubleValue = floatValue;//double타입 'doubleValue'변수에 float 10을 대입
		
		System.out.println("floatValue : "+floatValue); //byte에서 double까지 자동형변환
		//+ 연산중에 묵시적 형변환

		//byte + byte => int	, byte와 short 연산 결과는 무조건 int로 반환
		//byte + short => int	,
		//int  + int => int
		//int + long => long
		byte b1 = 10; byte b2 = 20; short s1 =30;int i1 = 40;
		float f1 =3.14f; double d1 =41.25;
		int res1 =b1+b2;
		int res2 = b1 +s1;
		float res3 = i1 +f1;
		double res4 = f1 +d1;
		
		//2. 강제(자료/타입)형 변환, 명시적(자료/타입)형 변환, 캐스팅
			//- 1. 메모리 코기가 큰값부터 작은 순으로 변환
			//- 2. 데이터의 (허용범위 외)손실이 있을 수도 있다.
			//- 3. (변환할타입명)변수명
			// double -> float -> long ->  int ->  short, char -> byte
		double value1 = 3.14;
		float value2 = (float)value1;
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		
		System.out.println("byte value : "+value6); //3.14 ->3
		
		//+++ 자바특징중에 다형성(다양한 형식/타입을 가지는 성질)은 형변환으로부터 표현할 수 있다.
		
		//p.67
		char ch1 ='A';
		int int1 = ch1;
		System.out.println(int1);
		System.out.println((int)ch1);
		int ch2 = 67;
		System.out.println((char)ch2);
		
		//+연산중에 강제 타입변환
		int res5 = (int)381.01+3;
		
		
		//문제풀이
		//1.예
		//2.아니요
		//3.부동소수점
		//4.
		int num1 = 10;
		double num2 = 2.0;
		double res = num1 + num2;
		System.out.println("res : "+res);
		
		//5. 
		char 문자1 ='글';
		int 문자정수 = 문자1;
		System.out.println("글 정수 : " +문자정수);	
		System.out.println("글 정수 : " +(char)문자정수+1);
		// JAVA를 정수로 표현하면 , 74 65 86 65
		System.out.println((char)74+""+ (char)65+""+ (char)86+""+ (char)65);

		
	}//main 끝

}//클래스 끝
