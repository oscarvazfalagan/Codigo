CREATE TABLE IF NOT EXISTS bd_equipos.traspasos
(
	idTraspaso integer UNSIGNED NOT NULL AUTO_INCREMENT,
	num_licencia_xogador smallint(6) NOT NULL ,
	codigo_equipo_orixe char(4),
	codigo_equipo_destino char(4),
	data_traspaso date NOT NULL,
	PRIMARY KEY (idTraspaso)
)ENGINE = MYISAM;


ALTER TABLE traspasos 
	ADD CONSTRAINT num_licencia_xogador_FK FOREIGN KEY (num_licencia_xogador) REFERENCES xogador(numero_licencia)ON DELETE RESTRICT ON UPDATE CASCADE,
	ADD CONSTRAINT codigo_equipo_FK FOREIGN KEY (codigo_equipo_orixe) REFERENCES equipo(codigo)ON DELETE RESTRICT ON UPDATE CASCADE,
	ADD CONSTRAINT codigo_equipo_FK_2 FOREIGN KEY (codigo_equipo_destino) REFERENCES equipo(codigo)ON DELETE RESTRICT ON UPDATE CASCADE;