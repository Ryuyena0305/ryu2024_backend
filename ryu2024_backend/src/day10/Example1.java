package day10;

public class Example1 {

	public static void main(String[] args) {
		//[1]
		Student s1 = new Student();
		s1.studentID = 1;
		s1.studentName="윤도운";
		s1.koreaScore=89;
		s1.mathScore=73;
		s1.koreaSubject="국어";
		s1.mathSubject="수학";
		
		//[2]
		Student s2 = new Student();
		s2.studentID = 2;
		s2.studentName="강영현";
		s2.koreaScore=92;
		s2.mathScore=100;
		s2.koreaSubject="국어";
		s2.mathSubject="수학";
		//[3]
		Student2 s3 = new Student2();
		s3.studentID = 3;
		s3.studentName="김원필";
		Subject sub1 = new Subject();
		sub1.subjectName ="국어";
		sub1.scorePoint=89;
		s3.korean = sub1;
		Subject sub2 = new Subject();
		sub2.subjectName ="수학";
		sub2.scorePoint=73;
		
		//[4]
		Student2 s4 = new Student2();
		s4.studentID = 4;
		s4.studentName = "박성진";
			Subject sub3 = new Subject();
			sub3.subjectName ="국어";
			sub3.scorePoint = 100;
		s4.korean = sub3;
			Subject sub4 = new Subject();
			sub4.subjectName ="수학";
			sub4.scorePoint = 82;
		s4.math = sub4;

	}

}
