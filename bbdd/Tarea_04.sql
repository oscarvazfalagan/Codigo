DROP DATABASE IF EXISTS empregados;
CREATE DATABASE emregados;

USE empregados;

CREATE TABLE empregado (
    empNumero INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    empDepartamento INT UNSIGNED NOT NULL,
    empExtension INT UNSIGNED NOT NULL,
    empDataNacemento DATE,
    empDataIngreso DATE,
    empSalario DECIMAL(7,2) CHECK (empSalario > 0),
    empComision DECIMAL(7,2) CHECK (empComision >= 0),
    empFillos INT(10) CHECK (empFillos >= 0),
    empNome VARCHAR(30) NOT NULL
) ENGNINE = InnoDB;

CREATE TABLE departamento (
    depNumero INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    depNome VARCHAR (20),
    depDirector INT UNSIGNED NOT NULL,
    deptipoDirector ENUM('P','F') NOT NULL,
    depPresuposto DECIMAL (7,2) CHECK (depPresuposto > 10000)
    depDepende INT,
    depCentro INT,


)