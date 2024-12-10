package day02;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
//		//[지문1] next() 점수로 국어,영어,수학 점수를 각 입력받아서 각 변수에 저장하고 총점과 평균을 계산하여 콘솔에 출력하시오.
	Scanner scan = new Scanner(System.in);
//		System.out.println("[1]국어 점수 : ");
//		int kor = scan.nextInt();
//		System.out.println("[1]영어 점수 : ");
//		int eng = scan.nextInt();
//		System.out.println("[1]수학 점수 : ");
//		int math = scan.nextInt();
//		
//		int sum1 = kor + eng + math;
//		double res1 = (double)sum1/3.0;
//		System.out.println("[1]총합 : "+ sum1+"평균 : " + res1);
//		
//		//[지문2] 반지름을 입력받아서 원넓이 [r*r*3.14] 계산하여 출력하시오.
//		final double PI = 3.14;
//		System.out.println("[2]반지름 : ");
//		double rad1 = scan.nextDouble();
//		
//		double res2 = rad1*rad1*PI;
//		System.out.println("[2]원의 넓이 : "+res2);
//		
//		// [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
//		
//				System.out.println("[3]실수1 : ");
//				double num1 = scan.nextDouble();
//				System.out.println("[3]실수2 : ");
//				double num2 = scan.nextDouble();
//				double res3 = num2/num1*100;
//				System.out.println("[3] 값의 비율 : "+res3 +"%");
//				
//		// [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
//				
//				System.out.println("[4]정수 : ");
//				int num3 = scan.nextInt();
//				boolean res4 = num3%2==0?false : true;
//				System.out.println("[4]결과 :" + res4);
//
//				
//		// [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
//				
//				System.out.println("[5]정수 : ");
//				int num4 = scan.nextInt();
//				boolean res5 = (num4%7==0)?true:false;
//				System.out.println("[5]결과 :" + res5);
//				
//		// [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
//				
//				System.out.println("[6]정수 : ");
//				int num5 = scan.nextInt();
//				boolean res6 = (num5%2==1&&num5%7==0)?true:false;
//				System.out.println("[6]결과 :" + res6);
//				
		//[지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
		          // -> 입력 예] 356789 입력시 , 출력 예] 십만원:3장 만원:5장 천원6장
				
//				System.out.println("[7]금액 : ");
//				int num6 = scan.nextInt();
//				int res7_1 = num6/100000;
//				int res7_2 = (num6%100000)/10000;
//				int res7_3 = (num6%10000)/1000;
//				System.out.printf(" [7]십만원: %d장 만원 : %d장 천원 : %d장",res7_1,res7_2,re_3);
//				
		// [지문8] 1차점수 와 2차점수 각각 입력받아서 
		// -> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오.
				
				System.out.println("[8]1차 점수 : ");
				int num7 = scan.nextInt();
				System.out.println("[8]2차 점수 : ");
				int num8 = scan.nextInt();
				int sum2 = num7+num8;
				System.out.println(sum2>=150?"합격":"불합격");
				
				
	}

}
