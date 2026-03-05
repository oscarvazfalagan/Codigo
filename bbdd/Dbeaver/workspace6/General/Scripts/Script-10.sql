-- q1
SELECT *
FROM tendas t 
ORDER BY t.tda_poboacion;

-- q2
SELECT *
FROM provedores p 
ORDER BY p.prv_nome;

-- q3
SELECT DISTINCT c.clt_poboacion 
FROM clientes c
ORDER BY c.clt_poboacion ;

-- q4
SELECT a.art_codigo , a.art_nome , ROUND(a.art_pv*1.1, 2) AS art_new_pv
FROM artigos a
ORDER BY art_new_pv;

-- q5
SELECT c.clt_id , c.clt_apelidos ,c.clt_nome 
FROM clientes c 
ORDER BY c.clt_apelidos ,c.clt_nome ;

-- q6
SELECT a.art_codigo ,a.art_peso 
FROM artigos a 
WHERE a.art_peso > 500
ORDER BY a.art_codigo ;

-- q7
SELECT *  
FROM artigos a 
WHERE  a.art_pv >= a.art_pc*2
ORDER BY a.art_pv/a.art_pc  DESC ;

-- q8
SELECT c.clt_apelidos ,c.clt_nome ,c.clt_poboacion ,c.clt_desconto 
FROM clientes c 
WHERE c.clt_poboacion  IN ("Asturias","Valencia") AND (c.clt_desconto > 2 OR c.clt_desconto = 0
ORDER BY c.clt_apelidos ,c.clt_alta;

-- q9
SELECT *
FROM artigos a 
WHERE a.art_color IN ("NEGRO") AND a.art_peso > 5000
ORDER BY a.art_codigo ;

-- q10
SELECT *
FROM artigos a 
WHERE a.art_color NOT IN ("NEGRO") OR a.art_peso <= 5000
ORDER BY a.art_codigo;

-- q11
-- SELECT 
-- FROM artigos a