-- Last updated: 11/08/2026, 14:22:37
# Write your MySQL query statement below
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores
ORDER BY score DESC;
