-- IS NULL operator
-- Kako dohvatiti sve kupce čija vrijednost neke kolone nedostaje
-- npr. phone number
USE store;
SELECT *
FROM customers
WHERE phone IS NULL;