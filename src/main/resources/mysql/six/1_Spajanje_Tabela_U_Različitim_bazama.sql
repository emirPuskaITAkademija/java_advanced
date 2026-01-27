-- spajanje podataka iz više tabela
-- Baza : store, inventory ... 
-- JOINING across DBs. Spajanje podataka koji se nalaze u tabelama, a pri tome su tabele u 
-- različitim BAZAMA
-- JOIN store.order_items i inventory.products
-- 1. JOIN => INNER JOIN 
-- 2. LEFT & RIGHT => OUTER JOIN 

-- Primjer: store.order_items i inventory.products
-- order_items: order_id, product_id, quantity, unit_price
-- inventory.products: product_id, name, quantity_in_stock, unit_price
USE store;
SELECT *
FROM order_items oi;

USE inventory;
SELECT *
FROM products p;

-- Spajanje podataka između tabela koje se nalaze u različitim bazama
SELECT 
	oi.order_id, 
    oi.quantity, 
    oi.unit_price 'Cijena po kojoj smo kupili', 
    p.unit_price 'Trenutna cijena', 
    p.name
FROM store.order_items oi 
INNER JOIN inventory.products p 
	ON oi.product_id = p.product_id;