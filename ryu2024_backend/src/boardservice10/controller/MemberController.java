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
	public boolean signup(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().signup(memberDto);
		return result;
	}
	//3. 아이디 찾기  컨트롤러 메소드
	public String findID(MemberDto memberDto) {
			//* 다양한 유효성 검사를 넣을 예정
		String result = MemberDao.getInstance().findId(memberDto);
		return null;
	}
	//4. 비밀번호 찾기 컨트롤러 메소드
	public String findPw(MemberDto memberDto) {
		String result = MemberDao.getInstance().findPW(memberDto);
		return null;
	}
}
