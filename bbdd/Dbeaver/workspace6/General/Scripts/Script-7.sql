-- q1
SELECT (5+7+2+9+3)/5 AS RESULTADO_VALOR_MEDIO ;

-- q2
SET @MI_VARIABLE = 'DUKOOOOOOOOOOO!';

SELECT @MI_VARIABLE;
-- q3
SET @valor = (34);
SELECT @valor % 7 AS resto;

-- q4
SET @salario_bruto=1500;
SET @cotizacion=50;
SELECT @salario_bruto -(@salario_bruto*@cotizacion /100) AS salario_neto;
