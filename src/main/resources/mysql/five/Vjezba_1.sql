-- Vježba 1 
-- Potrebno je uraditi upit na tabelu order_items
-- Zadatak upita: dohvatiti sve stavke narudžbe 2 i SORTIRATI po TOTAL PRICE
-- Sortirati stavke unutar narudžbe broj 2 po TOTAL PRICE i to od najveće ka najmanjoj
-- DESC
USE store;
SELECT *
FROM order_items
WHERE order_id=2
ORDER BY quantity*unit_price DESC;


SELECT *, quantity*unit_price AS total_price
FROM order_items
WHERE order_id=2
ORDER BY total_price DESC;

-- SELECT *
-- FROM order_items
-- WHERE order_id=2
-- ORDER BY 3;