package day08;

public class Example2 {

		public static void main(String[] args) {
			//[1] 함수 호출하고 값 반환하기
			int num1=10;
			int num2=20;
			
			int sum=add(num1,num2);
			
			System.out.println(num1+"+"+num2 +"="+sum+"입니다");
			
		}
		

		//(1) 함수 정의하기
		public static int add(int n1,int n2) {
			int result = n1+n2;
			return result;
			
		}
}
