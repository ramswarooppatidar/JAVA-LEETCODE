--+-------------+----------+
--| Column Name | Type     |
--+-------------+----------+
--| id          | int      |
--| client_id   | int      |
--| driver_id   | int      |
--| city_id     | int      |
--| status      | enum     |
--| request_at  | varchar  |
--+-------------+----------+
--
--+-------------+----------+
--| Column Name | Type     |
--+-------------+----------+
--| users_id    | int      |
--| banned      | enum     |
--| role        | enum     |
--+-------------+----------+
--
--Input:
--Trips table:
--+----+-----------+-----------+---------+---------------------+------------+
--| id | client_id | driver_id | city_id | status              | request_at |
--+----+-----------+-----------+---------+---------------------+------------+
--| 1  | 1         | 10        | 1       | completed           | 2013-10-01 |
--| 2  | 2         | 11        | 1       | cancelled_by_driver | 2013-10-01 |
--| 3  | 3         | 12        | 6       | completed           | 2013-10-01 |
--| 4  | 4         | 13        | 6       | cancelled_by_client | 2013-10-01 |
--| 5  | 1         | 10        | 1       | completed           | 2013-10-02 |
--| 6  | 2         | 11        | 6       | completed           | 2013-10-02 |
--| 7  | 3         | 12        | 6       | completed           | 2013-10-02 |
--| 8  | 2         | 12        | 12      | completed           | 2013-10-03 |
--| 9  | 3         | 10        | 12      | completed           | 2013-10-03 |
--| 10 | 4         | 13        | 12      | cancelled_by_driver | 2013-10-03 |
--+----+-----------+-----------+---------+---------------------+------------+
--Users table:
--+----------+--------+--------+
--| users_id | banned | role   |
--+----------+--------+--------+
--| 1        | No     | client |
--| 2        | Yes    | client |
--| 3        | No     | client |
--| 4        | No     | client |
--| 10       | No     | driver |
--| 11       | No     | driver |
--| 12       | No     | driver |
--| 13       | No     | driver |
--+----------+--------+--------+
--Output:
--+------------+-------------------+
--| Day        | Cancellation Rate |
--+------------+-------------------+
--| 2013-10-01 | 0.33              |
--| 2013-10-02 | 0.00              |
--| 2013-10-03 | 0.50              |
--+------------+-------------------+

SELECT t.request_at as Day,
      ROUND(
      SUM(
        CASE
        WHEN t.status != 'completed' then 1
        ELSE 0
      )
      /COUNT(*),
       2
      ) as Cancellation_Rate
     FROM Trips t
     JOIN Users c
     ON t.client_id = c.user_id
     JOIN Users d
     ON t.client_id = d.user_id
     GROUP BY request_at
     ORDER BY request_at;
