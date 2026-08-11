-- Last updated: 11/08/2026, 14:17:30
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
