-- ORDER BY 
-- MySQL Workbench ----> RDBMS(MySQL) -> DB 
-- ResultSet
USE store;
SELECT *
FROM customers
ORDER BY first_name;

SELECT *
FROM customers
ORDER BY state DESC, first_name ASC;