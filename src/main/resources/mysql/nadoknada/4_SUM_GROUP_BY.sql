-- film 
-- inventory
-- rental
-- payment
-- ZADATAK: Htio sam da sumiram zaradu od rentanja filmova i da prikažem sumarno zaradu svakog filma

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