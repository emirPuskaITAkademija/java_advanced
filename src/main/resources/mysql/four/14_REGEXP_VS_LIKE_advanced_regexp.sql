-- LIKE
-- REGEXP 
-- Dohvati sve kupce koji 
-- imaju riječ "field" u svom 
-- prezimenu -> last_name
USE store;

-- contains "field" with LIKE and REGEXP
SELECT *
FROM customers
-- WHERE last_name LIKE '%field%';
WHERE last_name REGEXP 'field';

-- počinje sa "field"
SELECT * 
FROM customers
-- WHERE last_name LIKE 'field%';
WHERE last_name REGEXP '^field';

-- završava sa "field"
SELECT * 
FROM customers
-- WHERE last_name LIKE '%field';
WHERE last_name REGEXP 'field$'

-- Što nam je trebao REGEXP u životu ? 
-- Zar nije moglo ostati na LIKE
-- Šta ne može LIKE a može REGEXP ? 
-- Daj mi primjer ? 
-- Npr. Želimo dohvatiti kupce čije prezime
-- sadrži "field" ili "mac" ili  "rose"
SELECT *
FROM customers
WHERE last_name REGEXP 'field|mac|rose';