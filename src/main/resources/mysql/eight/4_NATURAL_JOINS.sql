-- Natural Joins
-- jednostavniji način koji NE PREPORUČUJEM - vrlo često neočekivan rezultat
USE store;
SELECT 
	o.order_id, 
    c.first_name
FROM orders o 
NATURAL JOIN customers c 
	-- ON  o.customer_id=c.customer_id;
    -- USING (customer_id);