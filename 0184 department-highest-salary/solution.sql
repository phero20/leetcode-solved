# Write your MySQL query statement below



-- select 
-- (select name from Department where id=e.departmentId) as Department,
-- e.name as Employee,e.salary as Salary from Employee as e where salary = (select max(salary) from Employee where departmentId=e.departmentId);




select d.name as Department,e.name as Employee,
e.salary as Salary
from Employee as e left join Department as d on d.id=e.departmentId where e.salary in 
(select max(salary) from employee WHERE departmentId = e.departmentId);
;



