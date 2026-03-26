-- q1
INSERT INTO centro VALUES (40,'FRANQUICIA','C/ PROGRESO, 8 - LUGO')

-- q2
INSERT	INTO empregado(empNome,empNumero,empDepartamento,empExtension,empDataNacemento,empDataIngreso,empSalario,empComision,empFillos) 
VALUES('BARCIA, ANGELES',750,110,25,'1990-02-12',CURDATE(),825,50,1);

INSERT	INTO empregado(empNome,empNumero,empDepartamento,empExtension,empDataNacemento,empDataIngreso,empSalario,empComision,empFillos) 
VALUES('BERNARDEZ, LUCIA',752,120,45,'1992-05-09',null,1200,150,2);

INSERT	INTO empregado(empNome,empNumero,empDepartamento,empExtension,empDataNacemento,empDataIngreso,empSalario,empComision,empFillos) 
VALUES
('MENDEZ, RICARDO',751,110,25,'1985-10-22',(CURDATE()-INTERVAL 15 DAY) ,900,null,0),
('VALIN, EVA',753,100,200,'1980-09-05',(CURDATE()),1000,300,1);


-- q3
UPDATE empregado 
SET 
empSalario = empSalario + (empSalario *0.05),
empComision = empComision  + (empComision * 0.065);


-- q4
UPDATE empregado e 
SET empDataIngreso = e.empDataIngreso + INTERVAL 10 DAY
WHERE e.empNumero = 752;

-- q5
UPDATE empregado e 
SET empSalario = e.empSalario * 1.02
WHERE e.empDepartamento = 120

-- q6
UPDATE empregado e 
SET empComision = e.empComision + 50
WHERE e.empDepartamento in(
SELECT d.depNumero 
FROM departamento d 
JOIN centro c ON d.depCentro=c.cenNumero
WHERE c.cenNome = 'SEDE CENTRAL'
);


-- q7
UPDATE departamento 
SET depPresuposto = depPresuposto * 0.9
ORDER BY depPresuposto DESC 
LIMIT 1;


-- q8
UPDATE departamento d 
SET depPresuposto = d.depPresuposto +20000
where d.depNome = 'PROCESO DE DATOS';

UPDATE departamento d 
SET depPresuposto = d.depPresuposto -20000
WHERE d.depNome = 'PERSOAL';

UPDATE departamento d 
SET depPresuposto = d.depPresuposto -10000
where d.depNome = 'SECTOR INDUSTRIAL';

UPDATE departamento d 
SET depPresuposto = d.depPresuposto +4000
WHERE d.depNome = 'ORGANIZACION';

UPDATE departamento d 
SET depPresuposto = d.depPresuposto +6000
WHERE d.depNome = 'DIRECCION COMERCIAL';

-- q9
DELETE FROM empregado 
WHERE empNumero = 380;

-- q10
DELETE FROM departamento d
WHERE (TIMESTAMPDIFF(year,empDataNacemento ,CURDATE())>= 60) AND d.depDirector is NULL ;

-- q11
DELETE FROM empregado e
WHERE e.empDepartamento = (
	SELECT d.depNumero 
	FROM departamento d 
	where d.depNumero = 121
)

DELETE FROM departamento d
WHERE d.depNumero = 121

-- q12
CREATE TEMPORARY TABLE empregado_120 LIKE empregado ;

INSERT  INTO empregado_120
SELECT * FROM empregado WHERE empDepartamento = 120;

select *
from em

-- q13
SELECT *
FROM empregado_120





