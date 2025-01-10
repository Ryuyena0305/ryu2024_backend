package studentService.view;

import java.util.ArrayList;
import java.util.Scanner;

import boardservice10.model.dto.MemberDto;
import studentService.controller.StudentController;
import studentService.model.dto.StudentDto;

public class StudentView {
	private StudentView() {}
	private static StudentView instance = new StudentView();
	public static StudentView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	public void run() {
		while(true) {
			System.out.println("1. 점수등록, 2. 전제점수조회, 3. 점수삭제, 4. 점수수정");
			int choose = scan.nextInt();
			if(choose==1) {signup();}
			else if(choose==2) {findAll();}
			else if(choose==3) {findDSname();}
			else if(choose==4) {findUSname();}
		}
	}
	
	//점수 등록
	public void signup() {
		System.out.println("학생명 : "); String sname = scan.next();
		System.out.println("국어 : "); int scoKor = scan.nextInt();
		System.out.println("영어 : ");int scoEng = scan.nextInt();
		System.out.println("수학 : ");int scoMath = scan.nextInt();
		StudentDto studentDto = new StudentDto(sname,scoKor,scoEng,scoMath);
		boolean result = StudentController.getInstance().signup(studentDto);
		if(result) {System.out.println("[ 점수등록 성공 ]");}
		else {System.out.println("[ 점수등록 실패] ");}
		
	}
	//전체점수조회
	public void findAll() {
		ArrayList<StudentDto> result = StudentController.getInstance().findAll();
		System.out.println("학생명\t국어점수\t영어점수\t수학점수");
		for(int index=0;index<=result.size()-1;index++) {
			StudentDto studentDto = result.get(index);
			System.out.print(studentDto.getSname()+"\t");
			System.out.print(studentDto.getScoKor()+"\t");
			System.out.print(studentDto.getScoEng()+"\t");
			System.out.print(studentDto.getScoMath()+"\n");
		}
	}
	
	//학생명 검색(수정)
	public void findUSname() {
		System.out.println("점수를 수정할 학생명 : "); String sname = scan.next();
		StudentDto result = StudentController.getInstance().findUSname(sname);
		if(result!=null) {
			update(result);
		}else {
			System.out.println("동일한 학생정보가 없습니다.");
		}
		
	}
	public void findDSname() {
		System.out.println("점수를 삭제할 학생명 : "); String sname = scan.next();
		StudentDto result = StudentController.getInstance().findDSname(sname);
		if(result!=null) {
				delete(result);
		}else {
			System.out.println("동일한 학생정보가 없습니다.");
		}
		
	}
	
	
	// 점수 삭제
	public void delete(StudentDto studentDto) {
		System.out.println("정말 점수를 삭제하실건가요? 0:예 1:취소 ");
		int choose1 = scan.nextInt();
		if(choose1 == 0) {
			StudentController.getInstance().delete(studentDto);
			System.out.println("점수가 삭제되었습니다.");
		}
		
	}
	// 점수 수정
	public void update(StudentDto studentDto) {
		System.out.println("새로운 국어점수 : "); int scoKor = scan.nextInt();
		System.out.println("새로운 영어점수 : "); int scoEng = scan.nextInt();
		System.out.println("새로운 수학점수 : "); int scoMath = scan.nextInt();
		MemberDto memberDto = new MemberDto();
		studentDto.setScoKor(scoKor); studentDto.setScoEng(scoEng);
		studentDto.setScoMath(scoMath);
		boolean result = StudentController.getInstance().update(studentDto);
		if(result) {System.out.println("수정 완료되었습니다");}
		else {System.out.println("수정 실패입니다");}
	}
}
