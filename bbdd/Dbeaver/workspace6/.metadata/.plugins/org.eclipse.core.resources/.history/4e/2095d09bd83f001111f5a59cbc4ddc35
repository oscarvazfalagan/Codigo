DROP PROCEDURE IF EXISTS llenarRexistro;
DROP TRIGGER IF EXISTS af_xogador;
DROP TRIGGER IF EXISTS ad_xogador;

DELIMITER //
CREATE PROCEDURE llenarRexistro(num_licencia_xogador smallint(6),codigo_equipo_orixe char(4),codigo_equipo_destino char(4))
BEGIN
	IF	codigo_equipo_orixe != codigo_equipo_destino THEN
	INSERT INTO traspasos(num_licencia_xogador,codigo_equipo_orixe,codigo_equipo_destino,data_traspaso)
	VALUES (num_licencia_xogador,codigo_equipo_orixe,codigo_equipo_destino,now());
	END IF;
END //

CREATE TRIGGER af_xogador
AFTER INSERT ON	xogador
FOR EACH ROW 
BEGIN 
	CALL llenarRexistro(new.numero_licencia,NULL,new.codigo_equipo);
END //


CREATE TRIGGER ad_xogador
AFTER UPDATE  ON xogador
FOR EACH ROW 
BEGIN 
	CALL llenarRexistro(new.numero_licencia,old.codigo_equipo,new.codigo_equipo);
END //

DELIMITER ;

