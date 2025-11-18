DROP DATABASE IF EXISTS baloncesto;
CREATE DATABASE baloncesto;

USE baloncesto;

CREATE TABLE Equipo (
    Codigo VARCHAR(4) NOT NULL PRIMARY KEY,
    nome_club VARCHAR(200) NOt NULL,
    nome_equipo VARCHAR (200) NOT NUll,
    capacidade_pavillon INT UNSIGNED NOT NULL,
    web VARCHAR(300)
) ENGINE=InnoDB;

CREATE TABLE Xogador (
    numero_licencia INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Numero INT UNSIGNED NOT NULL CHECK (Numero > 0 AND Numero < 100),
    codigo_equipo VARCHAR(4) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    ficha ENUM('', 'EUR', 'JFL', 'EXT') NOT NULL,
    altura DECIMAL(3,2) UNSIGNED,
    nacionalidade CHAR(3) NOT NULL DEFAULT "ESP",
    posicion ENUM("F","B","A","P","E") NOT NULL,
    temporadas INT UNSIGNED,
    data_nacemento DATE
) ENGINE=InnoDB;

CREATE TABLE Nacionalidade (
    Codigo CHAR(3) PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL
) ENGINE=InnoDB;


ALTER TABLE Xogador
     ADD FOREIGN KEY (codigo_equipo) REFERENCES Equipo(Codigo) ON DELETE RESTRICT ON UPDATE CASCADE,
     ADD FOREIGN KEY (nacionalidade) REFERENCES Nacionalidade(Codigo) ON DELETE RESTRICT ON UPDATE CASCADE;
    