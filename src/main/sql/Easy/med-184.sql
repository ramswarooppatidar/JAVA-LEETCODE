-- Write your MySQL query statement below
-- 1 return result from both the tables so need join 
-- SELECT d.name as Department, e.name as Employee, e.salary
-- FROM Employee e
-- JOIN Department d
-- ON e.departmentId = d.id
-- WHERE (e.departmentId, e.salary) IN (
--     SELECT departmentId, MAX(salary) 
--     FROM  Employee 
--     GROUP BY departmentId
--     ) ;



-- 2 Alternate using DANSE RANK
SELECT
    Department,
    Employee,
    Salary
FROM (
    SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS rnk
    FROM Employee e
    JOIN Department d
        ON e.departmentId = d.id
) t
WHERE rnk = 1;
-- Accepted
-- Runtime: 153 ms
-- Case 1
-- Input
-- Employee =
-- | id | name  | salary | departmentId |
-- | -- | ----- | ------ | ------------ |
-- | 1  | Joe   | 70000  | 1            |
-- | 2  | Jim   | 90000  | 1            |
-- | 3  | Henry | 80000  | 2            |
-- | 4  | Sam   | 60000  | 2            |
-- | 5  | Max   | 90000  | 1            |
-- Department =
-- | id | name  |
-- | -- | ----- |
-- | 1  | IT    |
-- | 2  | Sales |
-- Output
-- | Department | Employee | Salary |
-- | ---------- | -------- | ------ |
-- | IT         | Jim      | 90000  |
-- | IT         | Max      | 90000  |
-- | Sales      | Henry    | 80000  |
-- Expected
-- | Department | Employee | Salary |
-- | ---------- | -------- | ------ |
-- | IT         | Jim      | 90000  |
-- | Sales      | Henry    | 80000  |
-- | IT         | Max      | 90000  |












-- 3 IF join not required then we can used this query 
-- SELECT name, departmentId, salary as Highest_salary_inDepartment
-- FROM (
--     SELECT *, 
--        ROW_NUMBER() OVER (
--                PARTITION BY departmentId
--                ORDER BY salary DESC
--            ) AS rn 
--        FROM Employee
-- ) t
-- where rn = 1;

-- Input Employee =
-- | id | name  | salary | departmentId |
-- | -- | ----- | ------ | ------------ |
-- | 1  | Joe   | 70000  | 1            |
-- | 2  | Jim   | 90000  | 1            |
-- | 3  | Henry | 80000  | 2            |
-- | 4  | Sam   | 60000  | 2            |
-- | 5  | Max   | 90000  | 1            |

-- Department =
-- | id | name  |
-- | -- | ----- |
-- | 1  | IT    |
-- | 2  | Sales |

-- Output
-- | name  | departmentId | Highest_salary_inDepartment |
-- | ----- | ------------ | --------------------------- |
-- | Jim   | 1            | 90000                       |
-- | Henry | 2            | 80000                       |

-- Expected
-- | Department | Employee | Salary |
-- | ---------- | -------- | ------ |
-- | IT         | Jim      | 90000  |
-- | Sales      | Henry    | 80000  |
-- | IT         | Max      | 90000  |



