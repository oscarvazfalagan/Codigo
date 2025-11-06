def main():
    tabla = 5  # Número de la tabla
    resultado = 0

    # Bucle para realizar la multiplicación 10 veces
    for n in range(0, 11):
        resultado = tabla * n
        print(f"{tabla} x {n} = {resultado}")

if __name__ == "__main__":
    main()
