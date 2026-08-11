-- Last updated: 11/08/2026, 14:15:22
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions REGEXP '(^| )DIAB1';
