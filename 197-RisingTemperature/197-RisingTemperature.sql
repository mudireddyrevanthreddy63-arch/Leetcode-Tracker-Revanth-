-- Last updated: 11/08/2026, 14:22:18
SELECT w1.Id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
WHERE w1.Temperature > w2.Temperature;
