-- Vježba 1
-- Baza: store
-- Izlistaj sve proizvode iz tabele products
-- name, unit price, new price(unit price*1.1)
USE store;
SELECT 
	name, 
    unit_price, 
    unit_price*1.1 AS 'new price'
FROM products;