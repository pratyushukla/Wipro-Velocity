Create table Student(
    id integer,
    name varchar(255),
    class integer,
    roll integer
);

Insert into Student(id, name, class, roll)
values (1, 'Prat', 6, 29);
values (2, 'Shukla', 5, 57);

Select * from Student;

Select * from Student where roll = 57;

