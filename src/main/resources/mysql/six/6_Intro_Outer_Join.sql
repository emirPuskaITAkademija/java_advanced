-- OUTER JOINS
-- Ranije smo govorili:
-- 1. INNER JOIN 
-- 2. OUTER JOIN 
-- 
-- Koje probleme nama rješava OUTER JOIN ? 
SELECT 
  c.customer_id, 
  c.first_name, 
  o.order_id
FROM orders o 
JOIN customers c
   ON o.customer_id=c.customer_id
ORDER BY c.customer_id;

-- Pogledajte rezultat query-a iznad ?? => NEŠTO NEDOSTAJE ? !!!
-- Šta nedostaje ? 
-- PRIMJER: Želim vidjeti SVE kupce i ukoliko su kupci kreirali narudžbe želim vidjeti i njihov order_id
-- OUTER JOIN => LEFT varijanta
SELECT 
  c.customer_id, 
  c.first_name, 
  o.order_id
FROM customers c 
LEFT OUTER JOIN orders o
   ON o.customer_id=c.customer_id
ORDER BY c.customer_id;


SELECT 
  c.customer_id, 
  c.first_name, 
  o.order_id
FROM orders o 
RIGHT OUTER JOIN customers c
   ON o.customer_id=c.customer_id
ORDER BY c.customer_id;