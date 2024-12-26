package day13.example.model.dao;

import day13.example.model.dto.WaitingDto;

public class WaitingDao {
	private WaitingDao() {}
	private static WaitingDao instance = new WaitingDao();
	public static WaitingDao getInstance() {
		return instance;
	}
	
	private WaitingDto[] waitingDB = new WaitingDto[100];
	
	public boolean waitingAdd(WaitingDto waitingDto) {
		for(int index=0;index<=waitingDB.length-1;index++) {
			if(waitingDB[index]==null) {
				waitingDB[index]=waitingDto;
				return true;
			}
		}
		return false;
	}
	public WaitingDto[] waitingPrint() {
		return waitingDB;
	}

}
