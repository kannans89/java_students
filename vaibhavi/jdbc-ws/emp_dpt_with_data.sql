CREATE TABLE DEPT
       (DEPTNO int PRIMARY KEY,
     DNAME VARCHAR(14) ,
     LOC VARCHAR(13) ) ;
     
     
     CREATE TABLE EMP
       (EMPNO int  PRIMARY KEY,
     ENAME VARCHAR(10),
     JOB VARCHAR(9),
     MGR int,
     HIREDATE DATE,
     SAL decimal(7,2),
     COMM decimal(7,2),
     DEPTNO int);
     `information_schema``emp_db`
     alter table EMP  add constraint fk_deptno foreign key(deptno) references dept(deptno);
     
     INSERT INTO DEPT VALUES
     (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES
     (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES
     (40,'OPERATIONS','BOSTON');
     
     
     INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,date('1980-12-10'),800,NULL,20);

INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,date('1981-2-20'),1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,date('1981-2-22'),1250,500,30);

INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,date('1981-2-4'),2975,NULL,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,date('1981-8-28'),1250,1400,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,date('1981-5-1'),2850,NULL,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,date('1981-6-7'),2450,NULL,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,date('1987-7-13'),3000,NULL,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',NULL,date('1981-11-17'),5000,NULL,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,date('1981-8-9'),1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,date('1987-7-13'),1100,NULL,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,date('1981-12-3'),950,NULL,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,date('1981-12-1'),3000,NULL,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,date('1982-1-23'),1300,NULL,10);

select ENAME from emp where sal>2000;
select ENAME from emp where deptno=10 or deptno=20;
select * from emp where ename="smith";
select Ename,deptno from emp where deptno=(select deptno from emp where ename="smith") ;
select Ename,deptno from emp where deptno=(select deptno from emp where ename="smith") and ename!="smith";
select Ename,deptno,sal from emp where sal=(select sal from emp where ename="scott");
select * from emp where ename like 'a%';
select * from emp where ename like '%s';
select count(ename) as no_of_emp from emp;
select count(*) as count_emp ,deptno from emp  group by(deptno) ;

select count(*) as count,job from emp group by(job);
select count(*) as count,job,deptno from emp group by(job),(deptno);
select ename from emp order by ename desc;
select ename,loc,dname from emp inner join dept on emp.deptno=dept.deptno;
select ename,mgr from emp;
select ename,mgr,dname from emp inner join dept on emp.deptno=dept.deptno;
select dname,ename,dept.deptno from emp right join dept on emp.deptno=dept.deptno; 
select dept.dname from dept where NOT EXISTS (SELECT * FROM EMP  WHERE Dept.DEPTNO = Emp.DEPTNO);
 














