
-- q1
START TRANSACTION;
INSERT INTO tbl_ProbaTransaccions ( id, s, si) VALUES (7, "setimo", NULL);
-- aqui aun no ha guardado los cambios
SET AUTOCOMMIT=1;
-- aqui ya guardo los cambios
SELECT * FROM  tbl_ProbaTransaccions;


-- q2
SHOW VARIABLES LIKE 'AUTOCOMMIT';

-- q3
ROLLBACK;
-- como hay cambios guardados al activar el autocommit entonces al hacer el rollback vuelve a justo despues de guardar las cosas
SELECT * FROM  tbl_ProbaTransaccions;




