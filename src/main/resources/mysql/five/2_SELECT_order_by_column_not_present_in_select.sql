-- selektuj first_name, last_name ali sortiraj ih po birthdate
-- sortirati možete i po kolonama koje se ne koriste u SELECT
SELECT first_name, last_name
FROM customers
ORDER BY birth_date;