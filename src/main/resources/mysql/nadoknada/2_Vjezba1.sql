-- Vježba 1: 
-- Koliko je filmova izašlo po godinama izlaska ? 
SELECT
 COUNT(*) AS 'Broj Filmova u godini izlaska',
 f.release_year
FROM film f
GROUP BY f.release_year;