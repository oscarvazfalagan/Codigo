/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package memorygame;

import java.util.ArrayList;

/**
 *   Interfaz para generar las cartas apartir de un numero de columnas y filas
 * @author daw1al13
 */
public interface CardGenerator {

    public Card[][] generateCards(int numFilas,int numColumnas)throws GenerateCardsException;
}
