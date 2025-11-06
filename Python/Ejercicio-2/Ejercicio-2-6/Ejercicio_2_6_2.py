"""
Clase Main para multiplicar dos números usando sumas repetidas
"""

def main():
    # Pedimos el primer número
    number1 = int(input("Dime un número: "))
    
    # Pedimos el segundo número
    number2 = int(input("Dime otro número: "))
    
    # Inicializamos el resultado
    result = 0
    
    # Sumamos number1, number2 veces
    for _ in range(number2):
        result += number1
    
    # Mostramos el resultado
    print("La multiplicación de tus números es:", result)

if __name__ == "__main__":
    main()
