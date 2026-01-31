# Write your MySQL query statement below


WITH CTE AS(
    select min(id) as keepId from Person group by email
)



delete from person 
where id not in (select keepId from CTE);



