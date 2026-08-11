-- Last updated: 11/08/2026, 14:22:19
# Write your MySQL query statement below
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
AND p1.id > p2.id;
