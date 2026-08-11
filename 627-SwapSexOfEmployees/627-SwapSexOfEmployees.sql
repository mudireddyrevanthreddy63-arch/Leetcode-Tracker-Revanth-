-- Last updated: 11/08/2026, 14:17:23
UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;
