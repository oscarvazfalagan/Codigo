-- q1
-- Da error de duplicate primary key por lo tanto usaria un on duplicate key update
INSERT INTO clientes ( clt_id, clt_cif, clt_apelidos, clt_nome, clt_enderezo, clt_cp, clt_poboacion, clt_pais, clt_alta)
VALUES (92, '33956665D', 'Varela Montero', 'Luisa', 'Rua Vella, 5-2º', '15006', 'Coruña', 73, curdate())
ON DUPLICATE KEY UPDATE 
clt_cif = VALUES(clt_cif),
clt_apelidos = VALUES(clt_apelidos),
clt_nome = VALUES(clt_nome),
clt_enderezo = VALUES(clt_enderezo) ,
clt_cp = VALUES(clt_cp),
clt_poboacion = VALUES(clt_poboacion),
clt_pais = VALUES(clt_pais),
clt_alta = VALUES(clt_alta);

	

-- q2
INSERT INTO clientes ( clt_cif, clt_apelidos, clt_nome, clt_enderezo, clt_cp, clt_poboacion, clt_pais, clt_alta)
VALUES ('16137107P', 'Nuñez Castro', 'Maria', 'Rua Nova, 22 - 5º', '27001', 'Lugo', 73, curdate())
ON DUPLICATE KEY UPDATE 
clt_cif = VALUES(clt_cif),
clt_apelidos = VALUES(clt_apelidos),
clt_nome = VALUES(clt_nome),
clt_enderezo = VALUES(clt_enderezo) ,
clt_cp = VALUES(clt_cp),
clt_poboacion = VALUES(clt_poboacion),
clt_pais = VALUES(clt_pais),
clt_alta = VALUES(clt_alta);


-- q3
-- La columna ven_empregado deberia ser un int
INSERT INTO vendas (ven_tenda, ven_empregado, ven_cliente, ven_data, ven_factura)
VALUES (24, NULL, 55, now(), NULL);

-- q4
-- es porque no existe un cliente numero 155 al ser una foreign key  no deja insertarlo porque ese numero hace referencia a la nada
INSERT INTO vendas (ven_tenda, ven_empregado, ven_cliente, ven_data, ven_factura)
VALUES (24, 10, 155, now(), NULL);



-- q5
-- sin errores
INSERT INTO vendas (ven_tenda, ven_empregado, ven_cliente)
VALUES (24, 10, 55);
