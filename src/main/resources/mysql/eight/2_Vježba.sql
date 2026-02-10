-- Vježba 2
-- Uraditi cross join između shippers i products
-- prvo: explicit syntax
-- onda: implicit syntax

-- EXPLICIT syntax
SELECT 
	sh.name 'dostavljač', 
    p.name 'produkt'
FROM shippers sh
CROSS JOIN products p;

-- IMPLICIT syntax
SELECT 
	sh.name 'dostavljač', 
    p.name 'produkt'
FROM shippers sh, products p;