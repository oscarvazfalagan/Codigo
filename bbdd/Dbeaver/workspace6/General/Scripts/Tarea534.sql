
-- q1
START TRANSACTION;
INSERT INTO tbl_ProbaTransaccions ( id, s, si) VALUES (8, "... comeza a proba", NULL);
INSERT INTO tbl_ProbaTransaccions ( id, s, si) VALUES (9, "... superase o limite do tamaño de numero de carácteres da cadea, prodúcese un error...", NULL); 
COMMIT;

SELECT * FROM  tbl_ProbaTransaccions;

-- que se guarda el primer insert ya que cave perfectamente y el segundo sobrepasa el numero de caracteres por lo tanto no se ejecuta ese
-- insert una vez haces el commit si lo vuelves a ejecutar el 8 te da duplicate key pq ya esta guardado y el nueve sigue sin poder entrar


