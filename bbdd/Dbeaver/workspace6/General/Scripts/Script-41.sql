DROP TRIGGER IF EXISTS clt_vendasBU;
DELIMITER //

CREATE TRIGGER clt_vendasBU
AFTER INSERT ON vendas
FOR EACH ROW 
BEGIN 
	UPDATE clientes
	SET
		clt_vendas = clt_vendas +1,
		clt_ultima_venda = new.ven_data
	WHERE clt_id = new.ven_cliente;
END //
DELIMITER ;