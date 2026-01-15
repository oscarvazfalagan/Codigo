-- q1
SELECT 
a.art_pv ,
a.art_nome
FROM artigos a
where a.art_nome LIKE "PORTATIL%" OR a.art_nome LIKE "NOTEBOOK%"
ORDER BY a.art_pv DESC
limit 3;

-- q2
SELECT 
a.art_pv ,
a.art_nome
FROM artigos a
where a.art_nome LIKE "PORTATIL%" OR a.art_nome LIKE "NOTEBOOK%"
ORDER BY a.art_pv DESC
limit 3,3;

-- q3.1
SELECT a.art_codigo,a.art_nome,a.art_pv
FROM artigos a 
order by a.art_nome
LIMIT 10;


-- q3.2
SELECT a.art_codigo,a.art_nome,a.art_pv
FROM artigos a 
order by a.art_nome
LIMIT 10,10;

-- q3.3
SELECT a.art_codigo,a.art_nome,a.art_pv
FROM artigos a 
order by a.art_nome
LIMIT 20,10;


-- q4
SELECT v.*
FROM vendas v 
ORDER BY v.ven_data DESC
LIMIT 0,5;

-- q5
SELECT *
FROM clientes c 
WHERE c.clt_nome LIKE "J%" AND CHAR_LENGTH(c.clt_nome) = 6;

-- q6

SELECT *
FROM clientes c 
WHERE c.clt_nome LIKE "J%" AND CHAR_LENGTH(c.clt_nome) <= 6 AND c.clt_nome LIKE "J%" AND CHAR_LENGTH(c.clt_nome) >= 4
ORDER BY c.clt_nome,c.clt_apelidos
LIKE 5,4;
-- REGEXP

-- q7
SELECT c.*
FROM clientes c 
WHERE LENGTH(c.clt_nome) > 4 AND  c.clt_nome NOT LIKE "%a%";


-- q8
SELECT c.*
FROM clientes c
WHERE LENGTH(c.clt_cif) = 8 AND c.clt_cif LIKE "%a%" OR c.clt_cif LIKE "%e%" OR c.clt_cif LIKE "%i%" OR c.clt_cif LIKE "%o%" OR c.clt_cif LIKE "%u%"
ORDER BY c.clt_nome,c.clt_apelidos;


-- q9
SELECT c.*
FROM clientes c 
WHERE c.clt_enderezo LIKE "%1%";