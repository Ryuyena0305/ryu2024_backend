package studentService.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import studentService.model.dto.StudentDto;

public class StudentDao extends Dao{
	private StudentDao() {}
	private static StudentDao instance = new StudentDao();
	public static StudentDao getInstance() {
		return instance;
	}
	
	public boolean signup(StudentDto studentDto) {
		try {
			//[1] SQL작성한다.
				String sql ="insert into student( sname , scoKor ,scoEng , scoMath ) "
						+ "values( '"+studentDto.getSname()+"' , '"+studentDto.getScoKor()+"', '"+studentDto.getScoEng()+"', '"+studentDto.getScoMath()+"' )";
			//[2] DB와 연동된 곳에 SQL 기재  sql을 기재하는 방법 : conn.prepareStatement(SQL)
			PreparedStatement ps = conn.prepareStatement(sql);
			//[3] 기재된 SQL을 실행하고 결과를 받는다.
			int count = ps.executeUpdate();
			//[4] 결과에 따른 처리 및 반환을 한다
			if(count==1) {return true;}
			}catch(SQLException e) {
				System.out.println(e);
			}
			
			return false;
		}
	
	public ArrayList<StudentDto> findAll() {
		ArrayList<StudentDto> list = new ArrayList<>();
		try {
			String sql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String sname = rs.getString("sname");
				int scoKor = rs.getInt("scoKor");
				int scoEng = rs.getInt("scoEng");
				int scoMath = rs.getInt("scoMath");
	
				StudentDto studentDto = new StudentDto(sname,scoKor,scoEng,scoMath);
				list.add(studentDto);
			} // w e
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}
	
	public StudentDto delete(StudentDto studentDto) {
		try {
			String sql = "delete from student where sname=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, studentDto.getSname());
			int count = ps.executeUpdate();
		}catch(SQLException e) {System.out.println(e);}	
		return studentDto;
	}
	
	public boolean update(StudentDto studentDto) {
		try {
			//[1] SQL 작성한다.
			String sql = "update student set scoKor = ? , scoEng = ? , scoMath = ? where sname = ? ";
			//[2] DB와 연동된 곳에 SQL 기재한다.
			PreparedStatement ps = conn.prepareStatement( sql );
			//[*] 기재된 SQL에 매개변수 값 대입한다.
			ps.setInt(1, studentDto.getScoKor());
			ps.setInt(2, studentDto.getScoEng());
			ps.setInt(3, studentDto.getScoMath());
			ps.setString(4, studentDto.getSname());
			//[3] 기재된 SQL 실행하고 결과를 받는다.
			int count = ps.executeUpdate();
			//[4] 결과에 따른 처리 및 변환을 한다.
			if(count==1) {return true;}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return false;
	}


	public StudentDto findDSname(String sname) {
	    try {
	        String sql = "select * from student where sname = ? ";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, sname);
	        ResultSet rs = ps.executeQuery();
	        
	        if (rs.next()) {
	            // 학생 정보를 찾은 경우, DTO 객체로 반환
	            StudentDto studentDto = new StudentDto(
	                rs.getString("sname"),
	                rs.getInt("scoKor"),
	                rs.getInt("scoEng"),
	                rs.getInt("scoMath")
	            );
	            return studentDto;  // 조회된 학생 객체 반환
	        }
	    } catch (SQLException e) {
	        System.out.println(e);
	    }
	    return null;  // 학생이 없으면 null 반환
	}
	public StudentDto findUSname(String sname) {
		try {
	        String sql = "select * from student where sname = ? ";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, sname);
	        ResultSet rs = ps.executeQuery();
	        
	        if (rs.next()) {
	            // 학생 정보를 찾은 경우, DTO 객체로 반환
	            StudentDto studentDto = new StudentDto(
	                rs.getString("sname"),
	                rs.getInt("scoKor"),
	                rs.getInt("scoEng"),
	                rs.getInt("scoMath")
	            );
	            return studentDto;  // 조회된 학생 객체 반환
	        }
	    } catch (SQLException e) {
	        System.out.println(e);
	    }
	    return null;  // 학생이 없으면 null 반환
	    }
}
