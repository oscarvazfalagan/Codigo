
"""
@author daw1al13
"""

def main():
    # Creamos variables booleanas dandole valor
    carne_universitario = True
    paro = False
    xubilado = True
    carne_familia = True

    # Y una variable age en la que se basara para saber que condicion usar
    age = 29

    # Creamos un bloque de condicionales que en base a los booleanos 
    # y el integer imprimira distintas opciones por pantalla
    if age < 30:
        if carne_universitario or paro:
            print("El precio es de 40 €")
        else:
            print("El precio es de 50 €")
    elif age > 55:
        if xubilado or paro:
            print("El precio es de 45 €")
        else:
            print("El precio es de 60 €")
    else:
        if carne_familia:
            print("El precio es de 75 €")
        else:
            print("El precio es de 65 €")


if __name__ == "__main__":
    main()
