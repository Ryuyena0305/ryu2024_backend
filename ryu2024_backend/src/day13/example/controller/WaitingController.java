package day13.example.controller;

import day13.example.model.dao.WaitingDao;
import day13.example.model.dto.WaitingDto;

public class WaitingController {
	
	private WaitingController() {}
	private static WaitingController instance = new WaitingController();
	public static WaitingController getInstance() {
		return instance;
	}
	
	public boolean waitingAdd(WaitingDto waitingDto) {
		boolean result = WaitingDao.getInstance().waitingAdd(waitingDto);
		return result;
	}
	public WaitingDto[] waitingPrint() {
		WaitingDto[]result = WaitingDao.getInstance().waitingPrint();
		return result;
	}

}
