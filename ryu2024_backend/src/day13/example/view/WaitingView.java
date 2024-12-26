package day13.example.view;

import java.util.Scanner;

import day13.example.controller.WaitingController;
import day13.example.model.dto.WaitingDto;

public class WaitingView {
	
	private WaitingView() {
		
	}
	
	private static WaitingView instance = new WaitingView();
	public static WaitingView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	
	public void index() {
		while(true) {
			System.out.println("1. 저장  2.출력 : ");
		int choose = scan.nextInt();
		if(choose ==1) {
			waitingAdd();
		}
		else if(choose==2) {
			waitingPrint();
		}
		}//while e
	} //f e
	
	public void waitingAdd() {
		System.out.println("1대기 등록을 선택했습니다.");
		System.out.println(">전화번호 : "); String phoneNum =scan.next();
		System.out.println(">인원수 : "); int people =scan.nextInt();
		
		WaitingDto waitingDto = new WaitingDto(phoneNum,people);
		
		boolean result = WaitingController.getInstance().waitingAdd(waitingDto);
		
		if(result == true) {
			System.out.println("대기 등록 성공");
		}else {
			System.out.println("대기 등록 실패");
		}
	}
	public void waitingPrint() {
		System.out.println("2 대기출력을 선택했습니다.");
		
		WaitingDto[]result = WaitingController.getInstance().waitingPrint();
		for(int index=0;index<=result.length-1;index++) {
			WaitingDto waiting = result[index];
			if(waiting!=null) {
				System.out.printf("전화번호 : %s, 인원수 : %d\n",waiting.getPhoneNum(),waiting.getPeople());
			}
		}
		
	}
	

}
