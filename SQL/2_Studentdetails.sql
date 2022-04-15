Create table Studentdetails(
    id integer Primary Key,
    name varchar(255),
    city varchar(255)
);

Insert into Studentdetails(id, name, city)
values (1, 'Jon', 'Kolkata');
values (2, 'Debdib', 'Pune');
values (3, 'Prat', 'Chennai');
values (4, 'Ravi', 'Bangalore');
values (5, 'Pooja', 'Chennai');
values (6, 'Keshaw', 'Pune');
values (7, 'Adit', 'Kolkata');

SELECT * FROM `Studentdetails` WHERE city = 'Chennai' or city = 'Pune';
SELECT * FROM `Studentdetails` WHERE city = 'Chennai' and city = 'Pune';
SELECT * FROM `Studentdetails` WHERE not city = 'Bangalore';
SELECT * FROM `Studentdetails` order by city;

Update Studentdetails set city = 'Kochi' where id = 4; 

select * from Studentdetails where id in (2,4);
select * from Studentdetails limit 5;
select count(roll) from Studentdetails;

select * from Studentdetails where city like '%e';
select * from Studentdetails where city like '_h%';
select * from Studentdetails where name like '[a-k]%';

select name from Studentdetails where id in (3,6);
select name from Studentdetails where id not in (3,6);

