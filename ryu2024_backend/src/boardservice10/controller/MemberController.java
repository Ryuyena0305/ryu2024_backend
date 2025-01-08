package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	//+싱글톤
	private static MemberController instance = new MemberController();
	private MemberController() {}
	public static MemberController getInstance() {
		return instance;

	}
	//1. 회원가입 컨트롤러 메소드
	public boolean signup(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().signup(memberDto);
		return result;
	}
	//2. 로그인 컨트롤러 메소드
	private int loginMno = 0;//0이면 비로그인상태, 0 초고이면 로그인상태 = 번호 = 로그인된 회원번호
	public int getLoginMno() {
		return loginMno;
	}
	public boolean login(MemberDto memberDto) {
		int result = MemberDao.getInstance().login(memberDto);
		//boolean --> int 변경한 이유 : 로그인 성공한 회원번호를 내부적으로 저장하기 위해
		//회원번호(1번으로 시작하므로)를 반환받아서 0이면 없는 회원번호, 0초과이면 있는 회원번호
		if(result >0) {
			loginMno=result;
			return true;
		}
		return false;
	}
	
	//3. 아이디 찾기  컨트롤러 메소드
	public String findID(MemberDto memberDto) {
			//* 다양한 유효성 검사를 넣을 예정
		String result = MemberDao.getInstance().findId(memberDto);
		return result;
	}
	//4. 비밀번호 찾기 컨트롤러 메소드
	public String findPw(MemberDto memberDto) {
		String result = MemberDao.getInstance().findPW(memberDto);
		return result;
	}
	//5. 로그아웃 컨트롤러 메소드
	public void logout() {
		loginMno = 0;
		
	}
	//6.내정보 찾기 컨트롤러 메소드
	// public MemberDto myInfo(받는타입 받는변수){}
	public MemberDto myInfo() {
		//Dao에게 로그인(로그인된 회원번호 PK)정보 주고 결과 받기
		MemberDto result = MemberDao.getInstance().myInfo(loginMno);
		
		return result;
	}
	
	//7. 회원탈퇴 컨트롤러 메소드
	public void delete() {
		MemberDao.getInstance().delete(loginMno);
	
	}
	
	
}
