-- Write your PostgreSQL query statement below




SELECT ROUND(SUM(tiv_2016)::numeric, 2) AS tiv_2016
FROM Insurance i
WHERE 
    -- Condition 1: tiv_2015 is shared by more than one policyholder
    i.tiv_2015 IN (
        SELECT tiv_2015
        FROM Insurance
        GROUP BY tiv_2015
        HAVING COUNT(*) > 1
    )
    -- Condition 2: (lat, lon) pair is unique
    AND (lat, lon) IN (
        SELECT lat, lon
        FROM Insurance
        GROUP BY lat, lon
        HAVING COUNT(*) = 1
    );
