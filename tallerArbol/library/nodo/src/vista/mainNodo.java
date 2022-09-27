/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Arbol;

/**
 *
 * @author Juan Rodriguez
 */
public class mainNodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();
        arbol.insertar(3);
        arbol.insertar(2);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("preorden");
        arbol.preorden();
    }
    
}
