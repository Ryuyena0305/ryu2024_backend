package day11;

public class LogInfoDto {
	
	private String id;
	private String pw;
	private String nickname;
	
	public LogInfoDto() {
		
	}
	public LogInfoDto(String id,String pw) {
		this.id= id;
		this.pw=pw;
	}
	public LogInfoDto(String id) {
		this.id= id;
	
	}
	public LogInfoDto(String id,String pw,String nickname) {
		this.id= id;
		this.pw=pw;
		this.nickname=nickname;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
