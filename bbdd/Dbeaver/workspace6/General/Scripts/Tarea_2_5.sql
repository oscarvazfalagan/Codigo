-- q1
SELECT  x.nome ,x.posicion,n.nome as nacionalidade ,e.nome_equipo,x.data_nacemento
FROM xogador x 
LEFT JOIN equipo e ON (e.codigo = x.codigo_equipo)
LEFT JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
ORDER BY x.nome,x.posicion;

-- q2
SELECT x.nome,x.posicion,n.nome as nacionalidade ,e.nome_equipo,x.data_nacemento
FROM xogador x 
LEFT JOIN equipo e ON (e.codigo = x.codigo_equipo)
LEFT JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
WHERE TIMESTAMPDIFF(YEAR,x.data_nacemento,CURDATE()) < 39
ORDER BY x.nome,x.posicion ;


-- q3
SELECT  x.nome ,x.posicion,n.nome as nacionalidade ,e.nome_equipo,x.data_nacemento,x.estatura
FROM xogador x 
left JOIN equipo e ON (e.codigo = x.codigo_equipo)
left JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
WHERE x.estatura < 1.90 AND e.nome_club LIKE '% S.A.D.'


-- q4
SELECT  x.nome ,x.posicion,n.nome as nacionalidade ,e.nome_equipo,x.data_nacemento,x.estatura
FROM xogador x 
LEFT JOIN equipo e ON (e.codigo = x.codigo_equipo)
JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
WHERE (e.nome_club LIKE '%e%' OR e.nome_club LIKE '%i%' OR e.nome_club LIKE '%u%') AND x.temporadas >= 2
ORDER BY  x.nome ,x.posicion;

-- q5
SELECT *
FROM xogador x 
LEFT JOIN equipo e ON (e.codigo = x.codigo_equipo)
WHERE  ((TIMESTAMPDIFF(YEAR,x.data_nacemento,CURDATE()))BETWEEN 36 AND 46)AND e.capacidade_pavillon IS  NULL;

-- q6
SELECT DISTINCT n.nome
FROM xogador x 
JOIN equipo e ON (e.codigo = x.codigo_equipo)
JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
where e.pavillon LIKE'%arena%'
ORDER By n.nome;

-- q7
SELECT DISTINCT e.nome_equipo
FROM xogador x 
JOIN equipo e ON (e.codigo = x.codigo_equipo)
JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
WHERE (YEAR(x.data_nacemento) >= 1980) AND x.temporadas >10
ORDER by e.nome_equipo ;

-- q8
SELECT  x.nome ,x.posicion,n.nome as nacionalidade ,e.nome_equipo,x.data_nacemento,x.estatura
FROM xogador x 
left JOIN equipo e ON (e.codigo = x.codigo_equipo)
left JOIN nacionalidade n ON (n.codigo = x.nacionalidade )
WHERE (x.estatura BETWEEN 1.98 AND 2.06)
ORDER BY x.estatura  , x.nome ;


-- q9
SELECT  x.nome ,e.nome_equipo,e.nome_club 
FROM xogador x 
JOIN equipo e ON (e.codigo = x.codigo_equipo)
where e.nome_equipo LIKE '%banca%' OR e.nome_equipo  LIKE '%caja%'
ORDER BY e.nome_equipo ,x.nome;

-- q10
SELECT  x.nome ,e.nome_equipo,e.nome_club 
FROM xogador x 
JOIN equipo e ON (e.codigo = x.codigo_equipo)
WHERE (TIMESTAMPDIFF(YEAR,x.data_nacemento,CURDATE())> 41)AND e.pavillon IS NULL
order by x.nome,e.nome_club;
