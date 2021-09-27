/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFXGraphicViewImplementation implements View {

    private String greeting;
    private Stage primaryStage;

    @Override
    public void showGreeting(String greeting) {
        this.greeting = greeting;
        JavaFXGraphicViewAlert.infoBox(greeting,greeting);
        
        
    }
    
}
