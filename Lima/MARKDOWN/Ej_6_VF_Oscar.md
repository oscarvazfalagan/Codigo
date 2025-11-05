# Encabezado nivel 1 (Sección)
## Encabezado nivel 2 (Subsección)
### Encabezado nivel 3
#### Encabezado nivel 4
##### Encabezado nivel 5
###### Encabezado nivel 6

## Negrita y cursiva
*texto en cursiva*  
_texto en cursiva_  
**texto en negrita**  
__texto en negria__  

## Enlaces
[Universidad Rey Juan Carlos](https://www.urjc.es)

## Bloque de texto

>No hagas muchas pragmáticas; y si las hicieres, procura que sean buenas,
y, sobre todo, que se guarden y cumplan; que las pragmáticas que no se guardan,
lo mismo es que si no lo fuesen;
antes dan a entender que el príncipe que tuvo discreción y autoridad para
hacerlas, no tuvo valor para hacer que se guardasen.
>
>*Carta de Don Quijote de la Mancha a Sancho Panza, Gobernador de la Ínsula Barataria*

## Lista

### Lista sin ordenar

- Sota
    - Sota de espadas
    - Sotas de oro

- Caballo
La figura del caballero, generalmente llamado caballo es una peculiaridad de la baraja española que sustituye a la figura de la reina que aparece en la mayoría de las restantes barajas. Son cuatro:
    - Caballos de oro
    - ...

### Lista  ordenada

1. Analisis
2. Diseño
3. Codificacion
4. Prueba

## Ejemplo con imágenes y listas

### Tunel Local

- Ventajas del túnel local

    - Permite asegurar el primer tramo, que suele ser el más peligroso
    - Para el servidor, las peticiones vienen desde el proxy, no desde la máquina local. Esto es de utilidad
        - Si se trata de un servicio vinculado a la IP del cliente,
        - Para evitar cortafuegos, censura, etc
        - Burlar restricciones en la red del cliente
    - El tráfico viaja cifrado en la red de la máquina local, el administrador de esa red pierde todo control sobre él
        - El administrador de la red local puede solucionar este problema    prohibiendo todo tráfico cifrado, y con ello los túneles


### Túnel remoto
Con un túnel remoto, también llamado túnel inverso, podemos traer a la máquina local las conexiones a cierto puerto del proxy. Esto puede tener al menos tres utilidades

1. Proteger el servidor
2. Distribuir servicios
3. Acceder a servidor tras NAT, sin configurar el NAT

## Código

### Código dentro de una línea

Ejecuta la orden ls -l

### Bloque de código

```
 #!/usr/bin/env python3

def main():
    return

if __name__ == "__main__":
    main()
```


## Tabla
| Hora	| Lunes	| Martes | Miércoles |
| --- | --- | --- | --- |
| 9:00 | Tal | Tal | Cual |
| 11:00 | Esto | Lo otro | Más allá |

## Imagen
![](https://www.edu.xunta.gal/centros/iespazomerce/system/files/fotoies.png)
