-- UNION 
-- Naučili smo kako kombinovati preko kolona iz više tabela REDOVE koji imaju zajedničku
-- vrijednost te spajajuće kolone.
-- Šta ako vam kažem da MOŽEMO KOMBINOVATI I REDOVE različitih upita i spojiti 
-- rezultate 2 ili više upita u jedan rezultat.. ? !!!
-- da je to VRLO moćna stvar...alter
-- Npr. želimo kreirati izvješta koji će dohvatiti sve narudžbe(orders) i uz svaku 
-- narudžbu dodati LABELU i to na sljedeći način:
-- 1. ukoliko je order smješten u trenutno godini LABELA je 'ACTIVE"
-- 2. ukoliko je order u prethodnim godinama LABELA je 'ARCHIVED'

-- Prvi DIO: Daj mi sve aktivne
SELECT 
	order_id, 
    order_date, 
    'Active' AS status
FROM orders
WHERE order_date>='2026-01-01';
-- Drugi DIO: Daj mi sve arhivirane 
SELECT 
	order_id, 
    order_date, 
    'Archived' AS status
FROM orders
WHERE order_date<'2026-01-01';

-- Pitanje: Kako kombinovati redove kojima sam dodijelio 'Active' sa redovima kojima 
-- sam dodijelio 'Archived' ? 
SELECT 
	order_id, 
    order_date, 
    'Active' AS status
FROM orders
WHERE order_date>='2026-01-01'
UNION
SELECT 
	order_id, 
    order_date, 
    'Archived' AS status
FROM orders
WHERE order_date<'2026-01-01';

-- ZAKLJUČAK: Korištenje UNION operatora možemo kombinovati redove iz dva ili više upita.