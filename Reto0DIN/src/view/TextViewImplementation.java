/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Implementation of the View Interface. This Implementation uses the IDE
 * console to show the greeting to the user
 *
 * @author Andoni Alday
 */
public class TextViewImplementation implements View {

    /**
     * Method to show the greeting to the user via the IDE Console
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
