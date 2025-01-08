drop database if exists moviereservation;                
create database moviereservation;           
use moviereservation;     
  
create table member(
	memberId int unsigned auto_increment , 
    id varchar(20) not null unique ,
    pw varchar(20) not null ,
    name varchar(20) not null ,
    birth date, 
    mState bool,
    constraint primary key( memberId )
); 
# [1] 회원테이블 샘플 레코드 삽입
insert into member ( id, pw ,name, birth,mState) values( 'admin' , '1234' , '최홍빈' , '1994-01-09' ,true);
insert into member ( id, pw ,name, birth,mState) values( 'guest1' , '2345' , '이민수' , '1999-10-09' ,false);
insert into member ( id, pw ,name, birth,mState) values( 'guest2' , '3456' , '장민우' , '2000-08-17' ,false);
insert into member ( id, pw ,name, birth,mState) values( 'guest3' , '4567' , '류예나' , '2001-03-05' ,false);



    create table Kategorie(
	genreId int auto_increment primary key,
    genreName char(10) not null,
     constraint primary key( genreId )
    );