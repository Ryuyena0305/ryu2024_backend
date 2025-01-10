package studentService.controller;
import studentService.model.dto.StudentDto;
import studentService.model.dao.StudentDao;
import java.util.ArrayList;


public class StudentController {
	private StudentController () {}
	private static StudentController instance = new StudentController();
	public static StudentController getInstance() {
		return instance;
	}
	
	private String sname = null;//0이면 비로그인상태, 0 초고이면 로그인상태 = 번호 = 로그인된 회원번호
	public String getsname() {
		return sname;
	}
	public boolean signup(StudentDto studentDto) {
		boolean result = StudentDao.getInstance().signup(studentDto);
		return result;
	}
	public ArrayList<StudentDto> findAll() {
		ArrayList<StudentDto> result=
				StudentDao.getInstance().findAll();
		return result;
	}
	public StudentDto delete(StudentDto studentDto) {
		StudentDto result = StudentDao.getInstance().delete(studentDto);
		return result;
		
	}

	public boolean update(StudentDto studentDto) {
		boolean result = StudentDao.getInstance().update(studentDto);
		return result;
	}
	public StudentDto findDSname(String sname) {
		StudentDto studentDto = StudentDao.getInstance().findDSname(sname);
		return studentDto;
	}
	public StudentDto findUSname(String sname) {
		StudentDto studentDto = StudentDao.getInstance().findUSname(sname);
		return studentDto;
	}
	
	
	
	

}
