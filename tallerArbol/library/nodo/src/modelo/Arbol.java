/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import datos.Punto3D;

/**
 *
 * @author Juan
 */
public class Arbol <T extends Base>{
    private Nodo raiz;
    public Arbol() {}
    public boolean existe(T busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, T busqueda) {
        if (n == null) {
            return false;
        }
        Punto3D datoNodo = (Punto3D) n.getDato();
        Punto3D datoBus = (Punto3D) busqueda;
        if (datoNodo.toString().equals(datoBus.toString())) {
            return true;
        } else if (datoBus.getX() < datoNodo.getX()) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(T elemento) {
        if (this.raiz == null) {
            this.raiz = new Nodo(elemento);
        } else {
            raiz = raiz.insertar(raiz, elemento);
        }
    }

    
    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}
