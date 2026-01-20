-- Šta LIKE ne može a REGEXP može ? 
-- Npr. početak +  kraj +  strukturu
-- phone : slovo, 2 cifre crtica, 3 cifre
-- phone: xxx-xxx-xxxx -> sve x su cifre/brojevi
SELECT *
FROM customers
WHERE phone REGEXP '[0-9]{3}-[0-9]{3}-[0-9]{4}$';


-- želimo sve kupce čiji last_name npr. prije slova 'e' mora imati 'g' ili 'i' ili 'm'
SELECT *
FROM customers
WHERE last_name REGEXP '[gim]e';

-- želimo sve kupce čije prezime last_name sadrži 'e' ali nakon slova 'e' ide ili 'y' ili 'f'
SELECT *
FROM customers
WHERE last_name REGEXP 'e[yf]';

-- ^ POČETAK
-- $ KRAJ
-- |  LOGIČKO OR 
-- [abcd]
-- [a-f]