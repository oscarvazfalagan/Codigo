"""
Clase Main para identificar si un número es primo usando un bucle for sin break
Autor: daw1al13
"""

def main():
    # Pedimos al usuario un número
    numero = int(input("Dime un número: "))
    
    # Valor para determinar si es primo
    es_primo = True

    if numero <= 1:
        es_primo = False  # 0 y 1 no son primos
    else:
        # Bucle for que comprueba si el número es divisible por algún número menor que él
        for i in range(numero - 1, 1, -1):
            if numero % i == 0:
                es_primo = False  # Si se puede dividir, no es primo

    # Imprimir resultado
    if es_primo:
        print("Tu número es primo")
    else:
        print("Tu número no es primo")


if __name__ == "__main__":
    main()
