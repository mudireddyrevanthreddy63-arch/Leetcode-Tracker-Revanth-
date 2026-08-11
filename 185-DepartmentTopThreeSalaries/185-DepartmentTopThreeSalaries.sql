-- Last updated: 11/08/2026, 14:19:28
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM (
    SELECT id, name, salary, departmentId,
           DENSE_RANK() OVER (
               PARTITION BY departmentId 
               ORDER BY salary DESC
           ) AS rnk
    FROM Employee
) e
JOIN Department d
  ON e.departmentId = d.id
WHERE e.rnk <= 3;
