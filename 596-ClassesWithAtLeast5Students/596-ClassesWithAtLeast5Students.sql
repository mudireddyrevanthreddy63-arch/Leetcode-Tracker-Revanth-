-- Last updated: 11/08/2026, 14:19:46
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;

