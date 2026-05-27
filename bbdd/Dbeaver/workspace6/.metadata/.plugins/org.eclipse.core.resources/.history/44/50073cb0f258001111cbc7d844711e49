BEGIN
	INSERT INTO centro VALUES(999,"Estudantado","Rúa Progreso, 37. A Cañiza.");
	INSERT INTO empregado VALUES(null,121,999,'2006/12/08',CURDATE(),2500,0,0,"Oscar Vaz Falagan");
	SET @id_director = LAST_INSERT_ID();
	INSERT INTO departamento VALUES(999,"Del.estudantado",@id_director,'D',30000,121,999,1);
	UPDATE empregado e SET empDepartamento = 999 WHERE e.empNome = "Oscar Vaz Falagan";
END
