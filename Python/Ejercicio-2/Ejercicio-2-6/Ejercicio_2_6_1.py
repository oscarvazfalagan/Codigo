"""
Programa que imprime los 10 primeros números impares negativos.
Autor: daw1al13
"""

def main():
    # Creamos la variable numero e iniciamos en -1 (primer impar negativo)
    numero = -1

    # Bucle que se repite 10 veces para imprimir los 10 primeros impares negativos
    for _ in range(10):
        # Imprimimos el valor actual de numero
        print(numero)

        # Restamos 2 para obtener el siguiente número impar negativo
        numero = numero - 2


# Llamamos al método principal
if __name__ == "__main__":
    main()
