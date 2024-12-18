package day08;

import java.util.Scanner;

/*
자바 과제7 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 100개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WaitList[] waitArray = new WaitList[100];
		
	
		while(true) {
			System.out.println("1. 저장  2.출력 : ");
			int choose = scan.nextInt();
			if(choose==1) {
				System.out.println("1대기 등록을 선택했습니다.");
				System.out.println(">전화번호 : "); String phoneNum =scan.next();
				System.out.println(">인원수 : "); int people =scan.nextInt();
				
				WaitList waitList = new WaitList();
				
				waitList.phoneNum = phoneNum;
				waitList.people=people;
				
				boolean saveState = false;
				for(int index=0;index<=waitArray.length-1;index++) {
					if(waitArray[index]==null) {
						waitArray[index] = waitList;
						saveState=true;
						break;
					}
				}
				if(saveState ==true) {
					System.out.println(">번호표 등록 성공");
				}else {
					System.out.println(">번호표 등록 실패");
				}
				
			}else if(choose==2) {
				System.out.println("2대기 출력을 선택했습니다.");
				for(int index=0;index<=waitArray.length-1;index++) {
					if(waitArray[index]!=null) {
						System.out.printf("전화번호 : %s, 인원수 : %d",waitArray[index].phoneNum,waitArray[index].people);
					}
				}
				
				
			}
		}

	}

}
