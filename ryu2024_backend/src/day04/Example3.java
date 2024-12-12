package day04;

public class Example3 {

	public static void main(String[] args) {
	//나혼자 코딩
		
		for(int num=1;num<=10;num++) {
			System.out.println("안녕하세요"+num);
		}
		
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
		
		
		
	}

}
