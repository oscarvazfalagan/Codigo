x = 150000 #Le damos valor a la variable x de los segundos
y = x//3600 #Calcula el numero de horas que hay en los segundos
z = (x%3600)//60 #Calculamos lo que sobro de las horas en segundos y lo dividimos entre 60 para que de los minutos
t = (x%3600)%60 #el resto de los minutos seran los segundos restantes
print(x,"segundos son ",y ,"horas",z,"minutos e",t,"segundos")#muestra por pantalla la orden