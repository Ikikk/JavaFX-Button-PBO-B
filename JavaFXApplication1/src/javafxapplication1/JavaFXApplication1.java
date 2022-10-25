/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/**
 *
 * @author ASUS
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Click Here!");
        btn.setLayoutX(0);
        btn.setLayoutY(100);
//        BorderPane root = new BorderPane();
//        root.getChildren().add(btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("SUCCESS");
                btn.setText("Success");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Not Here!");
        btn2.setLayoutX(500);
        btn2.setLayoutY(400);
        
        HBox root = new HBox();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
//        BorderPane root = new BorderPane();
        
        
        Scene scene = new Scene(root, 640, 480);
        
        primaryStage.setTitle("Test Scene");
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
