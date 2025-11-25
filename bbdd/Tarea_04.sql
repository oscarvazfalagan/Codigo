DROP DATABASE IF EXISTS empregados;
CREATE DATABASE empregados;

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
) ENGINE=InnoDB;

CREATE TABLE departamento (
    depNumero INT UNSIGNED  PRIMARY KEY,
    depNome VARCHAR(20),
    depDirector INT UNSIGNED NOT NULL,
    deptipoDirector ENUM('P','F') NOT NULL,
    depPresuposto DECIMAL (7,2) CHECK (depPresuposto > 10000),
    depDepende INT UNSIGNED,
    depCentro INT UNSIGNED,
    depEmpregados INT UNSIGNED ChECK (depEmpregados >= 0)
) ENGINE=InnoDB;

CREATE TABLE centro (
    cenNumero INT UNSIGNED PRIMARY KEY,
    cenNome VARCHAR(30) NOT NULL,
    cenEnderezo VARCHAR(100)
) ENGINE=InnoDB;

CREATE TABLE localidad (
    cod_localidade INT UNSIGNED PRIMARY KEY,
    nome VARCHAR(100),
    cod_provincia INT UNSIGNED NOT NULL
) ENGINE=InnoDB;

CREATE TABLE provincia (
    cod_provincia INT UNSIGNED PRIMARY KEY,
    nome VARCHAR(100)
) ENGINE=InnoDB;



ALTER TABLE departamento 
    ADD CONSTRAINT departamento_FK_1 FOREIGN KEY (depCentro) REFERENCES centro(cenNumero) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD CONSTRAINT departamento_FK_2 FOREIGN KEY (depDepende) REFERENCES departamento(depNumero) ON DELETE SET NULL ON UPDATE CASCADE,
    ADD CONSTRAINT departamento_FK FOREIGN KEY (depDirector) REFERENCES empregado(empNumero) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE empregado
    ADD CONSTRAINT empregado_FK FOREIGN KEY (empDepartamento) REFERENCES departamento(depNumero) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE centro
    RENAME COLUMN cenEnderezo to cenRuaNum,
    ADD cod_localidade INT UNSIGNED,
    ADD Foreign Key (cod_localidade) REFERENCES localidad(cod_localidade);


ALTER TABLE localidad
    ADD FOREIGN KEY (cod_provincia) REFERENCES provincia(cod_provincia);

