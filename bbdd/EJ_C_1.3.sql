-- q1
SELECT  
	e.empNome,
	e.empDataNacemento,
	e.empSalario,
	(YEAR(e.empDataNacemento) + 67) - YEAR(e.empDataIngreso) AS antiguedad,
	IF (YEAR(e.empDataNacemento) + 67 = YEAR(CURDATE()),
	e.empSalario * ((YEAR(e.empDataNacemento) + 67) - YEAR(e.empDataIngreso)),
	0)
	AS liquidacion
FROM empregado e ;

-- q2
SELECT 
	e.empNome,
	DAY(e.empDataNacemento) AS Aniversari_day,
	MONTH(e.empDataNacemento ) AS Aniversari_month
FROM empregado e 
WHERE (e.empDepartamento = 110 or e.empDepartamento =111);

-- q3
SELECT count(*) AS num_empregados,AVG(e.empSalario) AS salario_medio
FROM empregado e 
WHERE (YEAR(CURDATE())-YEAR(e.empDataIngreso)) = 25; 

-- q4
SELECT SUM(e.empSalario +IFNULL(e.empComision,0))*14 AS custo_total
FROM  empregado e;



-- q11 
SELECT 
MAX(e.empDataIngreso) AS mayor,
MIN(e.empDataIngreso) AS menor,
TIMESTAMPDIFF(day,MIN(e.empDataIngreso),MAX(e.empDataIngreso)) AS diferencia_dias
FROM empregado e;