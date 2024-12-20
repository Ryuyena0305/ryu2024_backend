package day10;

public class Example3 {
	public static void main(String[] args) {
		//[1] Dto 객체 생성하기
		
		// - title 멤버변수는 private 이므로 오류 발생
		//board.title = "안녕하세요";
		board.setTitle("안녕하세요.");
		
		//- title 멤버변수는 private 이므로 오류 발생
		//System.out.println(board.title);
		System.out.println(board.getTitle());
		
	System.out.println(board);
	}
	

}
