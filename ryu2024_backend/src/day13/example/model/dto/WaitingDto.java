package day13.example.model.dto;

public class WaitingDto {
	private String phoneNum;
	private int people;
	
	public WaitingDto() {
		
	}

	public WaitingDto(String phoneNum, int people) {
		this.phoneNum = phoneNum;
		this.people = people;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
	

}
