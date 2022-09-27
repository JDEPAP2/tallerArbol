/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Base;

/**
 *
 * @author Juan Rodriguez
 */
class Nodo <T extends Base> {
    private Nodo izquierda;
    private Nodo derecha;

    private double dato;

    /**
     * Get the value of dato
     *
     * @return the value of dato
     */
    public double getDato() {
        return dato;
    }

    /**
     * Set the value of dato
     *
     * @param dato new value of dato
     */
    public void setDato(double dato) {
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

    public Nodo(double dato) {
        this.dato = dato;
    }
    
    
}