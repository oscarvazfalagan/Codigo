DROP DATABASE IF EXISTS piezas;
CREATE DATABASE piezas;

USE piezas;

CREATE TABLE piezas (
    idpieza INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombrepiez VARCHAR(255) NOT NULL,
    color VARCHAR(100) DEFAULT 'Metalizado'
) ENGINE=InnoDB;

CREATE TABLE proyectos (
    idproyecto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreProyecto VARCHAR(100) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE proveedores (
    idproveedor INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreprov VARCHAR(100) NOT NULL,
    domicilio VARCHAR(150),
    ciudad VARCHAR(50)
) ENGINE=InnoDB;

CREATE TABLE suministradores (
    idproveedor INT UNSIGNED NOT NULL,
    idpieza INT UNSIGNED NOT NULL  ,
    idproyecto INT UNSIGNED NOT NULL ,
    cantidad INT UNSIGNED CHECK (cantidad>0),
    PRIMARY KEY (idproveedor,idpieza,idproyecto)
)ENGINE=InnoDB;

CREATE TABLE provincias (
    id_provincia INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre_provincia VARCHAR(20) UNIQUE NOT NULL
) ENGINE=InnoDB;

ALTER TABLE suministradores 
    ADD FOREIGN KEY (idproveedor) REFERENCES proveedores(idproveedor) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (idpieza) REFERENCES piezas(idpieza) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD FOREIGN KEY (idproyecto) REFERENCES proyectos(idproyecto) ON DELETE RESTRICT ON UPDATE CASCADE;


ALTER TABLE proveedores 
    DROP COLUMN nombreprov,
    ADD id_provincia INT UNSIGNED NOT NULL,
    ADD Foreign Key (id_provincia) REFERENCES provincias(id_provincia);


