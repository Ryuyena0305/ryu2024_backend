package day14.example.controller;

import day14.example.model.dao.*;
import day14.example.model.dto.*;

public class MemberController {
	private MemberController() {
	}

	private static MemberController instance = new MemberController();

	public static MemberController getInstance() {
		return instance;
	}

	private String loginId = null;

	public String getLoginId() {
		return this.loginId;
	}

	public boolean memberAdd(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().memberAdd(memberDto);
		return result;
	}

	public boolean memberLogin(String id, String pw) {
		boolean result = MemberDao.getInstance().memberLogin(id, pw);
		if (result == true) {
			loginId = id;

		}
		return result;
	}

	public boolean memberUpdate(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().memberUpdate(memberDto);
		return result;

	}

	public boolean memberDelete(String id, String pw) {

		boolean result = MemberDao.getInstance().memberDelete(id, pw);
		return result;

	}
}