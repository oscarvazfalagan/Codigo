-- q1
SELECT 
CONCAT(c.clt_nome,",",c.clt_apelidos) AS nombre_apellidos,
length(c.clt_nome) AS n_letras_nome
FROM clientes c;

-- q2
SELECT 
LOWER(c.clt_nome) AS nome_minuscula,
LOWER(c.clt_apelidos) AS nome_minuscula
FROM clientes c ;

-- q3
SELECT TIMESTAMPDIFF(YEAR,'1981-03-22',CURDATE()) AS diferencia_fecha;
-- q4
INSERT INTO vendas (ven_tenda, ven_empregado, ven_cliente, ven_data)
VALUES (7, 2, 1, '2025-12-01'),(2, 14, 30, '2025-12-15'),(2, 14, 60, '2025-12-30'),(2, 14, 60, '2025-12-30');
