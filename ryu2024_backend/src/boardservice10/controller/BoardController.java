package boardservice10.controller;

import java.lang.reflect.Member;
import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;


public class BoardController {
	//+싱글톤
	private BoardController() {}
	private static BoardController instance = new BoardController();
	public static BoardController getInstance() {
		return instance;
	}
	
	//1. 전체 게시물 컨트롤러 메소드
	public ArrayList<BoardDto> findAll(){
		ArrayList<BoardDto> result = 
		BoardDao.getInstance().findAll();
		return result;
	}
	//2.
	public BoardDto findById(int bno) {
		BoardDto boardDto = BoardDao.getInstance().findById(bno);
		return boardDto;
	}
	//3.
	public boolean write(BoardDto boardDto) {
		//현재 로그인 회원의 번호 넣어주기
		int loginMno = MemberController.getInstance().getLoginMno();
		boardDto.setMno(loginMno);
		return BoardDao.getInstance().write(boardDto);
	}
	//4. 컨트롤러 전체 조회 컨트롤러 메소드
	public ArrayList<BoardDto> categoryAll(){
		return BoardDao.getInstance().categoryAll();
	}

	public boolean update(BoardDto boardDto) {
		//+유효성 검사 : 현재 로그인된 작성자 작성한 글인지 체크
		boolean result = 
		BoardDao.getInstance().update(boardDto);
		return result;
	}

	public boolean delete(int bno) {
		boolean result = 
				BoardDao.getInstance().delete();
		return result;
	}

	
}
