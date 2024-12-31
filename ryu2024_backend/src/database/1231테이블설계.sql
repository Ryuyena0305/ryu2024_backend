create database kurly1; # [1] DB 생성 
use kurly1;  # [2] DB 사용 활성화


# 멤버 테이블
create table member(
	mno smallint auto_increment,
    constraint primary key( mno ),
    id varchar(20) not null,
    pw varchar(20) not null,
    name varchar(10) not null,
    email varchar(40)
);

# 카테고리 테이블 
create table category(
     cno int auto_increment, # 카테고리번호 
    cateName varchar(10) not null  , # 카테고리명
    constraint primary key( cno )  # pk 필드 선정 
);

#  제품 테이블 
create table product(
	pno int auto_increment, # 제품번호
    productName varchar(20) not null,# 제품명 
    price smallint unsigned default 0,# 제품가격
    constraint primary key(pno) ,# pk필드 설정
    cno  int   ,# fk필드 선언(pk필드와 동일한 타입 권장)
    constraint foreign key( cno ) references category( cno ) # fk필드 설정 
);

# [6] 주문 테이블 
create table porder(
	ono int auto_increment,  # 주문번호 
    orderDate datetime default now(),# 주문날짜 , 현재 시스템 날짜 자동  
    constraint primary key(ono), # pk필드 선정 
    mno  smallint ,
    constraint foreign key(mno) references member(mno)
);

# [7] 주문상세 테이블 
create table porderdetail(
	odno int auto_increment, # 주문상세
    orderCount int unsigned not null  , # 주문수량 
    totalPrice int unsigned not null,
    constraint primary key( odno ), # 주문상세 PK 설정 
    pno int , # 제품번호FK 필드
    constraint foreign key( pno ) references product( pno ) ,
    ono int , # 주문번호FK 필드 
    constraint foreign key( ono ) references porder(ono )
);

show tables;