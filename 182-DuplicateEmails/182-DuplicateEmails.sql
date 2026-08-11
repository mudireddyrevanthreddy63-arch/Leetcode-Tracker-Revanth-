-- Last updated: 11/08/2026, 14:19:33

SELECT 
    email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
