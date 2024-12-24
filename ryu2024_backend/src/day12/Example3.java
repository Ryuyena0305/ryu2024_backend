package day12;
class Student{//class s
	//+정적변수 : 프로그램 시작될때 1번 생성된다.
	public static int serialNum =1000;
	//+멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	//+생성자
	
	//+메소드
	public String getStudentName() {return studentName;}
	public void setStudentName(String name) {studentName = name;}
	
}//class e

class Student1{//class s
	//+정적변수 : 프로그램 시작될때 1번 생성된다.
	public static int serialNum =1000;
	//+멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	//+생성자
	public Student1() {
		serialNum++; //학생이 생성될때마다 1증가
		studentID = serialNum;//증가된 값을 학번 멤버변수에 대입한다.
	}
	//+메소드
	public String getStudentName() {return studentName;}
	public void setStudentName(String name) {studentName = name;}
	
}//class e

public class Example3 {//class s
	
	public static void main(String[] args) {
		//인스턴스 생성
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
	
	
		//인스턴스 생성
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		studentSon.serialNum++;
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
		
		System.out.println(studentLee.studentName);
		System.out.println(studentSon.studentName);
		
		//예2]
		Student1 studentLee1 = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee1.studentID);//1001
		
		Student1 studentSon1 = new Student1();
		studentLee.setStudentName("손수경");
		System.out.println(studentLee1.studentID);//1002
		
		//예3]클래스 변수
		System.out.println(Student.serialNum);
		System.out.println(Student1.serialNum);
	
	
	}

}//class e

/*
 	클래스 2개 : Student , Example3
 	인스턴스 2개 : new Student(); , new Student();
 	생성된 멤버변수 8개 
 	(studentID, studentName, grade , address)
 	(studentID, studentName, grade , address)
 	
 	정적변수 : 1개
 	
 
 */
