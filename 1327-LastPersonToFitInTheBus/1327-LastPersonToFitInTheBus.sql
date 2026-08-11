-- Last updated: 11/08/2026, 14:17:12
SELECT person_name
FROM (
    SELECT person_name,
           SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
    ORDER BY turn
) AS cumulative
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;
