# Write your MySQL query statement below







-- select empId,bonus from Employee where empId not in (select empId from Bonus where bonus>1000);

select e.name,b.bonus from Employee as e left join Bonus as b on 
e.empid=b.empid where b.bonus<1000 or b.bonus is null ;
