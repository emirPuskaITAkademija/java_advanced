-- Vježba 2
-- Dohvati mi top 3 lojalna kupca
-- Parametar lojalnosti je broj poena koje su ostvarili u našem shop-u
-- selektuj sve kupce -> zatim sortiraj redove 
-- po poenima na način da budu prvi oni redovi s najviše poena 
-- i na kraju limitiraj na 3
-- VAŽNO: LIMIT clause UVIJEK IDE NA KRAJ poslije SELECT, FROm, ORDER
USE store;
SELECT *
FROM customers
ORDER BY points DESC
LIMIT 3;
