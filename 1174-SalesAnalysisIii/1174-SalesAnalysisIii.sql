-- Last updated: 11/08/2026, 14:17:39
SELECT p.product_id, p.product_name
FROM Product p
WHERE p.product_id IN (
    SELECT DISTINCT product_id
    FROM Sales
    WHERE sale_date BETWEEN '2019-01-01' AND '2019-03-31'
)
AND p.product_id NOT IN (
    SELECT DISTINCT product_id
    FROM Sales
    WHERE sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31'
);
