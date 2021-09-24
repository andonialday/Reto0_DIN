/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {
    
    private ViewFactory instance = new ViewFactory();
    
    public ViewFactoryTest() {
    }

    @Test
    public void testGetModel() {
        View view = instance.getView();
        assertNotNull("Error generating Model", view);
    }
    
}
