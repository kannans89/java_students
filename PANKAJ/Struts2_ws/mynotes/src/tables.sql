create user mynotes identified by mynotes;
grant connect, resource to mynotes;

create sequence noteid_seq nocache;

create table users 
( email     varchar2(30) primary key,
  password  varchar2(10) not null,
  fullname  varchar2(50),
  dj        date
);

create table notes 
( 
  noteid   number(5) primary key,
  email    varchar2(30) references users(email),
  title    varchar2(100) not null,
  text     varchar2(2000) not null,
  updated  date
);

insert into users values ('a@a.com','a','Andy',sysdate);
