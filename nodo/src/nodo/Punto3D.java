/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author Juan Rodriguez
 */
public class Punto3D extends Base {
    private double x;
    private double y;
    private double z;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getZ() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Punto3D() {
    }

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return x + ", " + y + ", " + z ;
    }

    @Override
    public Base copy() {
       return new Punto3D( x,y,z);
    }
}
