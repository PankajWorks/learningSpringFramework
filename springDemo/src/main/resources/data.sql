create table person(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birthday timestamp,
    primary key(id)
);

insert into Person values(10001, 'Gunjan', 'banglore', sysdate());
insert into Person values(10002, 'Pankaj', 'delhi', sysdate());
insert into Person values(10003, 'Aadi', 'Hazaribag', sysdate());
insert into Person values(10004, 'Aanya', 'Patna', sysdate());