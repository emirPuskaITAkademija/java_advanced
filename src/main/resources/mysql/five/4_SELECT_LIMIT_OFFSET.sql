-- LIMIT 
-- 
-- MySQL Workbench SQL upit-->
-- ----> RDBMS DB izvršava SQL upit
-- ----> RDBMS kao rezultat vrati onome ko je kreirao SQL upit rezultat tog upita
-- ----> 3 reda
-- LIMIT ali postoji i OFFSET
-- PAGINATION 
-- PAGE 1, PAGE_SIZE=3 => OFFSET=0, LIMIT=3  ... 1, 2, 3
-- PAGE 2, PAGE_SIZE=3 => OFFSET=previous_PAGE*PAGE_SIZE=3, LIMIT=3... 4, 5, 6
-- PAGE 3, PAGE_SIZE=3 => OFFSET=previous_PAGE*PAGE_SIZE=6, LIMIT=3... 7, 8, 9
USE store;
SELECT *
FROM customers
LIMIT 6, 3;
-- Preskoči prvih 6 i daj mi sljedeća 3 elementa
-- LIMIT OFFSET, SIZE

-- Desna SLIKA https://primeng.org/table Paginator can also be controlled via model using a binding to the first property where changes trigger a pagination.
-- GUI(Browser)  -->  Java Backend  -> DB 
-- 1. Korisnik klikne na page = 4 page_size=10
-- 2. Reakcija GUI/frontend pošalje OFFSET=(4-1)*10=30 LIMIT=10
-- 3. Java Backend(WEB service) OFFSET=30, LIMIT=10
-- 4. Java Backend query na DB i RDBMS vrati rezultat upita
-- 5. Java Backend spakuje taj rezultat od RDBMS i vrati frontend app(GUI)

