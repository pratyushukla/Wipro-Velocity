-- Joins 
Select * from student;
select * from Studentdetails;

select s.name, class, city from student as s , Studentdetails as sb where s.id = sb.id;