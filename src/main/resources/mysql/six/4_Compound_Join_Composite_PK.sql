-- Compound Join Conditions
-- U svim primjerima koje smo do sada koristili imali smo 
-- samo JEDNU KOLONU da JEDINSTVENO prestavimo redove u nekoj tabeli
-- orders, customers   => customer_id
-- orders, order_statuses => status, order_status_id
-- MEĐUTIM, postoje situacije kada TO NIJE DOVOLJNO i KADA ne MOŽEMO
-- koristiti JEDNU kolonu za jedinstvenu identifikaciju reda u tabeli
USE store;
SELECT *
FROM order_items;
-- Šta ovdje predstavlja JEDINSTVENOST REDA ??
-- Nije unique: order_id
-- Nije unique: product_id
-- NJIHOVA KOMBINACIJA JESTE.. ne možete pronaći 2 reda sa 
-- kombinacijom vrijednosti order_id=8, product_id=5
-- KOMPOZITNI PRIMARNI KLJUČ
-- COMPOSITE PK 

-- Kakve ovo veze ima sa JOIN clause ? ?
-- Tabela: order_items(PK - kombinacija order_id, product_id), order_item_notes (order_id, product_id)
-- COMPOUND JOIN 
SELECT *
FROM order_items oi
JOIN order_item_notes oin 
  ON oi.order_id=oin.order_Id
  AND oi.product_id=oin.product_id;
