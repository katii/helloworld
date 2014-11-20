/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class textFieldsPartial extends VBox {
    
    private final Label nameLabel = new Label("Nimi");
    private final TextField nameField = new TextField();
      
    private final Label addressLabel = new Label("Osoite");
    private final TextField addressField = new TextField();
        
    private final Label phoneLabel = new Label("Puhelinnumero");
    private final TextField phoneField = new TextField();
        
    // Do layout for textfield components
    // tämä rivi joutaa pois, koska luokka perii VBox luokan
    // perii myös VBox luokasta tulevat funktiot myös getChildrenin
//    private final VBox textFieldLayout = new VBox();
        
    public textFieldsPartial(){
        
        VBox.setMargin(this, new Insets(10, 10, 10, 10));

        this.getChildren().add(nameLabel);
        this.getChildren().add(nameField);
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressField);
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneField);
  
//        this.setStyle("-fx-spacing:10;-fx-padding:10");
//        this.setStyle("-fx-spacing:10");
    }
}
