USE store;
-- UNDERSCORE 
-- Želimo kupce čuje je prezime sastavljeno
-- od 6 karaktera s tim da nas ne zanima prvih 5 al zadnji mora 
-- biti y
SELECT *
FROM customers
WHERE last_name LIKE '_____y';