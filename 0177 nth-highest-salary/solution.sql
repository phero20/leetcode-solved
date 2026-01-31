CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  declare offsetValue INT;
  set offsetValue=N-1;
  RETURN (
      # Write your MySQL query statement below.
select distinct salary from Employee order by salary desc limit offsetValue,1
  );
END
