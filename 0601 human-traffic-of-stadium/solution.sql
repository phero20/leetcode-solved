-- Write your PostgreSQL query statement below


SELECT id, visit_date, people
FROM Stadium
WHERE people >= 100
  AND (
    -- check if this row starts a sequence of 3
    (id + 1 IN (SELECT id FROM Stadium WHERE people >= 100)
     AND id + 2 IN (SELECT id FROM Stadium WHERE people >= 100))
    -- check if this row is the middle of a sequence
    OR (id - 1 IN (SELECT id FROM Stadium WHERE people >= 100)
        AND id + 1 IN (SELECT id FROM Stadium WHERE people >= 100))
    -- check if this row ends a sequence of 3
    OR (id - 1 IN (SELECT id FROM Stadium WHERE people >= 100)
        AND id - 2 IN (SELECT id FROM Stadium WHERE people >= 100))
  )
ORDER BY visit_date;
