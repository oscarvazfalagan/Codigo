-- q7
SELECT e.empNome,e.empSalario
FROM empregado e 
WHERE e.empSalario > ALL(SELECT e2.empSalario FROM empregado e2 WHERE e2.empDepartamento = 122)
ORDER BY e.empNome,e.empSalario;

-- q8.1
SELECT e.empNome,e.empSalario
FROM empregado e 
WHERE e.empSalario > ALL(SELECT e2.empSalario FROM empregado e2 WHERE e.empNome LIKE'FIERRO, CLAUDIA')

-- q8.2
SELECT e.empNome,e.empSalario
FROM empregado e 
LEFT JOIN empregado e2 ON(e2.empNome LIKE'FIERRO, CLAUDIA')
WHERE e.empSalario > e2.empSalario
ORDER BY e.empNome,e.empSalario


-- q9
SELECT d.depNome,d.depPresuposto
FROM departamento d 
WHERE d.depPresuposto >= ALL(SELECT d2.depPresuposto FROM departamento d2) 
OR d.depPresuposto <= ALL(SELECT d2.depPresuposto FROM departamento d2)
ORDER BY d.depNome

-- q10
SELECT e.empNumero ,e.empNome,e.empDataIngreso,(SELECT d.depNome FROM departamento d WHERE e.empDepartamento =d.depNumero )
FROM empregado e 
WHERE e.empDataIngreso <= ALL(SELECT e2.empDataIngreso FROM empregado e2)
ORDER BY e.empNumero ,e.empNome;


-- q11
SELECT e.empNome,e.empSalario
FROM empregado e 
WHERE e.empDataIngreso > (SELECT e.empDataIngreso FROM empregado e2 WHERE e2.empDataIngreso > '1-1-88') 
OR (e.empDataIngreso < (SELECT e.empDataIngreso FROM empregado e2 WHERE e2.empDataIngreso > '1-1-88') 
AND e.empSalario < (SELECT AVG(e.empSalario) FROM empregado e2 WHERE))
ORDER BY e.empNome,e.empSalario;