drop database if exists moviereservation;                
create database moviereservation;           
use moviereservation;     
  
create table member(
		memberId int unsigned auto_increment , 
    id varchar(30) not null unique ,
    pw varchar(30) not null ,
    name varchar(20) not null ,
    birth varchar(13) not null unique , 
     datetime default now() , 
    constraint primary key( memberId )
); 
# [1] 회원테이블 샘플 레코드 삽입
insert into member ( mid , mpwd , mname , mphone ) values( 'qwe123' , 'a123456' , '유재석' ,  '010-3333-3333' );
insert into member ( mid , mpwd , mname , mphone ) values( 'asd123' , 'b123456' , '강호동' ,  '010-4444-4444' );
insert into member ( mid , mpwd , mname , mphone ) values( 'zxc123' , 'c123456' , '신동엽' ,  '010-5555-5555' );
insert into member ( mid , mpwd , mname , mphone ) values( 'vbn123' , 'd123456' , '서장훈' ,  '010-6666-6666' );
insert into member ( mid , mpwd , mname , mphone ) values( 'rty123' , 'e123456' , '하하'   ,  '010-7777-7777' );



    create table Kategorie(
	KategorieNum int auto_increment primary key,
    KategorieName char(30)
    );