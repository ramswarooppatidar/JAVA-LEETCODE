Interview tip: Whenever a question asks for the first date, earliest date, or minimum date for each user, think of:
SELECT user_id, MIN(date_column)
FROM table_name
GROUP BY user_id;

# Write your MySQL query statement below
SELECT player_id , MIN(event_date) AS first_login
FROM  Activity
GROUP BY player_id