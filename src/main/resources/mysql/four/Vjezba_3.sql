-- VJEŽBA 3
-- Dohvati kupce/customers čije REGEXP
-- 1. first name sadrži ELKA ili AMBUR
-- 2. last name završava sa EY ili ON 
-- 3. last name počinje sa MY ili sadrži SE
-- 4. last name sadrži B praćeno sa R ili U

-- 1
SELECT *
FROM customers 
WHERE first_name REGEXP 'elka|ambur';

-- 2
SELECT *
FROM customers 
WHERE last_name REGEXP 'ey$|on$';

-- 3 
SELECT *
FROM customers
WHERE last_name REGEXP '^my|se';

-- 4 last name sadrži B praćeno sa R ili U
SELECT *
FROM customers
WHERE last_name REGEXP 'b[ru]';