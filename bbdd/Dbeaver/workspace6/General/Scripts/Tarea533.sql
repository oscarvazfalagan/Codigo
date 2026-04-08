-- q1
SET AUTOCOMMIT=1;
INSERT INTO tbl_ProbaTransaccions ( id, s, si) VALUES (7, "¿conformouse este dato?", NULL);

--q2
SET AUTOCOMMIT=0;
CREATE TABLE tbl_ProbaTransaccions2 (id INT NOT NULL PRIMARY KEY, s2 VARCHAR (50)) ENGINE = InnoDB ;
INSERT INTO tbl_ProbaTransaccions2 ( id, s2) VALUES (1, "¿existe tbl_ProbaTransaccions2?");
ROLLBACK;

-- q3
SELECT * FROM  tbl_ProbaTransaccions;
SELECT * FROM tbl_ProbaTransaccions2;

-- Al hacer el rollback luego no puedes mostrar tbl_ProbaTransaccions2 ya que no se crea porque esta el autocommit deshabilitado