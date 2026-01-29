-- OUTER JOIN 
-- dvije tabele => šta ako želimo spojiti 3 i više tabela
-- tabele: customers, orders, shippers 
-- Neke narudzbe imaju shipper_id = NULL dok druge imaju shipper_id != NULL
-- Hajmo sada prikazati IME dostavljača ili shipper-a
SELECT 
   c.customer_id, 
   c.first_name, 
   o.order_id, 
   sh.name 'Shipper'
FROM customers c
LEFT JOIN orders o
	ON c.customer_id=o.customer_id
LEFT JOIN shippers sh
	ON o.shipper_id = sh.shipper_id;