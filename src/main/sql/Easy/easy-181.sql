# Write your MySQL query statement below
SELECT e.name as Employee,e.salary as EmployeeSalary, m.salary as ManagerSalary
From Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;