-- Last updated: 11/08/2026, 14:17:25
SELECT *
FROM cinema
WHERE id % 2 = 1
  AND description != 'boring'
  AND rating > 3.0
ORDER BY rating DESC;
