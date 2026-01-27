-- Self JOIN 
-- U SQL ili relacionim bazama podataka možemo tabelu povezati samu sa sobom
-- redove u tabeli A 
-- redove u tabeli A 
-- Povezujemo redove koji su u nekoj korelaciji.
-- Dakle redovi u istoj tabeli imaju zajedničku poveznicu.
-- PRIMJER: 
USE hr;
SELECT
	e.employee_id, 
    e.first_name 'Uposlenik', 
    m.first_name 'Neposredni Rukovodioc', 
    m.employee_id
FROM employees e
JOIN employees m
    ON e.reports_to = m.employee_id
ORDER BY m.first_name;

-- Da li je korisno spajati redove(koji su naravno povezani) a nalaze se u ISTOJ tabeli ? 