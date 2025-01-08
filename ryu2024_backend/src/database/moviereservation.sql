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



    create table categorie(
	genreId int unsigned auto_increment,
    genreName char(10) not null,
     constraint primary key( genreId )
    );
    
insert into categorie (genreName ) values( '액션' );
insert into categorie (genreName ) values( '판타지' );
insert into categorie (genreName ) values( '로맨스' );
insert into categorie (genreName ) values( '드라마' );
insert into categorie (genreName ) values( '미스터리' );

create table movie(
	movieId int unsigned auto_increment , 
    movieName varchar(30) not null,
    runTime tinyint unsigned not null,
    movieGrade varchar(10) not null,
    genreId int unsigned not null,
    constraint foreign key(genreId) references categorie(genreId),
    constraint primary key( movieId )
); 

insert into movie (movieName,runTime,movieGrade,genreId) values( '아바타',166,'15세',2);
insert into movie (movieName,runTime,movieGrade,genreId) values( '기생충',131,'15세',1);
insert into movie (movieName,runTime,movieGrade,genreId) values( '하얼빈',115,'15세',4);
insert into movie (movieName,runTime,movieGrade,genreId) values( '인턴',121,'12세',4);
insert into movie (movieName,runTime,movieGrade,genreId) values( '파묘',134,'15세',5);
insert into movie (movieName,runTime,movieGrade,genreId) values( 'About Time',123,'15세',3);

select * from movie;


create table theater(
theaterId tinyint unsigned auto_increment,
screen varchar(20) not null,
constraint primary key (theaterId)
);