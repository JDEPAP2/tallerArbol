/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
<<<<<<< HEAD
import javafx.scene.control.Label;
=======
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
>>>>>>> 8ff45af7cae9404c2b460b75effba8ed96352c6b

/**
 *
 * @author Juan
 */
public class FXMLDocumentController implements Initializable {
<<<<<<< HEAD
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
=======

    @FXML
    private Canvas lienzo;
    
    @FXML
    private Label labelX, labelY, labelZ;
    
    @FXML
    private TextField addX, addY, addZ;
    
    @FXML
    private Button recInorder, recPreorder, recPostOrder, añadirNodo, buscarNodo;
    
    GraphicsContext g;
    
    
    @FXML
    private void addNodo(ActionEvent event) {
        
    }
    
    @FXML
    private void buscarNodo(ActionEvent event) {
        
    }
    
    @FXML
    private void recorrerIn(ActionEvent event) {
        
    }
 
    @FXML
    private void recorrerPre(ActionEvent event) {
        
    }    

    @FXML
    private void recorrerPost(ActionEvent event) {
        
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        g = lienzo.getGraphicsContext2D();
        double h = lienzo.getHeight();
        double w = lienzo.getWidth();
        
        g.setStroke(Color.BLACK);
        g.setLineWidth(7);
        g.strokeRect(0, 0, w, h);
>>>>>>> 8ff45af7cae9404c2b460b75effba8ed96352c6b
        // TODO
    }    
    
}
