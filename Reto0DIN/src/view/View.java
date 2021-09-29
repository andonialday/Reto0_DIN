/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * This interface dictates the requisites of the Implementations (JavaFX, Swing
 * and IDE Console)
 *
 * @author Andoni Alday
 */
public interface View {

    /**
     * Method to show the greeting to the user
     * @param greeting
     */
    public void showGreeting(String greeting);

}
