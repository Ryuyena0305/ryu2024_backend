package day01;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자료형/타입/분류 : 데이터를 나누는 방법
		/*
		 	-자바 기본 타입
		 	
		 			[키워드]		[용량]	[저장범위]
		 	[논리]	boolean		1바아트 	true 혹은 false
		 	
		 	[문자]	char		2바이트 	유니코드, 작은따옴표로 감싼 문자	, 'A'
		 			String		N바이트 	문자열클래스, 큰따옴표로 감싼 문자열, "ABC"
		 			
		 	[정수]	byte		1바이트	-128 ~ +127 저장
		 			short		2바이트	+-3만정도 저장
		 			int			4바이트	+-21억정도 저장 , 리터럴정수(키보드로 입력한 정수), 정수들 중에 기본타입
		 			long		8바이트	+-21억 저장, 리터럴뒤에 L/l 붙이기
		 	
		 	[실수, 부동소수점]	
		 			float		4바이트	소수점 8자리까지 표현
		 			double		8바이트	소수점 17자리까지 표현
		 			
		 			
		 	**왜? 타입을 여러가지 구분해서 범위맞게 사용하라고 할까?
		 	  메모리를 효율적으로 적절하게 선택하여 사용하자!
		 	
		 */
		
		//1. boolean
		boolean bool1= true; System.out.println("bool1 : "+bool1);//+ 연결연산자, "문자열"+변수호출값
		boolean bool3 = false; System.out.println("bool3 : "+bool3);
		//boolean bool2 = 3; //오류발생 : boolean타입에 3을 저장할 수 없다.
		
		
		//2. char 타입은 작은따옴표로 이용한 문자1개만 저장할 수 있다.
		char ch1 ='A'; 	System.out.println(ch1);
		//char ch2 ='ABC; //오류발생 : 문자1개만 저장 가능하여 오류발생
		//char ch3 = "ABC"; //오류발생 : char는 큰따옴표를 사용할 수 없다.
		
		//3. String 클래스타입은 큰따옴표를 이용한 문자여러개를 저장할 수 있다. *참고로 기본타입은 아니다
		String str1 ="ABC"; System.out.println("str1 : " + str1);
		//String str2 = 'ABC'; //오류발생 : 문자여러개는 큰따옴표로 감싸야한다.
		
		//4. byte 타입은 -128 ~ +127 까지 저장이 가능하다.
		byte b1 = 100; System.out.println("b1 : " + b1);
		//byte b2 = 300; // 오류발생 : 저장허용범위 벗어났기 때문
		
		//5. short 타입은 대략 +-3만정도 저장이 가능하다.
		short s1 =32000; System.out.println("s1 : "+s1);
		//short s2 =40000; // 오류발생 : 타입의 저장허용 범위를 벗어났기 때문
		
		//6. int타입은 대략 +-21억정도 저장이 가능하다.
		int i1 =2100000000; System.out.println("i1 : "+i1);
		//int i2 =3000000000; // 오류발생 : 타입의 저장허용 범위를 벗어났기 때문
		
		//7. long타입은 대략 +-21억 이상 저장이 가능하다. 정수리터럴 값 뒤에 L/l 붙인다.
		long lo1 = 30000000000L; System.out.println("lo1 : "+lo1);
		
		//8. float 타입은 소수점 8자리까지 표현, 실수리터럴 값 뒤에 F/f 붙인다.
		//float f1 =0.1234567891234;// 오류발생 : 실수 리터럴값은 double이므로 float에 대입할 수 없다.
		float f2 = 0.12345689123456789F;System.out.println("f2 : "+f2);
		
		//9. double 타입은 소수점 17자리 까지 표현, 실수리터럴 값의 기본타입
		double d1= 0.123456789123456789; System.out.println("d1 : "+d1);
		
		
	}

}
