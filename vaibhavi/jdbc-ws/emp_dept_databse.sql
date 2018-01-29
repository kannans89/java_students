
create table Dept
(
dno int primary key,
dname varchar(20) not null,
loc varchar(20) not null
)

drop table emp
create table emp
(
eno int primary key,
ename varchar(20) not null,
sal decimal(7,2) not null,
deptno int not null
)

alter table emp add constraint fk_deptno foreign key(deptno) references dept(dno)

insert into Dept values(1,'IT','mumbai');

insert into emp values(4,'vaibhavi',10000,1);




