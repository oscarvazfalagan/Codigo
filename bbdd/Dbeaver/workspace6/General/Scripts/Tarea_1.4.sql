-- q1
SELECT 
CONCAT(c.clt_nome,",",c.clt_apelidos) AS nombre_apellidos,
length(c.clt_nome) AS n_letras_nome
FROM clientes c;

-- q2
SELECT 
LOWER(c.clt_nome) AS nome_minuscula,
LOWER(c.clt_apelidos) AS nome_minuscula
FROM clientes c;

-- q3
SELECT 
TIMESTAMPDIFF(YEAR,'1981-03-22',CURDATE()) AS diferencia_fecha;

-- q4
SELECT *
FROM vendas v 
WHERE MONTH(SUBDATE(CURDATE(),INTERVAL 1 MONTH)) = MONTH(v.ven_data ) AND YEAR(SUBDATE(CURDATE(),INTERVAL 1 MONTH)) = YEAR(v.ven_data);


-- q5
SELECT a.art_codigo,a.art_nome,ROUND(a.art_pv,0) AS Prezo_redondo
FROM artigos a
WHERE a.art_color = 'NEGRO'
ORDER BY a.art_codigo,a.art_nome ;

-- q6
SELECT AVG(a.art_peso) AS pesoMedio
FROM artigos a ;

-- q7
SELECT 
AVG(a.art_peso) AS pesoMedio,
MAX(a.art_pv -a.art_pc ) AS Margen_maximo,
(max (a.art_pv) - MIN(a.art_pc)) AS Maxima_diferencia
FROM artigos a 
where a.art_color is not NULL;

-- q8
SELECT COUNT(distinct a.art_color ) AS numero_colores
FROM artigos a ;

-- q9
SELECT 
IFNULL(a.art_color,"Descoñecido"),
a.art_nome 
FROM artigos a
ORDER BY a.art_nome,a.art_color;
