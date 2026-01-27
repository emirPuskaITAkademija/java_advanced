-- Vježba 1
-- Baza: invoicing
-- Menadžer dođe i kaže: "Kreiraj mi izvještaj koji 
-- prikazuje fakture sa imenom klijenta i imenom payment metode"
-- Rezultat u izvještaju :
-- "Invoice Date",  "Payment Date", "Broj Fakture", 
-- "Iznos Fakture", "Uplaćeni Iznos" "Ime Klijenta", "Ime Metode Plaćanja"
-- Tri tabele: payments, invoices, clients, payment_methods
-- payments -> clients : DA 
-- payments -> invoices : DA
-- payments -> payment_methods: DA
USE invoicing;
SELECT 
  i.invoice_date 'Datum Fakturisanja',
  i.payment_date 'Datum Plaćanja',
  i.number 'Broj Fakture',
  i.invoice_total 'Iznos Fakture',
  p.amount 'Uplaćeni Iznos',
  c.name 'Ime Klijenta', 
  pm.name 'Ime Metode Plaćanja'
FROM payments p
JOIN clients c 
  ON p.client_id=c.client_id
JOIN invoices i 
  ON p.invoice_id=i.invoice_id
JOIN payment_methods pm 
  ON  p.payment_method=pm.payment_method_id;