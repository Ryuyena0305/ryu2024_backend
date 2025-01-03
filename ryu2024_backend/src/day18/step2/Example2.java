package day18.step2;

public class Example2 {
	public static void main(String[] args) {
		//[확인]
		Dao.getInstance();
		
		//[insert 확인]
		//Dao.getInstance().insert();
		//[select 확인]
		Dao.getInstance().select();
		//[update 확인] : uno=2인 uname="강영현"수정
		//Dao.getInstance().update();
		//[delete 확인] : uno=1인 레코드 삭제
		//Dao.getInstance().delete();
		
	}
	
}
