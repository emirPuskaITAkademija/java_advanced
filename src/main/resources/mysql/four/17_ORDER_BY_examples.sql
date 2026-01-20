-- ORDER BY clause
-- Koncept vezan za sortiranje
-- DEFAULTNI sorting by primary key..customer_id
USE store;
SELECT *
FROM customers
ORDER BY first_name;

SELECT *
FROM customers
ORDER BY first_name DESC;

-- sortiranje po više kolona
SELECT *
FROM customers
ORDER BY state, first_name;

SELECT *
FROM customers
ORDER BY state DESC, first_name DESC;

SELECT *
FROM customers
ORDER BY state DESC, first_name;