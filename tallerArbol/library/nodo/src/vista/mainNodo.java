/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Punto3D;
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
        Arbol<Punto3D> arbol = new Arbol<>();
        arbol.insertar(new Punto3D(1,1,1));
        arbol.insertar(new Punto3D(2,1,1));
        arbol.insertar(new Punto3D(3,1,1));
        arbol.insertar(new Punto3D(4,1,1));
        arbol.insertar(new Punto3D(5,1,1));
        System.out.println("preorden");
        arbol.preorden();
    }
    
}
