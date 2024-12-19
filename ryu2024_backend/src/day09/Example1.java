package day09;
/*
자바 과제8 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체, 배열, 메소드
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 100개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Example1function ef = new Example1function();
		WaitList[] waitArray = new WaitList[100];
		while(true)
		{// w s

			System.out.println("1. 저장  2.출력 : ");
			int choose = scan.nextInt();

			if (choose == 1) {
				ef.watingAdd(scan, waitArray);
			} // if e
			else if (choose == 2) {
				ef.watingPrint(waitArray);
			} // else if e
		}// w e
		
	}// m e
	

}// c e
