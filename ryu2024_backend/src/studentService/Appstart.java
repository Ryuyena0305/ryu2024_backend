package studentService;

import studentService.view.StudentView;

public class Appstart {

	public static void main(String[] args) {
		// + 싱글톤의 메소드를 호출하는 방법 : 클래스명.getInstance().메소드명()
		StudentView.getInstance().run();
		

	}

}

