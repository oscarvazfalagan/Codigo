DROP DATABASE IF EXISTS 02_bd_piezas;
CREATE DATABASE 02_bd_piezas;

USE 02_bd_piezas;

CREATE TABLE piezas (
    idpieza INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombrepiez VARCHAR(255) NOT NULL,
    color VARCHAR(100) DEFAULT 'Metalizado'
) ENGINE=InnoDB;

CREATE TABLE proyectos (
    idproyecto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreproyecto VARCHAR(255) NOT NULL
) ENGINE=InnoDB; 

CREATE TABLE proveedores (
    idproveedor INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombreproveedor VARCHAR(100) NOT NULL,
    domicilio VARCHAR(255),
    ciudad VARCHAR(100)
)ENGINE=InnoDB;

CREATE TABLE suministradores (
    idproveedor INT UNSIGNED,
    idpieza INT UNSIGNED,
    idproyecto INT UNSIGNED,
    cantidad INT UNSIGNED CHECK (cantidad > 0),
    PRIMARY KEY(idproveedor, idpieza, idproyecto)
)ENGINE=InnoDB;
