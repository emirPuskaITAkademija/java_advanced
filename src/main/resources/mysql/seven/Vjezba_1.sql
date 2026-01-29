-- Vježba 1
-- Tabele: products, order_items
-- ZADATAK: Prikazati SVE proizvode [product_id, name] i količine na stavkama narudžbi[quantity]
-- a ukoliko neki proizvod nikad nije naručen onda quantity treba da bude NULL
USE store;
SELECT
    p.product_id,
    p.name,
    oi.quantity 
FROM products p
LEFT JOIN order_items oi
   ON p.product_id = oi.product_id;