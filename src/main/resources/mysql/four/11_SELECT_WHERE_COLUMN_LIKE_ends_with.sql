USE store;
-- DOhvati kupce čije ime završava na 'y'
SELECT *
FROM customers
WHERE last_name LIKE '%y'