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

# [3] update : 레코드의 속성 값 수정
# 1. 전체 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값
update table1 set mcount=0; # 오류 mysql workbench safe mode 끄기 : 
set SQL_SAFE_UPDATES = 0; #safe mode 끄기
set SQL_SAFE_UPDATES = 1; # safe mode 사용
update table1 set mcount=0;
# 2. 특정 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값 where [조건절]
update table1 set mcount =100 where mname = '윤도운'; # mname속성값이 '윤도운'인 레코드의 mcount 속성값을 100으로 수정

# 3. 여러 속성값 수정할 때	: update 테이블명 set 속성명1 = 새로운값, 속성명2 = 새로운값 where [ 조건절 ]
update table1 set mname = '강영현2', mcount = 200 where mno=2; # mno속성값이 3인 레코드의 mname과 mcount 값 수정한다.


# [4] delete : 레코드 삭제
# 1. 전체 레코드 삭제 : delete from 테이블명;
delete from table1;

# 2. 특정 레코드 삭제a : delete from 테이블명 where [조건절]
delete from table1 where mno = 3;


# 테이블이 있다는 가정하에 SQL만 작성, 풀이후 (테스트)실행 불가능
/* 
[문제1]: employees 테이블에 새로운 직원을 추가하세요. 직원의 정보는 다음과 같습니다:
employee_id: 101
first_name: 'John'
last_name: 'Doe'
email: 'johndoe@example.com'
hire_date: '2024-06-24'
job_id: 'IT_PROG'

insert into employees(employee_id,first_name,last_name,email,hire_date,job_id) values('John','Doe','johndoe@example.com','2024-06-24','IT_PROG');

[문제2]: products 테이블에 새로운 제품을 추가하세요. 제품의 정보는 다음과 같습니다:
product_id: 201
product_name: 'Wireless Mouse'
category: 'Electronics'
price: 29.99
stock_quantity: 150

insert into products(product_id,product_name,category,price,stock_quantity) values(201,'Wireless Mouse','Electronics',29.99,150);

[문제3]: employees 테이블에서 모든 직원의 first_name과 email을 조회하세요.

select first_name, email from employess;

[문제4]: products 테이블에서 price가 1000 인 제품의 product_name과 price를 조회하세요.

select product_name,price from price where price=1000;

[문제5]: employees 테이블에서 employee_id가 101인 직원의 email을 'john.doe@company.com'으로 업데이트하세요.

update employees set email='john.doe@company.com' where employee_id=101;

[문제6]: products 테이블에서 product_id가 201인 제품의 price를 24.99로 업데이트하세요.

update products set price = 24.99 where product_id=201;

[문제7]: employees 테이블에서 employee_id가 101인 직원을 삭제하세요.


delete from employees where employee_id=101;

[문제8]: products 테이블에서 product_id가 201인 제품을 삭제하세요.

delete from products where product_id =201;

*/


