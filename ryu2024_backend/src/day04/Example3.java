package day04;

public class Example3 {

	public static void main(String[] args) {
		
	// p.113 1분복습 : 1. int num = 1; 2. num<=10; 3. num++
		
		// [1] for , 1부터 10까지 더하는 과정 
			// 1. 
		int sum = 0;
		sum += 1; sum += 2 ;sum += 3; sum += 4; sum += 5;
		sum += 6; sum += 7 ;sum += 8; sum += 9; sum += 10;
			// - 반복되는코드 : sum += 
			// - 반복되지않는 코드 : int sum = 0; , 1 2 3 4 5 6 7 8 9 10
				// - 패턴/규칙 : 1부터 10까지 1씩증가 규칙 
			// 2. 
		int sum2 = 0;
		for( int i = 1 ; i <= 10 ; i++ ) { // i는 1부터 10까지 1씩 증가 반복한다.
			sum2 += i;
		} // for end 
		System.out.println("1부터 10까지 합 : " + sum2 );
		
		
	//나혼자 코딩
		
		for(int num=1;num<=10;num++) {
			System.out.println("안녕하세요"+num);
		}
		
		// [3] 구구단 , for중첩 , 단마다 곱 계산( 단for 안에 곱for 포함 )
		for(int i = 2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//[4]1분복습
		for(int i = 3;i<=7;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//[5] continue문, 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
		//1~100까지의 홀수값들의 누적합계
		int total = 0;
		for(int num=1;num<=100;num++) {
			if(num%2==0) {
				//만약에 현재 반복되고 있는 num변수값이 나누기 2했을 때 0이면 [짝수]
				continue;
			}
			total +=num;
		}
		System.out.println("1부터10까지 홀수의 합 : "+total);
		
		//[7] break, 가장 가까운 for/switch문 {}을 탈출/종료한다.
		int sum3=0;
		for(int num=0;;num++) {
			sum3+=num;
			if(sum3>=100) {
				break;
			}
		}
		
		//[1연습문제 p.123]
		int num1=10;
		int num2 =2;
		char operator ='+';
//		if(operator=='+') {
//			System.out.println(num1+"+"+num2+"="+(num1+num2));
//		}else if(operator=='-') {
//			System.out.println(num1+"-"+num2+"="+(num1-num2));
//		}else if(operator=='*') {
//			System.out.println(num1+"*"+num2+"="+(num1*num2));
//		}else if(operator=='/') {
//			System.out.println(num1+"/"+num2+"="+(num1/num2));
//		}
		//[1]
		//switch문에서 논리(t/f)연산 제어가 아닌 데이터 비교 검사(==)제어
		switch(operator) {
		case '+': System.out.println(num1+"+"+num2+"="+(num1+num2));
		break;
		case '-':System.out.println(num1+"-"+num2+"="+(num1-num2));
		break;
	
		case '*':System.out.println(num1+"*"+num2+"="+(num1*num2));
		break;
		case '/':System.out.println(num1+"/"+num2+"="+(num1/num2));
		break;
		}
		
		//[2]구구단을 짝수 단만 출력하는 코드 구현
		for(int i = 2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i%2==1) {continue;}//만약 단이 홀수이면 continue;
				System.out.println(i+"*"+j+"="+i*j);
				
			}
			System.out.println();
		}
		
		
		//[3]단보다 곱하는 수가 작거나 같은 경우
		for(int i = 2;i<=9;i++) {
		
			for(int j=1;j<=9;j++) {
				if(i<j) {
				break;
					}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		
		
		//[4]
		/*
		 			*
		 		   ***
		 		  *****
		 		 *******
		 */
		
		for(int i=1;i<=4;i++) {
			for(int j =1;j<=12;j++) {
				if(j%2==0)
				System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		//[5]
		
		
		
		
		
		
	}

}
