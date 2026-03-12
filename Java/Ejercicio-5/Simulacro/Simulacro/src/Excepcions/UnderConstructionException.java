/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Excepcions;

/**
 *
 * @author daw1al13
 */
public class UnderConstructionException extends Exception {

    /**
     * Creates a new instance of <code>UnderConstructionExceptio</code> without
     * detail message.
     */
    public UnderConstructionException() {
    }

    /**
     * Constructs an instance of <code>UnderConstructionExceptio</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnderConstructionException(String msg) {
        super(msg);
    }
}
