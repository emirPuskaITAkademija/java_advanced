-- UNION ERRORS
SELECT
	first_name, 
    last_name
FROM customers
UNION
SELECT 
	name
    -- name
FROM shippers;
-- Ima smisla kombinirati rezultate VIŠE upita ako svi UPITI traže isti broj kolona.
-- Inače nema ni smisla..
