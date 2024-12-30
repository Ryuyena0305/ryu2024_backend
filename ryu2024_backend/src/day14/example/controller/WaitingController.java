package day14.example.controller;

import java.util.ArrayList;

import day14.example.model.dao.WaitingDao;
import day14.example.model.dto.WaitingDto;

public class WaitingController {
	private WaitingController() {}
	private static WaitingController instance = new WaitingController();
	public static WaitingController getInstance() {
		return instance;
	}
	public boolean regist(WaitingDto waitingDto) {
		
		// 
		String id = MemberController.getInstance().getLoginId();
		waitingDto.setId(id);
		
		boolean result = WaitingDao.getInstance().regist(waitingDto);
		return result;
	}
	public ArrayList<WaitingDto> print(){
		ArrayList<WaitingDto> result = WaitingDao.getInstance().print();
		return result;
	}
	public boolean update(WaitingDto waitingDto) {
		String id = MemberController.getInstance().getLoginId();
		waitingDto.setId(id);
		boolean result = WaitingDao.getInstance().update(waitingDto);
		return result;
	}
	public boolean delete() {
		boolean result = WaitingDao.getInstance().delete();
		return result;
	}
}
