package day14.example.model.dao;

import java.util.ArrayList;

import day14.example.model.dto.WaitingDto;


public class WaitingDao {
	private WaitingDao() {}
	private static WaitingDao instance = new WaitingDao();
	public static WaitingDao getInstance() {
		return instance;
	}
	private ArrayList<WaitingDto> waitings = new ArrayList<>();
	
	public boolean regist(WaitingDto waitingDto) {
		waitings.add(waitingDto);
		return true;
	}
	public ArrayList<WaitingDto> print(){
		return waitings;
	}
	public boolean update(WaitingDto waitingDto) {
		for(int i = 0; i<waitings.size(); i++) {
		waitings.set(i, waitingDto);
		}
		return true;
	}
	public boolean delete() {
		for(int i = 0; i <waitings.size(); i++) {
		waitings.remove(i);
		}
		return true;
	}
}
