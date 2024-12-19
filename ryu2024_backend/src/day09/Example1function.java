package day09;

import java.util.Scanner;

public class Example1function {

	
	void watingAdd(Scanner scan,WaitList[] waitArray){
		System.out.println("1대기 등록을 선택했습니다.");
		System.out.println(">전화번호 : "); String phoneNum =scan.next();
		System.out.println(">인원수 : "); int people =scan.nextInt();
		
		WaitList waitList = new WaitList();
		
		waitList.phoneNum=phoneNum;
		waitList.people = people;
		
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
		
	}
	void watingPrint(WaitList[] waitArray) {
		System.out.println("2 대기출력을 선택했습니다.");
		for(int index=0;index<=waitArray.length-1;index++) {
			if(waitArray[index]!=null) {
				System.out.printf("전화번호 : %s, 인원수 : %d\n",waitArray[index].phoneNum,waitArray[index].people);
			}
		}
		
	}
}
