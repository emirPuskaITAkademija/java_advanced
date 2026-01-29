-- OUTER JOINS
-- Dvije vrste JOIN:
-- 1. INNER JOIN ( JOIN )
-- 2. OUTER JOIN (LEFT JOIN ili RIGHT JOIN)
-- Primjer 1: INNER JOIN
--  Želimo prikazati samo kupce(customers) koji su kreirali narudžbe(orders)
-- customers: customer_id, first_name
-- orders: order_id
USE store;
SELECT 
	c.customer_id, 
    c.first_name, 
    o.order_id
FROM customers c
JOIN orders o -- INNER JOIN
  ON c.customer_id=o.customer_id;
  
  
-- Primjer 2: 
-- Želimo prikazati sve kupce i ukoliko su kreirali narudžu i njihov order_id ili NULL ako nisu
SELECT 
	c.customer_id, 
    c.first_name, 
    o.order_id
FROM customers c
LEFT JOIN orders o -- LEFT OUTER JOIN
  ON c.customer_id=o.customer_id;