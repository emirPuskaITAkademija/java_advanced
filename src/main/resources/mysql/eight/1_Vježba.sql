-- Vježba 1
-- BAZA: invoicing
-- Direktor uđe u kancelariju i kaže: 
-- "Želim znati na koji datum i ko je uradio uplatu i pomoću koje payment metode ?"
USE invoicing;

SELECT 
	p.date 'datum uplate', 
    c.name 'uplatio',
    pm.name 'payment metoda', 
    p.invoice_id
FROM payments p
JOIN clients c USING (client_id)
	-- ON p.client_id=c.client_id
JOIN payment_methods pm 
    ON p.payment_method=pm.payment_method_id;