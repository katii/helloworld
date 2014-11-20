/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

// katso, että luokat on javafx (fix imports voi valita jonkun muunkin)
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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
        
        root.getChildren().add(new textFieldsPartial());
        root.getChildren().add(new buttonsPartial());
                
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
