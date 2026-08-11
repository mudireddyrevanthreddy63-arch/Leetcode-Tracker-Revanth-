-- Last updated: 11/08/2026, 14:15:47
# Write your MySQL query statement below
SELECT visited_on, amount, average_amount
FROM
(SELECT
visited_on,
SUM(amount) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount,
round(AVG(amount) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW),2) AS average_amount,
COUNT(*) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS total_count
FROM (select
visited_on, SUM(amount) as amount
FROM customer 
group by 1) temp1) temp2
WHERE total_count=7
ORDER BY visited_on