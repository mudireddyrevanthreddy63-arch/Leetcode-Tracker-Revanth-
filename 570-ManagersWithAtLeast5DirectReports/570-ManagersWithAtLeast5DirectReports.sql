-- Last updated: 11/08/2026, 14:17:45
SELECT e.name
FROM Employee e
JOIN Employee m ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(m.id) >= 5;
