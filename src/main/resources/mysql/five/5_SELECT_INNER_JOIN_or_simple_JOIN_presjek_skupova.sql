-- JOIN
-- Do sada smo selektovali redove iz SAMO JEDNE tabele.
-- U realnom svijetu RELACIONIH BAZA mi seelktujemo redove IZ VIŠE POVEZANIH(relationship)
-- orders  <-> customers
-- kolona: customer_id postoji u orders => FK Foreign Key
-- kolona: customer_id postoji i u customers => PK Primary Key
-- Čak se ne moraju isto zvati kolone preko koji su povezani podaci u različitim tabelama
USE store;
SELECT *
FROM orders;

-- JOIN ON 
-- Da li order_id kolona postoji u obje tabele: orders, customers ? NE samo u orders
-- Da li first_name kolona postoji u obje tabele: orders, customers ? NE samo u customers
-- -|| - last_name ? NE samo u customers
-- Da li customer_id kolona postoji u obje tabele ? DA, order, customers
USE store;
SELECT 
		order_id, 
        customers.customer_id,  
        first_name, 
        last_name
FROM orders
JOIN customers 
	ON orders.customer_id = customers.customer_id;
-- MySQL Worknbench  ---> RDBMS
-- RDBMS izvršava ovaj query ... ovaj query spaja podatke iz dvije tabele orders, customers
-- Spaja ih na način da prikazuje u rezultatu redove spojene kroz customer_id
-- 1. pronađi customer_id=2 u tabeli customers (Ines, Brushfield)
-- 2. pronađi customer_id=2 u tabeli orders ( order_id = 4 , customer_id=2), (order_id=7, customer_id=2)
-- customer_id=2  => order_id=11


SELECT 
		order_id, 
        customers.customer_id,  
        first_name, 
        last_name
FROM orders
INNER JOIN customers 
	ON orders.customer_id = customers.customer_id;
    
-- Aliasi 
SELECT 
		order_id, 
        c.customer_id,  -- ona jedina postoji u obje tabele
        first_name, 
        last_name
FROM orders o
JOIN customers c
	ON o.customer_id = c.customer_id;

-- Kada uvedemo tzv. aliase onda nemamo više izbora i ne možemo koristiti nazive tabela 
-- nego jednostavno do kraja koristimo aliase
