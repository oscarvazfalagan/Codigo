DROP DATABASE IF EXISTS historialLaboral;

CREATE DATABASE historialLaboral;
USE historialLaboral;

CREATE TABLE empleados (
    dni INT(8) UNSIGNED PRIMARY KEY,
    nombre VARCHAR(10),
    apellido1 VARCHAR(15),
    apellido VARCHAR(15),
    direcc1 VARCHAR(25),
    direcc2 VARCHAR(25),
    ciudad VARCHAR(20),
    provincia VARCHAR(20),
    cod_postal VARCHAR(5),
    sexo VARCHAR(1),
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
    PRIMARY KEY (empleado_dni,salario,fecha_comienzo)
) ENGINE=InnoDB;

CREATE TABLE departamentos (
    dpto_cod INT(5) PRIMARY KEY,
    nombre_dpto VARCHAR(30),
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
    nombre_trab VARCHAR(20),
    salario_min INT(2),
    salario_max INT(2)
) ENGINE=InnoDB;

