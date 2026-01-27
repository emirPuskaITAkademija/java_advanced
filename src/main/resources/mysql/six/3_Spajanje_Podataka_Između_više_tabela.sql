-- Spajali smo podatke između 2 tabele.
-- Kako je to spojiti podatke između 3+ tabela ? 
-- JOINING rows from multiple tables
-- Primjer: orders => order_id, customer_id | customers => customer_id | order_statuses => order_status_id, name

-- REZULTAT: order_id(orders),   first_name(customers) => preko customer_id, status_name(order_statuses) => status kolone u orders, order_status_id u order_statuses
-- ZAKLJUČAK: SPajamo povezane redove iz tri tabele [orders, customers, order_statuses ]
SELECT 
	o.order_id, 
    c.first_name 'Customer Name', 
    c.last_name 'Customer Surname',
    os.name 'Status Name'
FROM orders o
JOIN customers c 
    ON o.customer_id = c.customer_id
JOIN order_statuses os
    ON o.status = os.order_status_id;