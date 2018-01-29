create user mycalendar identified by mycalendar;
grant connect, resource to mycalendar;

connect mycalendar/mycalendar

create table users 
( 
   username  varchar(10) primary key,
   password  varchar(10) not null,
   email     varchar(30) unique not null
);

create table Events 
( 
   eventid   number(5) primary key,
   title     varchar(100) not null,
   eventdate date not null,
   eventtime varchar(5),
   username  varchar(10) references users(username)
);

create sequence  eventid_sequence  nocache;

insert into users values('abc','abc','abc@gmail.com');
commit;

insert into events values ( eventid_sequence.nextval,
 'Work with project in Java EE', '30-oct-2014','22:00','abc');

insert into events values ( eventid_sequence.nextval,
 'Pay Electricity Bill', '31-oct-2014','10:00','abc');


