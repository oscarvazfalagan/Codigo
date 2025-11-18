DROP DATABASE IF EXISTS tablas;
CREATE DATABASE tablas;

USE tablas

CREATE TABLE tiendas (
    nif VARCHAR(10),
    nombre VARCHAR(20),
    direccion VARCHAR(20),
    poblacion VARCHAR(20),
    provincia VARCHAR(20),
    codpostal CHAR(5) 
) ENGINE=InnoDB;

ALTER TABLE tiendas
    ADD PRIMARY KEY (nif),
    MODIFY nombre VARCHAR(50) NOT NULL; 

CREATE TABLE fabricantes (
    cod_fabricantes INT UNSIGNED,
    nombre VARCHAR(15),
    pais VARCHAR(15)
) ENGINE=InnoDB;

ALTER TABLE fabricantes 
    MODIFY cod_fabricantes INT UNSIGNED AUTO_INCREMENT PRIMARY KEY;

CREATE TABLE articulos (
    articulo VARCHAR(20),
    cod_fabricantes INT UNSIGNED,
    peso INT UNSIGNED,
    categoria VARCHAR(10),
    precio_venta DECIMAL(7,2),
    precio_costo DECIMAL(7,2),
    existencias INT UNSIGNED
) ENGINE=InnoDB;

ALTER TABLE articulos
    ADD PRIMARY KEY (articulo,cod_fabricantes,categoria,peso),
    ADD FOREIGN KEY (cod_fabricantes) REFERENCES fabricantes(cod_fabricantes),
    ADD CHECK (precio_venta > 0),
    ADD CHECK (precio_costo > 0),
    ADD CHECK (peso > 0),
    MODIFY categoria ENUM('Primera','Segunda','Tercera');

CREATE TABLE ventas (
    nif VARCHAR(10),
    articulo VARCHAR(20),
    cod_fabricantes INT UNSIGNED,
    peso INT UNSIGNED,
    categoria VARCHAR(10),
    fecha_venta DATE,
    unidades_vendidas SMALLINT UNSIGNED
) ENGINE=InnoDB;

ALTER TABLE ventas 
    ADD PRIMARY KEY (nif,articulo,cod_fabricantes,peso,categoria,fecha_venta),
    ADD FOREIGN KEY (nif) REFERENCES tiendas(nif),
    ADD FOREIGN KEY (articulo,cod_fabricantes,categoria,peso) REFERENCES articulos(articulo,cod_fabricantes,categoria,peso),
    ADD CHECK (unidades_vendidas > 0),
    MODIFY categoria ENUM('Primera','Segunda','Tercera');

CREATE TABLE pedidos (
    nif VARCHAR(10),
    articulo VARCHAR(20),
    cod_fabricantes INT UNSIGNED,
    peso INT UNSIGNED,
    categoria VARCHAR(10),
    fecha_pedido DATE,
    unidades_pedidas SMALLINT UNSIGNED,
    existencias INT UNSIGNED
) ENGINE = InnoDB;

ALTER TABLE pedidos
    ADD PRIMARY KEY (nif,articulo,cod_fabricantes,peso,categoria,fecha_pedido),
    ADD FOREIGN KEY (nif) REFERENCES tiendas(nif),
    ADD FOREIGN KEY (articulo,cod_fabricantes,categoria,peso) REFERENCES articulos(articulo,cod_fabricantes,categoria,peso),
    ADD CHECK (unidades_pedidas > 0),
    MODIFY categoria ENUM('Primera','Segunda','Tercera');

ALTER TABLE articulos 
    MODIFY precio_venta DECIMAL (8,2),
    MODIFY precio_costo DECIMAL (8,2);

ALTER TABLE pedidos
    ADD COLUMN fecha_entrega DATE;



