package day04;

public class Example2 {

	public static void main(String[] args) {
		//[1] while 문
		/*
		 	while(조건식){
		 	실행문
		 	}
		 	-조건식이 true이면 { }안에 있는 실행문 실행한다.
		  */
		
		//[1]while문 활용하여 1부터 10까지 더하기
		int num=1; //1. 초기값
		int sum =0;
		while(num<=10) {//2. 조건문
			sum +=num;//3. 증감식
			num++;
		}
		int sum2=0;
		for(int num2=1;num2<=10;num2++) {
			sum2 +=num2;
		}
		System.out.println("[for] 1부터 10까지의 합은"+sum2);
		
		
		
		//[2] while문이 무한히 반복되는 경우
		
//		while(true) {
//		System.out.println(",");
//			
//		}
//		for(;;) {
//			System.out.println(",,");
//		}
		
		//[3] do~while문, 1~10까지 더하는 프로그램
		int num3 = 1;
		int sum3=0;
		do {//먼저실행후
			sum3+=num3;
			num3++;
		}while(num<=10);
		System.out.println("1부터 10까지의 합: "+sum3);
		
		//[4] 구구단 중에 2단만 출력하시오 . while문과 do~while문으로 구현하기
		//1.while문
		int dan=2;
		int gop=1;
		while(gop<10) {
			System.out.println(dan+"*"+gop+"="+dan*gop);
			gop++;
		}
		
		//2.do~while문
		int dan2=2;
		int gop2=1;
		do {
			System.out.println(dan2+"*"+gop2+"="+dan2*gop2);
			gop2++;
		}while(gop2<10);
		//3. for문
		for(int gop3=1;gop3<=9;gop3++) {
		System.out.println(2+"*"+gop3+"="+2*gop3);
		}
		
	}
}
