-- Vježba 4 
-- Analiziraj bazu store i tabelu orders i dohvati mi sve narudžbe koje nisu shipped/isporučene
SELECT *
FROM orders
WHERE shipped_date IS NULL OR shipper_id IS NULL;