# -*- coding: utf-8 -*-
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

"""
@author Oscar Vaz Falagan
"""

class StringComparator:
    """
    Clase que compara tres cadenas de texto y determina cuál es la más larga.
    """

    # Creamos tres atributos para introducir strings
    def __init__(self, string1: str, string2: str, string3: str):
        """
        Establece el valor base de las tres strings
        :param string1:
        :param string2:
        :param string3:
        """
        self.string1 = string1
        self.string2 = string2
        self.string3 = string3

    def getBigger(self) -> str:
        """
        En base a la longitud del texto devuelve la variable más larga.
        :return: String
        """
        if len(self.string1) > len(self.string2) and len(self.string1) > len(self.string3):
            return self.string1
        if len(self.string2) > len(self.string1) and len(self.string2) > len(self.string3):
            return self.string2
        if len(self.string3) > len(self.string1) and len(self.string3) > len(self.string2):
            return self.string3
        return "Todos tienen la misma longitud"


def main():
    # Creamos un objeto string en el que introducimos tres strings
    string = StringComparator("Hola", "men", "probando")

    # Pedimos que imprima por pantalla la palabra más larga
    print(string.getBigger())


if __name__ == "__main__":
    main()
