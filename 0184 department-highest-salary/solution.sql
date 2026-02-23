-- Write your PostgreSQL query statement below
select d.name as Department,e.name as Employee,
e.salary as Salary
from Employee as e left join Department as d on d.id=e.departmentId where e.salary in 
(select max(salary) from employee WHERE departmentId = e.departmentId);
;
