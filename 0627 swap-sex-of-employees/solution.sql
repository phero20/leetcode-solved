# Write your MySQL query statement below



update Salary 
SET sex = CASE 
when sex='m' THEN 'f' ELSE 'm' END;
