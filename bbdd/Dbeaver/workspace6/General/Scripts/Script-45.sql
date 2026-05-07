
DROP TRIGGER IF EXISTS empregado_bi;
DROP TRIGGER IF EXISTS empregado_bu;

DELIMITER //
	
CREATE TRIGGER empregado_bi
BEFORE INSERT ON empregado
FOR EACH ROW 
BEGIN 
	DECLARE salario_total DECIMAL(9,2);
	DECLARE salario_emp DECIMAL(9,2);
	DECLARE presupuesto DECIMAL(9,2);

	SET salario_emp = new.empSalario + IFNULL(new.empComision,0);
		
	SET salario_total = 
	(SELECT IFNULL(SUM(empSalario + IFNULL(empComision,0)),0)
	FROM empregado e
	where e.empDepartamento = new.empDepartamento);
	
	SET presupuesto = (SELECT d.depPresuposto
	FROM departamento d 
	JOIN empregado e ON d.depNumero = new.empDepartamento) ;
	
	
	IF salario_total+salario_emp > presupuesto THEN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Se supera el presupuesto del departamento';
	END IF;
END //



CREATE TRIGGER empregado_bu
BEFORE UPDATE ON empregado
FOR EACH ROW 
BEGIN 
	DECLARE salario_total DECIMAL(9,2);
	DECLARE salario_emp DECIMAL(9,2);
	DECLARE presupuesto DECIMAL(9,2);

	SET salario_emp = new.empSalario + IFNULL(new.empComision,0);
		
	SELECT IFNULL(SUM(empSalario + IFNULL(empComision,0)),0)
	INTO salario_total
	FROM empregado e
	where e.empDepartamento = new.empDepartamento;
	
	SELECT d.depPresuposto
	INTO presupuesto
	FROM departamento d 
	JOIN empregado e ON d.depNumero = new.empDepartamento ;
	
	
	IF salario_total+salario_emp > presupuesto THEN
	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Se supera el presupuesto del departamento';
	END IF;
END //







DELIMITER 







