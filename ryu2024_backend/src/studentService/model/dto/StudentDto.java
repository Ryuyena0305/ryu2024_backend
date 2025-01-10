package studentService.model.dto;

public class StudentDto {
	private String sname;
	private int scoKor;
	private int scoEng;
	private int scoMath;
	
	public StudentDto() {}
	public StudentDto(String sname, int scoKor, int scoEng, int scoMath) {
		
		this.sname = sname;
		this.scoKor = scoKor;
		this.scoEng = scoEng;
		this.scoMath = scoMath;
	}
	public StudentDto( int scoKor, int scoEng, int scoMath) {

		this.scoKor = scoKor;
		this.scoEng = scoEng;
		this.scoMath = scoMath;
	}
	
	
	@Override
	public String toString() {
		return "StudentDto [sname=" + sname + ", scoKor=" + scoKor + ", scoEng=" + scoEng + ", scoMath=" + scoMath
				+ "]";
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getScoKor() {
		return scoKor;
	}
	public void setScoKor(int scoKor) {
		this.scoKor = scoKor;
	}
	public int getScoEng() {
		return scoEng;
	}
	public void setScoEng(int scoEng) {
		this.scoEng = scoEng;
	}
	public int getScoMath() {
		return scoMath;
	}
	public void setScoMath(int scoMath) {
		this.scoMath = scoMath;
	}
	
	

}
