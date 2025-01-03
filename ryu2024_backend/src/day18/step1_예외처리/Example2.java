package day18.step1_예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		// [1] 실행예외 : 프로그램 실행 도중에 발생하는 예외, 예측
		try {
			String str1 = "강호동";
			System.out.println(str1.length());
			String str2 = null;
			System.out.println(str2.length()); // 예외발생 : NullPointerException
		} catch (NullPointerException e) {
			System.out.println("인스턴스가 존재하지 않습니다." + e);
		}
		
		//[2] 실행예외
			//Integer.parseInt(문자열) : 문자열 타입을 정수타입으로 변환 함수
			//NumberFormatException
		try {
		String str3 = "100";
		String str4 = "1aa";
		int value1 = Integer.parseInt(str3); //"100" --> 100 ok
		int value2 = Integer.parseInt(str4); //"1aa" --> ?? fail
		}catch(NumberFormatException e) {
			System.out.println("int타입으로 변환이 불가능합니다."+e);
		}
		
		//[3] 실행예외
			//ArrayIndexOutOfBoundsExcoption
		try {	int [] intArray = {1,2,3};
		System.out.println(intArray[0]);//0번 인덱스 요소 호출
		System.out.println(intArray[3]);//3번 인덱스 요소 호출 // ArrayIndexOutOfBoundsExcoption
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스 입니다."+e);
		}
		
		//[4] 실행예외
			//InputMismatchException
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int value3 = scan.nextInt();//만약에 int타입 허용할 수 없는 입력이면 예외 발생 //InputMismatchException
		}catch(InputMismatchException e) {
			System.out.println("입력값의 타입이 일치하지 않습니다."+e);
			
		}
		
		//[5] 다중 try ~ catch ~ catch
		try {
			Integer.parseInt("1aa");
			
			int [] intArray = {1,2,3};
			System.out.println(intArray[3]);
			
			String str = null;
			System.out.println(str.length());
		}catch (NumberFormatException e1) {
			System.out.println(e1);
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}catch (NullPointerException e3) {
			System.out.println(e3);
		}catch (Exception e) { // -> 슈퍼클래스
			System.out.println(e); //만약에 다중 catch에서 부모클래스인 Exception 사용할 경우는 마지막에 catch에서 사용
		}finally {System.out.println("예외여부 상관없이 무조건 실행코드");}// 주로 안전하게 메모리 초기화, 연결 종료

	}
}
