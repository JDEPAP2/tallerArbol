/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import datos.Punto3D;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import modelo.Arbol;

/**
 *
 * @author Juan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Canvas lienzo;
    
    @FXML
    private Label labelX, labelY, labelZ;
    
    @FXML
    private TextField addX, addY, addZ;
    
    @FXML
    private Button recInorder, recPreorder, recPostOrder, añadirNodo, buscarNodo;
    
    GraphicsContext g;
    
    private Arbol<Punto3D> arbol;
    
    
    @FXML
    private void addNodo(ActionEvent event) {
        double x = Double.parseDouble(addX.getText());
        double y = Double.parseDouble(addY.getText());
        double z = Double.parseDouble(addZ.getText());
        arbol.insertar(new Punto3D(x,y,z));
    }
    
    @FXML
    private void buscarNodo(ActionEvent event) {
        double x = Double.parseDouble(addX.getText());
        double y = Double.parseDouble(addY.getText());
        double z = Double.parseDouble(addZ.getText());
        arbol.insertar(new Punto3D(x,y,z));
    }
    
    @FXML
    private void recorrerIn(ActionEvent event) {
        arbol.inorden();
    }
 
    @FXML
    private void recorrerPre(ActionEvent event) {
        arbol.preorden();
    }    

    @FXML
    private void recorrerPost(ActionEvent event) {
        arbol.postorden();
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        g = lienzo.getGraphicsContext2D();
        double h = lienzo.getHeight();
        double w = lienzo.getWidth();
        
        g.setStroke(Color.BLACK);
        g.setLineWidth(7);
        g.strokeRect(0, 0, w, h);
        arbol = new Arbol();
        // TODO
    }    
    
}