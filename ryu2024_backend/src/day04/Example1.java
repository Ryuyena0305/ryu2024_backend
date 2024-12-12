package day04;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//p.102 switch
		/*
		 	-형태
		 	switch(조건){
		 	case 값1:
		 	실행문;
		 			 	}
		 			 	
		 -break : switch 종료, 만일 break 없다면 아래 case의 실행문이 실행된다.
		 */
//		int ranking =1;
//		char medalColor;
//		
//		switch(ranking) {
//		case 1:
//			medalColor ='G';
//			break;
//		case 2: 
//			medalColor = 'S';
//			break;
//		case 3:
//			medalColor = 'B';
//			break;
//		default : 
//			medalColor = 'A';
//		}
//		System.out.println("메달의 색깔은: "+medalColor);
		
		//[2]
//		int month = 10;
//		int day;
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12://month가 1 3 5 7 9 10 12 경우에 아래 코드가 실행된다.
//			day = 31;
//			break; // 아래코드가 실행되지 않고 switch 종료
//		case 4:
//		case 6:
//		case 9 :
//		case 11:
//			day=30;
//			break;
//		case 2:
//			day = 28;
//			break;
//			
//		}
		//[3] p.105 '메달' 문자열에 따른 메시지 출력코드 ,case문에 문자열 사용하기
//		String medal = "Gold";
//		switch(medal) {
//		case "Gold":
//			System.out.println("금메달입니다.");
//		break;
//		case "Silver":
//			System.out.println("은메달입니다.");
//		break;
//		case "Bronze":
//			System.out.println("동메달입니다.");
//		break;
//		default :
//			System.out.println("메달이 없습니다.");
//			break;//생략가능
//			
//		}
		//[4] if는 조건결과ㅑ의 논리(t/f)제어, switch는 조건결과의 값 제어
//		int score = 80;
		//switch(score>=80){ } : 조건문에 논리연산, 비교연산에 따른 논리결과 케이스가 아니다.
//		switch(score) {
//	
//		}
		//[5] p.106 나혼자 코딩
		int towerFloor= scan.nextInt();
		String tower = "약국";
		switch(towerFloor) {
		case 1: 
			tower ="약국";
			break;
		case 2 : 
			tower ="정형외과";
			break;
		case 3 : 
			tower ="피부과";
			break;
		case 4 : 
			tower ="치과";
			break;
		case 5 : 
			tower ="헬스 클럽";
			break;
		default : 
			tower = "없음";
		}
		System.out.println(towerFloor+"층 " +tower+"입니다.");

	}

}
