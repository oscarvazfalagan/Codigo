/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package memorygame;

/**
 *  É unha excepción que definiremos para representar un erro que nos podemos atopar ao xerar as cartas, por calquera motivo
 * @author daw1al13
 */
public class GenerateCardsException extends Exception {

    /**
     * Creates a new instance of <code>GenerateCardsException</code> without
     * detail message.
     */
    public GenerateCardsException() {
    }

    /**
     * Constructs an instance of <code>GenerateCardsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GenerateCardsException(String msg) {
        super(msg);
    }
}
