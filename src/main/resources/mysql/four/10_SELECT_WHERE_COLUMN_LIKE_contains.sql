-- LIKE operator
USE store;
-- SELECT *
-- FROM customers;
-- Zadatak:Dohvati sve kupce čije prezime počinje sa 'b'
-- 'b' ili 'B'
SELECT *
FROM customers
WHERE last_name LIKE '%b%'
-- % ili Percent znak ne mora biti na kraju PATTERNA ili UZORKA
