CREATE TABLE  aux_rol (
 id_rol INT unsigned auto_increment primary key,
nombre_rol VARCHAR(50) NOT NULL
);


INSERT INTO aux_rol (nombre_rol)VALUES
("administrador"),
("standard"),
("dev");

ALTER TABLE usuario 
ADD id_rol INT unsigned;


UPDATE usuario u 
SET u.id_rol = 
(
	SELECT ar.id_rol
	FROM aux_rol ar 
	WHERE ar.nombre_rol= u.rol
);

ALTER TABLE usuario 
DROP rol;


ALTER TABLE usuario
ADD CONSTRAINT fk_usuario_rol FOREIGN KEY (id_rol) REFERENCES aux_rol(id_rol)ON UPDATE CASCADE ON DELETE RESTRICT;


