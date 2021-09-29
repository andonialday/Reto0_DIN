/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Implementation of the View Interface. This Implementation uses the JavaFX
 * sources to show the greeting to the user
 *
 * @author Andoni Alday
 */
public class JavaFXGraphicViewImplementation extends Application implements View {

    /**
     * Method to show the greeting to the user via JavaFX
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        String[] parameters = new String[1];
        parameters[0] = greeting;
        launch(parameters);
    }

    /**
     *
     * @param primaryStage
     */
    public void start(Stage primaryStage) {
        Label text = new Label(getParameters().getRaw().get(0));
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text));
        primaryStage.setTitle(getParameters().getRaw().get(0));
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

}
