# Write your MySQL query statement below
SELECT Department, Employee , Salary
FROM (
    SELECT
     d.name as Department,
     e.name as Employee,
     e.salary as Salary,
     DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary desc) as rn
     FROM Employee e
     JOIN Department d
      ON e.departmentId = d.id
) t
WHERE rn <= 3;
-- WHERE rn IN (1,2,3)
-- LIMIT 3