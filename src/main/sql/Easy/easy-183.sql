# Write your MySQL query statement below
-- SELECT c.name as Customers
-- FROM Customers c
-- join Orders o
-- ON c.id = o.customerId
-- WHERE  c.id IS NULL;

-- Your query has a small logical mistake.

-- You used JOIN (INNER JOIN), which returns only customers who have placed orders.

-- Also, WHERE c.id IS NULL will never be true because c.id is a primary key and cannot be NULL.

SELECT c.name as Customers
FROM Customers c
Left join Orders o
ON c.id = o.customerId
WHERE  o.customerId IS NULL;

