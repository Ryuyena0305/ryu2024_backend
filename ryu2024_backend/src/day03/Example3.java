package day03;

public class Example3 { //class s

	public static void main(String[] args) {//main s
		//p.92 조건문
		
		//[1] if문
		int age =60;
		if(age>=8) {//if s
			System.out.println("학교에 다닙니다.");
			
		}//if e
		//[2] if ~ else문 
		//만약에 age 값이 8이상이면 출력함수 실행한다.
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}//if e
		
		
		//p.95[1분 복습]
		char gender = 'F';
		if(gender =='F') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
		}
		
		
		//[3]if ~ elseif문
		int charge;
		if (age<8) {//만약에 age가 8미만이면
			charge =1000;
			System.out.println("취학 전 아동입니다.");
			
		}else if(age<14){//아니고 age값이 8초과 이면서 14미만 이면
			charge =2000;
			System.out.println("초등학생입니다.");
		}else if(age<20) {//아니고 age값이 14초과 이면서 20미만 이면
			charge =2500;
			System.out.println("중,고등학생 입니다.");
		}else if(age>=60){//[1분복습]
			charge = 0;
			System.out.println("경로우대입니다.");
			
		}
		else {
			charge=3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 "+charge+"원 입니다.");

		
		
		//[p.100 나혼자 코딩]
		int score=79; //성적 임의
		char grade;
		
		if (score<=100&&score>=90) { //만약 성적이 100~90
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade='F';
		}
		System.out.printf("%d은 %c입니다.",score,grade);
	}//main e

}//class e
