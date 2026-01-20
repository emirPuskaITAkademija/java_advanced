USE store;
-- SELECT asterisk nije nekada dobro koristiti. 
-- Zašto ? Odgovor: Asterisk vraća sve kolone, a nas baš podaci iz svih kolona ne zanimaju.
-- Razlog 2: BIG TABLES milion redova i * zna biti neefikasan

SELECT first_name, last_name
FROM customers; 