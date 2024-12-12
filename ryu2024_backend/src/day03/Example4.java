package day03;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
//		문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("[1]정수형 점수 : ");
		int score1 = scan.nextInt();
		String res1 ;
		
		if(score1 >=90) {
			res1 ="합격";
		}else {
			res1 = "불합격";
		}
		System.out.println(res1);
		
//		문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
		System.out.println("[2]정수형 점수 : ");
		int score2 = scan.nextInt();
		String res2 ;
		
		if(score2 >=90&&score2<=100) {
			res2 ="A등급";
		}else if(score2 >=80){
			res2 ="B등급";
		}else if(score2 >=70){
			res2 ="C등급";
		}else if(score2 >=60){
			res2 ="D등급";
		}else {
			res2 ="재시험";
		}
		System.out.println(res2);
		
		
//		문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("[3]각 서로 다른 정수1 : ");
		int num1= scan.nextInt();
		System.out.println("[3]각 서로 다른 정수2 : ");
		int num2 = scan.nextInt();
		System.out.println("[3]각 서로 다른 정수3 : ");
		int num3 = scan.nextInt();
	
		int max = num1;
		if(max<num2) {max = num2;}
		if(max<num3) {max = num3;}
		
	System.out.println(max);
		
		
//
		
		
//		문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("[4]각 서로 다른 정수1 : ");
		int num4= scan.nextInt();
		System.out.println("[4]각 서로 다른 정수2 : ");
		int num5 = scan.nextInt();
		System.out.println("[4]각 서로 다른 정수3 : ");
		int num6 = scan.nextInt();

		if (num4 > num5) {
			int temp = num4; num4 = num5; num5 = temp;
		}
		if(num4>num6) {
			int temp = num4; num4=num6;num6=temp;
		}if(num5>num6) {
			int temp = num5; num5=num6;num6=temp;
		}
		System.out.println(num4+" "+num5+" "+num6);
//		
		
//		문제5 : 가위바위보 게임 구현하기.
//		      - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//		     - 승리자 판단과 무승부 경우의수를 출력하시오.
//		      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
//		     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
		
		System.out.println("[5]가위바위보 player1 : ");
		int player1 = scan.nextInt();
		System.out.println("[5]가위바위보 player2 : ");
		int player2 = scan.nextInt();
		if(player1==player2) {
			System.out.println("무승부");
		}else if((player1==0&&player2==2)||(player1==1&&player2==0)||(player1==2&&player2==1)) {
			System.out.println("player1 승리");
			
		}else {
			System.out.println("player2 승리");
		}

		
		
//		문제6 : 윤년/평년 판단하기
//		   [ 입력조건 ] 하나의 연도를 입력 받습니다.
//		   [ 윤년/평년 조건 ]
//		   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//		   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//		   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//		   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
		System.out.println("[6]윤년/평년 판달할 해 입력 : ");
		int year = scan.nextInt();
		
		if(year%4 ==0 || (year%100==0 &&year%400==0&&year%4==0 )) {
			System.out.println("입력한"+year+"년은 평년입니다.");
		}else {
			System.out.println("입력한"+year+"년은 윤년입니다.");
		}
		
		

		
		
		
//		문제7 : 주차 사용요금 계산하기
//		   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
//		   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
//		   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
//		   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//		   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.

		int in_hour =9;
		int in_min =30;
		System.out.println("[7]출차 시 입력 : ");
		int out_hour = scan.nextInt();
		if(out_hour <in_hour) {
			System.out.println("[7]출차 시 입력 : ");
			out_hour = scan.nextInt();
		}
		System.out.println("[7]출차 분 입력 : ");
		int out_min = scan.nextInt();
		if(out_hour==9&&out_min <in_min) {
			System.out.println("[7]출차 분 입력 : ");
			out_min = scan.nextInt();
		}
		int price = (out_hour-in_hour)*60*1000 + (out_min-in_min)*1000;
		
		System.out.println("사용요금 : "+price);
		
		

		
		
//		문제8 : 로그인 처리
//		   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//		   [처리출력 조건]
//		   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//		   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//		   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
//		   [ 참고 ]
//		   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
//		   예] 
//		      String name = scan.next();
//		      name =="admin" 대신에 name.equals( "admin" ) 사용.
		
		System.out.println("[8]아이디 : ");
		String id = scan.next();
		System.out.println("[8]비밀번호 : ");
		String pw = scan.next();
		if(id.equals( "admin" )&&pw.equals("1234")) {
			System.out.println("로그인성공");
		}else if(id.equals( "admin" )&&pw!=("1234")){
			System.out.println("비밀번호 정보가 일치하지 않습니다.");
		}
		else if(id!=( "admin" )&&pw.equals("1234")){
			System.out.println("아이디 정보가 일치하지 않습니다.");
		}
		
		
		
		
		
//		문제9 : 당첨번호 개수  찾기
//		   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
//		   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//		   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
		
		int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
		int num7 = scan.nextInt();
		int num8 = scan.nextInt();
		int num9 = scan.nextInt();
		int count=0;
		if(num7==공1){
			count++;
		}if(num8==공1) {
			count++;
		}if(num9==공1) {
			count++;
		}if(num7==공2) {
			count++;
		}if(num8==공2) {
			count++;
		}if(num9==공2) {
			count++;
		}if(num7==공3) {
			count++;
		}if(num8==공3) {
			count++;
		}if(num9==공3) {
			count++;
		}
		System.out.println("[9]공과 동일한 갯수: "+count);

		
		
		
		
		// 문제10
//		int H = scan.nextInt();
//		int M = scan.nextInt()-45;
//		
//		if(M<0) {
//			H = H-1;
//			M=60+M;
//		}
//	
//		if(H<0)
//		{
//			H=24+H;
//		}
//		System.out.println(H+" "+M);
		
//		int H = scan.nextInt(); // 입력받은 시간
//		int M = scan.nextInt();  // 입력받은 분
//		if(M<45) {   // 만약 입력받은 분이 45분 미만이면
//			H--;     // 시간은감소되고
//			M=60+(M-45);  // 입력받은 분은 (입력받은분-45분) + 60분
//		}if(H<0) {       // 만약 입력받은시간이 
//			H =23;
//			System.out.println(H+"시"+M+"분");
//		}else {
//			System.out.println(H+"시"+(M-45));
//		}
		

		
		
	}

}
