DROP DATABASE IF EXISTS pubs;
CREATE DATABASE pubs;

USE pubs;

CREATE TABLE pub (
    cod_pub VARCHAR(20) NOT NULL PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    licencia_fiscal VARCHAR(60) NOT NULL,
    domicilio VARCHAR(120),
    fecha_apertura DATE NOT NULL,
    horario VARCHAR(100) NOT NULL,
    cod_localidad INT(8) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE titular (
    dni_titular VARCHAR(8) NOT NULL PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    domicilio VARCHAR(120),
    cod_pub VARCHAR(20) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE empleado (
    dni_empleado VARCHAR(8) NOT NULL PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    domicilio VARCHAR(120)
) ENGINE=InnoDB;

CREATE TABLE existencias (
    cod_articulo VARCHAR(10) NOT NULL PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    cantidad INT(10) NOT NULL,
    precio DECIMAL(5,2) NOT NULL CHECK (precio>0),
    cod_pub VARCHAR(20) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE localidad (
    cod_localidad INT (8) NOT NULL PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE pub_empleado (
    cod_pub VARCHAR(20) NOT NULL,
    dni_empleado VARCHAR(8) NOT NULL,
    funcion ENUM('camarero','seguridad','limpieza'),
    PRIMARY KEY (cod_pub,dni_empleado,funcion)
) ENGINE=InnoDB;

ALTER TABLE titular
ADD Foreign Key (cod_pub) REFERENCES pub(cod_pub) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE pub
ADD Foreign Key (cod_localidad) REFERENCES localidad(cod_localidad);

ALTER TABLE existencias 
ADD Foreign Key (cod_pub) REFERENCES pub(cod_pub);

ALTER TABLE pub_empleado
ADD Foreign Key (cod_pub) REFERENCES pub(cod_pub),
ADD Foreign Key (dni_empleado) REFERENCES empleado(dni_empleado);


