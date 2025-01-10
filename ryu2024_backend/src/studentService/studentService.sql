drop database if exists studentService;
create database studentService;
use studentService;

create table student(
   studentId smallint auto_increment,
   sname varchar(20) not null,
   scoKor smallint unsigned,
   scoEng smallint unsigned,
   scoMath smallint unsigned,
   constraint primary key (studentId)
   
);
select * from student;