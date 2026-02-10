-- SELF OUTER JOIN 
USE hr;
SELECT 
  e.employee_id, 
  e.first_name, 
  e.last_name, 
  e.reports_to, 
  m.first_name 'Neposredni rukovodioc'
FROM employees e
LEFT JOIN employees m ON e.reports_to = m.employee_id;