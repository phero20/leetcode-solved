# Write your MySQL query statement below




select e.name,o.bonus from Employee e left join Bonus o on e.empId=o.empId where o.bonus<1000 or o.bonus is null;

