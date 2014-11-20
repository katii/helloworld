/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

// katso, että luokat on javafx (fix imports voi valita jonkun muunkin)
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloWorld extends Application {
    
    @Override
    // stage on se sinisellä oleva nimi ja nappulat
    public void start(Stage primaryStage) {
        
        // root on ns. mainlayout joka saisi sisältää vain muita layoutteja
        VBox root = new VBox();
        
        // text voi sisältää vain tekstiä, label sekä kuvan/ikonin että tekstin
        // label vie enemmän muistia
        
        Label nameLabel = new Label("Nimi");
        TextField nameField = new TextField();
        
        Label addressLabel = new Label("Osoite");
        TextField addressField = new TextField();
        
        Label phoneLabel = new Label("Puhelinnumero");
        TextField phoneField = new TextField();
        
        // Do layout for textfield components
        VBox textFieldLayout = new VBox();
        textFieldLayout.setStyle("-fx-padding:10;-fx-spacing:10");
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameField);
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressField);
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneField);
        
        Button closeButton = new Button("Sulje");
        closeButton.setStyle("-fx-color:red");
        
        Button saveButton = new Button("Tallenna");     
        saveButton.setStyle("-fx-color:blue");
        
        // Do layout for button components
        HBox buttonLayout = new HBox();
        // spacing pistää buttonien väliin väin, padding niiden ympärille
        buttonLayout.setStyle("-fx-spacing:10;-fx-padding:10");
        buttonLayout.getChildren().add(closeButton);
        buttonLayout.getChildren().add(saveButton);
        
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
                
        // scene on se valkoinen alue
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
