/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class buttonsPartial extends HBox implements EventHandler<ActionEvent>{
    
        private final Button closeButton = new Button("Sulje");
        private final Button saveButton = new Button("Tallenna");     
        private final Button printButton = new Button("Tulosta");
        
        // Do layout for button components
        //HBox buttonLayout = new HBox();
        
        buttonsPartial(){
                    
//        HBox.setMargin(this, new Insets(10, 10, 10, 10));
        saveButton.setStyle("-fx-color:blue");
        closeButton.setStyle("-fx-color:red");
        printButton.setStyle("-fx-color:yellow");

        // spacing pistää buttonien väliin väin, padding niiden ympärille
        this.setStyle("-fx-spacing:10;-fx-padding:10");
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.getChildren().add(printButton);
        
        // sama tapahtumakäsittelijä molemmilla
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        printButton.setOnAction(this);
        /* inline implementation esimerkki
                closeButton.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent t){
                
            }
        });
        */
        }

    @Override
    public void handle(ActionEvent t) {
        if(t.getSource().equals(closeButton)){
            Platform.exit();
        }
        else if(t.getSource().equals(saveButton)){
            System.out.println("Tallennus...");
        }
        else {
            System.out.println("Printtaus...");
        }
    }
        
}
