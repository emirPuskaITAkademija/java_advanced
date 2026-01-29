-- Primjer 2: 
-- Želimo prikazati sve kupce i ukoliko su kreirali narudžu i njihov order_id ili NULL ako nisu
SELECT 
	c.customer_id, 
    c.first_name, 
    o.order_id
FROM customers c
LEFT JOIN orders o -- LEFT OUTER JOIN
  ON c.customer_id=o.customer_id;
  
SELECT 
	c.customer_id, 
    c.first_name, 
    o.order_id
FROM orders o  --
RIGHT JOIN customers c -- RIGHT OUTER JOIN
  ON c.customer_id=o.customer_id;  