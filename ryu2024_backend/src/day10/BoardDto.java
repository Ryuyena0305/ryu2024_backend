package day10;

public class BoardDto {
//D(data)t(transfer)o(object) : 데이터 이동 객체
	//왜? 목적? 여러사람들이 작업할 때 클래스명에 공통적으로 dto명시 함으로써 클래스 사용처 파악이 쉽다.
	//추후에 dto,vo,dao,controller,service, view ,entity
//DTO : 데이터베이스 (DB) 에 저장된 자료들을 자바로 이동할 때 사용되는 객체
	// 자바와 자바스크립트 휘발성(영구저장x)
	//자바와 자바스크립트 <---> DB(영구저장o)
	//관례적으로 모든 멤버변수는 private , 디폴트 생성자 + 풀매개변수, setter/getter메소드 ,
	//toString메소드 : 객체 주소값 대신 객체 멤버변수값을 반환
	
	//1. 멤버변수 : private
	private String title;
	private String content;
	private String writer;
	//2. 생성자 : 디폴트, 풀매개변수, 설계에 따라 만들기
		//2-1 : 디폴트 생성자
	 public BoardDto() {
		 
	 }
	 //2-2
	 public BoardDto(String title,String content, String writer) {
		 this.title = title;
		 this.content=content;
		 this.writer = writer;
	 }
	//3. 메소드 : 멤버변수 마다 getter/setter, toString
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}
