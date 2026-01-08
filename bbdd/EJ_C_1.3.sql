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
SELECT 
FROM empregado e 
WHERE 