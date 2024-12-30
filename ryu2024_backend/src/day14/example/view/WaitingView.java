package day14.example.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.example.controller.WaitingController;
import day14.example.model.dto.WaitingDto;



public class WaitingView {
	private WaitingView() {}
	private static WaitingView instance = new WaitingView();
	public static WaitingView getInstance() {
		return instance;
	}
	private Scanner scan = new Scanner(System.in);
	public void index() {
		while(true) {
			System.out.println("1.등록 2.출력 3.수정 4.삭제");
			int choose = scan.nextInt();
			if(choose == 1) {regist();}
			else if(choose == 2) {print();}
			else if(choose == 3) {update();}
			else if(choose == 4) {delete();}
		}
	}
	public void regist() {
		System.out.println("인원수 "); int people = scan.nextInt();
		
		WaitingDto waitingDto = new WaitingDto(people);
		boolean result = WaitingController.getInstance().regist(waitingDto);
		if(result == true) {System.out.println("등록 성공");}
		else {System.out.println("등록실패");}
		
	}
	public void print() {
		ArrayList<WaitingDto> result = WaitingController.getInstance().print();
		System.out.println("순번\t아이디\t인원수\t");
		for(int i = 0; i < result.size(); i++) {
			WaitingDto waiting = result.get(i);
			System.out.printf("%d\t%s\t%d \n", i, waiting.getId(), waiting.getPeople() );
			
		}
	}
	public void update() {		
		
		System.out.println("수정할 인원수"); int people = scan.nextInt();
		
		WaitingDto waitingDto = new WaitingDto(people);
		boolean result = WaitingController.getInstance().update(waitingDto);
		if(result == true) {System.out.println("수정 완료");}
		else {System.out.println("수정 실패");}
	}
	public void delete() {
		boolean result = WaitingController.getInstance().delete();
		if(result == true) {System.out.println("삭제 성공");}
		else {System.out.println("삭제 실패");}
	}
}
