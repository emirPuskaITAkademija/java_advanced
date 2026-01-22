-- Vježba 3
-- Tabele: order_items (kolone: order_id, product_id..)
--         products
-- ZADATAK: Napravite prikaz proizvoda u order_items ali i da dodatno prikažite 
-- naziv proizvoda
SELECT 
  oi.order_id,
  oi.product_id, 
  p.name,
  oi.quantity, 
  oi.unit_price
FROM order_items oi
JOIN products p ON p.product_id=oi.product_id;


SELECT 
  order_id,
  p.product_id, 
  name,
  quantity, 
  p.unit_price AS 'Trenutna cijena proizvoda',
  oi.unit_price AS 'Stavka narudžbe'
FROM order_items oi
JOIN products p ON p.product_id=oi.product_id;
-- products : unit_price
-- aktuelnu jediničnu cijenu na datum 22.01.2026 4 EURA
-- na datum: 23.01.2026  3.5 EURA
-- order_items: unit_price
-- Kristijan kreira narudžbu i kao stavku dodat artikl sa ovom cijenom 4 EURA quantity = 2
-- Milica dođe dana 23.01.2026 i doda 2 stavke istog artikla i kolko ga plati po 3.5 EURA quantity=2
  