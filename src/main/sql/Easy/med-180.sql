# Write your MySQL query statement below
 SELECT DISTINCT l1.num as ConsecutiveNums
 FROM logs l1
 JOIN logs l2 ON l1.id = l2.id - 1
 JOIN logs l3 on l2.id = l3.id - 1
 where l1.num = l2.num
 AND l1.num = l3.num;

SELECT DISTINCT num as ConsecutiveNums
FROM (
    SELECT
        num,
        LAG(num, 1) OVER (ORDER BY id) as prev1,
        LAG(num, 2) OVER (ORDER BY id) as prev2
    FROM logs
) t
WHERE num = prev1 AND num = prev2;
