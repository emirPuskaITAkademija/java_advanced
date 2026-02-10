-- USING clause
USE store;

SELECT 
   o.order_id, 
   c.first_name, 
   sh.name 'Dostavljač'
FROM orders o
JOIN customers c 
    USING (customer_id)
LEFT JOIN shippers sh
    USING (shipper_id);
	-- ON o.customer_id=c.customer_id;
-- kolona preko koje je urađeno spajanje se isto zove u obje tabele(orders, customers) -> customer_id
