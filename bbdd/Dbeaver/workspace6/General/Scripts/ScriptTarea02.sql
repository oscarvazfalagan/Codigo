-- q5
SELECT t.* FROM Track t ;

-- q6
SELECT *
FROM Artist a ;

-- q7
select *
FROM Genre g ;

-- q8
SELECT *,
(il.Quantity * il.UnitPrice) as coste_total
FROM InvoiceLine il ;

-- q9
SELECT *,
t.Bytes/1048576 as peso_MB,
t.Milliseconds/60000 as duracion_minutos 
FROM Track t;

--q 10
SELECT *,
t.Bytes/1048576 as peso_MB,
t.Milliseconds/60000 as duracion_minutos, 
(t.Milliseconds%60000)/1000 as duracion_segundos
FROM Track t;

--q 11
SELECT c.CustomerId ,c.FirstName ,c.LastName ,c.Company ,c.Country   
FROM Customer c;

--q 12
SELECT DISTINCT c.Country
FROM Customer c;

--q 13
SELECT DISTINCT t.Composer 
FROM Track t;

--q 14
SELECT DISTINCT t.UnitPrice
FROM Track t;

--q 15
SELECT i.BillingCity, i.BillingCountry, i.Total ,ROUND(i.Total*09, 2) AS total_euros
FROM Invoice i;

--q 16
SELECT DISTINCT  i.BillingCity
FROM Invoice i ;