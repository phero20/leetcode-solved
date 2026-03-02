CREATE OR REPLACE FUNCTION NthHighestSalary(N INT)
RETURNS TABLE (Salary INT) AS $$
BEGIN
  IF N < 1 THEN
    -- Return nothing if N is invalid
    RETURN;
  END IF;

  RETURN QUERY
  SELECT DISTINCT e.salary
  FROM Employee e
  ORDER BY e.salary DESC
  OFFSET N-1 LIMIT 1;
END;
$$ LANGUAGE plpgsql;
