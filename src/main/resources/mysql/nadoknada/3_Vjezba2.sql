-- Vježba 2
-- Koliko filmova ima svaki žanr ? 
SELECT
  c.name AS category_name, 
  count(*) AS film_count
FROM category c
JOIN film_category fc ON fc.category_id=c.category_id
GROUP BY c.name
ORDER BY film_count DESC;
-- Primjer: Najpopularniji žanrovi prije 2007
SELECT
  c.name AS category_name, 
  count(*) AS film_count
FROM category c
JOIN film_category fc ON fc.category_id=c.category_id
JOIN film f ON f.film_id=fc.film_id
WHERE f.release_year<2007
GROUP BY c.name
ORDER BY film_count DESC;