# 테이블: 표( 행과 열로 이루어진 집합 )
# 속성/필드 : 세로단위 제목
# 레코드/튜플
# 1. 데이터베이스 생성
drop database if exists mydb0102; # -- 데이터베이스 삭제
create database mydb0102;		 # -- 데이터베이스 생성
use mydb0102;					# -- 데이터베이스 활성화

# 2. 테이블 생성
create table table1(
	mno int auto_increment, 
	mname varchar(30) not null unique,
    mcount int ,
    constraint primary key(mno)
);

# DML : 데이터베이스 조작어
# 1. insert [ C ]
# 2. select [ R ]
# 3. update [ U ]
# 4. delete [ D ]

# 1. insert : 레코드(행/튜플) 삽입a
# insert into 테이블명(속성명1, 속성명2) values (값1, 값2);
insert into table1(mname,mcount) values ('윤도운',5);
insert into table1(mname,mcount) values ('강영현',10);
insert into table1(mcount,mname) values (60,'김원필');

# mname속성에 제약조건이 unique 했으므로 중복 삽입 불가능하다.
# mname속성에 제약조건이 not null이므로 삽입시 값 대입해야한다.
# insert into table1(mcount)values(30); # 실행이 안된다.
insert into table1(mno,mname,mcount)values(5,'박성진',30);
# mno속성의 초기값 생략하면 auto_increment 이므로 자동번호가 부여된다.
# 테이블의 모든 속성들을 순서대로 초기값 대입할 경우 속성명은 생략해도 된다.
insert into table1 values(6,'신동엽',40);
# insert에 여러개 레코드 삽입하기.
insert into table1 values(7,'서장훈',50),(8,'하하',10);

# [2] select : 레코드 (행/튜플) 조회
# 1. 전체 속성의 레코드 조회 : select * from 테이블명; , *[와일드카드] 모든 속성명 뜻
select * from table1;
# 2. 특정 속성의 레코드 조회 : select 속성명1 from 테이블명;
select mno from table1;
select mno, mname from table1;
select mno,mname,mcount from table1;

# 3. 레코드 조회할 때 속성값 조건, [ 조건절 ] where 조건; , 
select * from table1 where mname = '윤도운';  # mname 속성 값이 '윤도운'인 레코드 조회
select * from  table1 where mno=1; 			# mno 속성 값이 1인 레코드 조회


