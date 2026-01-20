USE store;
-- UNDERSCORE 
-- Želimo kupce čuje je prezime sastavljeno
-- od 6 karaktera s tim da nas ne zanimaju 4 karaktera
-- u sredini ali prvi mora biti 'b' a zadnji 'y'
SELECT *
FROM customers
WHERE last_name LIKE 'b____y';