DROP DATABASE IF EXISTS oscarvf_dpto;
CREATE DATABASE oscarvf_dpto;
USE oscarvf_dpto;

CREATE TABLE empregado (
    empNumero INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    empDepartamento INT UNSIGNED NOT NULL,
    empExtension INT UNSIGNED NOT NULL CHECK (empExtension > 0),
    empDataNacamento DATE NOT NULL,
    empDataIngrso DATE NOT NULL,
    empSalario DECIMAL(7,2) CHECK (empSalario > 0),
    empComision DECIMAL(7,2) CHECK (empComision >= 0),
    empFillos INT UNSIGNED NOT NULL CHECK (empFillos >= 0),
    empNome VARCHAR(100) NOT NULL
) ENGINE = InnoDB;

CREATE TABLE  departamento (
    depNumero INT UNSIGNED PRIMARY KEY CHECK (depNumero > 0),
    depNome VARCHAR(50) NOT NULL,
    depPresuposto DECIMAL(10,2) CHECK (depPresuposto > 10000),
    depDirector INT UNSIGNED NOT NULL,
    depDepende INT UNSIGNED,
    depTipoDirector ENUM('P','F'),
    depCentro INT UNSIGNED,
    depEmpregados INT UNSIGNED CHECK(depEmpregados >= 0)
) ENGINE = InnoDB;

CREATE TABLE centro (
    cenNumero INT UNSIGNED PRIMARY KEY CHECK (cenNumero > 0),
    cenNome VARCHAR(50) NOT NULL,
    cenEnderezo VARCHAR(255) NOT NULL
) ENGINE = InnoDB;


ALTER TABLE departamento
    ADD CONSTRAINT departamento_FK_1 FOREIGN KEY (depCentro) REFERENCES centro(cenNumero) ON DELETE RESTRICT ON UPDATE CASCADE,
    ADD CONSTRAINT departamento_FK_2 FOREIGN KEY (depDepende) REFERENCES departamento(depNumero) ON DELETE SET NULL ON UPDATE CASCADE,
    ADD CONSTRAINT departamento_FK FOREIGN KEY (depDirector) REFERENCES empregado(empNumero) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE empregado
    ADD CONSTRAINT empregado_FK FOREIGN KEY (empDepartamento) REFERENCES departamento(depNumero) ON DELETE RESTRICT ON UPDATE CASCADE;