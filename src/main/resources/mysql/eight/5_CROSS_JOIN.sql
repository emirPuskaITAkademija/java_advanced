-- CROSS JOIN 
-- kada želimo da kombinujemo svaki red iz PRVE tabele sa svakim redom iz DRUGE tabele
-- Pitanje: PRVA tabela ima 10 redova
--          DRUGA tabela ima 11 redova
--          Koliko redova će imat rezultat CROSS JOIN upita ? 10*11=110

SELECT 
	c.first_name 'Customer', 
    p.name 'PRODUKT'
FROM customers c
CROSS JOIN products p  -- eksplicitna SINTAKSA za cross join
ORDER BY c.first_name;

SELECT 
	c.first_name 'Customer', 
    p.name 'PRODUKT'
FROM customers c, products p  -- implicitna SINTAKSA za cross join 
ORDER BY c.first_name;