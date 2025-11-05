
class Year:
    """
    Clase Year sirve para denominar si un año es bisiesto o no 
    y contiene un método que muestra los días del mes según si es bisiesto.
    """

    def __init__(self, leapYear: bool):
        # Atributo que indica si el año es bisiesto
        self.leapYear = leapYear

    def showDaysMethod(self, month: int):
        """
        En base a leapYear y el mes que introduzcas, te dará 
        el número de días que tiene ese mes.
        """
        # Comprobamos el mes y mostramos los días correspondientes
        if month in (1, 3, 5, 7, 8, 10, 12):
                print("Tu mes tiene 31 días")
        elif month in (4, 6, 9, 11):
                print("Tu mes tiene 30 días")
        elif month == 2:
                if self.leapYear: # Si es bisiesto
                        print("Tu mes tiene 28 días")
                else:
                    print("Tu mes tiene 29 días")
        else:
                print("Número de mes inválido.")
def main():
    # Pedimos si el año es bisiesto
    print("El año que quieres usar es bisiesto : ")
    print("true --- sí")
    print("false --- no")

    year_input = input("Introduce true o false: ").strip().lower()
    yearI = year_input == "true"

    print("Vamos a ver los días del mese que esscojas")
    monthI = int(input("Introduce el número del mes que quieres (1-12): "))

    # Creamos un objeto Year y usamos su método
    año = Year(yearI)
    año.showDaysMethod(monthI)


if __name__ == "__main__":
    main()

