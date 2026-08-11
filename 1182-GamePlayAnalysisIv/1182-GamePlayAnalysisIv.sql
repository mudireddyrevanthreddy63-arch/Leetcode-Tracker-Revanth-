-- Last updated: 11/08/2026, 14:16:19
SELECT 
    ROUND(AVG(b.event_date IS NOT NULL), 2) AS fraction
FROM (
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
) a
LEFT JOIN Activity b
ON a.player_id = b.player_id
AND DATEDIFF(b.event_date, a.first_login) = 1;
