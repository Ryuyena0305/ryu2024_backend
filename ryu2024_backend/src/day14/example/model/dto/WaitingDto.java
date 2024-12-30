package day14.example.model.dto;

public class WaitingDto {
	private String id;
	private int people;
	public WaitingDto() {}
	public WaitingDto( int people) {
		this.people = people;
	}
	public WaitingDto(String id, int people) {
		this.id = id;
		this.people = people;
	}
	public String getId() {return this.id;}
	public int getPeople() {return this.people;}
	public void setId(String id) {this.id = id;}
	public void setPeople(int people) {this.people = people;}
}
