DROP DATABASE IF EXISTS historialLaboral;

CREATE DATABASE historialLaboral;
USE historialLaboral;

CREATE TABLE empleados (
    dni INT(8) UNSIGNED PRIMARY KEY,
    nombre VARCHAR(10) NOT NULL,
    apellido1 VARCHAR(15) NOT NULL,
    apellido2 VARCHAR(15),
    direcc1 VARCHAR(25),
    direcc2 VARCHAR(25),
    ciudad VARCHAR(20),
    provincia VARCHAR(20),
    cod_postal VARCHAR(5),
    sexo ENUM('h','m'),
    fecha_nac DATE
) ENGINE=InnoDB;


CREATE TABLE historial_laboral (
    empleado_dni INT(8) UNSIGNED,
    trabajo_cod INT(5) UNSIGNED,
    fecha_inicio DATE,
    fecha_fin DATE,
    dpto_cod INT(5) UNSIGNED,
    supervisor_dni INT(8) UNSIGNED,
    PRIMARY KEY (empleado_dni,trabajo_cod,fecha_inicio)
) ENGINE=InnoDB;

CREATE TABLE historial_salarial (
    empleado_dni INT(8) UNSIGNED,
    salario INT UNSIGNED,
    fecha_comienzo DATE,
    fecha_fin DATE,
    PRIMARY KEY (empleado_dni,fecha_comienzo)
) ENGINE=InnoDB;

CREATE TABLE departamentos (
    dpto_cod INT(5) PRIMARY KEY,
    nombre_dpto VARCHAR(30) UNIQUE,
    dpto_padre INT(5) UNSIGNED,
    presupuesto INT UNSIGNED,
    pres_actual INT UNSIGNED
) ENGINE=InnoDB;

CREATE TABLE estudios (
    empleado_dni INT(8) UNSIGNED,
    universidad INT(5) UNSIGNED,
    año INT UNSIGNED,
    grado VARCHAR(3),
    especialidad VARCHAR(20),
    PRIMARY KEY (empleado_dni,universidad,especialidad)
) ENGINE=InnoDB;

CREATE TABLE universidades (
    univ_cod INT(5) UNSIGNED PRIMARY KEY,
    nombre_univ VARCHAR (25),
    ciudad VARCHAR (20),
    municipio VARCHAR (2),
    cod_postal VARCHAR(5)
) ENGINE=InnoDB;

CREATE TABLE trabajos (
    trabajo_cod INT(5) UNSIGNED PRIMARY KEY,
    nombre_trab VARCHAR(20) UNIQUE,
    salario_min DECIMAL(2) UNSIGNED NOT NULL,
    salario_max DECIMAL(2) UNSIGNED NOT NULL
) ENGINE=InnoDB;


ALTER TABLE historial_laboral
Add Foreign Key (empleado_dni) REFERENCES empleados(dni) ON DELETE RESTRICT ON UPDATE CASCADE,
Add Foreign Key (trabajo_cod) REFERENCES trabajos(trabajo_cod) ON DELETE RESTRICT ON UPDATE CASCADE,
Add Foreign Key (dpto_cod) REFERENCES departamentos(dpto_cod) ON DELETE RESTRICT ON UPDATE CASCADE,
Add Foreign Key (supervisor_dni) REFERENCES empleados(dni) ON DELETE RESTRICT ON UPDATE CASCADE;



ALTER TABLE historial_salarial
Add Foreign Key (empleado_dni) REFERENCES empleados(dni) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE departamentos
Add Foreign Key (dpto_padre) REFERENCES departamentos(dpto_cod) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE estudios
Add Foreign Key (empleado_dni) REFERENCES empleados(dni) ON DELETE RESTRICT ON UPDATE CASCADE,
Add Foreign Key (universidad) REFERENCES universidades(univ_cod) ON DELETE RESTRICT ON UPDATE CASCADE;




