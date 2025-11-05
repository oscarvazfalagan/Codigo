# importamos la clase math
import math
#Introducimos las variables y le damos valor
a:float = 1
b:float = -2
c:float = -15
#Creamos la variable gradeS y gradeR que intrducira los valores de la ecuacion
gradeS = -b + math.sqrt(math.pow(b,2)-4*a*c)/2*a
gradeR = -b - math.sqrt(math.pow(b,2)-4*a*c)/2*a
#Imprimimos el resultado de la ecuacion
print('El resultado de la ecuacion de segundo grado sumando da : ',gradeS)
print('El resultado de la ecuacion de segundo grado restando da : ',gradeR)