package day18.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	private String DBURL = "jdbc:mysql://localhost:3306/mydb0103";
	private String DBID = "root";
	private String DBPW = "1234";
	//+ JDBC 인터페이스
	private Connection conn;
	//+싱글톤
	//1단계. 디폴트 생성자를 private 한다.
	private Dao() {
		//*JDBC 연동 : 싱글톤이 생성될 때 DB연동이 된다.
		try {//1. 드라이버 로드한다.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. DB서버와 연결 시도
		conn = DriverManager.getConnection(DBURL,DBID,DBPW);
		System.out.println(">>DB 연동 성공");
		}catch(ClassNotFoundException e) {
			System.out.println(">>JDBC 드라이버가 없습니다."+e);
		}catch(SQLException e) {
			System.out.println(">>DB 연동 실패"+e);
		}
		
	}//f e
	
	private static Dao instance = new Dao();
	public static Dao getInstance() {
		return instance;
	}
	
	//1. inser 함수
	public void insert() {
		try {
		//(1) SQL 작성, 문자열 타입으로
		String sql = "insert into user(uname,uage)values('윤도운','30')";
		//(2) SQL 기재, prepare 준비, Statement 기재 : 연동된 db에 SQL을 기재하고 기재된 SQL 객체 반환
		PreparedStatement ps = conn.prepareStatement(sql);
		//(3) 기재된 SQL 실행 .excute
		//.executeUpdate() : 현재 기재된 SQL을 실행하고 처리한 레코드 수 반환 함수 int 반환
		//(4) SQL 실행 결과 반환받기
		int count = ps.executeUpdate();
		//(5) 반환 결과를 조작하기
		if(count==1) {
			System.out.println("[insert 성공]");
			return;
		}
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	//2. select 함수
	public void select() {
		try {
		// (1) SQL 작성
		String sql = "select * from user ";
		// (2) SQL 기재한다.
		PreparedStatement ps = conn.prepareStatement(sql);
		// (3) 기재된 SQL 실행, select => excuteQuery
		//.excuteQuery() : 현재 기재된 SQL을 실행하고 조회 결과를 조작 가능한 인스턴스 반환
		ResultSet rs = ps.executeQuery();
		//(5) 반환 결과를 조작하기 .next() : 조회 결과에서 다음 레코드로 이동함수, 다음레코드 존재하면 true 다음레코드 없으면 false
		while(rs.next()) { // 즉) 6개의 레코드가 존재하면 .next()함수는 6번 실행 가능하다.
			//rs.get타입("속성명") // 현재 레코드의 속성 값 반환 함수. 타입 일치
			System.out.printf("%d \t %s \t %s \n",
					rs.getInt("uno"),
					rs.getString("uname"),
					rs.getInt("uage"));
		}
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	//3. update 함수
	public void update() {
		try {
		//(1) SQL 작성
		String sql= "update user set uname='강영현'where uno=2";
		//(2) SQL 기재
		PreparedStatement ps = conn.prepareStatement(sql);
		//(3) 기재된 SQL 실행하고 반환받기
		int count = ps.executeUpdate();
		//(4)반환 결과 제어
		if(count==1) {
			System.out.println("[Update 성공]");
			return;
					}
		}catch(SQLException e) {
			System.out.println(e);
		}
		System.out.println("[Update 실패]");
	}
	
	//4. delete 함수
	public void delete() {
		try {
			//(1) SQL 작성
			String sql= "delete from user where uno=1";
			PreparedStatement ps = conn.prepareStatement(sql);
			int count = ps.executeUpdate();
			if(count==1) {
				System.out.println("[delete 성공]");
				return;
			}
			}catch(SQLException e) {
				System.out.println(e);
			}
		System.out.println("[Delete 실패]");
		
	}
	

}//c e
