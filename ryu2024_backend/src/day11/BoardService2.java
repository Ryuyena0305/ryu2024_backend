package day11;

import java.util.Scanner;

public class BoardService2 {//class s
	
	//1.멤버변수
	//2.생성자
	//3.메소드
	//3-1 게시물 등록
	LogInfoDto logInfos = new LogInfoDto();
	String id;
	public void boardAdd(Scanner scan, BoardDto2[] boards,LoginFun lf) {
		System.out.print("제목 : ");	String title = scan.next();
		System.out.print("내용 : ");	String content = scan.next();
		//*생성자를 이용한 객체 생성
		BoardDto2 boardDto2 = new BoardDto2(title,content,lf.trans_id);
		//*배열에 저장
		boolean saveState=false;
		for(int index=0;index<=boards.length-1;index++) {
			if(boards[index]==null) {
				boards[index]=boardDto2;
				saveState = true;
				break;
			}
		}
			if(saveState) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
		
		
	}
	//3-2 게시물 출력
	public void boardPrint(BoardDto2[] boards) {
		for(int index = 0;index<=boards.length-1;index++) {
			if(boards[index]!=null) {
				System.out.printf("제목 : %s, 내용 : %s, 작성자 : %s\n",
						boards[index].getTitle(),
						boards[index].getContent(),
						boards[index].getWriter());
			}
		}
	}

}
