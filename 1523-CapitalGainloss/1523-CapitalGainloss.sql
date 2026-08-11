-- Last updated: 11/08/2026, 14:15:35
SELECT stock_name,
       SUM(CASE 
             WHEN operation = 'Sell' THEN price
             ELSE -price
           END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;
