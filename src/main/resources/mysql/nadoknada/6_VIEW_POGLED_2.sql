CREATE OR REPLACE VIEW zarada_filmova_po_godinama AS
SELECT 
  f.film_id,
  f.title,
  SUM(p.amount) AS zarada
FROM film f
JOIN inventory i ON i.film_id=f.film_id
JOIN rental r ON r.inventory_id=i.inventory_id
JOIN payment p ON p.rental_id=r.rental_id
GROUP BY f.film_id, f.title
ORDER BY zarada DESC;

-- KADA naapravimo pogleda više nikad ne moramo praviti višestruki join da
-- dobijemo zaradu filmova po godinama nego jednostavno uradimo upit na taj 
-- VIEW
SELECT * FROM zarada_filmova_po_godinama;