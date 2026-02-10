-- Vježba 3
-- Napraviti upite na tabelu customers i izvući sljedeće podatke:
-- 1. customer_id
-- 2. first_name
-- 3. points
-- 4. type (ova kolona ne postoji u tabeli, ali će postojati u rezultatu upita)
-- KOLONA: type kolona => definira kakav ste vi kupac/customers
-- Title kolone u rezultatu treba da je type
-- Vrijednosti u rezultatu koje ćemo povezati sa različitim redovim zavise od 
-- sljedećih parametara:
-- 1. kupac ima <2000 poena vrijednost kolone type treba da je 'BRONZE'
-- 2. kupac ima 2000<=poena<3000 vrijednost kolone type treba da je 'SILVER'
-- 3. poena>=3000 ....'GOLD'
-- Potrebno je sortirati rezultate po first_name.

SELECT
	customer_id, 
    first_name, 
    points,
    'GOLD' AS type 
FROM customers
WHERE points>=3000
UNION
SELECT
	customer_id, 
    first_name, 
    points,
    'SILVER' AS type 
FROM customers
WHERE points<3000 AND points>=2000
UNION
SELECT
	customer_id, 
    first_name, 
    points,
    'BRONZE' AS type 
FROM customers
WHERE points<2000;
