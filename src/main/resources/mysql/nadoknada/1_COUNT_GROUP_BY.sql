-- Agregatne funkcije
-- SUM, AVERAGE, COUNT, MIN, MAX => dobro idu uz GROUPING BY
SELECT *
FROM film;
-- Primjer: Želim izbrojati koliko ima filmova rejtinga PG, koliko ih ima rating PG-13 itd..
SELECT
  f.rating, 
  COUNT(*) AS film_count
FROM film f
GROUP BY f.rating
ORDER BY film_count;