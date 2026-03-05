-- q0
SELECT c.Country 
FROM Customer c
WHERE c.Country NOT IN ('Spain','USA','United Kingdom')OR c.Country IS NULL;

-- q1
SELECT derivada.*
FROM(
	SELECT 
	i.InvoiceDate,
	i.BillingState,
	i.BillingCountry,
	i.Total,(i.Total*0.3) AS Beneficio
FROM Invoice i
) AS derivada 
WHERE derivada.Beneficio >=7
Order by derivada.Beneficio  DESC;

-- q2
SELECT 
i.InvoiceDate,
i.BillingAddress,
i.BillingCountry,
i.Total 
FROM Invoice i 
WHERE i.BillingCountry IN ("USA","Germany","Canada")AND((strftime('%Y',i.InvoiceDate)="2012")AND(strftime('%m',i.InvoiceDate)IN("01","02")))
ORDER BY i.InvoiceDate;

-- q3
SELECT 
c.FirstName,
c.LastName,
c.Country ,
c.Email
FROM Customer c 
WHERE c.Country  IN ("USA","Canada") AND (c.Email LIKE('%@gmail.com') OR c.Email LIKE('%@hotmail.com'))
ORDER BY c.LastName,c.FirstName ;

-- q4
SELECT t.*
FROM Track t  
WHERE ((t.Composer LIKE ('%Angus Young%') OR t.Composer LIKE ('%Steven Tyler%'))
AND
(t.Milliseconds BETWEEN 60*1000*3 AND 60*1000*4)
AND
(t.Bytes/1024.0/1024.0 <= 10)
)
ORDER BY t.Bytes DESC ;

-- q5
SELECT AVG(t.Milliseconds)/60.0/1000.0 AS AVG_time, AVG(t.Bytes)/1024.0/1024.0 AS MB
FROM Track t ;

-- q6
SELECT AVG(t.Milliseconds)/60.0/1000.0 AS AVG_time, AVG(t.Bytes)/1024.0/1024.0 AS MB
FROM Track t 
WHERE t.Name LIKE('%love%') AND t.GenreId IN (1,2,3) AND (t.Milliseconds BETWEEN 3*1000*60 AND 5*1000*60);

-- q7
SELECT t.*
FROM Track t
WHERE t.Composer LIKE ('%Mercury%') AND (t.Milliseconds > 60*1000*3) AND (t.bytes/1024.0/1024.0 BETWEEN 6 AND 12) AND ((t.AlbumId IN ('185','186')) OR (t.TrackId = 3));

-- q8
SELECT c.*
FROM Customer c 
WHERE c.Country IN ('Canada','USA') AND (c.Email LIKE('%@gmail%') OR c.Email LIKE('%@yahoo%')) AND c.SupportRepId IN ('3','4','5')
order by c.CustomerId ;

-- q9
SELECT c.*
FROM Customer c 
WHERE c.Country NOT IN ('USA','Canada','India')
ORDER BY c.CustomerId;
