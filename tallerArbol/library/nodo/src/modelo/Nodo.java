/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Punto3D;
import modelo.Base;

/**
 *
 * @author Juan Rodriguez
 */
class Nodo <T extends Base> {
    private Nodo izquierda;
    private Nodo derecha;

    private T dato;

    public Nodo(T dato) {
        this.dato = dato;
    }
    
    public Nodo insertar(Nodo n, T elemento){
        if(n == null)
            return new Nodo(elemento);
        else if (elemento.hashCode() < n.dato.hashCode())
            n.izquierda = insertar(n.izquierda, elemento);
        else if (elemento.hashCode() > n.dato.hashCode())
            n.derecha = insertar(n.derecha, elemento);
        return n;
    }
    
    public int nodosCompletos(Nodo n){
        if(n == null)
            return 0;
        else{
            if(n.izquierda != null && n.derecha != null)
                return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha)+1;
            return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha);
        }
    }
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }


    
}