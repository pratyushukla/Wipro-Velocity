CREATE TABLE EmployeeDetails (
   
  EmpId INTEGER PRIMARY KEY,
  FullName Varchar(255) NOT NULL,
  ManagerId INTEGER NOT NULL,
  DateOfJoining Varchar(255) NOT NULL,
  City Varchar(255) NOT NULL
   
);

CREATE TABLE EmployeeSalary (
  EmpId INTEGER,
  Project Varchar(255) NOT NULL,
  Salary INTEGER NOT NULL,
  Variable INTEGER NOT NULL,
  FOREIGN KEY (EmpId) REFERENCES EmployeeDetails(EmpId)
);

INSERT INTO EmployeeDetails VALUES(121,"John Snow",321,"01/31/2014","Toronto");
INSERT INTO EmployeeDetails VALUES(321,"Walter White",986,"01/30/2015","California");
INSERT INTO EmployeeDetails VALUES(421,"Kuldeep Rana",876,"27/11/2016","New Delhi");
INSERT INTO EmployeeDetails VALUES(422,"Kuldeep Rana",876,"27/11/2016","New Delhi");

INSERT INTO EmployeeSalary VALUES(121,"P1",8000,500);
INSERT INTO EmployeeSalary VALUES(321,"P2",10000,1000);
INSERT INTO EmployeeSalary VALUES(421,"P1",12000,0);

Select ManagerId, DateOfJoining, count(*) from EmployeeDetails group by ManagerId, DateOfJoining where count(*)>1;
-- Select * from (select rownum as r,* from EmployeeDetails) where r mod 2 <>0;
select Max(salary) from employeesalary where salary<(select max(salary) from employeesalary where salary<(select max(salary) from EmployeeSalary));
