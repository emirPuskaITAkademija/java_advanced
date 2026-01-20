-- Vježba 2
-- Dohvati sve kupce koji su 
-- skladišteni u tabeli 
-- customers čija:
--  1. adresa sadrži TRAIL
--             ili AVENUE
--  2. phone number ends with 9

SELECT *
FROM customers
WHERE  address LIKE '%TRAIL%' 
	OR address LIKE '%AVENUE%'; 
    
SELECT *
FROM customers
WHERE  phone LIKE '%9';

SELECT * 
FROM customers 
WHERE (address LIKE '%trail%' OR address LIKE '%avenue%') 
AND phone LIKE '%4';