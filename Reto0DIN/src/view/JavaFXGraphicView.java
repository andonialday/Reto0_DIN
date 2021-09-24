/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFXGraphicView extends Application {

    private String greeting;

    public JavaFXGraphicView(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(10, 40, greeting);
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text));

        primaryStage.setTitle("Welcome to JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
