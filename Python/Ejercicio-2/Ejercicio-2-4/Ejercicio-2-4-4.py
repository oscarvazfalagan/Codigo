# -*- coding: utf-8 -*-
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

"""
@author Oscar Vaz Falagan
"""

class Wallet:
    """
    Clase Wallet simula una cartera con una cantidad de dinero y una tarjeta.
    """

    def __init__(self, money: float, card: bool):
        # Atributos de la cartera
        self.money = money
        self.card = card

    def available(self) -> str:
        """
        Método que devuelve un texto según el dinero y si tiene tarjeta o no.
        (La lógica exacta no estaba en el código original, 
        así que se infiere del contexto del ejercicio)
        """
        if self.money >= 100:
            return "Tienes suficiente dinero en efectivo."
        elif self.card:
            return "No tienes mucho dinero, pero tienes tarjeta."
        else:
            return "No tienes suficiente dinero ni tarjeta."


def main():
    # Creamos distintos objetos con distintos atributos para aplicarles un método
    cartera1 = Wallet(250, False)
    cartera2 = Wallet(25, True)
    cartera3 = Wallet(10, False)

    # Le pedimos que imprima el resultado del método available()
    # en base al objeto que uses
    print(cartera1.available())
    print(cartera2.available())
    print(cartera3.available())


if __name__ == "__main__":
    main()
