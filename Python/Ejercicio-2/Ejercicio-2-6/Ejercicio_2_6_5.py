"""
Clase Main para hacer potencias mediante bucles
Autor: daw1al13
"""

def main():
    # Pedimos al usuario un número base
    number1 = int(input("Dime un número: "))
    
    # Variable para almacenar el resultado
    resultado = number1
    
    # Pedimos el exponente
    number2 = int(input("Dime a cuanto lo quieres elevar: "))
    
    # Bucle con un contador hasta llegar a 1
    for _ in range(number2, 1, -1):
        resultado = resultado * number1
    
    # Mostramos el resultado final
    print("El resultado es =", resultado)


if __name__ == "__main__":
    main()
